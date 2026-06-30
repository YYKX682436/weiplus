package com.tencent.mm.plugin.story.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/StoryBrowseUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lze4/h;", "<init>", "()V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StoryBrowseUI extends com.tencent.mm.ui.MMActivity implements ze4.h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f171862h = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f171863d;

    /* renamed from: e, reason: collision with root package name */
    public int f171864e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f171865f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f171866g;

    @Override // ze4.h
    public void H2() {
    }

    public final void T6(int i17) {
        mf4.d dVar = mf4.d.f326160a;
        mf4.d.f326163d.f60918d = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(getContext());
        mf4.d.f326163d.f60925k = java.lang.System.currentTimeMillis();
        dVar.c();
        mf4.c cVar = mf4.c.f326149a;
        if (mf4.c.f326152d > 0) {
            cVar.a();
        }
        setResult(i17);
        finish();
    }

    @Override // ze4.h
    public void Y0() {
        T6(-1);
    }

    @Override // ze4.h
    public void c2() {
        T6(-1);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f171865f;
        boolean z17 = false;
        if (storyGalleryView != null && storyGalleryView.c()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        T6(-1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.widget.RelativeLayout relativeLayout;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryBrowseUI", "StoryBrowseUI create " + this);
        supportRequestWindowFeature(1);
        customfixStatusbar(true);
        super.onCreate(bundle);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        mf4.c.f326152d = java.lang.System.currentTimeMillis();
        mf4.b bVar = mf4.b.f326142a;
        mf4.b.f326145d = java.lang.System.currentTimeMillis();
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
        ai3.d.f5107a = true;
        android.widget.RelativeLayout relativeLayout2 = new android.widget.RelativeLayout(getContext());
        relativeLayout2.setBackgroundColor(0);
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setBackgroundColor(-16777216);
        this.f171866g = imageView;
        this.f171864e = getIntent().getIntExtra("h_position", 0);
        this.f171863d = getIntent().getIntExtra("v_position", 0);
        java.lang.String stringExtra = getIntent().getStringExtra(dm.i4.COL_USERNAME);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = getIntent().getStringArrayListExtra("user_list");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("user_date_list");
        boolean booleanExtra = getIntent().getBooleanExtra("delete_when_first_empty", false);
        long longExtra = getIntent().getLongExtra("data_seed_key", 0L);
        mf4.d dVar = mf4.d.f326160a;
        java.lang.String str = mf4.d.f326163d.f60934t;
        getIntent().getBooleanExtra("gallery_story_need_action", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryBrowseUI", "vPosition " + this.f171863d);
        dVar.g();
        mf4.d.f326163d.f60918d = (long) com.tencent.mars.comm.NetStatusUtil.getIOSNetType(getContext());
        com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct storyPreviewReportStruct = mf4.d.f326163d;
        storyPreviewReportStruct.f60926l = 0L;
        storyPreviewReportStruct.f60928n = 0L;
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        if (ze4.l.f471801b == null) {
            ze4.l.f471801b = new ze4.l();
        }
        android.support.v4.media.f.a(((java.util.HashMap) ze4.l.f471801b.f471802a).remove(java.lang.Long.valueOf(longExtra)));
        h0Var2.f310123d = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || !com.tencent.mm.sdk.platformtools.t8.D0(stringExtra, ef4.w.f252468t.e())) {
            relativeLayout = relativeLayout2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && !com.tencent.mm.sdk.platformtools.t8.D0(stringExtra, ef4.w.f252468t.e())) {
                this.f171865f = new com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView(this, ze4.k.SingleGallery, 0, false, null, 28, null);
                h0Var2.f310123d = stringExtra;
            } else if (h0Var.f310123d != null) {
                this.f171865f = new com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView(this, ze4.k.MultiUserGallery, 0, false, null, 28, null);
                h0Var2.f310123d = new java.util.ArrayList((java.util.Collection) h0Var.f310123d);
            }
        } else if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            relativeLayout = relativeLayout2;
            this.f171865f = new com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView(this, ze4.k.SelfGallery, 0, false, null, 28, null);
            h0Var2.f310123d = stringExtra;
        } else {
            relativeLayout = relativeLayout2;
            this.f171865f = new com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView(this, ze4.k.HistoryGallery, 0, false, null, 28, null);
            h0Var2.f310123d = stringArrayListExtra;
        }
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f171865f;
        if (storyGalleryView != null) {
            storyGalleryView.w();
        }
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView2 = this.f171865f;
        if (storyGalleryView2 != null) {
            storyGalleryView2.setDeleteWhenFirstEmpty(booleanExtra);
        }
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView3 = this.f171865f;
        if (storyGalleryView3 != null) {
            storyGalleryView3.setSessionId(str);
        }
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView4 = this.f171865f;
        if (storyGalleryView4 != null) {
            storyGalleryView4.setDataSeed(h0Var2.f310123d);
        }
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView5 = this.f171865f;
        if (storyGalleryView5 != null) {
            storyGalleryView5.setStoryBrowseUIListener(this);
        }
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView6 = this.f171865f;
        if (storyGalleryView6 != null) {
            storyGalleryView6.setCurrentVItem(this.f171863d);
        }
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView7 = this.f171865f;
        if (storyGalleryView7 != null) {
            storyGalleryView7.setCanDragScale(true);
        }
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView8 = this.f171865f;
        if (storyGalleryView8 != null) {
            storyGalleryView8.setGalleryScaleListener(new of4.c(this));
        }
        android.widget.RelativeLayout relativeLayout3 = relativeLayout;
        relativeLayout3.addView(this.f171866g, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView9 = this.f171865f;
        if (storyGalleryView9 != null) {
            relativeLayout3.addView(storyGalleryView9, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        setContentView(relativeLayout3);
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView10 = this.f171865f;
        if (storyGalleryView10 != null) {
            storyGalleryView10.post(new of4.d(this, h0Var, stringExtra, h0Var2));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryBrowseUI", "onDestroy " + this);
        super.onDestroy();
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f171865f;
        if (storyGalleryView != null) {
            storyGalleryView.e();
        }
        mf4.c cVar = mf4.c.f326149a;
        if (mf4.c.f326152d <= 0) {
            return;
        }
        cVar.a();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryBrowseUI", "onPause " + this);
        super.onPause();
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f171865f;
        if (storyGalleryView != null) {
            storyGalleryView.h();
        }
        qp1.h0.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryBrowseUI", "onResume " + this);
        super.onResume();
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f171865f;
        if (storyGalleryView != null) {
            storyGalleryView.k();
        }
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView2 = this.f171865f;
        if (storyGalleryView2 != null) {
            storyGalleryView2.j();
        }
        qp1.h0.a(true, true, true);
    }
}
