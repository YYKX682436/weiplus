package g34;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.text.SimpleDateFormat f268176a;

    public static void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance()");
        if (g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() entrance is open");
            if (f()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() card entrance is not in open time, close card entrance");
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_OPEN_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() entrance is not open");
        if (!f()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() card entrance is not in open time");
        } else {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_OPEN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() open shake card entrance");
        }
    }

    public static int b() {
        int currentTimeMillis = (((int) (java.lang.System.currentTimeMillis() % 10)) + new java.util.Random(c01.d9.b().C()).nextInt(10)) % 10;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardUtil", "genShakeCardFrequencyLevel retRand:" + currentTimeMillis);
        return currentTimeMillis;
    }

    public static int c() {
        return ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ACTIVITY_TYPE_INT_SYNC, 0)).intValue();
    }

    public static java.lang.String d() {
        return (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC, "");
    }

    public static int e(int i17) {
        switch (i17) {
            case 1:
                return 20;
            case 2:
                return 30;
            case 3:
                return 60;
            case 4:
                return 90;
            case 5:
                return 120;
            case 6:
                return 150;
            case 7:
                return 180;
            case 8:
                return 240;
            case 9:
                return 300;
            default:
                return 10;
        }
    }

    public static boolean f() {
        int intValue = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_BEGIN_TIME_INT_SYNC, 0)).intValue();
        int intValue2 = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_END_TIME_INT_SYNC, 0)).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time : " + intValue + " end time : " + intValue2);
        if (intValue <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time is " + intValue + " , invalid");
            return false;
        }
        if (intValue2 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil end time  is " + intValue2 + " , invalid");
            return false;
        }
        if (intValue >= intValue2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time is >= end time, invalid time");
            return false;
        }
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time : " + currentTimeMillis);
        if (currentTimeMillis < intValue || currentTimeMillis > intValue2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time is not incled in [btime, etime]");
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time is incled in [btime, etime]");
        return true;
    }

    public static boolean g() {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardUtil", "acc is not ready");
            return false;
        }
        java.lang.Object m17 = c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_OPEN_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        if (m17 != null) {
            return ((java.lang.Boolean) m17).booleanValue();
        }
        return false;
    }

    public static boolean h() {
        return g() && com.tencent.mm.sdk.platformtools.m2.j();
    }
}
