package jx0;

/* loaded from: classes5.dex */
public final class f0 extends db5.w5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar f302371d;

    public f0(com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar) {
        this.f302371d = playbackTimelineToolbar;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return true;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        this.f302371d.K.d();
        return true;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar = this.f302371d;
        float f19 = playbackTimelineToolbar.E;
        if (!playbackTimelineToolbar.F) {
            return true;
        }
        float f27 = f19 - f17;
        if (f27 < 0.0f) {
            f27 = 0.0f;
        }
        float max = playbackTimelineToolbar.A.getMax();
        if (f27 > max) {
            f27 = max;
        }
        playbackTimelineToolbar.E = f27;
        playbackTimelineToolbar.C(playbackTimelineToolbar.E);
        playbackTimelineToolbar.K.c(playbackTimelineToolbar.getPercent());
        return true;
    }
}
