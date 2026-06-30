package ll3;

/* loaded from: classes10.dex */
public final class p0 extends com.tencent.mm.sdk.event.n {
    public p0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.VoipEvent event = (com.tencent.mm.autogen.events.VoipEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!gm0.j1.h() || !gm0.j1.a()) {
            return false;
        }
        am.y00 y00Var = event.f54945g;
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicFloatBallManager", "receive VoipEvent:[%s, %s]", java.lang.Integer.valueOf(y00Var.f8419f), java.lang.Integer.valueOf(y00Var.f8415b));
        int i17 = y00Var.f8415b;
        if (i17 != 7 && i17 != 3) {
            return false;
        }
        ll3.q0.f319210a.a(true);
        return false;
    }
}
