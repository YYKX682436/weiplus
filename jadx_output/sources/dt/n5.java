package dt;

/* loaded from: classes9.dex */
public class n5 extends com.tencent.mm.sdk.event.n {
    public n5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = (com.tencent.mm.autogen.events.SendMsgEvent) iEvent;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(sendMsgEvent.f54752g.f7362a.split(",")).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            boolean a17 = w11.t1.a(str);
            am.mt mtVar = sendMsgEvent.f54752g;
            if (a17) {
                w11.r1 a18 = w11.s1.a(str);
                a18.e(mtVar.f7363b);
                a18.h(mtVar.f7364c);
                a18.f442131f = mtVar.f7365d;
                a18.b();
            } else {
                w11.r1 a19 = w11.s1.a(str);
                a19.g(str);
                a19.e(mtVar.f7363b);
                a19.h(mtVar.f7364c);
                a19.f442131f = mtVar.f7365d;
                a19.f442134i = 4;
                a19.a().a();
            }
        }
        return false;
    }
}
