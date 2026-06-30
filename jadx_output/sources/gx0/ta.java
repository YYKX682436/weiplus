package gx0;

/* loaded from: classes5.dex */
public final class ta implements com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.a f276985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276986b;

    public ta(gx0.ac acVar) {
        this.f276986b = acVar;
        if (!com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.a.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.a.class.getClassLoader(), new java.lang.Class[]{com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.a.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.TimelineScaleListener");
        }
        this.f276985a = (com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.a) newProxyInstance;
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.a
    public void a() {
        this.f276985a.a();
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.a
    public void b(float f17) {
        this.f276985a.b(f17);
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.a
    public void c() {
        gx0.ac acVar = this.f276986b;
        kotlinx.coroutines.l.d(acVar.getMainScope(), null, null, new gx0.sa(acVar, null), 3, null);
    }
}
