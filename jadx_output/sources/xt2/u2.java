package xt2;

/* loaded from: classes3.dex */
public final class u2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f457048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f457049e;

    public u2(xt2.e3 e3Var, cm2.m0 m0Var) {
        this.f457048d = e3Var;
        this.f457049e = m0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        xt2.e3 e3Var = this.f457048d;
        e3Var.f456708m.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        cm2.m0 m0Var = this.f457049e;
        java.util.LinkedList list = m0Var.f43368v.getList(54);
        if (list.size() <= 1) {
            kotlinx.coroutines.r2 r2Var = e3Var.F;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            e3Var.f(m0Var, 0);
            com.tencent.mars.xlog.Log.i(e3Var.f456706h, "product " + m0Var.f43369w + " parse showbox directly");
            return;
        }
        kotlinx.coroutines.r2 r2Var2 = e3Var.F;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        e3Var.F = com.tencent.mm.plugin.finder.live.util.y.m(e3Var.getPlugin(), null, null, new xt2.t2(e3Var, m0Var, list, null), 3, null);
        com.tencent.mars.xlog.Log.i(e3Var.f456706h, "product " + m0Var.f43369w + " start play showBox with item size " + list.size() + ", job = " + e3Var.F);
    }
}
