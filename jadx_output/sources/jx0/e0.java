package jx0;

/* loaded from: classes5.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar f302369d;

    public e0(com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar) {
        this.f302369d = playbackTimelineToolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar = this.f302369d;
        if (playbackTimelineToolbar.G) {
            return;
        }
        playbackTimelineToolbar.f69446x.setTranslationX((-(r1.getWidth() / 2.0f)) + (playbackTimelineToolbar.f69447y.getWidth() / 2.0f) + 0.0f);
    }
}
