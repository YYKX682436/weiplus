package ir2;

/* loaded from: classes2.dex */
public final class a1 extends pf5.e implements ir2.y {

    /* renamed from: r, reason: collision with root package name */
    public static final ir2.g0 f294089r = new ir2.g0(null);

    /* renamed from: s, reason: collision with root package name */
    public static final jz5.g f294090s = jz5.h.b(ir2.f0.f294137d);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f294091d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final u26.w f294092e;

    /* renamed from: f, reason: collision with root package name */
    public ir2.a0 f294093f;

    /* renamed from: g, reason: collision with root package name */
    public ir2.a0 f294094g;

    /* renamed from: h, reason: collision with root package name */
    public ir2.a0 f294095h;

    /* renamed from: i, reason: collision with root package name */
    public ir2.a0 f294096i;

    /* renamed from: m, reason: collision with root package name */
    public ir2.a0 f294097m;

    /* renamed from: n, reason: collision with root package name */
    public ym5.m1 f294098n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f294099o;

    /* renamed from: p, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f294100p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f294101q;

    public a1() {
        u26.w a17 = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
        this.f294092e = a17;
        this.f294099o = jz5.h.b(new ir2.q0(this));
        this.f294100p = new kotlinx.coroutines.flow.e(a17, false, null, 0, null, 28, null);
        this.f294101q = jz5.h.b(new ir2.k0(this));
        kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new ir2.e0(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N6(ir2.a1 r5, yz5.l r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof ir2.h0
            if (r0 == 0) goto L16
            r0 = r7
            ir2.h0 r0 = (ir2.h0) r0
            int r1 = r0.f294147g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f294147g = r1
            goto L1b
        L16:
            ir2.h0 r0 = new ir2.h0
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r5 = r0.f294145e
            pz5.a r7 = pz5.a.f359186d
            int r1 = r0.f294147g
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            long r6 = r0.f294144d
            kotlin.ResultKt.throwOnFailure(r5)
            goto L47
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.ResultKt.throwOnFailure(r5)
            long r3 = c01.id.c()
            r0.f294144d = r3
            r0.f294147g = r2
            java.lang.Object r5 = r6.invoke(r0)
            if (r5 != r7) goto L46
            goto L51
        L46:
            r6 = r3
        L47:
            long r0 = c01.id.c()
            long r0 = r0 - r6
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r0)
        L51:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir2.a1.N6(ir2.a1, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.util.List O6() {
        return this.f294091d;
    }

    public final java.util.List P6(java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (so2.j5 j5Var : this.f294091d) {
            if (clazz.isInstance(j5Var)) {
                arrayList.add(j5Var);
            }
        }
        return arrayList;
    }

    public void Q6(so2.j5 data, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(data);
        pf5.e.launch$default(this, null, null, new ir2.l0(this, new ir2.b0(arrayList, i17, 0L, z17, 4, null), null), 3, null);
    }

    public final void R6(yz5.l observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        pf5.e.launch$default(this, null, null, new ir2.t0(this, observer, null), 3, null);
    }

    public void S6(ir2.u event) {
        kotlin.jvm.internal.o.g(event, "event");
        pf5.e.launch$default(this, null, null, new ir2.u0(this, event, null), 3, null);
    }

    public final java.lang.Object T6(ir2.x xVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object obj = this.f294092e;
        boolean j17 = ((u26.o) obj).j();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (j17) {
            com.tencent.mars.xlog.Log.i("Finder.NewLoader", "send is closed");
            return f0Var;
        }
        java.lang.Object t17 = ((u26.o) obj).t(xVar, continuation);
        return t17 == pz5.a.f359186d ? t17 : f0Var;
    }

    @Override // pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        by1.d a17;
        super.onCleared();
        ir2.z[] zVarArr = new ir2.z[4];
        ir2.a0 a0Var = this.f294094g;
        zVarArr[0] = a0Var != null ? a0Var.getKey() : null;
        ir2.a0 a0Var2 = this.f294095h;
        zVarArr[1] = a0Var2 != null ? a0Var2.getKey() : null;
        ir2.a0 a0Var3 = this.f294097m;
        zVarArr[2] = a0Var3 != null ? a0Var3.getKey() : null;
        ir2.a0 a0Var4 = this.f294096i;
        zVarArr[3] = a0Var4 != null ? a0Var4.getKey() : null;
        com.tencent.mars.xlog.Log.i("Finder.NewLoader", "clearFutureCache:4");
        for (int i17 = 0; i17 < 4; i17++) {
            ir2.z zVar = zVarArr[i17];
            if (zVar != null && (a17 = by1.c.f36353b.a().a(zVar)) != null) {
            }
        }
    }
}
