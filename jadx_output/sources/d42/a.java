package d42;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static d42.a f226400b;

    /* renamed from: a, reason: collision with root package name */
    public long f226401a;

    public a() {
        this.f226401a = 0L;
        if (!gm0.j1.a()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f226401a = java.lang.System.currentTimeMillis();
        } else {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_GET_EXPTID_BEGIN_TIME_LONG;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f226401a = c17.t(u3Var, java.lang.System.currentTimeMillis());
        }
    }

    public static d42.a a() {
        if (f226400b == null) {
            f226400b = new d42.a();
        }
        return f226400b;
    }
}
