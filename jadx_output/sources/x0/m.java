package x0;

/* loaded from: classes14.dex */
public abstract class m {

    /* renamed from: e, reason: collision with root package name */
    public static final x0.l f450907e = new x0.l(null);

    /* renamed from: a, reason: collision with root package name */
    public x0.s f450908a;

    /* renamed from: b, reason: collision with root package name */
    public int f450909b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f450910c;

    /* renamed from: d, reason: collision with root package name */
    public int f450911d;

    public m(int i17, x0.s sVar, kotlin.jvm.internal.i iVar) {
        int i18;
        int a17;
        this.f450908a = sVar;
        this.f450909b = i17;
        if (i17 != 0) {
            x0.s invalid = e();
            n0.c5 c5Var = x0.z.f450962a;
            kotlin.jvm.internal.o.g(invalid, "invalid");
            int[] iArr = invalid.f450943g;
            if (iArr != null) {
                i17 = iArr[0];
            } else {
                long j17 = invalid.f450941e;
                int i19 = invalid.f450942f;
                if (j17 != 0) {
                    a17 = x0.t.a(j17);
                } else {
                    long j18 = invalid.f450940d;
                    if (j18 != 0) {
                        i19 += 64;
                        a17 = x0.t.a(j18);
                    }
                }
                i17 = a17 + i19;
            }
            synchronized (x0.z.f450963b) {
                i18 = x0.z.f450966e.a(i17);
            }
        } else {
            i18 = -1;
        }
        this.f450911d = i18;
    }

    public final void a() {
        synchronized (x0.z.f450963b) {
            b();
            n();
        }
    }

    public void b() {
        x0.z.f450964c = x0.z.f450964c.e(d());
    }

    public abstract void c();

    public int d() {
        return this.f450909b;
    }

    public x0.s e() {
        return this.f450908a;
    }

    public abstract yz5.l f();

    public abstract boolean g();

    public abstract yz5.l h();

    public x0.m i() {
        n0.c5 c5Var = x0.z.f450962a;
        x0.m mVar = (x0.m) c5Var.a();
        c5Var.b(this);
        return mVar;
    }

    public abstract void j(x0.m mVar);

    public abstract void k(x0.m mVar);

    public abstract void l();

    public abstract void m(x0.z0 z0Var);

    public void n() {
        int i17 = this.f450911d;
        if (i17 >= 0) {
            x0.z.s(i17);
            this.f450911d = -1;
        }
    }

    public void o(x0.m mVar) {
        x0.z.f450962a.b(mVar);
    }

    public void p(int i17) {
        this.f450909b = i17;
    }

    public void q(x0.s sVar) {
        kotlin.jvm.internal.o.g(sVar, "<set-?>");
        this.f450908a = sVar;
    }

    public abstract x0.m r(yz5.l lVar);
}
