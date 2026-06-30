package qo3;

/* loaded from: classes15.dex */
public class o1 extends com.tencent.mm.sdk.event.n {
    public o1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        po3.o Di = po3.p.wi().Di();
        Di.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new po3.l(Di, (com.tencent.mm.autogen.events.SnsPostSuccessEvent) iEvent));
        return false;
    }
}
