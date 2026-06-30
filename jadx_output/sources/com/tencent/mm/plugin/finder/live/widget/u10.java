package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class u10 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z10 f119928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(com.tencent.mm.plugin.finder.live.widget.z10 z10Var) {
        super(1);
        this.f119928d = z10Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.finder.live.widget.z10 z10Var = this.f119928d;
            android.view.View view = z10Var.f120498g;
            if (view == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$initContentView$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$initContentView$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.finder.live.plugin.l lVar = z10Var.f120494c;
            lVar.K0(8);
            com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var = lVar instanceof com.tencent.mm.plugin.finder.live.plugin.ai0 ? (com.tencent.mm.plugin.finder.live.plugin.ai0) lVar : null;
            if (ai0Var != null) {
                com.tencent.mars.xlog.Log.i(ai0Var.f111889q, "releaseDynamicCardEnv");
                hq0.e0 e0Var = ai0Var.f111892t;
                if (e0Var != null && (str = e0Var.f282984e) != null) {
                    ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Bi(str);
                }
                ai0Var.f111892t = null;
                ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Di(null);
                ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).getClass();
                xg4.m.f454446a.a(2000L);
            }
        }
        return jz5.f0.f302826a;
    }
}
