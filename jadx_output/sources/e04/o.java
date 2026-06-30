package e04;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final e04.o f246034a = new e04.o();

    /* renamed from: b, reason: collision with root package name */
    public static int f246035b = -1;

    public final boolean a(int i17, int i18, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        if (scene.getType() == 233 || scene.getType() == 106 || scene.getType() == 1061) {
            return i17 == 1 || i17 == 2 || i17 == 3 || i17 == 7 || i17 == 8 || i17 == 9;
        }
        return false;
    }

    public final void b(com.tencent.mm.plugin.scanner.model.OfflineScanContext context, java.lang.String showMsg, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(showMsg, "showMsg");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineScanManager", "OfflineScan handleNetworkUnconnected needNotifyMessage: %b, context: %s, time: %d", java.lang.Boolean.valueOf(z17), context, java.lang.Long.valueOf(context.f158766m));
        com.tencent.mm.plugin.scanner.model.OfflineScanContext.CREATOR.getClass();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
        obtain.setDataPosition(0);
        context.writeToParcel(obtain, 0);
        java.lang.String encodeToString = android.util.Base64.encodeToString(obtain.marshall(), 0);
        kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineScanManager", "insertOfflineScanMessage");
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.u1("notifymessage");
            f9Var.j1(0);
            f9Var.r1(3);
            f9Var.setType(721420337);
            f9Var.e1(c01.w9.p());
            f9Var.d1(encodeToString);
            c01.w9.x(f9Var);
            com.tencent.mm.autogen.events.AppMsgInsertEvent appMsgInsertEvent = new com.tencent.mm.autogen.events.AppMsgInsertEvent();
            appMsgInsertEvent.f53988g.f6201a = f9Var;
            appMsgInsertEvent.e();
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_OFFLINE_SCAN_LOCAL_STORAGE_STRING_SYNC;
        java.lang.Object m17 = c17.m(u3Var, "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) m17;
        if (str.length() > 0) {
            encodeToString = str + ',' + encodeToString;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineScanManager", "handleNetworkUnconnected toSave string length: %d", java.lang.Integer.valueOf(encodeToString.length()));
        gm0.j1.u().c().x(u3Var, encodeToString);
    }
}
