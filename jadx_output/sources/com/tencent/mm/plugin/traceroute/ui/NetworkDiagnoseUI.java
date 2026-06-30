package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes11.dex */
public class NetworkDiagnoseUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f175310n = 0;

    /* renamed from: f, reason: collision with root package name */
    public jn4.m f175313f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMProgressBar f175314g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f175315h;

    /* renamed from: d, reason: collision with root package name */
    public int f175311d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f175312e = 0;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f175316i = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.traceroute.ui.q(this), true);

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f175317m = new com.tencent.mm.plugin.traceroute.ui.r(this);

    public static void T6(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI networkDiagnoseUI, boolean z17) {
        networkDiagnoseUI.getClass();
        android.content.Intent intent = new android.content.Intent(networkDiagnoseUI, (java.lang.Class<?>) com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI.class);
        intent.putExtra("diagnose_result", z17);
        if (!z17) {
            networkDiagnoseUI.f175313f.getClass();
            intent.putExtra("diagnose_log_file_path", jn4.m.f300814i);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(networkDiagnoseUI, arrayList.toArray(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseUI", "redirectToReportUI", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        networkDiagnoseUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(networkDiagnoseUI, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseUI", "redirectToReportUI", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        networkDiagnoseUI.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c7l;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f175315h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lzd);
        com.tencent.mm.ui.base.MMProgressBar mMProgressBar = (com.tencent.mm.ui.base.MMProgressBar) findViewById(com.tencent.mm.R.id.cy8);
        this.f175314g = mMProgressBar;
        mMProgressBar.setOnProgressChangedListener(new com.tencent.mm.plugin.traceroute.ui.s(this));
        setMMTitle("");
        setBackBtn(new com.tencent.mm.plugin.traceroute.ui.t(this));
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.traceroute.ui.u(this), 200L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        db5.e1.j(this, com.tencent.mm.R.string.bau, com.tencent.mm.R.string.bp9, com.tencent.mm.R.string.f490608zu, com.tencent.mm.R.string.f490503wx, new com.tencent.mm.plugin.traceroute.ui.a0(this), new com.tencent.mm.plugin.traceroute.ui.b0(this));
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        this.f175314g.setAutoProgress(false);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (!c01.d9.b().E()) {
            db5.t7.k(this, null);
        } else {
            this.f175314g.setAutoProgress(true);
            super.onResume();
        }
    }
}
