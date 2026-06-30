package ks3;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BindQQEvent bindQQEvent = (com.tencent.mm.autogen.events.BindQQEvent) iEvent;
        if (bindQQEvent instanceof com.tencent.mm.autogen.events.BindQQEvent) {
            bindQQEvent.f54000g.getClass();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.QQMail.EventListener", "unbind qq, bindXMail is [%s]", str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                try {
                    gm0.j1.u().c().w(17, 2);
                    int n17 = c01.z1.n() | 1;
                    gm0.j1.u().c().w(34, java.lang.Integer.valueOf(n17));
                    ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", n17, "", 0, "", 0));
                    ls3.e.b();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QQMail.EventListener", e17, "", new java.lang.Object[0]);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.f("MicroMsg.QQMail.EventListener", "not bind qq event");
        }
        return false;
    }
}
