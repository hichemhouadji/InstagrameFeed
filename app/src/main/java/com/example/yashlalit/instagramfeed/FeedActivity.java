package com.example.yashlalit.instagramfeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.yashlalit.instagramfeed.Adapters.RecyclerViewAdapterFeed;
import com.example.yashlalit.instagramfeed.Adapters.RecyclerViewAdapterStories;
import com.example.yashlalit.instagramfeed.Models.FeedModel;
import com.example.yashlalit.instagramfeed.Models.StoriesModel;

import java.util.ArrayList;

public class FeedActivity extends AppCompatActivity {

    RecyclerView recyclerView1;
    RecyclerView recyclerView2;

    ArrayList<FeedModel> feedModelArrayList=new ArrayList<>();
    ArrayList<StoriesModel> storiesModelArrayList=new ArrayList<>();

    RecyclerViewAdapterFeed adapterFeed;
    RecyclerViewAdapterStories adapterStories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        recyclerView1=(RecyclerView) findViewById(R.id.recy_feed);
        recyclerView2=(RecyclerView) findViewById(R.id.recy_stories);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView1.setLayoutManager(layoutManager);

        RecyclerView.LayoutManager layoutManager1=new LinearLayoutManager(this);
        ((LinearLayoutManager) layoutManager1).setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(layoutManager1);

        adapterFeed=new RecyclerViewAdapterFeed(this,feedModelArrayList);
        adapterStories=new RecyclerViewAdapterStories(this,storiesModelArrayList);

        recyclerView1.setAdapter(adapterFeed);
        recyclerView2.setAdapter(adapterStories);

        populaterecyclerview();

        populaterecyclerviewstories();
    }

    private void populaterecyclerviewstories() {

        StoriesModel

        storiesModel=new StoriesModel("mumbiker.nikkhil",R.drawable.propic1);
        storiesModelArrayList.add(storiesModel);
        storiesModel=new StoriesModel("carryminati",R.drawable.propic2);
        storiesModelArrayList.add(storiesModel);
        storiesModel=new StoriesModel("bhuvan.bam",R.drawable.propic3);
        storiesModelArrayList.add(storiesModel);
        storiesModel=new StoriesModel("easportsfifa",R.drawable.propic4);
        storiesModelArrayList.add(storiesModel);
        storiesModel=new StoriesModel("championsleague",R.drawable.propic5);
        storiesModelArrayList.add(storiesModel);
        storiesModel=new StoriesModel("leomessi",R.drawable.propic6);
        storiesModelArrayList.add(storiesModel);
    }

    private void populaterecyclerview() {

        FeedModel

        feedModel=new FeedModel("mumbiker.nikkhil","2 HOURS AGO","y.a.s.h_l.a.l.i.t","#sundayfunday #mssquad #mumbai #tiger #vlog",
                86,R.drawable.propic2,R.drawable.propic6,R.drawable.propic1,R.drawable.postpic1);

        feedModelArrayList.add(feedModel);

        feedModel=new FeedModel("carryminati","25 MINUTES AGO","y.a.s.h_l.a.l.i.t","#fanfest #youtoobh #ayecarry #sundayfunday",
                92,R.drawable.propic2,R.drawable.propic5,R.drawable.propic2,R.drawable.postpic2);

        feedModelArrayList.add(feedModel);

        feedModel=new FeedModel("bhuvam.bam","50 MINUTES AGO","y.a.s.h_l.a.l.i.t","#newview #papamakichu #bambam #youtube #sundayfunday",
                82,R.drawable.propic2,R.drawable.propic4,R.drawable.propic3,R.drawable.postpic3);

        feedModelArrayList.add(feedModel);

        feedModel=new FeedModel("easportsfifa","5 HOURS AGO","y.a.s.h_l.a.l.i.t","#fifa19 #ucl #easports #ps4 #sundayfunday",
                76,R.drawable.propic2,R.drawable.propic3,R.drawable.propic4,R.drawable.postoic4);

        feedModelArrayList.add(feedModel);

        feedModel=new FeedModel("championsleague","36 MINUTES AGO","y.a.s.h_l.a.l.i.t","#ucl #roundof16 #feb #nightsucl #sundayfunday",
                97,R.drawable.propic2,R.drawable.propic2,R.drawable.propic5,R.drawable.postpic5);

        feedModelArrayList.add(feedModel);

        feedModel=new FeedModel("leomessi","8 HOURS AGO","y.a.s.h_l.a.l.i.t","#argentinna #papi #antocaro #mundol #fifa #carloa ",
                56,R.drawable.propic2,R.drawable.propic1,R.drawable.propic6,R.drawable.postpic6);

        feedModelArrayList.add(feedModel);

    }
}
