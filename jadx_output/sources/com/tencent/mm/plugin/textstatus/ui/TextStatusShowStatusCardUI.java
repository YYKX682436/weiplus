package com.tencent.mm.plugin.textstatus.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusShowStatusCardUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/gg", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextStatusShowStatusCardUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.textstatus.ui.gg f173693f = new com.tencent.mm.plugin.textstatus.ui.gg(null);

    /* renamed from: g, reason: collision with root package name */
    public static mj4.h f173694g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f173695h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f173696i;

    /* renamed from: d, reason: collision with root package name */
    public bi4.n0 f173697d;

    /* renamed from: e, reason: collision with root package name */
    public int f173698e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d0_;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusShowStatusCardUI", "onCreate: ");
        o25.n1.f(this);
        super.onCreate(bundle);
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        vj5.o.e(getWindow());
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        getWindow().setNavigationBarColor(getResources().getColor(com.tencent.mm.R.color.f478514w));
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        this.f173698e = getIntent().getIntExtra("KEY_ACTION", 0);
        mj4.h hVar = f173694g;
        if (hVar != null && (str = f173695h) != null) {
            bi4.k1 k1Var = new bi4.k1();
            k1Var.e(true);
            k1Var.f(true);
            k1Var.q(true);
            k1Var.j(false);
            k1Var.f21067g = 11;
            k1Var.f21064d |= 32;
            k1Var.r(true);
            k1Var.d(false);
            k1Var.i(false);
            k1Var.c(true);
            k1Var.g(false);
            k1Var.h(true);
            k1Var.o(true);
            k1Var.f21065e = true;
            k1Var.f21066f = true;
            k1Var.n(true);
            k1Var.m(true);
            k1Var.f21064d |= 1024;
            com.tencent.mm.plugin.textstatus.ui.q3 q3Var = new com.tencent.mm.plugin.textstatus.ui.q3(this, k1Var);
            bi4.p0.U2(q3Var, str, hVar, null, 4, null);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f485516hy4);
            if (viewGroup != null) {
                viewGroup.addView(q3Var.f174196m);
                try {
                    q3Var.u(q3Var.A);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(q3Var.f174190e, th6, "update handleThirdBack failed", new java.lang.Object[0]);
                }
                viewGroup.postDelayed(new com.tencent.mm.plugin.textstatus.ui.hg(this, hVar, viewGroup, str), 150L);
            }
            q3Var.D1 = new com.tencent.mm.plugin.textstatus.ui.ig(this);
            this.f173697d = q3Var;
            qj4.s.m(qj4.s.f363958a, this, 1L, null, hVar, 0L, 0L, 0L, 0L, null, null, k1Var.f21067g, 1012, null);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.TextStatusCardFeedsActivity);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "TextStatusShowStatusCardUI");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.TextState);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 28809);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f173695h = null;
        f173694g = null;
        f173696i = null;
        bi4.n0 n0Var = this.f173697d;
        if (n0Var != null) {
            ((com.tencent.mm.plugin.textstatus.ui.q3) n0Var).c();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        bi4.n0 n0Var = this.f173697d;
        if (n0Var != null) {
            ((com.tencent.mm.plugin.textstatus.ui.q3) n0Var).d();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        bi4.n0 n0Var = this.f173697d;
        if (n0Var != null) {
            ((com.tencent.mm.plugin.textstatus.ui.q3) n0Var).a();
        }
        bi4.n0 n0Var2 = this.f173697d;
        if (n0Var2 != null) {
            ((com.tencent.mm.plugin.textstatus.ui.q3) n0Var2).v5(false);
        }
    }
}
