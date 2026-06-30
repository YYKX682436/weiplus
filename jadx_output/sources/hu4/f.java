package hu4;

/* loaded from: classes9.dex */
public abstract class f {
    public static boolean a() {
        return ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_GESTURE_IS_OPENED_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
    }

    public static void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGuardManager", "setUserSetGesturePwd: %b", java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_GESTURE_IS_OPENED_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().i(true);
    }
}
