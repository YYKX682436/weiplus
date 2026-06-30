package r21;

@j95.b
/* loaded from: classes11.dex */
public class w extends i95.w {
    public static com.tencent.mm.storage.q7 Ai() {
        gm0.j1.b().c();
        com.tencent.mm.storage.o7 wi6 = wi();
        com.tencent.mm.storage.q7 q7Var = (com.tencent.mm.storage.q7) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ui();
        q7Var.add(wi6, gm0.j1.e().a());
        return q7Var;
    }

    public static com.tencent.mm.storage.u8 Bi() {
        gm0.j1.b().c();
        return (com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi();
    }

    public static com.tencent.mm.storage.qa Di() {
        gm0.j1.b().c();
        return (com.tencent.mm.storage.qa) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).ij();
    }

    public static com.tencent.mm.storage.o7 wi() {
        gm0.j1.b().c();
        return (com.tencent.mm.storage.o7) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ri();
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        int W0 = wi().W0();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c01.d9.b().p().l(340225, null), 0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVerify", "timeInterval = " + currentTimeMillis);
        if (currentTimeMillis <= 259200000 || W0 <= 0) {
            return;
        }
        com.tencent.mm.storage.o7 wi6 = wi();
        wi6.getClass();
        android.database.Cursor f17 = wi6.f195203d.f(java.lang.String.format("select %s from %s where isNew = 1 ORDER BY lastModifiedTime DESC limit %d", "contentNickname", "fmessage_conversation", 2), null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            arrayList.add(f17.getString(f17.getColumnIndex("contentNickname")));
        }
        f17.close();
        int size = arrayList.size();
        if (size > 0) {
            java.lang.String str = (java.lang.String) arrayList.get(0);
            for (int i17 = 1; i17 < size; i17++) {
                str = str + ", " + ((java.lang.String) arrayList.get(i17));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVerify", "title = " + str);
            com.tencent.mm.autogen.events.NotifyNewFriendRequestEvent notifyNewFriendRequestEvent = new com.tencent.mm.autogen.events.NotifyNewFriendRequestEvent();
            am.ul ulVar = notifyNewFriendRequestEvent.f54549g;
            ulVar.f8103a = null;
            ulVar.f8104b = str;
            ulVar.f8105c = 0;
            notifyNewFriendRequestEvent.e();
            c01.d9.b().p().w(340225, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).g();
    }
}
