package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q70 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f113967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.gp0 f113968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f113969f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var, com.tencent.mm.plugin.finder.live.plugin.gp0 gp0Var, java.util.List list) {
        super(0);
        this.f113967d = v70Var;
        this.f113968e = gp0Var;
        this.f113969f = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f113967d;
        com.tencent.mm.plugin.finder.live.plugin.gp0 gp0Var = v70Var.f114683q;
        com.tencent.mm.plugin.finder.live.plugin.gp0 gp0Var2 = this.f113968e;
        if (gp0Var == gp0Var2) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "curState targetState same");
        } else {
            com.tencent.mm.plugin.finder.live.plugin.gp0 gp0Var3 = com.tencent.mm.plugin.finder.live.plugin.gp0.f112724d;
            if (gp0Var2 == gp0Var3) {
                com.tencent.mars.xlog.Log.w("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "showStatePanel: targetState:" + gp0Var2);
            } else if (((mm2.o4) v70Var.P0(mm2.o4.class)).f329330x0 || !(gp0Var2 == com.tencent.mm.plugin.finder.live.plugin.gp0.f112726f || gp0Var2 == com.tencent.mm.plugin.finder.live.plugin.gp0.f112727g)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showStatePanel: curState:");
                sb6.append(v70Var.f114683q);
                sb6.append(" ,targetState:");
                sb6.append(gp0Var2);
                sb6.append(", contactList size:");
                java.util.List list = this.f113969f;
                sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", sb6.toString());
                com.tencent.mm.plugin.finder.live.plugin.gp0 gp0Var4 = v70Var.f114683q;
                com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 finderLiveFloatContainerV2 = v70Var.f114684r;
                if (gp0Var4 == gp0Var3) {
                    v70Var.K0(0);
                    kotlin.jvm.internal.o.f(finderLiveFloatContainerV2, "access$getContentView$p(...)");
                    int i17 = com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2.D;
                    com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "showStatePanel: animate:true,currentState:" + finderLiveFloatContainerV2.f115873d);
                    if (finderLiveFloatContainerV2.f115873d == com.tencent.mm.plugin.finder.live.view.v4.f116732e) {
                        finderLiveFloatContainerV2.k(com.tencent.mm.plugin.finder.live.view.v4.f116733f);
                        finderLiveFloatContainerV2.setVisibility(0);
                        finderLiveFloatContainerV2.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.live.view.d5(finderLiveFloatContainerV2, true, null));
                    }
                }
                v70Var.f114683q = gp0Var2;
                v70Var.t1();
                com.tencent.mm.plugin.finder.live.plugin.gp0 gp0Var5 = v70Var.f114683q;
                com.tencent.mm.plugin.finder.live.plugin.gp0 gp0Var6 = com.tencent.mm.plugin.finder.live.plugin.gp0.f112725e;
                android.view.ViewGroup viewGroup = v70Var.f114688v;
                android.view.ViewGroup viewGroup2 = v70Var.f114686t;
                com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout finderLiveInterceptRelativeLayout = v70Var.f114691y;
                if (gp0Var5 == gp0Var6) {
                    ml2.q2 q2Var = ml2.q2.f327823l1;
                    com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 58 ");
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
                    ((mm2.o4) v70Var.P0(mm2.o4.class)).f329330x0 = true;
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "startMatch");
                    v70Var.N = list;
                    androidx.recyclerview.widget.RecyclerView recyclerView = v70Var.f114692z;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "startMatch", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "startMatch", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
                    v70Var.A.setVisibility(0);
                    android.view.View view = v70Var.B;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "startMatch", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "startMatch", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    v70Var.u1();
                    kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                    if (v70Var.F == null) {
                        v70Var.F = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.finder.live.plugin.r70(v70Var, f0Var), true);
                    }
                    com.tencent.mm.sdk.platformtools.b4 b4Var = v70Var.F;
                    if (b4Var != null) {
                        b4Var.c(400L, 400L);
                    }
                    android.view.View view2 = v70Var.f114685s;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderLiveInterceptRelativeLayout.setVisibility(0);
                    viewGroup2.setVisibility(8);
                    viewGroup.setVisibility(8);
                    finderLiveFloatContainerV2.c(true);
                } else if (gp0Var5 == com.tencent.mm.plugin.finder.live.plugin.gp0.f112726f) {
                    ml2.q2 q2Var2 = ml2.q2.Z;
                    com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 54 ");
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var2, "", -1, -1);
                    android.view.View view3 = v70Var.f114685s;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderLiveInterceptRelativeLayout.setVisibility(8);
                    viewGroup2.setVisibility(0);
                    viewGroup.setVisibility(8);
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "stopRandomMatchConnectingTimer");
                    kotlinx.coroutines.r2 r2Var = v70Var.V;
                    if (r2Var != null) {
                        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                    }
                    v70Var.V = null;
                    ((mm2.o4) v70Var.P0(mm2.o4.class)).S7();
                    finderLiveFloatContainerV2.c(true);
                } else if (gp0Var5 == com.tencent.mm.plugin.finder.live.plugin.gp0.f112727g) {
                    ml2.q2 q2Var3 = ml2.q2.f327842y1;
                    com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 62 ");
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var3, "", -1, -1);
                    android.view.View view4 = v70Var.f114685s;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList5.add(4);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderLiveInterceptRelativeLayout.setVisibility(8);
                    viewGroup2.setVisibility(8);
                    viewGroup.setVisibility(0);
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "startRandomMatchConnectingTimer");
                    kotlinx.coroutines.r2 r2Var2 = v70Var.V;
                    if (r2Var2 != null) {
                        kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                    }
                    mm2.o4 o4Var = (mm2.o4) v70Var.P0(mm2.o4.class);
                    if (o4Var.f329315l1 != null) {
                        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "startRandomMatchConnectingTimer timer is not null");
                    } else {
                        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "startRandomMatchConnectingTimer");
                        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(new mm2.n4(java.lang.System.currentTimeMillis(), o4Var), true);
                        o4Var.f329315l1 = b4Var2;
                        b4Var2.c(1000L, 1000L);
                    }
                    v70Var.V = com.tencent.mm.plugin.finder.live.util.y.e(v70Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.t70(v70Var, null), 3, null);
                    finderLiveFloatContainerV2.c(true);
                    v70Var.t1();
                    com.tencent.mm.plugin.finder.live.plugin.h70 h70Var = new com.tencent.mm.plugin.finder.live.plugin.h70(v70Var);
                    v70Var.T = h70Var;
                    v70Var.R.postDelayed(h70Var, 5000L);
                }
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "skip showStatePanel: isInChattingMode:" + ((mm2.o4) v70Var.P0(mm2.o4.class)).f329330x0);
            }
        }
        return jz5.f0.f302826a;
    }
}
