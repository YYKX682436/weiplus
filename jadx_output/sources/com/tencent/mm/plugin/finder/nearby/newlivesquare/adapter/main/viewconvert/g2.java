package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class g2 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.v f121687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.i2 f121688e;

    public g2(vp2.v vVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.i2 i2Var) {
        this.f121687d = vVar;
        this.f121688e = i2Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        vp2.v vVar = this.f121687d;
        if (i17 > vVar.f438958e.size()) {
            return;
        }
        java.lang.Object obj = vVar.f438958e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        android.content.Context context = holder.f293121e;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            boolean z17 = j5Var instanceof vp2.r;
            vp2.r rVar = z17 ? (vp2.r) j5Var : null;
            if (rVar != null) {
                ((sp2.b0) pf5.z.f353948a.a(mMActivity).a(sp2.b0.class)).R6((r45.dd2) rVar.f438952d.getCustom(0));
            }
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.i2 i2Var = this.f121688e;
            i2Var.getClass();
            rq2.w wVar = (rq2.w) pf5.z.f353948a.a(mMActivity).a(rq2.w.class);
            if (wVar != null) {
                vp2.r rVar2 = z17 ? (vp2.r) j5Var : null;
                if (rVar2 != null) {
                    cl0.g gVar = new cl0.g();
                    r45.dd2 dd2Var = (r45.dd2) rVar2.f438952d.getCustom(0);
                    gVar.s("tab_id", java.lang.Integer.valueOf(dd2Var != null ? dd2Var.getInteger(0) : 0));
                    gVar.s("card_index", java.lang.Integer.valueOf(i17));
                    com.tencent.mars.xlog.Log.i("Finder.LiveTabJumpersListConvert", "handleClickReport: " + gVar + ' ');
                    r45.qt2 qt2Var = i2Var.f121724e;
                    java.lang.String string = qt2Var != null ? qt2Var.getString(1) : null;
                    java.lang.String gVar2 = gVar.toString();
                    kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                    wVar.Q6(string, "main_page_tab_card", r26.i0.t(gVar2, ",", ";", false));
                }
            }
        }
    }
}
