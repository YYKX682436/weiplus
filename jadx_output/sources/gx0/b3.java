package gx0;

/* loaded from: classes5.dex */
public final class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f276220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f276221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f276222f;

    public b3(gx0.y3 y3Var, ex0.a0 a0Var, com.tencent.maas.base.MJID mjid) {
        this.f276220d = y3Var;
        this.f276221e = a0Var;
        this.f276222f = mjid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ex0.v vVar;
        java.util.List list;
        gx0.y3 y3Var = this.f276220d;
        int i17 = (int) (y3Var.getContext().getResources().getDisplayMetrics().widthPixels * 0.5f);
        y3Var.o7().b(this.f276221e, new bx0.j(e3.d.b(i17, (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 40), i17, 0), (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 48)), y3Var.getMainScope());
        y3Var.o7().setPlaybackStateListener(y3Var.f277198y);
        y3Var.o7().setTimelineScaleListener(y3Var.f277199z);
        y3Var.o7().setScrollTimeChangedListener(y3Var.B);
        y3Var.o7().setTimelineItemDecorationTrimListener(y3Var.C);
        y3Var.o7().setScrollStateChangeListener(y3Var.A);
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView o76 = y3Var.o7();
        kotlinx.coroutines.y0 mainScope = y3Var.getMainScope();
        kotlin.jvm.internal.o.g(mainScope, "mainScope");
        ex0.a0 timelineVM = o76.getTimelineVM();
        if (timelineVM != null && (vVar = timelineVM.f257097g) != null && (list = vVar.f257177e) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                o76.getThumbnailProviderManager().d(rVar.f257168b);
                if (rVar.f257169c != ug.m.Transition) {
                    kotlinx.coroutines.l.d(mainScope, null, null, new jv0.l(o76, rVar, null), 3, null);
                }
            }
        }
        y3Var.o7().setSegmentID$plugin_mj_template_release(this.f276222f);
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView o77 = y3Var.o7();
        java.util.List list2 = y3Var.f302189r;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
        while (it6.hasNext()) {
            arrayList.add(((jv0.p) it6.next()).f302205a);
        }
        o77.setAdditionalSnapTimeList$plugin_mj_template_release(arrayList);
        y3Var.o7().setTransitionShadowedChecker$plugin_mj_template_release(gx0.c3.f276277d);
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.l(y3Var.o7(), y3Var.z7().h7(), false, 2, null);
    }
}
