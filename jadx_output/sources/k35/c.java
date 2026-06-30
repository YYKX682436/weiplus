package k35;

/* loaded from: classes11.dex */
public class c implements l75.z0 {

    /* renamed from: e, reason: collision with root package name */
    public static final bm5.p1 f303898e = new k35.a();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f303899f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f303900g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f303901h = false;

    /* renamed from: i, reason: collision with root package name */
    public static volatile boolean f303902i;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f303903d = false;

    public c(k35.a aVar) {
        c();
    }

    public static java.util.List a() {
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "getBlackListContacts");
        ((k35.c) f303898e.b()).c();
        java.util.Set set = f303899f;
        synchronized (set) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "getBlackListContacts cacheReady = %b", java.lang.Boolean.valueOf(f303901h));
            if (((java.util.HashSet) set).isEmpty() && !f303901h) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                android.database.Cursor cursor = null;
                try {
                    gm0.j1.i();
                    com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                    cursor = Bi.f195071d.B("select username from rcontact " + Bi.I("@black.android", "", null), null);
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        ((java.util.HashSet) f303899f).add(cursor.getString(0));
                        cursor.moveToNext();
                    }
                    f303901h = true;
                    cursor.close();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "[select black list] cost:%d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                } catch (java.lang.Throwable th6) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "[select black list] cost:%d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    throw th6;
                }
            }
            java.util.Set set2 = f303899f;
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "[get black list] %s", set2);
            arrayList = new java.util.ArrayList(set2);
        }
        return arrayList;
    }

    public static java.util.List b() {
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "getSnsBlackListContacts");
        ((k35.c) f303898e.b()).c();
        java.util.Set set = f303900g;
        synchronized (set) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "getSnsBlackListContacts snsCacheReady = %b", java.lang.Boolean.FALSE);
            if (((java.util.HashSet) set).isEmpty()) {
                try {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    set.addAll(c01.e2.z());
                    f303901h = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "[select sns black list] cost:%d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ContactBlackListHelper", "getSnsBlackListContacts failed, message = %s", th6.getMessage());
                }
            }
            java.util.Set set2 = f303900g;
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "[get black list] %s", set2);
            arrayList = new java.util.ArrayList(set2);
        }
        return arrayList;
    }

    public final void c() {
        if (com.tencent.mm.sdk.platformtools.x2.n() && gm0.j1.b().m() && !this.f303903d) {
            synchronized (this) {
                if (this.f303903d) {
                    return;
                }
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
                this.f303903d = true;
            }
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "onNotifyChange %s", str);
            if (!(a1Var instanceof com.tencent.mm.storage.e8) || f303902i || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new k35.b(this, str), "Thread-ContactBlackListHelper-onNotifyChange");
        }
    }
}
