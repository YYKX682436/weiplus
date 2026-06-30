package com.tencent.mm.ui;

@db5.a(8192)
@gm0.a2
/* loaded from: classes11.dex */
public class AlbumUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f196551h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.DoubleTabView f196552d = null;
    private com.tencent.mm.ui.base.CustomViewPager mViewPager = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f196553e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f196554f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f196555g = false;

    @Override // com.tencent.mm.ui.MMActivity
    public void dealContentView(android.view.View view) {
        android.content.res.Resources resources;
        int i17;
        super.dealContentView(view);
        this.f196554f = getIntent().getBooleanExtra("story_only", false);
        this.f196555g = getIntent().getBooleanExtra("story_dot", false);
        if (com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_sns_reset_userpage_md5", "1", false, true), 1) > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumUI", "AlbumUI resetMd5");
            com.tencent.mm.plugin.sns.storage.e2 Ej = com.tencent.mm.plugin.sns.model.l4.Ej();
            Ej.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            com.tencent.mm.plugin.sns.storage.d2 J0 = Ej.J0(c01.z1.r());
            J0.field_albumMd5 = "";
            Ej.u1(J0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        }
        com.tencent.mm.ui.DoubleTabView doubleTabView = (com.tencent.mm.ui.DoubleTabView) findViewById(com.tencent.mm.R.id.f482916rp);
        this.f196552d = doubleTabView;
        if (this.f196554f) {
            doubleTabView.setVisibility(8);
        } else {
            doubleTabView.setFirstTabString(getResources().getString(com.tencent.mm.R.string.f489981hd));
            boolean g17 = bi4.v1.g();
            if (g17) {
                resources = getResources();
                i17 = com.tencent.mm.R.string.f489982he;
            } else {
                resources = getResources();
                i17 = com.tencent.mm.R.string.f489983hf;
            }
            this.f196552d.setSecondTabString(resources.getString(i17));
            if (g17) {
                com.tencent.mm.ui.q qVar = new com.tencent.mm.ui.q(this.f196552d, "textstate_history");
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().k(qVar);
            }
            if (g17) {
                addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.ui.m(this));
                showOptionMenu(false);
            }
            this.f196552d.setOnTabClickListener(new com.tencent.mm.ui.n(this));
        }
        com.tencent.mm.ui.base.CustomViewPager customViewPager = (com.tencent.mm.ui.base.CustomViewPager) findViewById(com.tencent.mm.R.id.f482924rz);
        this.mViewPager = customViewPager;
        customViewPager.setOnPageChangeListener(new com.tencent.mm.ui.o(this));
        this.mViewPager.setAdapter(new com.tencent.mm.ui.p(this, getSupportFragmentManager()));
        if (!this.f196554f && getIntent().getBooleanExtra("status_default", false)) {
            this.f196552d.setTo(1);
            this.mViewPager.setCurrentItem(1);
        }
        mf4.d dVar = mf4.d.f326160a;
        mf4.d.f326161b.f60916d = 3L;
        dVar.b();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bxr;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.ui.bk.u0(this);
        fixStatusbar(true);
        super.onCreate(bundle);
        com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").G("SnsMMKVSnsUI", true);
        setRequestedOrientation(1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        cc4.a.f40481a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_group_dynamic_label_enable, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelRangeConfig", "updateNewLabelRangeControl enableNewGroupUI:" + cc4.a.f40481a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SnsUserUI)).Rj(this, iy1.a.Album);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").G("SnsMMKVSnsUI", false);
        super.onDestroy();
    }
}
