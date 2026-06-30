package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class c00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f117930d;

    public c00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        this.f117930d = m10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        r45.z87 z87Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$checkGameInvitation$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Uj((ml2.r0) c17, 15, 0, null, null, 14, null);
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f117930d;
        m10Var.C = -1;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = m10Var.f119013o;
        if (y1Var != null) {
            y1Var.q();
        }
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var2 = this.f117930d;
        m10Var2.H = false;
        r45.xq1 xq1Var = ((mm2.c1) m10Var2.f119001c.P0(mm2.c1.class)).C2;
        r45.fr1 fr1Var = ((mm2.c1) this.f117930d.f119001c.P0(mm2.c1.class)).M2;
        if (xq1Var != null && fr1Var != null) {
            com.tencent.mm.plugin.finder.live.widget.m10 m10Var3 = this.f117930d;
            r45.xq1 xq1Var2 = ((mm2.c1) m10Var3.f119001c.P0(mm2.c1.class)).C2;
            r45.fr1 fr1Var2 = ((mm2.c1) m10Var3.f119001c.P0(mm2.c1.class)).M2;
            if (!((mm2.c1) m10Var3.f119001c.P0(mm2.c1.class)).T) {
                if (!(((mm2.n0) m10Var3.f119001c.P0(mm2.n0.class)).f329273r)) {
                    if (xq1Var2 != null && fr1Var2 != null) {
                        int integer = fr1Var2.getInteger(0);
                        if (integer == 3 || ((mm2.c1) m10Var3.f119001c.P0(mm2.c1.class)).P2) {
                            db5.t7.i(m10Var3.f118999a.getContext(), m10Var3.f118999a.getContext().getString(com.tencent.mm.R.string.czd), com.tencent.mm.R.raw.icons_filled_error);
                        } else {
                            if (integer != 4) {
                                if (!(fr1Var2.getInteger(5) == 0)) {
                                    m10Var3.I = true;
                                    com.tencent.mm.plugin.finder.live.widget.pz pzVar = com.tencent.mm.plugin.finder.live.widget.m10.R;
                                    com.tencent.mm.plugin.finder.live.plugin.l lVar = m10Var3.f119001c;
                                    android.content.Context context = m10Var3.f118999a.getContext();
                                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                                    java.lang.String string2 = fr1Var2.getString(4);
                                    java.lang.String str = "";
                                    java.lang.String str2 = string2 == null ? "" : string2;
                                    com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
                                    boolean a17 = pzVar.a(fr1Var2);
                                    if (!pzVar.a(fr1Var2) ? (string = xq1Var2.getString(3)) != null : (z87Var = (r45.z87) fr1Var2.getCustom(18)) != null && (string = z87Var.getString(4)) != null) {
                                        str = string;
                                    }
                                    android.content.Context context2 = m10Var3.f118999a.getContext();
                                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                    r45.yq1 yq1Var = ((mm2.c1) m10Var3.f119001c.P0(mm2.c1.class)).f328811g6;
                                    pzVar.b(lVar, context, xq1Var2, fr1Var2, str2, b3Var.g(a17, 6, str, context2, yq1Var != null ? yq1Var.getInteger(5) : -1), new com.tencent.mm.plugin.finder.live.widget.m00(m10Var3), ((mm2.c1) m10Var3.f119001c.P0(mm2.c1.class)).N2);
                                }
                            }
                            db5.t7.i(m10Var3.f118999a.getContext(), m10Var3.f118999a.getContext().getString(com.tencent.mm.R.string.cze), com.tencent.mm.R.raw.icons_filled_error);
                        }
                    }
                }
            }
            db5.t7.i(m10Var3.f118999a.getContext(), m10Var3.f118999a.getContext().getString(com.tencent.mm.R.string.czf), com.tencent.mm.R.raw.icons_filled_error);
        } else if (fr1Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveVisitorGameTeamWidget", "lastGameTeamInfo is null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$checkGameInvitation$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
