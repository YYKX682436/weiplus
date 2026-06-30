package m8;

/* loaded from: classes15.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final d9.x f324606a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f324607b;

    /* renamed from: c, reason: collision with root package name */
    public final int f324608c;

    /* renamed from: d, reason: collision with root package name */
    public final d9.g0[] f324609d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f324610e;

    /* renamed from: f, reason: collision with root package name */
    public final long f324611f;

    /* renamed from: g, reason: collision with root package name */
    public m8.v f324612g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f324613h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f324614i;

    /* renamed from: j, reason: collision with root package name */
    public m8.l f324615j;

    /* renamed from: k, reason: collision with root package name */
    public q9.p f324616k;

    /* renamed from: l, reason: collision with root package name */
    public final m8.b0[] f324617l;

    /* renamed from: m, reason: collision with root package name */
    public final m8.c0[] f324618m;

    /* renamed from: n, reason: collision with root package name */
    public final q9.o f324619n;

    /* renamed from: o, reason: collision with root package name */
    public final m8.u f324620o;

    /* renamed from: p, reason: collision with root package name */
    public final d9.a0 f324621p;

    /* renamed from: q, reason: collision with root package name */
    public q9.p f324622q;

    public l(m8.b0[] b0VarArr, m8.c0[] c0VarArr, long j17, q9.o oVar, m8.u uVar, d9.a0 a0Var, java.lang.Object obj, int i17, m8.v vVar) {
        this.f324617l = b0VarArr;
        this.f324618m = c0VarArr;
        this.f324611f = j17;
        this.f324619n = oVar;
        this.f324620o = uVar;
        this.f324621p = a0Var;
        obj.getClass();
        this.f324607b = obj;
        this.f324608c = i17;
        this.f324612g = vVar;
        this.f324609d = new d9.g0[b0VarArr.length];
        this.f324610e = new boolean[b0VarArr.length];
        d9.x d17 = a0Var.d(vVar.f324667a, ((m8.c) uVar).f324545a);
        long j18 = vVar.f324669c;
        if (j18 != Long.MIN_VALUE) {
            d9.k kVar = new d9.k(d17, true);
            kVar.f227366f = 0L;
            kVar.f227367g = j18;
            d17 = kVar;
        }
        this.f324606a = d17;
    }

    public long a() {
        int i17 = this.f324608c;
        long j17 = this.f324611f;
        return i17 == 0 ? j17 : j17 - this.f324612g.f324668b;
    }

    public void b() {
        try {
            long j17 = this.f324612g.f324669c;
            d9.x xVar = this.f324606a;
            d9.a0 a0Var = this.f324621p;
            if (j17 != Long.MIN_VALUE) {
                a0Var.b(((d9.k) xVar).f227364d);
            } else {
                a0Var.b(xVar);
            }
        } catch (java.lang.RuntimeException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x068e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022c A[LOOP:8: B:57:0x011c->B:66:0x022c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.l.c():boolean");
    }

    public long d(long j17, boolean z17, boolean[] zArr) {
        int i17;
        q9.n nVar = this.f324616k.f360871b;
        int i18 = 0;
        while (true) {
            boolean z18 = true;
            if (i18 >= nVar.f360867a) {
                break;
            }
            if (z17 || !this.f324616k.a(this.f324622q, i18)) {
                z18 = false;
            }
            this.f324610e[i18] = z18;
            i18++;
        }
        d9.x xVar = this.f324606a;
        q9.m[] mVarArr = nVar.f360868b;
        long i19 = xVar.i((q9.m[]) mVarArr.clone(), this.f324610e, this.f324609d, zArr, j17);
        this.f324622q = this.f324616k;
        this.f324614i = false;
        int i27 = 0;
        while (true) {
            d9.g0[] g0VarArr = this.f324609d;
            if (i27 >= g0VarArr.length) {
                break;
            }
            if (g0VarArr[i27] != null) {
                t9.a.d(mVarArr[i27] != null);
                this.f324614i = true;
            } else {
                t9.a.d(mVarArr[i27] == null);
            }
            i27++;
        }
        d9.l0 l0Var = this.f324616k.f360870a;
        m8.c cVar = (m8.c) this.f324620o;
        cVar.f324550f = 0;
        int i28 = 0;
        while (true) {
            m8.b0[] b0VarArr = this.f324617l;
            if (i28 >= b0VarArr.length) {
                r9.o oVar = cVar.f324545a;
                int i29 = cVar.f324550f;
                synchronized (oVar) {
                    boolean z19 = i29 < oVar.f393393d;
                    oVar.f393393d = i29;
                    if (z19) {
                        oVar.b();
                    }
                }
                return i19;
            }
            if (mVarArr[i28] != null) {
                int i37 = cVar.f324550f;
                int i38 = ((m8.a) b0VarArr[i28]).f324535d;
                int i39 = t9.d0.f416498a;
                if (i38 == 0) {
                    i17 = com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62;
                } else if (i38 == 1) {
                    i17 = 3538944;
                } else if (i38 == 2) {
                    i17 = 13107200;
                } else {
                    if (i38 != 3 && i38 != 4) {
                        throw new java.lang.IllegalStateException();
                    }
                    i17 = 131072;
                }
                cVar.f324550f = i37 + i17;
            }
            i28++;
        }
    }
}
