package rh3;

/* loaded from: classes15.dex */
public interface o {
    void b(boolean z17);

    void c(float f17, float f18);

    void d(rh3.p pVar);

    void e(rh3.f fVar);

    void f(rh3.e eVar);

    void g(rh3.d dVar);

    long getCurrentPositionMs();

    long getDurationMs();

    int getState();

    java.lang.String getTag();

    int getVideoHeight();

    int getVideoWidth();

    void h(rh3.m mVar);

    void i(rh3.h hVar);

    boolean isPlaying();

    void j(rh3.k kVar);

    void k(rh3.n nVar);

    void l(rh3.i iVar);

    java.lang.Object m();

    void n(wh3.b bVar);

    void o(rh3.j jVar);

    void p(rh3.l lVar);

    void pause();

    void prepareAsync();

    void q(rh3.g gVar);

    void release();

    void reset();

    void seekTo(long j17);

    void setOutputMute(boolean z17);

    void setPlaySpeedRatio(float f17);

    void setSurface(android.view.Surface surface);

    void start();

    void stop();
}
