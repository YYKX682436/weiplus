package to3;

@j95.b
/* loaded from: classes9.dex */
public class c0 extends i95.w {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f420951i = false;

    /* renamed from: m, reason: collision with root package name */
    public static volatile int f420952m = 10;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f420953n;

    /* renamed from: d, reason: collision with root package name */
    public wo3.c0 f420954d = null;

    /* renamed from: e, reason: collision with root package name */
    public to3.n f420955e = null;

    /* renamed from: f, reason: collision with root package name */
    public to3.a0 f420956f = null;

    /* renamed from: g, reason: collision with root package name */
    public xo3.a f420957g = null;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f420958h = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    static {
        com.tencent.mm.wallet_core.a.h("OfflineBindCardRegProcess", to3.l.class);
        com.tencent.mm.wallet_core.a.h("OfflineBindCardProcess", to3.i.class);
        f420953n = false;
    }

    public static to3.c0 Ai() {
        return (to3.c0) i95.n0.c(to3.c0.class);
    }

    public static synchronized int Bi() {
        int i17;
        synchronized (to3.c0.class) {
            if (!f420953n && com.tencent.mm.sdk.platformtools.x2.n() && gm0.j1.a()) {
                f420952m = gm0.j1.u().c().r(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_REGET_TOKEN_NUM_SYNC_INT, 10);
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreOffline", "init get token count: %s", java.lang.Integer.valueOf(f420952m));
                f420953n = true;
            }
            i17 = f420952m;
        }
        return i17;
    }

    public xo3.a Di() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        if (Ai().f420957g == null) {
            to3.c0 Ai = Ai();
            gm0.j1.i();
            Ai.f420957g = new xo3.a(gm0.j1.u().f273153f);
        }
        return Ai().f420957g;
    }

    public java.lang.String Ni(int i17) {
        gm0.j1.i();
        return (java.lang.String) gm0.j1.u().c().l(i17, null);
    }

    public wo3.c0 Ri() {
        gm0.j1.b().c();
        if (Ai().f420954d == null) {
            Ai().f420954d = new wo3.c0();
        }
        return Ai().f420954d;
    }

    public to3.a0 Ui() {
        gm0.j1.b().c();
        if (Ai().f420956f == null) {
            Ai().f420956f = new to3.a0();
        }
        return Ai().f420956f;
    }

    public void Vi(int i17, java.lang.String str) {
        if (str != null) {
            gm0.j1.i();
            gm0.j1.u().c().w(i17, str);
            gm0.j1.i();
            gm0.j1.u().c().i(true);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
    }

    public to3.n wi() {
        gm0.j1.b().c();
        if (Ai().f420955e == null) {
            Ai().f420955e = new to3.n();
        }
        return Ai().f420955e;
    }
}
