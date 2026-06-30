package if3;

/* loaded from: classes8.dex */
public class p0 extends com.tencent.mm.sdk.event.n {
    public p0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.util.List list = ((com.tencent.mm.autogen.events.UpdatePackageEvent) iEvent).f54922g.f6203b;
        if (list != null) {
            java.util.LinkedList linkedList = (java.util.LinkedList) list;
            if (linkedList.size() > 0) {
                byte[] d17 = x51.j1.d(((r45.n35) linkedList.get(0)).f381058h);
                if (d17 != null && d17.length != 0) {
                    java.lang.String str = new java.lang.String(d17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.UpdateMassSendPlaceTopListener", "MassSendTopConfXml:".concat(str));
                    if3.k0.Bi().d(str);
                }
                return false;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.UpdateMassSendPlaceTopListener", "empty mass send top config package");
        return false;
    }
}
