package qs;

/* loaded from: classes8.dex */
public class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        z71.f Bi = z71.f.Bi();
        Bi.getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new z71.c(Bi, (com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent) iEvent), "Ai_thread");
        return false;
    }
}
