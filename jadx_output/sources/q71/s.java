package q71;

/* loaded from: classes8.dex */
public class s extends com.tencent.mm.sdk.event.n {
    public s() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RcptAddressEvent rcptAddressEvent = (com.tencent.mm.autogen.events.RcptAddressEvent) iEvent;
        com.tencent.mars.xlog.Log.i("MicroMsg.RcptAddressEventListener", "revent " + rcptAddressEvent.f54642g.f7061a);
        java.lang.String h17 = gm0.j1.u().h();
        com.tencent.mm.vfs.w6.c(rcptAddressEvent.f54642g.f7061a, h17 + "address");
        o71.l.Bi().f360340b = true;
        return false;
    }
}
