package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class v5 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f120037a;

    public v5(com.tencent.mm.plugin.finder.live.widget.d6 d6Var) {
        this.f120037a = d6Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f120037a;
            if (!d6Var.g()) {
                r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) d6Var.f118061c.P0(mm2.g1.class)).f329071i).getValue();
                r45.z53 z53Var = n73Var != null ? (r45.z53) n73Var.getCustom(1) : null;
                com.tencent.mm.plugin.finder.assist.x2 x2Var = com.tencent.mm.plugin.finder.assist.x2.f102672a;
                cl0.g gVar = new cl0.g();
                gVar.o("result", 2);
                gVar.h("appid", z53Var != null ? z53Var.getString(0) : null);
                gVar.o("game_type", 2 - (z53Var != null ? z53Var.getInteger(13) : 0));
                x2Var.c(22, gVar);
                return;
            }
            r45.xq1 xq1Var = ((mm2.c1) d6Var.f118061c.S0().a(mm2.c1.class)).C2;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.A1;
            cl0.g gVar2 = new cl0.g();
            gVar2.o("result", 2);
            gVar2.h("appid", xq1Var != null ? xq1Var.getString(2) : null);
            zl2.r4 r4Var = zl2.r4.f473950a;
            r45.a83 a83Var = ((mm2.c1) d6Var.f118061c.P0(mm2.c1.class)).f328828j6;
            gVar2.o("game_type", r4Var.j3(a83Var != null ? a83Var.getInteger(2) : 0));
            zy2.zb.y6(zbVar, z4Var, gVar2.toString(), null, 4, null);
        }
    }
}
