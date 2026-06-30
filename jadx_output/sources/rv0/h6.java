package rv0;

/* loaded from: classes5.dex */
public final class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f400038f;

    public h6(rv0.z6 z6Var, ex0.a0 a0Var, yz5.a aVar) {
        this.f400036d = z6Var;
        this.f400037e = a0Var;
        this.f400038f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ex0.v vVar;
        java.util.List list;
        rv0.z6 z6Var = this.f400036d;
        z6Var.u7().b(this.f400037e, new bx0.j(e3.d.b(((java.lang.Number) ((jz5.n) z6Var.f400365u).getValue()).intValue(), ((java.lang.Number) ((jz5.n) z6Var.f400366v).getValue()).intValue(), ((java.lang.Number) ((jz5.n) z6Var.f400365u).getValue()).intValue(), 0), (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 48)), z6Var.getMainScope());
        z6Var.u7().setScrollTimeChangedListener(z6Var.B);
        z6Var.u7().setScrollStateChangeListener(z6Var.C);
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView u76 = z6Var.u7();
        kotlinx.coroutines.y0 mainScope = z6Var.getMainScope();
        kotlin.jvm.internal.o.g(mainScope, "mainScope");
        ex0.a0 timelineVM = u76.getTimelineVM();
        if (timelineVM != null && (vVar = timelineVM.f257097g) != null && (list = vVar.f257177e) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                u76.getThumbnailProviderManager().d(rVar.f257168b);
                if (rVar.f257169c == ug.m.Transition) {
                    break;
                } else {
                    kotlinx.coroutines.l.d(mainScope, null, null, new rv0.m5(u76, rVar, null), 3, null);
                }
            }
        }
        z6Var.u7().setIgnoreStartTimeInMedia(true);
        z6Var.o7().a();
        z6Var.o7().setCursorMoveListener(z6Var.D);
        z6Var.o7().setTimelineViewScrollListener(z6Var.E);
        this.f400038f.invoke();
    }
}
