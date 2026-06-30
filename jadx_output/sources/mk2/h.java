package mk2;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final mk2.h f327133a = new mk2.h();

    /* renamed from: b, reason: collision with root package name */
    public static final mk2.c f327134b = new mk2.c();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f327135c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f327136d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f327137e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final mk2.b f327138f = new mk2.b();

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Runnable f327139g = mk2.d.f327129d;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.ref.WeakReference f327140h;

    public final void a(long j17) {
        com.tencent.mars.xlog.Log.i("Finder.LinkMicTimeoutTimer", "startRandomMatchTimer delay:" + j17);
        com.tencent.mm.sdk.platformtools.u3.i(f327139g, j17);
    }

    public final void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.LinkMicTimeoutTimer", "stopAcceptMicNewAnchorPkTimer userName:" + str);
        if (str != null) {
            com.tencent.mm.sdk.platformtools.u3.l((java.lang.Runnable) f327136d.get(str));
        }
    }

    public final void c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.LinkMicTimeoutTimer", "stopAcceptMicTimer micId:" + str);
        if (str != null) {
            com.tencent.mm.sdk.platformtools.u3.l((java.lang.Runnable) f327137e.get(str));
        }
    }

    public final void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.LinkMicTimeoutTimer", "stopApplyMicNewAnchorPkTimer userName:" + str);
        if (str != null) {
            java.util.HashMap hashMap = f327135c;
            com.tencent.mm.sdk.platformtools.u3.l((java.lang.Runnable) hashMap.get(str));
        }
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("Finder.LinkMicTimeoutTimer", "stopApplyMicTimer");
        com.tencent.mm.sdk.platformtools.u3.l(f327134b);
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("Finder.LinkMicTimeoutTimer", "stopRandomMatchTimer");
        com.tencent.mm.sdk.platformtools.u3.l(f327139g);
    }
}
