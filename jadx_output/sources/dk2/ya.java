package dk2;

/* loaded from: classes3.dex */
public final class ya {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.ya f234386a = new dk2.ya();

    /* renamed from: b, reason: collision with root package name */
    public static r45.i22 f234387b;

    public final r45.i22 a() {
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalStateException("FinderLiveNetworkIdentityAuthManager must be called on main thread".toString());
        }
        if (f234387b == null) {
            ae2.in inVar = ae2.in.f3688a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3727d8).getValue()).r()).intValue() == 1) {
                com.tencent.mars.xlog.Log.i("FinderLiveNetworkIdentityAuthManager", "[getAuthParams] using mock params for debug");
                r45.i22 i22Var = new r45.i22();
                i22Var.set(0, "");
                i22Var.set(1, "");
                i22Var.set(2, "");
                i22Var.set(3, "");
                i22Var.set(4, "");
                i22Var.set(5, "");
                return i22Var;
            }
        }
        return f234387b;
    }
}
