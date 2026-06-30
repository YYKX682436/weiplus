package rv0;

/* loaded from: classes5.dex */
public final class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.f5 f399985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.layout.OffsetRange f399986e;

    public e5(rv0.f5 f5Var, double d17, com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange) {
        this.f399985d = f5Var;
        this.f399986e = offsetRange;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.TimelineAdapterInnerContainer timelineAdapterInnerContainer = this.f399985d.f400002e;
        timelineAdapterInnerContainer.getClass();
        com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange = this.f399986e;
        kotlin.jvm.internal.o.g(offsetRange, "offsetRange");
        timelineAdapterInnerContainer.invalidate();
    }
}
