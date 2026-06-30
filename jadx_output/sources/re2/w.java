package re2;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final long f394495a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f394496b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f394497c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f394498d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f394499e;

    public w(long j17, java.util.List avatarUrls) {
        kotlin.jvm.internal.o.g(avatarUrls, "avatarUrls");
        this.f394495a = j17;
        this.f394496b = avatarUrls;
        this.f394497c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f394498d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f394499e = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    public static final void a(re2.w wVar, yz5.l lVar, re2.g gVar, int i17, java.lang.String str) {
        if (wVar.f394497c.compareAndSet(false, true)) {
            com.tencent.mars.xlog.Log.e("Finder.CoLiveAvatarMerger", "dispatchFail: stage=" + gVar + ", errCode=" + i17 + ", errMsg=" + str);
            if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                lVar.invoke(new re2.h(gVar, i17, str));
            } else {
                wVar.f394498d.post(new re2.i(lVar, gVar, i17, str));
            }
        }
    }

    public final void b(yz5.l lVar, java.lang.String str) {
        if (this.f394497c.compareAndSet(false, true)) {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveAvatarMerger", "dispatchSuccess: mergedUrl=".concat(r26.p0.E0(str, 80)));
            if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                lVar.invoke(str);
            } else {
                this.f394498d.post(new re2.j(lVar, str));
            }
        }
    }
}
