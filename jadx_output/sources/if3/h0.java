package if3;

/* loaded from: classes.dex */
public class h0 extends com.tencent.mm.sdk.event.n {
    public h0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (gm0.j1.a()) {
            if3.k0.Bi().getClass();
            if (java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c01.d9.b().p().l(102409, null), 0L) > 900000) {
                if3.k0.Bi().a();
                if3.a0 Bi = if3.k0.Bi();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                Bi.getClass();
                c01.d9.b().p().w(102409, java.lang.Long.valueOf(currentTimeMillis));
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.PostTaskMassSendListener", "has not set uin");
        }
        return false;
    }
}
