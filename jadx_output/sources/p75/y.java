package p75;

/* loaded from: classes8.dex */
public final class y implements p75.m {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f352701a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String[] f352702b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f352703c;

    public y(p75.m0 cond) {
        kotlin.jvm.internal.o.g(cond, "cond");
        this.f352701a = cond.b();
        this.f352702b = cond.e();
        this.f352703c = kz5.p1.e(cond);
    }

    @Override // p75.m
    public java.util.Set a() {
        return this.f352703c;
    }

    @Override // p75.r
    public java.lang.String b() {
        return this.f352701a;
    }

    @Override // p75.m
    public /* bridge */ /* synthetic */ p75.m c(p75.m mVar) {
        f(mVar);
        return this;
    }

    @Override // p75.m
    public p75.m d(p75.m cond) {
        kotlin.jvm.internal.o.g(cond, "cond");
        g(cond, p75.o.f352678e);
        return this;
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return this.f352702b;
    }

    public p75.y f(p75.m cond) {
        kotlin.jvm.internal.o.g(cond, "cond");
        g(cond, p75.o.f352677d);
        return this;
    }

    public final p75.y g(p75.m cond, p75.o operator) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(cond, "cond");
        kotlin.jvm.internal.o.g(operator, "operator");
        int ordinal = operator.ordinal();
        if (ordinal == 0) {
            str = "AND";
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            str = "OR";
        }
        this.f352701a = "(" + this.f352701a + ") " + str + " (" + cond.b() + ')';
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String[] strArr = this.f352702b;
        if (strArr != null) {
            kz5.h0.w(linkedList, strArr);
        }
        java.lang.String[] e17 = cond.e();
        if (e17 != null) {
            kz5.h0.w(linkedList, e17);
        }
        this.f352702b = (java.lang.String[]) linkedList.toArray(new java.lang.String[0]);
        this.f352703c.addAll(cond.a());
        return this;
    }
}
