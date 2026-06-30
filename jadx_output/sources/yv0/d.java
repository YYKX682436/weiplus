package yv0;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yv0.f f465958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.layout.OffsetRange f465959e;

    public d(yv0.f fVar, double d17, com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange) {
        this.f465958d = fVar;
        this.f465959e = offsetRange;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.TimelineAdapterInnerContainer i17 = this.f465958d.i();
        com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange = this.f465959e;
        kotlin.jvm.internal.o.g(offsetRange, "offsetRange");
        i17.invalidate();
    }
}
