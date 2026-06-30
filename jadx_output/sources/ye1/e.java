package ye1;

/* loaded from: classes7.dex */
public interface e extends ye1.s {
    void B(ye1.m mVar);

    void b(boolean z17);

    void c(float f17, float f18);

    void d(ye1.f fVar);

    boolean f(float f17);

    void g(ye1.q qVar);

    int getCurrentPosition();

    int getDuration();

    int getPlayerType();

    int getState();

    int getVideoHeight();

    int getVideoWidth();

    void h(ye1.n nVar);

    void i(ye1.o oVar);

    boolean isPlaying();

    void j(boolean z17);

    void k(ye1.k kVar);

    ye1.e l(java.lang.Class cls);

    void m(java.lang.String str, java.lang.String str2);

    void n(double d17);

    void p(ye1.l lVar);

    void pause();

    void prepareAsync();

    void q(ye1.i iVar);

    void r(ye1.j jVar);

    void release();

    void reset();

    default void s(ye1.p pVar) {
    }

    void seekTo(long j17);

    void setDataSource(java.lang.String str);

    default void setMinBufferDuration(long j17) {
    }

    void setMute(boolean z17);

    void setSurface(android.view.Surface surface);

    void start();

    void stop();

    void t(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17);

    default void u(final java.lang.String str, final java.lang.String str2, final ye1.h hVar) {
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: ye1.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                ye1.e eVar = ye1.e.this;
                java.lang.String str3 = str;
                java.lang.String str4 = str2;
                final ye1.h hVar2 = hVar;
                eVar.m(str3, str4);
                if (hVar2 != null) {
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: ye1.e$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((ff1.i) ye1.h.this).a();
                        }
                    });
                }
            }
        });
    }

    void w(java.lang.String str);

    void x(java.lang.String str, java.lang.String str2, int i17);

    default void y(java.lang.String str, int i17) {
        setDataSource(str);
    }

    void z(ye1.g gVar);
}
