package fy0;

/* loaded from: classes5.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView f267184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f267185e;

    public g(com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView, boolean z17) {
        this.f267184d = baseTimelineView;
        this.f267185e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f267184d.h(this.f267185e);
    }
}
