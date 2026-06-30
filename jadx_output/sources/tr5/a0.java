package tr5;

/* loaded from: classes13.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final tr5.f0 f421440a;

    /* renamed from: b, reason: collision with root package name */
    public int f421441b = -1;

    /* renamed from: c, reason: collision with root package name */
    public tr5.u f421442c;

    /* renamed from: d, reason: collision with root package name */
    public tr5.y f421443d;

    /* renamed from: e, reason: collision with root package name */
    public tr5.f f421444e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f421445f;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.channels.Selector f421446g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Set f421447h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f421448i;

    public a0(tr5.f0 f0Var) {
        if (f0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupParams".concat(" can not be null"));
        }
        this.f421440a = f0Var;
    }

    public int a() {
        if (sr5.f.a(this.f421441b)) {
            throw new java.lang.IllegalStateException("mCurNetStack".concat(" is not initialized yet"));
        }
        return this.f421441b;
    }

    public tr5.a0 b(int i17) {
        if (sr5.f.a(i17)) {
            throw new java.lang.IllegalArgumentException("curNetStack".concat(" is invalid"));
        }
        this.f421441b = i17;
        return this;
    }

    public java.util.Set c() {
        java.util.Set set = this.f421447h;
        if (set != null) {
            return set;
        }
        throw new java.lang.IllegalStateException("mDnses".concat(" is not initialized yet"));
    }

    public tr5.a0 d(tr5.f0 f0Var) {
        tr5.a0 a0Var = new tr5.a0(f0Var);
        a0Var.b(this.f421441b);
        a0Var.g(this.f421442c);
        a0Var.i(this.f421443d);
        tr5.f fVar = this.f421444e;
        if (fVar == null) {
            throw new java.lang.IllegalArgumentException("transaction".concat(" can not be null"));
        }
        a0Var.f421444e = fVar;
        java.util.concurrent.CountDownLatch countDownLatch = this.f421445f;
        if (countDownLatch == null) {
            throw new java.lang.IllegalArgumentException("countDownLatch".concat(" can not be null"));
        }
        a0Var.f421445f = countDownLatch;
        a0Var.f421446g = this.f421446g;
        java.util.Set set = this.f421447h;
        if (set == null) {
            throw new java.lang.IllegalArgumentException("dnses".concat(" can not be null"));
        }
        a0Var.f421447h = set;
        java.util.List list = this.f421448i;
        if (list == null) {
            throw new java.lang.IllegalArgumentException("sessions".concat(" can not be null"));
        }
        a0Var.f421448i = list;
        return a0Var;
    }

    public java.util.List e() {
        java.util.List list = this.f421448i;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("mSessions".concat(" is not initialized yet"));
    }

    public tr5.u f() {
        tr5.u uVar = this.f421442c;
        if (uVar != null) {
            return uVar;
        }
        throw new java.lang.IllegalStateException("mSorter".concat(" is not initialized yet"));
    }

    public tr5.a0 g(tr5.u uVar) {
        if (uVar == null) {
            throw new java.lang.IllegalArgumentException("sorter".concat(" can not be null"));
        }
        this.f421442c = uVar;
        return this;
    }

    public tr5.y h() {
        tr5.y yVar = this.f421443d;
        if (yVar != null) {
            return yVar;
        }
        throw new java.lang.IllegalStateException("mStatMerge".concat(" is not initialized yet"));
    }

    public tr5.a0 i(tr5.y yVar) {
        if (yVar == null) {
            throw new java.lang.IllegalArgumentException("statMerge".concat(" can not be null"));
        }
        this.f421443d = yVar;
        return this;
    }

    public tr5.f j() {
        tr5.f fVar = this.f421444e;
        if (fVar != null) {
            return fVar;
        }
        throw new java.lang.IllegalStateException("mTransaction".concat(" is not initialized yet"));
    }

    public java.lang.String toString() {
        return "LookupContext{mLookupParams=" + this.f421440a + ", mCurNetStack=" + this.f421441b + ", mSorter=" + this.f421442c + ", mStatMerge=" + this.f421443d + ", mTransaction=" + this.f421444e + ", mCountDownLatch=" + this.f421445f + ", mSelector=" + this.f421446g + ", mDnses=" + this.f421447h + ", mSessions=" + this.f421448i + '}';
    }
}
