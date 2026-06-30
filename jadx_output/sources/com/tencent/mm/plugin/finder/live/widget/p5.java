package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class p5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f119360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f119361e;

    public p5(com.tencent.mm.plugin.finder.live.widget.d6 d6Var, android.content.Context context) {
        this.f119360d = d6Var;
        this.f119361e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        r45.en6 en6Var;
        r45.en6 en6Var2;
        r45.en6 en6Var3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f119360d;
        r45.yq1 yq1Var = d6Var.f118068j;
        java.lang.String string = (yq1Var == null || (en6Var3 = (r45.en6) yq1Var.getCustom(1)) == null) ? null : en6Var3.getString(0);
        if (string == null || string.length() == 0) {
            l81.b1 b1Var = new l81.b1();
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context = this.f119361e;
            r45.yq1 yq1Var2 = d6Var.f118068j;
            if (yq1Var2 == null || (en6Var = (r45.en6) yq1Var2.getCustom(1)) == null || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) en6Var.getCustom(2)) == null) {
                finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            }
            c61.yb.nd(ybVar, context, finderJumpInfo, b1Var, 0, null, 24, null);
        } else {
            android.content.Intent intent = new android.content.Intent();
            r45.yq1 yq1Var3 = d6Var.f118068j;
            intent.putExtra("rawUrl", (yq1Var3 == null || (en6Var2 = (r45.en6) yq1Var3.getCustom(1)) == null) ? null : en6Var2.getString(0));
            j45.l.j(this.f119361e, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        if (d6Var.g()) {
            r45.xq1 xq1Var = ((mm2.c1) d6Var.f118061c.S0().a(mm2.c1.class)).C2;
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.z4 z4Var = ml2.z4.A1;
            cl0.g gVar = new cl0.g();
            gVar.o("result", 3);
            gVar.h("appid", xq1Var != null ? xq1Var.getString(2) : null);
            zl2.r4 r4Var = zl2.r4.f473950a;
            r45.a83 a83Var = ((mm2.c1) d6Var.f118061c.P0(mm2.c1.class)).f328828j6;
            gVar.o("game_type", r4Var.j3(a83Var != null ? a83Var.getInteger(2) : 0));
            zy2.zb.y6(zbVar, z4Var, gVar.toString(), null, 4, null);
        } else {
            r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) d6Var.f118061c.P0(mm2.g1.class)).f329071i).getValue();
            r45.z53 z53Var = n73Var != null ? (r45.z53) n73Var.getCustom(1) : null;
            com.tencent.mm.plugin.finder.assist.x2 x2Var = com.tencent.mm.plugin.finder.assist.x2.f102672a;
            cl0.g gVar2 = new cl0.g();
            gVar2.o("result", 3);
            gVar2.h("appid", z53Var != null ? z53Var.getString(0) : null);
            gVar2.o("game_type", 2 - (z53Var != null ? z53Var.getInteger(13) : 0));
            x2Var.c(22, gVar2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
