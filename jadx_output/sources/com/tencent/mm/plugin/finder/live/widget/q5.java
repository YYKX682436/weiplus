package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class q5 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f119495d;

    public q5(com.tencent.mm.plugin.finder.live.widget.d6 d6Var) {
        this.f119495d = d6Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        r45.t63 t63Var;
        int i18;
        java.lang.String str;
        r45.t63 t63Var2;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f119495d;
        java.lang.Object obj = d6Var.f118067i.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        if (((cm2.p) obj).f43373d == 2) {
            qo0.c.a(d6Var.f118060b, qo0.b.A2, null, 2, null);
            boolean g17 = d6Var.g();
            com.tencent.mm.plugin.finder.live.plugin.l lVar = d6Var.f118061c;
            android.view.ViewGroup viewGroup = d6Var.f118059a;
            if (g17) {
                r45.xq1 xq1Var = ((mm2.c1) lVar.S0().a(mm2.c1.class)).C2;
                java.util.LinkedList list = (xq1Var == null || (t63Var = (r45.t63) xq1Var.getCustom(0)) == null) ? null : t63Var.getList(0);
                com.tencent.mm.plugin.finder.view.so soVar = new com.tencent.mm.plugin.finder.view.so(new com.tencent.mm.plugin.finder.live.widget.c6(d6Var, xq1Var));
                if (list != null) {
                    java.lang.String string = viewGroup.getContext().getString(com.tencent.mm.R.string.cz8);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    soVar.a(string, list, d6Var.f(xq1Var.getInteger(1), list));
                }
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                soVar.c(context);
            } else {
                r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) lVar.P0(mm2.g1.class)).f329071i).getValue();
                r45.z53 z53Var = n73Var != null ? (r45.z53) n73Var.getCustom(1) : null;
                java.util.LinkedList list2 = (z53Var == null || (t63Var2 = (r45.t63) z53Var.getCustom(11)) == null) ? null : t63Var2.getList(0);
                com.tencent.mm.plugin.finder.view.so soVar2 = new com.tencent.mm.plugin.finder.view.so(new com.tencent.mm.plugin.finder.live.widget.z5(d6Var, z53Var));
                if (list2 != null) {
                    java.lang.String string2 = viewGroup.getContext().getString(com.tencent.mm.R.string.cz8);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    soVar2.a(string2, list2, d6Var.f(z53Var.getInteger(12), list2));
                }
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                soVar2.c(context2);
            }
            if (!d6Var.g()) {
                r45.n73 n73Var2 = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) lVar.P0(mm2.g1.class)).f329071i).getValue();
                r45.z53 z53Var2 = n73Var2 != null ? (r45.z53) n73Var2.getCustom(1) : null;
                com.tencent.mm.plugin.finder.assist.x2 x2Var = com.tencent.mm.plugin.finder.assist.x2.f102672a;
                cl0.g gVar = new cl0.g();
                gVar.o("result", 6);
                gVar.h("appid", z53Var2 != null ? z53Var2.getString(0) : null);
                gVar.o("game_type", 2 - (z53Var2 != null ? z53Var2.getInteger(13) : 0));
                gVar.h("team_type", z53Var2 != null ? java.lang.Integer.valueOf(z53Var2.getInteger(12)) : null);
                x2Var.c(22, gVar);
                return;
            }
            r45.xq1 xq1Var2 = ((mm2.c1) lVar.S0().a(mm2.c1.class)).C2;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.A1;
            cl0.g gVar2 = new cl0.g();
            gVar2.o("result", 6);
            if (xq1Var2 != null) {
                i18 = 2;
                str = xq1Var2.getString(2);
            } else {
                i18 = 2;
                str = null;
            }
            gVar2.h("appid", str);
            zl2.r4 r4Var = zl2.r4.f473950a;
            r45.a83 a83Var = ((mm2.c1) lVar.P0(mm2.c1.class)).f328828j6;
            gVar2.o("game_type", r4Var.j3(a83Var != null ? a83Var.getInteger(i18) : 0));
            gVar2.h("team_type", xq1Var2 != null ? java.lang.Integer.valueOf(xq1Var2.getInteger(1)) : null);
            zy2.zb.y6(zbVar, z4Var, gVar2.toString(), null, 4, null);
        }
    }
}
