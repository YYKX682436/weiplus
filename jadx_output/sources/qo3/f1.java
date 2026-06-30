package qo3;

/* loaded from: classes9.dex */
public class f1 extends com.tencent.mm.sdk.event.n {
    public f1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        po3.k Bi = po3.p.wi().Bi();
        Bi.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new po3.h(Bi, (com.tencent.mm.autogen.events.SendMsgFailEvent) iEvent));
        return false;
    }
}
