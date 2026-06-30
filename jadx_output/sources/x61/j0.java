package x61;

/* loaded from: classes12.dex */
public class j0 extends com.tencent.mm.sdk.event.n {
    public j0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetContactUsernameByMobileEvent getContactUsernameByMobileEvent = (com.tencent.mm.autogen.events.GetContactUsernameByMobileEvent) iEvent;
        if (getContactUsernameByMobileEvent instanceof com.tencent.mm.autogen.events.GetContactUsernameByMobileEvent) {
            java.lang.String str = getContactUsernameByMobileEvent.f54386g.f7423a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GetUsernameByMobileListener", "hy: mobile number is null");
            } else {
                r61.b wi6 = m61.k.wi();
                wi6.getClass();
                android.database.Cursor f17 = wi6.f392819d.f("select addr_upload2.username from addr_upload2 where addr_upload2.moblie = " + str, null, 2);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (f17.moveToNext()) {
                    linkedList.add(f17.getString(0));
                }
                f17.close();
                java.lang.String str2 = linkedList.size() == 0 ? "" : (java.lang.String) linkedList.get(0);
                com.tencent.mars.xlog.Log.i("MicroMsg.GetUsernameByMobileListener", "hy: username: %s", str2);
                getContactUsernameByMobileEvent.f54387h.f7531a = str2;
            }
        }
        return false;
    }
}
