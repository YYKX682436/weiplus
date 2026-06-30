package g61;

/* loaded from: classes15.dex */
public class f extends com.tencent.mm.sdk.event.n {
    public f() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CloseAAUrgeNotifyEvent closeAAUrgeNotifyEvent = (com.tencent.mm.autogen.events.CloseAAUrgeNotifyEvent) iEvent;
        if (com.tencent.mm.sdk.platformtools.t8.K0(closeAAUrgeNotifyEvent.f54064g.f6307a)) {
            return false;
        }
        am.c3 c3Var = closeAAUrgeNotifyEvent.f54064g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(c3Var.f6308b)) {
            return false;
        }
        new i61.d(c3Var.f6307a, c3Var.f6308b).l().q(new g61.e(this, closeAAUrgeNotifyEvent));
        return false;
    }
}
