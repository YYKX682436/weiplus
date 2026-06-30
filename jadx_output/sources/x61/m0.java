package x61;

/* loaded from: classes11.dex */
public class m0 extends com.tencent.mm.sdk.event.n {
    public m0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.au auVar = ((com.tencent.mm.autogen.events.SetLocalQQMobileEvent) iEvent).f54766g;
        android.content.Intent intent = auVar.f6187a;
        java.lang.String str = auVar.f6188b;
        if (intent == null || str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AccountSyncUtil", "setLocalQQMobile fail, intent = " + intent + ", username = " + str);
            return false;
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        r61.w1 h17 = m61.k.Ri().h(str);
        if (h17 != null) {
            intent.putExtra("Contact_Uin", h17.f392978a);
            intent.putExtra("Contact_QQNick", h17.c());
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        r61.a h18 = m61.k.wi().h(str);
        if (h18 == null) {
            return false;
        }
        intent.putExtra("Contact_Mobile_MD5", h18.e());
        return false;
    }
}
