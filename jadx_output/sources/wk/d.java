package wk;

/* loaded from: classes12.dex */
public class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExtNetSceneSendMsgEvent extNetSceneSendMsgEvent = (com.tencent.mm.autogen.events.ExtNetSceneSendMsgEvent) iEvent;
        w11.r1 a17 = w11.s1.a(extNetSceneSendMsgEvent.f54200g.f6915a);
        am.i8 i8Var = extNetSceneSendMsgEvent.f54200g;
        a17.g(i8Var.f6915a);
        a17.e(i8Var.f6916b);
        a17.h(i8Var.f6917c);
        a17.f442131f = 0;
        a17.f442134i = 4;
        w11.n1 a18 = a17.a();
        com.tencent.mm.modelbase.m1 m1Var = a18.f442095a;
        am.j8 j8Var = extNetSceneSendMsgEvent.f54201h;
        j8Var.f7015b = m1Var;
        j8Var.f7014a = a18.f442096b;
        return true;
    }
}
