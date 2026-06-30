package xt2;

/* loaded from: classes3.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456765d;

    public g2(xt2.e3 e3Var) {
        this.f456765d = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        so2.j5 j5Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget$closeOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xt2.e3 e3Var = this.f456765d;
        if (e3Var.f456703e.getLiveRole() == 0) {
            gk2.e liveData = e3Var.getLiveData();
            java.lang.Long l17 = null;
            if ((liveData != null ? ((mm2.f6) liveData.a(mm2.f6.class)).f329049w : null) != null) {
                gk2.e liveData2 = e3Var.getLiveData();
                so2.j5 j5Var2 = liveData2 != null ? ((mm2.f6) liveData2.a(mm2.f6.class)).f329049w : null;
                boolean z17 = j5Var2 instanceof cm2.m0;
                bf2.c cVar = bf2.c.f19598a;
                if (z17) {
                    gk2.e liveData3 = e3Var.getLiveData();
                    kotlin.jvm.internal.o.d(liveData3);
                    cm2.m0 m0Var = (cm2.m0) j5Var2;
                    bf2.c.c(cVar, liveData3, 2, 5, java.lang.String.valueOf(m0Var.f43369w), 0, null, 0, 0, null, 0, 1008, null);
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ml2.r0 r0Var = (ml2.r0) c17;
                    ml2.f4 f4Var = ml2.f4.f327439o;
                    gk2.e liveData4 = e3Var.getLiveData();
                    if (liveData4 != null && (j5Var = ((mm2.f6) liveData4.a(mm2.f6.class)).f329049w) != null) {
                        l17 = java.lang.Long.valueOf(j5Var.getItemId());
                    }
                    ml2.r0.Dj(r0Var, f4Var, null, java.lang.String.valueOf(l17), null, null, null, 0, 0L, st2.g3.f412326a.k(m0Var.f43368v), null, null, null, false, null, 16120, null);
                    c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
                    r45.qt2 reportObj = e3Var.getReportObj();
                    zl2.r4 r4Var = zl2.r4.f473950a;
                    qo0.c cVar2 = e3Var.f456703e;
                    kotlin.jvm.internal.o.e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
                    ((c61.p2) ybVar).Kj(reportObj, 18054, zl2.r4.k0(r4Var, ((com.tencent.mm.plugin.finder.live.view.k0) cVar2).getBuContext(), 29, pm0.v.u(m0Var.f43369w), 0, null, 24, null));
                } else if (j5Var2 instanceof cm2.k0) {
                    gk2.e liveData5 = e3Var.getLiveData();
                    kotlin.jvm.internal.o.d(liveData5);
                    bf2.c.c(cVar, liveData5, 2, 6, java.lang.String.valueOf(((cm2.k0) j5Var2).f43361w), 0, null, 0, 0, null, 0, 1008, null);
                }
            }
        }
        xt2.e3.b(e3Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget$closeOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
