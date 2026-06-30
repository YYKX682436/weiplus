package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes15.dex */
public class WxaLiteAppListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f144339m = new com.tencent.mm.plugin.lite.ui.g1();

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f144340d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f144341e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.ui.s1 f144342f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f144343g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f144344h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.ui.WxaLiteAppView f144345i;

    /* loaded from: classes3.dex */
    public static class a implements com.tencent.mm.ipcinvoker.j {
        private a() {
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            if (rVar != null) {
                rVar.a(null);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bpz;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.lite.p.f144149a.b(7, new com.tencent.liteapp.report.WxaLiteAppStartReport());
        com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getEngineConfigModel();
        com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getLiteAppEngineConfigInfo();
        ((d83.u) ((e70.z) i95.n0.c(e70.z.class))).Bi(new e70.w("wxalitec8a16f9bf80f65dffb97cdf7760c1142", com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM, null), new com.tencent.mm.plugin.lite.ui.h1(this));
        this.f144344h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.q1r);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        com.tencent.mm.plugin.lite.ui.WxaLiteAppView wxaLiteAppView = new com.tencent.mm.plugin.lite.ui.WxaLiteAppView(this);
        wxaLiteAppView.f46059z = true;
        wxaLiteAppView.A = true;
        wxaLiteAppView.f144377y0 = null;
        wxaLiteAppView.f144376x0 = null;
        this.f144345i = wxaLiteAppView;
        this.f144344h.addView(wxaLiteAppView, 3);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.pua)).setOnClickListener(new com.tencent.mm.plugin.lite.ui.j1(this));
        this.f144343g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.afe);
        com.tencent.mm.plugin.lite.w.initLib();
        java.lang.String baseLibMajorVersion = com.tencent.mm.plugin.lite.LiteAppCenter.getBaseLibMajorVersion();
        this.f144343g.setText("基础库列表  当前基础库大版本：" + baseLibMajorVersion);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f483074vv)).setText("App列表");
        this.f144340d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.aff);
        this.f144340d.setAdapter((android.widget.ListAdapter) new com.tencent.mm.plugin.lite.ui.q1(this, this));
        x03.x0.f451161d.a().f451164b.c("http://wxsnsdy.tc.qq.com/105/20210/snsdyvideodownload?filekey=30280201010421301f0201690402534804102ca905ce620b1241b726bc41dcff44e00204012882540400&bizid=1023&hy=SH&fileparam=302c020101042530230204136ffd93020457e3c4ff02024ef202031e8d7f02030f42400204045a320a0201000400", 80);
        this.f144341e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f483075vw);
        com.tencent.mm.plugin.lite.ui.s1 s1Var = new com.tencent.mm.plugin.lite.ui.s1(this, this);
        this.f144342f = s1Var;
        this.f144341e.setAdapter((android.widget.ListAdapter) s1Var);
        this.f144341e.setOnItemClickListener(new com.tencent.mm.plugin.lite.ui.o1(this));
        this.f144341e.setOnItemLongClickListener(new com.tencent.mm.plugin.lite.ui.p1(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.lite.w.initLib();
        java.lang.String baseLibMajorVersion = com.tencent.mm.plugin.lite.LiteAppCenter.getBaseLibMajorVersion();
        this.f144343g.setText("基础库列表  当前基础库大版本：" + baseLibMajorVersion);
        this.f144342f.notifyDataSetChanged();
    }
}
