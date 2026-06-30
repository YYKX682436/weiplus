package nw0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final du0.t0 f340767a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f340768b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.j0 f340769c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.j0 f340770d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.g0 f340771e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.g0 f340772f;

    public h(du0.t0 materialService) {
        kotlin.jvm.internal.o.g(materialService, "materialService");
        this.f340767a = materialService;
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f340768b = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(new zu0.h(new kw0.e(null, 0, null, 7, null)));
        this.f340769c = j0Var;
        androidx.lifecycle.j0 j0Var2 = new androidx.lifecycle.j0(new zu0.h(new kw0.e(null, 0, null, 7, null)));
        this.f340770d = j0Var2;
        this.f340771e = androidx.lifecycle.b1.a(j0Var, new nw0.f());
        this.f340772f = androidx.lifecycle.b1.a(j0Var2, new nw0.g());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nw0.h r4, kw0.b r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof nw0.a
            if (r0 == 0) goto L16
            r0 = r7
            nw0.a r0 = (nw0.a) r0
            int r1 = r0.f340749h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f340749h = r1
            goto L1b
        L16:
            nw0.a r0 = new nw0.a
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f340747f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f340749h
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f340746e
            r5 = r4
            kw0.b r5 = (kw0.b) r5
            java.lang.Object r4 = r0.f340745d
            nw0.h r4 = (nw0.h) r4
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f340745d = r4
            r0.f340746e = r5
            r0.f340749h = r3
            java.lang.Object r7 = r4.c(r5, r6, r0)
            if (r7 != r1) goto L4b
            goto L7d
        L4b:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r6 = r7.iterator()
            r0 = 0
        L52:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r6.next()
            kw0.a r1 = (kw0.a) r1
            boolean r1 = r1.f312790c
            if (r1 == 0) goto L63
            goto L67
        L63:
            int r0 = r0 + 1
            goto L52
        L66:
            r0 = -1
        L67:
            r4.b(r5)
            kw0.e r4 = new kw0.e
            kw0.i r6 = kw0.i.f312806a
            r4.<init>(r7, r0, r6)
            zu0.h r6 = new zu0.h
            r6.<init>(r4)
            zu0.k r1 = new zu0.k
            int r4 = r5.f312794d
            r1.<init>(r4, r6)
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nw0.h.a(nw0.h, kw0.b, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final zu0.h b(kw0.b bVar) {
        zu0.h hVar;
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            return (ordinal == 1 && (hVar = (zu0.h) this.f340769c.getValue()) != null) ? hVar : new zu0.h(new kw0.e(null, 0, null, 7, null));
        }
        zu0.h hVar2 = (zu0.h) this.f340770d.getValue();
        return hVar2 == null ? new zu0.h(new kw0.e(null, 0, null, 7, null)) : hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kw0.b r12, java.lang.String r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof nw0.c
            if (r0 == 0) goto L13
            r0 = r14
            nw0.c r0 = (nw0.c) r0
            int r1 = r0.f340758h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f340758h = r1
            goto L18
        L13:
            nw0.c r0 = new nw0.c
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f340756f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f340758h
            r3 = 0
            r4 = 0
            kz5.p0 r5 = kz5.p0.f313996d
            r6 = 1
            if (r2 == 0) goto L3c
            if (r2 != r6) goto L34
            java.lang.Object r12 = r0.f340755e
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r0.f340754d
            nw0.h r12 = (nw0.h) r12
            kotlin.ResultKt.throwOnFailure(r14)
            goto L77
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3c:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.String r14 = "<this>"
            kotlin.jvm.internal.o.g(r12, r14)
            com.tencent.maas.material.g[] r14 = com.tencent.maas.material.g.values()
            int r2 = r14.length
            r7 = r4
        L4a:
            if (r7 >= r2) goto L5d
            r8 = r14[r7]
            int r9 = r8.f48248d
            int r10 = r12.f312794d
            if (r9 != r10) goto L56
            r9 = r6
            goto L57
        L56:
            r9 = r4
        L57:
            if (r9 == 0) goto L5a
            goto L5e
        L5a:
            int r7 = r7 + 1
            goto L4a
        L5d:
            r8 = r3
        L5e:
            if (r8 != 0) goto L61
            return r5
        L61:
            r12 = -1
            int r14 = r8.f48248d
            if (r12 != r14) goto L67
            return r5
        L67:
            r0.f340754d = r11
            r0.f340755e = r13
            r0.f340758h = r6
            du0.t0 r12 = r11.f340767a
            java.lang.Object r14 = r12.R6(r14, r0)
            if (r14 != r1) goto L76
            return r1
        L76:
            r12 = r11
        L77:
            com.tencent.maas.material.MJMaterialPack r14 = (com.tencent.maas.material.MJMaterialPack) r14
            if (r14 == 0) goto L8b
            java.util.List r14 = r14.a()
            java.lang.Object r14 = kz5.n0.a0(r14, r4)
            com.tencent.maas.material.MJMaterialCategory r14 = (com.tencent.maas.material.MJMaterialCategory) r14
            if (r14 == 0) goto L8b
            java.util.List r3 = r14.a()
        L8b:
            if (r3 == 0) goto Lcc
            java.util.ArrayList r5 = new java.util.ArrayList
            r14 = 10
            int r14 = kz5.d0.q(r3, r14)
            r5.<init>(r14)
            java.util.Iterator r14 = r3.iterator()
        L9c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto Lcc
            java.lang.Object r0 = r14.next()
            com.tencent.maas.material.MJMaterialInfo r0 = (com.tencent.maas.material.MJMaterialInfo) r0
            kw0.a r1 = new kw0.a
            kotlin.jvm.internal.o.d(r0)
            du0.t0 r2 = r12.f340767a
            java.lang.String r3 = "getMaterialID(...)"
            java.lang.String r4 = r0.f48224b
            kotlin.jvm.internal.o.f(r4, r3)
            boolean r2 = r2.Q6(r4)
            if (r2 == 0) goto Lbf
            zu0.i r2 = zu0.i.f475676f
            goto Lc1
        Lbf:
            zu0.i r2 = zu0.i.f475674d
        Lc1:
            boolean r3 = kotlin.jvm.internal.o.b(r4, r13)
            r1.<init>(r0, r2, r3)
            r5.add(r1)
            goto L9c
        Lcc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nw0.h.c(kw0.b, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d() {
        kotlinx.coroutines.z0.d(this.f340768b, this + " onCleared.", null, 2, null);
    }

    public final void e() {
        this.f340769c.setValue(new zu0.h(new kw0.e(null, 0, null, 7, null)));
        this.f340770d.setValue(new zu0.h(new kw0.e(null, 0, null, 7, null)));
    }
}
