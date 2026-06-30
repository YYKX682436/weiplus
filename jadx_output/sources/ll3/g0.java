package ll3;

/* loaded from: classes11.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.MusicPlayerEvent f319170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ll3.j0 f319171e;

    public g0(ll3.j0 j0Var, com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
        this.f319171e = j0Var;
        this.f319170d = musicPlayerEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean c17 = b21.m.c();
        ll3.j0 j0Var = this.f319171e;
        if (c17) {
            com.tencent.mars.xlog.Log.i(j0Var.f319184n, "delay stop and playing music again");
            return;
        }
        if (j0Var.u()) {
            com.tencent.mm.plugin.ball.model.BallInfo s17 = j0Var.s();
            if (s17 == null || !s17.I) {
                j0Var.o0();
                return;
            }
            int i17 = s17.f93046d;
            com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = this.f319170d;
            if (i17 != 23) {
                j0Var.t().f93090m = musicPlayerEvent.f54512g.f7036b == 2 ? 10 : 11;
                j0Var.g();
                j0Var.d();
                return;
            }
            if (musicPlayerEvent.f54512g.f7036b == 7) {
                j0Var.j0(musicPlayerEvent);
            } else {
                j0Var.n0(musicPlayerEvent);
            }
        }
    }
}
