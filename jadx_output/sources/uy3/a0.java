package uy3;

/* loaded from: classes8.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f431922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(uy3.j0 j0Var) {
        super(0);
        this.f431922d = j0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.o mo133getLifecycle;
        uy3.j0 j0Var = this.f431922d;
        j0Var.getClass();
        zg0.i3 i3Var = (zg0.i3) i95.n0.c(zg0.i3.class);
        vy3.x xVar = vy3.x.f441492b;
        ((yg0.i4) i3Var).getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) nw4.d3.f340822b;
        if (arrayList.contains(xVar)) {
            arrayList.remove(xVar);
            arrayList.size();
        }
        uy3.s0 s0Var = j0Var.f431953n;
        if (s0Var != null) {
            if (s0Var.f431995e != null) {
                gm0.j1.d().d(s0Var.f431995e);
            }
            gm0.j1.d().q(1532, s0Var);
        }
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView = j0Var.f431952m;
        if (boxWebView != null) {
            boxWebView.destroy();
        }
        j0Var.f431952m = null;
        if (j0Var.f431954o != null) {
            uy3.r0.f431993g.f431988a.clear();
        }
        zg0.q2 q2Var = j0Var.f431950h;
        if (q2Var != null) {
            ((com.tencent.mm.plugin.webview.core.e3) q2Var).D0();
        }
        java.lang.Object obj = j0Var.f431949g;
        if (obj == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        androidx.lifecycle.y yVar = obj instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) obj : null;
        if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
            mo133getLifecycle.c(j0Var.E);
        }
        return jz5.f0.f302826a;
    }
}
