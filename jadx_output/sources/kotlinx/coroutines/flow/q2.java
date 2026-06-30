package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public class q2 extends v26.b implements kotlinx.coroutines.flow.i2, kotlinx.coroutines.flow.j, v26.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f310372h;

    /* renamed from: i, reason: collision with root package name */
    public final int f310373i;

    /* renamed from: m, reason: collision with root package name */
    public final u26.u f310374m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object[] f310375n;

    /* renamed from: o, reason: collision with root package name */
    public long f310376o;

    /* renamed from: p, reason: collision with root package name */
    public long f310377p;

    /* renamed from: q, reason: collision with root package name */
    public int f310378q;

    /* renamed from: r, reason: collision with root package name */
    public int f310379r;

    public q2(int i17, int i18, u26.u uVar) {
        this.f310372h = i17;
        this.f310373i = i18;
        this.f310374m = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094 A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:14:0x0039, B:18:0x008c, B:20:0x0094, B:28:0x00a7, B:31:0x00ae, B:32:0x00b2, B:34:0x00b3, B:40:0x0059), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.flow.q2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlinx.coroutines.flow.k] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v6, types: [kotlinx.coroutines.flow.s2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c1 -> B:15:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object l(kotlinx.coroutines.flow.q2 r8, kotlinx.coroutines.flow.k r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q2.l(kotlinx.coroutines.flow.q2, kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        return l(this, kVar, continuation);
    }

    @Override // v26.h0
    public kotlinx.coroutines.flow.j b(oz5.l lVar, int i17, u26.u uVar) {
        return ((i17 == 0 || i17 == -3) && uVar == u26.u.SUSPEND) ? this : new v26.o(this, lVar, i17, uVar);
    }

    @Override // kotlinx.coroutines.flow.i2
    public void d() {
        synchronized (this) {
            u(p() + this.f310378q, this.f310377p, p() + this.f310378q, p() + this.f310378q + this.f310379r);
        }
    }

    @Override // kotlinx.coroutines.flow.i2
    public boolean e(java.lang.Object obj) {
        int i17;
        boolean z17;
        kotlin.coroutines.Continuation[] continuationArr = v26.c.f432987a;
        synchronized (this) {
            if (r(obj)) {
                continuationArr = o(continuationArr);
                z17 = true;
            } else {
                z17 = false;
            }
        }
        for (kotlin.coroutines.Continuation continuation : continuationArr) {
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
            }
        }
        return z17;
    }

    @Override // kotlinx.coroutines.flow.i2, kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlin.coroutines.Continuation[] continuationArr;
        kotlinx.coroutines.flow.o2 o2Var;
        if (e(obj)) {
            return jz5.f0.f302826a;
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        kotlin.coroutines.Continuation[] continuationArr2 = v26.c.f432987a;
        synchronized (this) {
            if (r(obj)) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
                continuationArr = o(continuationArr2);
                o2Var = null;
            } else {
                kotlinx.coroutines.flow.o2 o2Var2 = new kotlinx.coroutines.flow.o2(this, this.f310378q + this.f310379r + p(), obj, rVar);
                n(o2Var2);
                this.f310379r++;
                if (this.f310373i == 0) {
                    continuationArr2 = o(continuationArr2);
                }
                continuationArr = continuationArr2;
                o2Var = o2Var2;
            }
        }
        if (o2Var != null) {
            rVar.m(new kotlinx.coroutines.t1(o2Var));
        }
        for (kotlin.coroutines.Continuation continuation2 : continuationArr) {
            if (continuation2 != null) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                continuation2.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        if (j17 != aVar) {
            j17 = jz5.f0.f302826a;
        }
        return j17 == aVar ? j17 : jz5.f0.f302826a;
    }

    @Override // v26.b
    public v26.d f() {
        return new kotlinx.coroutines.flow.s2();
    }

    @Override // v26.b
    public v26.d[] g(int i17) {
        return new kotlinx.coroutines.flow.s2[i17];
    }

    public final java.lang.Object j(kotlinx.coroutines.flow.s2 s2Var, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        synchronized (this) {
            if (s(s2Var) < 0) {
                s2Var.f310403b = rVar;
            } else {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
            }
        }
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }

    public final void k() {
        if (this.f310373i != 0 || this.f310379r > 1) {
            java.lang.Object[] objArr = this.f310375n;
            kotlin.jvm.internal.o.d(objArr);
            while (this.f310379r > 0) {
                long p17 = p();
                int i17 = this.f310378q;
                int i18 = this.f310379r;
                if (objArr[((int) ((p17 + (i17 + i18)) - 1)) & (objArr.length - 1)] != kotlinx.coroutines.flow.r2.f310389a) {
                    return;
                }
                this.f310379r = i18 - 1;
                objArr[((int) (p() + this.f310378q + this.f310379r)) & (objArr.length - 1)] = null;
            }
        }
    }

    public final void m() {
        v26.d[] dVarArr;
        java.lang.Object[] objArr = this.f310375n;
        kotlin.jvm.internal.o.d(objArr);
        objArr[((int) p()) & (objArr.length - 1)] = null;
        this.f310378q--;
        long p17 = p() + 1;
        if (this.f310376o < p17) {
            this.f310376o = p17;
        }
        if (this.f310377p < p17) {
            if (this.f432984e != 0 && (dVarArr = this.f432983d) != null) {
                for (v26.d dVar : dVarArr) {
                    if (dVar != null) {
                        kotlinx.coroutines.flow.s2 s2Var = (kotlinx.coroutines.flow.s2) dVar;
                        long j17 = s2Var.f310402a;
                        if (j17 >= 0 && j17 < p17) {
                            s2Var.f310402a = p17;
                        }
                    }
                }
            }
            this.f310377p = p17;
        }
    }

    public final void n(java.lang.Object obj) {
        int i17 = this.f310378q + this.f310379r;
        java.lang.Object[] objArr = this.f310375n;
        if (objArr == null) {
            objArr = q(null, 0, 2);
        } else if (i17 >= objArr.length) {
            objArr = q(objArr, i17, objArr.length * 2);
        }
        objArr[((int) (p() + i17)) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final kotlin.coroutines.Continuation[] o(kotlin.coroutines.Continuation[] continuationArr) {
        v26.d[] dVarArr;
        kotlinx.coroutines.flow.s2 s2Var;
        kotlin.coroutines.Continuation continuation;
        int length = continuationArr.length;
        if (this.f432984e != 0 && (dVarArr = this.f432983d) != null) {
            int length2 = dVarArr.length;
            int i17 = 0;
            continuationArr = continuationArr;
            while (i17 < length2) {
                v26.d dVar = dVarArr[i17];
                if (dVar != null && (continuation = (s2Var = (kotlinx.coroutines.flow.s2) dVar).f310403b) != null && s(s2Var) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = java.util.Arrays.copyOf(continuationArr, java.lang.Math.max(2, continuationArr.length * 2));
                        kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = continuation;
                    s2Var.f310403b = null;
                    length++;
                }
                i17++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long p() {
        return java.lang.Math.min(this.f310377p, this.f310376o);
    }

    public final java.lang.Object[] q(java.lang.Object[] objArr, int i17, int i18) {
        if (!(i18 > 0)) {
            throw new java.lang.IllegalStateException("Buffer size overflow".toString());
        }
        java.lang.Object[] objArr2 = new java.lang.Object[i18];
        this.f310375n = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long p17 = p();
        for (int i19 = 0; i19 < i17; i19++) {
            int i27 = (int) (i19 + p17);
            objArr2[i27 & (i18 - 1)] = objArr[(objArr.length - 1) & i27];
        }
        return objArr2;
    }

    public final boolean r(java.lang.Object obj) {
        int i17 = this.f432984e;
        int i18 = this.f310372h;
        if (i17 == 0) {
            if (i18 != 0) {
                n(obj);
                int i19 = this.f310378q + 1;
                this.f310378q = i19;
                if (i19 > i18) {
                    m();
                }
                this.f310377p = p() + this.f310378q;
            }
            return true;
        }
        int i27 = this.f310378q;
        int i28 = this.f310373i;
        if (i27 >= i28 && this.f310377p <= this.f310376o) {
            int ordinal = this.f310374m.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 2) {
                return true;
            }
        }
        n(obj);
        int i29 = this.f310378q + 1;
        this.f310378q = i29;
        if (i29 > i28) {
            m();
        }
        long p17 = p() + this.f310378q;
        long j17 = this.f310376o;
        if (((int) (p17 - j17)) > i18) {
            u(j17 + 1, this.f310377p, p() + this.f310378q, p() + this.f310378q + this.f310379r);
        }
        return true;
    }

    public final long s(kotlinx.coroutines.flow.s2 s2Var) {
        long j17 = s2Var.f310402a;
        if (j17 < p() + this.f310378q) {
            return j17;
        }
        if (this.f310373i <= 0 && j17 <= p() && this.f310379r != 0) {
            return j17;
        }
        return -1L;
    }

    public final java.lang.Object t(kotlinx.coroutines.flow.s2 s2Var) {
        java.lang.Object obj;
        kotlin.coroutines.Continuation[] continuationArr = v26.c.f432987a;
        synchronized (this) {
            long s17 = s(s2Var);
            if (s17 < 0) {
                obj = kotlinx.coroutines.flow.r2.f310389a;
            } else {
                long j17 = s2Var.f310402a;
                java.lang.Object[] objArr = this.f310375n;
                kotlin.jvm.internal.o.d(objArr);
                java.lang.Object obj2 = objArr[((int) s17) & (objArr.length - 1)];
                if (obj2 instanceof kotlinx.coroutines.flow.o2) {
                    obj2 = ((kotlinx.coroutines.flow.o2) obj2).f310354f;
                }
                s2Var.f310402a = s17 + 1;
                java.lang.Object obj3 = obj2;
                continuationArr = v(j17);
                obj = obj3;
            }
        }
        for (kotlin.coroutines.Continuation continuation : continuationArr) {
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
            }
        }
        return obj;
    }

    public final void u(long j17, long j18, long j19, long j27) {
        long min = java.lang.Math.min(j18, j17);
        for (long p17 = p(); p17 < min; p17++) {
            java.lang.Object[] objArr = this.f310375n;
            kotlin.jvm.internal.o.d(objArr);
            objArr[((int) p17) & (objArr.length - 1)] = null;
        }
        this.f310376o = j17;
        this.f310377p = j18;
        this.f310378q = (int) (j19 - min);
        this.f310379r = (int) (j27 - j19);
    }

    public final kotlin.coroutines.Continuation[] v(long j17) {
        long j18;
        long j19;
        long j27;
        v26.d[] dVarArr;
        long j28 = this.f310377p;
        kotlin.coroutines.Continuation[] continuationArr = v26.c.f432987a;
        if (j17 > j28) {
            return continuationArr;
        }
        long p17 = p();
        long j29 = this.f310378q + p17;
        int i17 = this.f310373i;
        if (i17 == 0 && this.f310379r > 0) {
            j29++;
        }
        if (this.f432984e != 0 && (dVarArr = this.f432983d) != null) {
            for (v26.d dVar : dVarArr) {
                if (dVar != null) {
                    long j37 = ((kotlinx.coroutines.flow.s2) dVar).f310402a;
                    if (j37 >= 0 && j37 < j29) {
                        j29 = j37;
                    }
                }
            }
        }
        if (j29 <= this.f310377p) {
            return continuationArr;
        }
        long p18 = p() + this.f310378q;
        int min = this.f432984e > 0 ? java.lang.Math.min(this.f310379r, i17 - ((int) (p18 - j29))) : this.f310379r;
        long j38 = this.f310379r + p18;
        kotlinx.coroutines.internal.l0 l0Var = kotlinx.coroutines.flow.r2.f310389a;
        if (min > 0) {
            continuationArr = new kotlin.coroutines.Continuation[min];
            java.lang.Object[] objArr = this.f310375n;
            kotlin.jvm.internal.o.d(objArr);
            long j39 = p18;
            int i18 = 0;
            while (true) {
                if (p18 >= j38) {
                    j18 = j29;
                    j19 = j38;
                    break;
                }
                j18 = j29;
                int i19 = (int) p18;
                java.lang.Object obj = objArr[(objArr.length - 1) & i19];
                if (obj == l0Var) {
                    j19 = j38;
                    j27 = 1;
                } else {
                    if (obj == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    }
                    kotlinx.coroutines.flow.o2 o2Var = (kotlinx.coroutines.flow.o2) obj;
                    j19 = j38;
                    int i27 = i18 + 1;
                    continuationArr[i18] = o2Var.f310355g;
                    objArr[i19 & (objArr.length - 1)] = l0Var;
                    objArr[((int) j39) & (objArr.length - 1)] = o2Var.f310354f;
                    j27 = 1;
                    j39++;
                    if (i27 >= min) {
                        break;
                    }
                    i18 = i27;
                }
                p18 += j27;
                j29 = j18;
                j38 = j19;
            }
            p18 = j39;
        } else {
            j18 = j29;
            j19 = j38;
        }
        kotlin.coroutines.Continuation[] continuationArr2 = continuationArr;
        int i28 = (int) (p18 - p17);
        long j47 = this.f432984e == 0 ? p18 : j18;
        long max = java.lang.Math.max(this.f310376o, p18 - java.lang.Math.min(this.f310372h, i28));
        if (i17 == 0 && max < j19) {
            java.lang.Object[] objArr2 = this.f310375n;
            kotlin.jvm.internal.o.d(objArr2);
            if (kotlin.jvm.internal.o.b(objArr2[((int) max) & (objArr2.length - 1)], l0Var)) {
                p18++;
                max++;
            }
        }
        u(max, j47, p18, j19);
        k();
        return (continuationArr2.length == 0) ^ true ? o(continuationArr2) : continuationArr2;
    }
}
