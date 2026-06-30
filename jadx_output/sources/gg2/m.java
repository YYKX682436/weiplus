package gg2;

/* loaded from: classes2.dex */
public final class m extends gg2.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f271694b;

    /* renamed from: c, reason: collision with root package name */
    public long f271695c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f271696d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f271697e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cp1 f271698f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f271694b = "LiveExpOneItem";
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // gg2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.view.View r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof gg2.e
            if (r0 == 0) goto L13
            r0 = r11
            gg2.e r0 = (gg2.e) r0
            int r1 = r0.f271671h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271671h = r1
            goto L18
        L13:
            gg2.e r0 = new gg2.e
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f271669f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f271671h
            java.lang.Class<bg2.n2> r3 = bg2.n2.class
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lb1
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.Object r10 = r0.f271668e
            android.view.View r10 = (android.view.View) r10
            java.lang.Object r2 = r0.f271667d
            gg2.m r2 = (gg2.m) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L6f
        L42:
            kotlin.ResultKt.throwOnFailure(r11)
            tc2.g r11 = r9.f271664a
            tc2.c r11 = r11.a(r3)
            bg2.n2 r11 = (bg2.n2) r11
            if (r11 == 0) goto L5c
            kotlinx.coroutines.flow.j2 r11 = r11.f20323f
            if (r11 == 0) goto L5c
            kotlinx.coroutines.flow.h3 r11 = (kotlinx.coroutines.flow.h3) r11
            java.lang.Object r11 = r11.getValue()
            cm2.t r11 = (cm2.t) r11
            goto L5d
        L5c:
            r11 = r6
        L5d:
            if (r11 != 0) goto L6e
            r0.f271667d = r9
            r0.f271668e = r10
            r0.f271671h = r5
            r7 = 300(0x12c, double:1.48E-321)
            java.lang.Object r11 = kotlinx.coroutines.k1.b(r7, r0)
            if (r11 != r1) goto L6e
            return r1
        L6e:
            r2 = r9
        L6f:
            tc2.g r11 = r2.f271664a
            tc2.c r11 = r11.a(r3)
            bg2.n2 r11 = (bg2.n2) r11
            if (r11 == 0) goto Lb4
            kotlinx.coroutines.flow.j2 r11 = r11.f20323f
            if (r11 == 0) goto Lb4
            kotlinx.coroutines.flow.h3 r11 = (kotlinx.coroutines.flow.h3) r11
            java.lang.Object r11 = r11.getValue()
            cm2.t r11 = (cm2.t) r11
            if (r11 == 0) goto Lb4
            boolean r3 = r11 instanceof cm2.m0
            if (r3 == 0) goto L8e
            cm2.m0 r11 = (cm2.m0) r11
            goto L8f
        L8e:
            r11 = r6
        L8f:
            if (r11 == 0) goto Lb4
            r45.y23 r3 = r11.f43368v
            r5 = 0
            long r7 = r3.getLong(r5)
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r2.f271696d = r3
            r45.kr0 r3 = r2.h()
            r45.y23 r11 = r11.f43368v
            r0.f271667d = r6
            r0.f271668e = r6
            r0.f271671h = r4
            java.lang.Object r10 = r2.m(r10, r3, r11, r0)
            if (r10 != r1) goto Lb1
            return r1
        Lb1:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        Lb4:
            java.lang.String r10 = "return data null"
            java.lang.String r11 = r2.f271694b
            com.tencent.mars.xlog.Log.i(r11, r10)
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: gg2.m.a(android.view.View, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // gg2.b
    public int c() {
        return com.tencent.mm.R.layout.aqs;
    }

    @Override // gg2.b
    public int e() {
        return 2;
    }

    @Override // gg2.b
    public java.lang.String f() {
        r45.y23 y23Var;
        kotlinx.coroutines.flow.j2 j2Var;
        bg2.n2 n2Var = (bg2.n2) this.f271664a.a(bg2.n2.class);
        java.lang.String str = null;
        cm2.t tVar = (n2Var == null || (j2Var = n2Var.f20323f) == null) ? null : (cm2.t) ((kotlinx.coroutines.flow.h3) j2Var).getValue();
        cm2.m0 m0Var = tVar instanceof cm2.m0 ? (cm2.m0) tVar : null;
        if (m0Var != null && (y23Var = m0Var.f43368v) != null) {
            str = y23Var.getString(1);
        }
        return str == null ? "" : str;
    }

    @Override // gg2.b
    public int g() {
        return 1;
    }

    @Override // gg2.b
    public java.lang.String i() {
        return this.f271694b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof gg2.f
            if (r0 == 0) goto L13
            r0 = r6
            gg2.f r0 = (gg2.f) r0
            int r1 = r0.f271675g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271675g = r1
            goto L18
        L13:
            gg2.f r0 = new gg2.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f271673e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f271675g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f271672d
            gg2.m r0 = (gg2.m) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4e
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            r45.cp1 r6 = r5.f271698f
            if (r6 != 0) goto L52
            kotlinx.coroutines.p0 r6 = kotlinx.coroutines.q1.f310570c
            gg2.g r2 = new gg2.g
            r4 = 0
            r2.<init>(r5, r4)
            r0.f271672d = r5
            r0.f271675g = r3
            java.lang.Object r6 = kotlinx.coroutines.l.g(r6, r2, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r5
        L4e:
            r45.cp1 r6 = (r45.cp1) r6
            r0.f271698f = r6
        L52:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gg2.m.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0251, code lost:
    
        if ((r3 != null && r3.a()) == false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(android.view.View r29, r45.kr0 r30, r45.y23 r31, kotlin.coroutines.Continuation r32) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg2.m.m(android.view.View, r45.kr0, r45.y23, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
