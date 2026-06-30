package rh3;

/* loaded from: classes15.dex */
public class r implements rh3.o {

    /* renamed from: d, reason: collision with root package name */
    public final rh3.o f395681d;

    /* renamed from: e, reason: collision with root package name */
    public final th3.a f395682e;

    public r(rh3.o player) {
        kotlin.jvm.internal.o.g(player, "player");
        this.f395681d = player;
        this.f395682e = new th3.a();
    }

    public final void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f395681d.getTag(), "operate:" + str + " invalid in state:" + getState());
    }

    @Override // rh3.o
    public void b(boolean z17) {
        this.f395681d.b(z17);
    }

    @Override // rh3.o
    public void c(float f17, float f18) {
        this.f395681d.c(f17, f18);
    }

    @Override // rh3.o
    public void d(rh3.p onePlayContext) {
        kotlin.jvm.internal.o.g(onePlayContext, "onePlayContext");
        this.f395681d.d(onePlayContext);
    }

    @Override // rh3.o
    public void e(rh3.f listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f395681d.e(listener);
    }

    @Override // rh3.o
    public void f(rh3.e listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f395681d.f(listener);
    }

    @Override // rh3.o
    public void g(rh3.d listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f395681d.g(listener);
    }

    @Override // rh3.o
    public long getCurrentPositionMs() {
        int state = getState();
        this.f395682e.getClass();
        boolean z17 = true;
        if (state != 1 && state != 2 && state != 3 && state != 4 && state != 5 && state != 6 && state != 8 && state != 9 && state != 7) {
            z17 = false;
        }
        if (z17) {
            return this.f395681d.getCurrentPositionMs();
        }
        a("getCurrentPosition");
        return -1L;
    }

    @Override // rh3.o
    public long getDurationMs() {
        int state = getState();
        this.f395682e.getClass();
        if (state == 4 || state == 5 || state == 6 || state == 8 || state == 9 || state == 7) {
            return this.f395681d.getDurationMs();
        }
        a("getDuration");
        return -1L;
    }

    @Override // rh3.o
    public int getState() {
        return this.f395681d.getState();
    }

    @Override // rh3.o
    public java.lang.String getTag() {
        return this.f395681d.getTag();
    }

    @Override // rh3.o
    public int getVideoHeight() {
        return this.f395681d.getVideoHeight();
    }

    @Override // rh3.o
    public int getVideoWidth() {
        return this.f395681d.getVideoWidth();
    }

    @Override // rh3.o
    public void h(rh3.m listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f395681d.h(listener);
    }

    @Override // rh3.o
    public void i(rh3.h listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f395681d.i(listener);
    }

    @Override // rh3.o
    public boolean isPlaying() {
        return this.f395681d.isPlaying();
    }

    @Override // rh3.o
    public void j(rh3.k listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f395681d.j(listener);
    }

    @Override // rh3.o
    public void k(rh3.n listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f395681d.k(listener);
    }

    @Override // rh3.o
    public void l(rh3.i listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f395681d.l(listener);
    }

    @Override // rh3.o
    public java.lang.Object m() {
        return this.f395681d.m();
    }

    @Override // rh3.o
    public void n(wh3.b mediaSource) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        this.f395681d.n(mediaSource);
    }

    @Override // rh3.o
    public void o(rh3.j listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f395681d.o(listener);
    }

    @Override // rh3.o
    public void p(rh3.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f395681d.p(listener);
    }

    @Override // rh3.o
    public void pause() {
        int state = getState();
        this.f395682e.getClass();
        if (state == 5 || state == 6 || state == 7) {
            this.f395681d.pause();
        } else {
            a("pause");
        }
    }

    @Override // rh3.o
    public void prepareAsync() {
        int state = getState();
        this.f395682e.getClass();
        boolean z17 = true;
        if (state != 1 && state != 8 && state != 9) {
            z17 = false;
        }
        if (z17) {
            this.f395681d.prepareAsync();
        } else {
            a("prepareAsync");
        }
    }

    @Override // rh3.o
    public void q(rh3.g listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f395681d.q(listener);
    }

    @Override // rh3.o
    public void release() {
        int state = getState();
        this.f395682e.getClass();
        boolean z17 = true;
        if (state != 1 && state != 2 && state != 3 && state != 4 && state != 5 && state != 6 && state != 8 && state != 9 && state != 7 && state != 10) {
            z17 = false;
        }
        if (z17) {
            this.f395681d.release();
        } else {
            a("release");
        }
    }

    @Override // rh3.o
    public void reset() {
        int state = getState();
        this.f395682e.getClass();
        boolean z17 = true;
        if (state != 1 && state != 2 && state != 3 && state != 4 && state != 5 && state != 6 && state != 8 && state != 9 && state != 7 && state != 10) {
            z17 = false;
        }
        if (z17) {
            this.f395681d.reset();
        } else {
            a("reset");
        }
    }

    @Override // rh3.o
    public void seekTo(long j17) {
        int state = getState();
        this.f395682e.getClass();
        if (state == 4 || state == 5 || state == 6 || state == 7) {
            this.f395681d.seekTo(j17);
        } else {
            a("seekTo");
        }
    }

    @Override // rh3.o
    public void setOutputMute(boolean z17) {
        com.tencent.mars.xlog.Log.i(getTag(), "setOutputMute:" + z17);
        this.f395681d.setOutputMute(z17);
    }

    @Override // rh3.o
    public void setPlaySpeedRatio(float f17) {
        this.f395681d.setPlaySpeedRatio(f17);
    }

    @Override // rh3.o
    public void setSurface(android.view.Surface surface) {
        this.f395681d.setSurface(surface);
    }

    @Override // rh3.o
    public void start() {
        int state = getState();
        this.f395682e.getClass();
        if (state == 4 || state == 5 || state == 6 || state == 7) {
            this.f395681d.start();
        } else {
            a("start");
        }
    }

    @Override // rh3.o
    public void stop() {
        int state = getState();
        this.f395682e.getClass();
        if (state == 3 || state == 4 || state == 5 || state == 8 || state == 9 || state == 6 || state == 7) {
            this.f395681d.stop();
        } else {
            a("stop");
        }
    }
}
