package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class h2 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.i2 f121706a;

    public h2(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.i2 i2Var) {
        this.f121706a = i2Var;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        rq2.w wVar;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                android.content.Context context = parent.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.lang.Object obj = s0Var.f293124h;
                vp2.r rVar = obj instanceof vp2.r ? (vp2.r) obj : null;
                com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.i2 i2Var = this.f121706a;
                i2Var.getClass();
                com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
                if (mMActivity != null && (wVar = (rq2.w) pf5.z.f353948a.a(mMActivity).a(rq2.w.class)) != null && rVar != null) {
                    cl0.g gVar = new cl0.g();
                    r45.dd2 dd2Var = (r45.dd2) rVar.f438952d.getCustom(0);
                    gVar.s("tab_id", java.lang.Integer.valueOf(dd2Var != null ? dd2Var.getInteger(0) : 0));
                    android.view.View view = s0Var.itemView;
                    java.lang.Object tag = view != null ? view.getTag() : null;
                    java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
                    gVar.s("card_index", java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
                    com.tencent.mars.xlog.Log.i("Finder.LiveTabJumpersListConvert", "handleExposeReport: " + gVar + ' ');
                    r45.qt2 qt2Var = i2Var.f121724e;
                    java.lang.String string = qt2Var != null ? qt2Var.getString(1) : null;
                    java.lang.String gVar2 = gVar.toString();
                    kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                    wVar.P6("", string, "main_page_tab_card", r26.i0.t(gVar2, ",", ";", false));
                }
            }
        }
    }
}
