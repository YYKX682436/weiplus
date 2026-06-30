package h4;

/* loaded from: classes14.dex */
public abstract class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f278677d = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final u26.w f278678a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.z f278679b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f278680c;

    public k0(kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        u26.w a17 = u26.z.a(0, null, null, 6, null);
        this.f278678a = a17;
        this.f278679b = kotlinx.coroutines.b0.a(null, 1, null);
        this.f278680c = new java.util.concurrent.atomic.AtomicBoolean(false);
        kotlinx.coroutines.flow.l.p(new kotlinx.coroutines.flow.g0(new kotlinx.coroutines.flow.y1(kotlinx.coroutines.flow.l.g(a17), new h4.h0(this, null)), new h4.i0(this, null)), scope);
    }

    public static final void a(h4.k0 k0Var) {
        jz5.f0 f0Var = jz5.f0.f302826a;
        kotlinx.coroutines.z zVar = k0Var.f278679b;
        u26.w wVar = k0Var.f278678a;
        if (k0Var.f278680c.compareAndSet(false, true)) {
            try {
                h4.i iVar = (h4.i) k0Var;
                java.util.ArrayList arrayList = (java.util.ArrayList) iVar.f278667i;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    u26.x0.a(((h4.j) it.next()).f278670a, null, 1, null);
                }
                arrayList.clear();
                h4.g0 g0Var = iVar.f278664f;
                if (g0Var != null) {
                    kotlinx.coroutines.p2.a(g0Var.f278656a, null, 1, null);
                }
            } finally {
                u26.x0.a(wVar, null, 1, null);
                ((kotlinx.coroutines.a0) zVar).U(f0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof h4.j0
            if (r0 == 0) goto L13
            r0 = r6
            h4.j0 r0 = (h4.j0) r0
            int r1 = r0.f278673e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278673e = r1
            goto L18
        L13:
            h4.j0 r0 = new h4.j0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f278672d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f278673e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.f278675g
            h4.k0 r2 = (h4.k0) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4f
        L3a:
            kotlin.ResultKt.throwOnFailure(r6)
            u26.w r6 = r5.f278678a
            java.lang.Object r2 = h4.k0.f278677d
            r0.f278675g = r5
            r0.f278673e = r4
            u26.o r6 = (u26.o) r6
            java.lang.Object r6 = r6.t(r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            kotlinx.coroutines.z r6 = r2.f278679b
            r2 = 0
            r0.f278675g = r2
            r0.f278673e = r3
            kotlinx.coroutines.a0 r6 = (kotlinx.coroutines.a0) r6
            java.lang.Object r6 = r6.k(r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.k0.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
