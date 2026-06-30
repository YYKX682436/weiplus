package zl2;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.k0 f473853a = new zl2.k0();

    public final java.lang.Object a(androidx.appcompat.app.AppCompatActivity appCompatActivity, r45.zc4 zc4Var, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = new com.tencent.mm.sdk.coroutines.LifecycleScope("FinderLiveShareProductDialog", appCompatActivity, 0, 4, null);
        com.tencent.mars.xlog.Log.i("FinderLiveShareProductDialog", "open product share, appId = " + zc4Var.getString(0) + ", entranceGMsgId = " + zc4Var.getString(7) + ", productId = " + zc4Var.getString(1) + ", ecSource = " + zc4Var.getString(4) + ", token = " + zc4Var.getString(5) + ", finderUsername = " + zc4Var.getString(6));
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) appCompatActivity, 0, true);
        k0Var.X1 = false;
        k0Var.U1 = true;
        k0Var.f211855d2 = false;
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        new com.tencent.mm.pluginsdk.forward.m().Di(appCompatActivity, k0Var, 2, null, new zl2.j0(zc4Var, k0Var, lifecycleScope, zc4Var, appCompatActivity, nVar));
        k0Var.f211872n = new zl2.d0(k0Var, appCompatActivity, zc4Var);
        k0Var.f211874o = new zl2.e0(zc4Var, appCompatActivity);
        zl2.h0 h0Var = new zl2.h0(lifecycleScope, k0Var, nVar, zc4Var, appCompatActivity, zc4Var);
        k0Var.f211881s = h0Var;
        k0Var.f211884v = h0Var;
        k0Var.p(new zl2.f0(nVar));
        k0Var.v();
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
