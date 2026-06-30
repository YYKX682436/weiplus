package v26;

/* loaded from: classes14.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public v26.d[] f432983d;

    /* renamed from: e, reason: collision with root package name */
    public int f432984e;

    /* renamed from: f, reason: collision with root package name */
    public int f432985f;

    /* renamed from: g, reason: collision with root package name */
    public v26.s0 f432986g;

    public final v26.d c() {
        v26.d dVar;
        v26.s0 s0Var;
        synchronized (this) {
            v26.d[] dVarArr = this.f432983d;
            if (dVarArr == null) {
                dVarArr = g(2);
                this.f432983d = dVarArr;
            } else if (this.f432984e >= dVarArr.length) {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(dVarArr, dVarArr.length * 2);
                kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
                this.f432983d = (v26.d[]) copyOf;
                dVarArr = (v26.d[]) copyOf;
            }
            int i17 = this.f432985f;
            do {
                dVar = dVarArr[i17];
                if (dVar == null) {
                    dVar = f();
                    dVarArr[i17] = dVar;
                }
                i17++;
                if (i17 >= dVarArr.length) {
                    i17 = 0;
                }
            } while (!dVar.a(this));
            this.f432985f = i17;
            this.f432984e++;
            s0Var = this.f432986g;
        }
        if (s0Var != null) {
            synchronized (s0Var) {
                java.lang.Object[] objArr = s0Var.f310375n;
                kotlin.jvm.internal.o.d(objArr);
                s0Var.e(java.lang.Integer.valueOf(((java.lang.Number) objArr[((int) ((s0Var.f310376o + ((int) ((s0Var.p() + s0Var.f310378q) - s0Var.f310376o))) - 1)) & (objArr.length - 1)]).intValue() + 1));
            }
        }
        return dVar;
    }

    public abstract v26.d f();

    public abstract v26.d[] g(int i17);

    public final void h(v26.d dVar) {
        v26.s0 s0Var;
        int i17;
        kotlin.coroutines.Continuation[] b17;
        synchronized (this) {
            int i18 = this.f432984e - 1;
            this.f432984e = i18;
            s0Var = this.f432986g;
            if (i18 == 0) {
                this.f432985f = 0;
            }
            b17 = dVar.b(this);
        }
        for (kotlin.coroutines.Continuation continuation : b17) {
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
            }
        }
        if (s0Var != null) {
            synchronized (s0Var) {
                kotlin.jvm.internal.o.d(s0Var.f310375n);
                s0Var.e(java.lang.Integer.valueOf(((java.lang.Number) r9[((int) ((s0Var.f310376o + ((int) ((s0Var.p() + s0Var.f310378q) - s0Var.f310376o))) - 1)) & (r9.length - 1)]).intValue() - 1));
            }
        }
    }

    public final kotlinx.coroutines.flow.f3 i() {
        v26.s0 s0Var;
        synchronized (this) {
            s0Var = this.f432986g;
            if (s0Var == null) {
                s0Var = new v26.s0(this.f432984e);
                this.f432986g = s0Var;
            }
        }
        return s0Var;
    }
}
