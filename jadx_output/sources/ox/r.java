package ox;

@j95.b
/* loaded from: classes8.dex */
public final class r extends i95.w implements rm.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.z0 f349509d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.z0 f349510e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.h1 f349511f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.h1 f349512g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.p1 f349513h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.p1 f349514i;

    /* renamed from: m, reason: collision with root package name */
    public long f349515m;

    public r() {
        com.tencent.wechat.iam.biz.t1 t1Var = com.tencent.wechat.iam.biz.t1.f217792c;
        this.f349509d = t1Var.a().a();
        this.f349510e = t1Var.f().a();
        this.f349511f = t1Var.a().c();
        this.f349512g = t1Var.f().c();
        this.f349513h = t1Var.a().b();
        this.f349514i = t1Var.f().b();
    }

    public java.lang.String Ai() {
        java.lang.String str = ((r01.l1) i95.n0.c(r01.l1.class)).f368147i.f368153a;
        java.nio.charset.Charset charset = r26.c.f368865a;
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        byte[] decode = android.util.Base64.decode(bytes, 0);
        kotlin.jvm.internal.o.f(decode, "decode(...)");
        return new java.lang.String(decode, charset);
    }

    public com.tencent.wechat.iam.biz.z0 Bi(int i17) {
        tk.s[] sVarArr = tk.s.f419870d;
        if (i17 == 2) {
            com.tencent.wechat.iam.biz.z0 z0Var = this.f349510e;
            kotlin.jvm.internal.o.d(z0Var);
            return z0Var;
        }
        com.tencent.wechat.iam.biz.z0 z0Var2 = this.f349509d;
        kotlin.jvm.internal.o.d(z0Var2);
        return z0Var2;
    }

    public com.tencent.wechat.iam.biz.p1 Di(int i17) {
        tk.s[] sVarArr = tk.s.f419870d;
        if (i17 == 2) {
            com.tencent.wechat.iam.biz.p1 p1Var = this.f349514i;
            kotlin.jvm.internal.o.d(p1Var);
            return p1Var;
        }
        com.tencent.wechat.iam.biz.p1 p1Var2 = this.f349513h;
        kotlin.jvm.internal.o.d(p1Var2);
        return p1Var2;
    }

    public com.tencent.wechat.iam.biz.h1 Ni(int i17) {
        tk.s[] sVarArr = tk.s.f419870d;
        if (i17 == 2) {
            com.tencent.wechat.iam.biz.h1 h1Var = this.f349512g;
            kotlin.jvm.internal.o.d(h1Var);
            return h1Var;
        }
        com.tencent.wechat.iam.biz.h1 h1Var2 = this.f349511f;
        kotlin.jvm.internal.o.d(h1Var2);
        return h1Var2;
    }

    public boolean wi() {
        boolean c17 = com.tencent.wechat.iam.biz.t1.f217792c.c();
        com.tencent.wechat.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f368148m.f368154b;
        return c17 && (bVar != null && bVar.f217901t == 1);
    }
}
