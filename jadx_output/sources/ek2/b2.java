package ek2;

/* loaded from: classes3.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j01 f253417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ek2.c2 f253418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(r45.j01 j01Var, ek2.c2 c2Var) {
        super(0);
        this.f253417d = j01Var;
        this.f253418e = c2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        r45.i22 i22Var = this.f253417d.M1;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (i22Var != null) {
            com.tencent.mars.xlog.Log.i(this.f253418e.f253428v, "[saveNetworkIdentityAuthParams] org_id:" + i22Var.getString(0) + ", app_id:" + i22Var.getString(1));
            if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                throw new java.lang.IllegalStateException("FinderLiveNetworkIdentityAuthManager must be called on main thread".toString());
            }
            com.tencent.mars.xlog.Log.i("FinderLiveNetworkIdentityAuthManager", "[saveAuthParams] hasParams=true");
            dk2.ya.f234387b = i22Var;
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                throw new java.lang.IllegalStateException("FinderLiveNetworkIdentityAuthManager must be called on main thread".toString());
            }
            com.tencent.mars.xlog.Log.i("FinderLiveNetworkIdentityAuthManager", "[clearAuthParams]");
            dk2.ya.f234387b = null;
        }
        return f0Var2;
    }
}
