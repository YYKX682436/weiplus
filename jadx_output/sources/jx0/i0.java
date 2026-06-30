package jx0;

/* loaded from: classes5.dex */
public final class i0 implements jx0.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar f302375a;

    public i0(com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar) {
        this.f302375a = playbackTimelineToolbar;
    }

    @Override // jx0.g0
    public void a(float f17) {
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar = this.f302375a;
        playbackTimelineToolbar.F = false;
        jx0.g0 g0Var = playbackTimelineToolbar.f69445w;
        if (g0Var != null) {
            g0Var.a(f17);
        }
    }

    @Override // jx0.g0
    public int b() {
        jx0.g0 g0Var = this.f302375a.f69445w;
        if (g0Var != null) {
            return g0Var.b();
        }
        return 1;
    }

    @Override // jx0.g0
    public void c(float f17) {
        jx0.g0 g0Var = this.f302375a.f69445w;
        if (g0Var != null) {
            g0Var.c(f17);
        }
    }

    @Override // jx0.g0
    public void d() {
        jx0.g0 g0Var = this.f302375a.f69445w;
        if (g0Var != null) {
            g0Var.d();
        }
    }

    @Override // jx0.g0
    public void e(float f17) {
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar = this.f302375a;
        playbackTimelineToolbar.F = true;
        jx0.g0 g0Var = playbackTimelineToolbar.f69445w;
        if (g0Var != null) {
            g0Var.e(f17);
        }
    }
}
