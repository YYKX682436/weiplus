package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class k5 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.l5 f118815d;

    public k5(com.tencent.mm.plugin.finder.live.widget.l5 l5Var) {
        this.f118815d = l5Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.finder.live.widget.l5 l5Var = this.f118815d;
        boolean z17 = ((mm2.c1) l5Var.f118900f.S0().a(mm2.c1.class)).A7() == null;
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = l5Var.f118898d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean Y1 = r4Var.Y1(context);
        boolean z18 = (z17 || ((java.lang.Number) ae2.in.f3826n7.r()).intValue() == 2 || !Y1) ? false : true;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = l5Var.f118900f;
        r45.xq1 xq1Var = ((mm2.c1) lVar.S0().a(mm2.c1.class)).C2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gameInfo is not null: ");
        sb6.append(xq1Var != null);
        sb6.append(", setting: ");
        sb6.append(xq1Var != null ? java.lang.Integer.valueOf(xq1Var.getInteger(1)) : null);
        sb6.append(", canshow: ");
        sb6.append(bool);
        sb6.append(", isLandScapeOpenLiteapp: ");
        sb6.append(z18);
        sb6.append(", isPlayTogetherJumpInfoNull:");
        sb6.append(z17);
        sb6.append(", isLandScape:");
        sb6.append(Y1);
        com.tencent.mars.xlog.Log.i(l5Var.f118901g, sb6.toString());
        if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE) || z18) {
            l5Var.f118905n = false;
            qo0.c.a(l5Var.f118899e, qo0.b.A2, null, 2, null);
        } else {
            l5Var.f118905n = true;
        }
        if (l5Var.f118906o != l5Var.f118905n) {
            jf2.u uVar = (jf2.u) lVar.U0(jf2.u.class);
            if (uVar != null) {
                jf2.u.a7(uVar, "canShowPlayTogetherEntracne", false, 2, null);
            }
            l5Var.f118906o = l5Var.f118905n;
        }
    }
}
