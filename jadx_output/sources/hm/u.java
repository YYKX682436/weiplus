package hm;

/* loaded from: classes12.dex */
public final class u extends jm0.g {

    /* renamed from: h, reason: collision with root package name */
    public static final hm.n f282177h = new hm.n(null);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f282178f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f282179g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f282178f = jz5.h.b(new hm.r(service));
        this.f282179g = jz5.h.b(hm.q.f282167d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T6(java.lang.Class r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof hm.o
            if (r0 == 0) goto L13
            r0 = r12
            hm.o r0 = (hm.o) r0
            int r1 = r0.f282163h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f282163h = r1
            goto L18
        L13:
            hm.o r0 = new hm.o
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f282161f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f282163h
            java.lang.String r3 = "cancelTask id:"
            java.lang.String r4 = "MicroMsg.WeTaskScheduleFSC"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r10 = r0.f282160e
            kotlin.jvm.internal.h0 r10 = (kotlin.jvm.internal.h0) r10
            java.lang.Object r11 = r0.f282159d
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L96
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            java.lang.Object r10 = r0.f282160e
            kotlin.jvm.internal.h0 r10 = (kotlin.jvm.internal.h0) r10
            java.lang.Object r11 = r0.f282159d
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L83
        L4a:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r3)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            com.tencent.mars.xlog.Log.i(r4, r12)
            kotlin.jvm.internal.h0 r12 = new kotlin.jvm.internal.h0
            r12.<init>()
            jz5.g r2 = r9.f282178f
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.sdk.coroutines.LifecycleScope r2 = (com.tencent.mm.sdk.coroutines.LifecycleScope) r2
            hm.p r7 = new hm.p
            r8 = 0
            r7.<init>(r12, r9, r10, r8)
            kotlinx.coroutines.r2 r10 = v65.i.b(r2, r8, r7, r6, r8)
            r0.f282159d = r11
            r0.f282160e = r12
            r0.f282163h = r6
            java.lang.Object r10 = r10.C(r0)
            if (r10 != r1) goto L82
            return r1
        L82:
            r10 = r12
        L83:
            java.lang.Object r12 = r10.f310123d
            x65.a r12 = (x65.a) r12
            if (r12 == 0) goto L96
            r0.f282159d = r11
            r0.f282160e = r10
            r0.f282163h = r5
            java.lang.Object r12 = r12.a(r11, r0)
            if (r12 != r1) goto L96
            return r1
        L96:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r3)
            r12.append(r11)
            java.lang.String r11 = " group:"
            r12.append(r11)
            java.lang.Object r10 = r10.f310123d
            x65.a r10 = (x65.a) r10
            if (r10 == 0) goto Laf
            java.lang.String r10 = r10.name()
            if (r10 != 0) goto Lb1
        Laf:
            java.lang.String r10 = ""
        Lb1:
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            com.tencent.mars.xlog.Log.i(r4, r10)
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.u.T6(java.lang.Class, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U6(w65.m r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof hm.s
            if (r0 == 0) goto L13
            r0 = r11
            hm.s r0 = (hm.s) r0
            int r1 = r0.f282173h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f282173h = r1
            goto L18
        L13:
            hm.s r0 = new hm.s
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f282171f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f282173h
            java.lang.String r3 = "startTask id:"
            java.lang.String r4 = "MicroMsg.WeTaskScheduleFSC"
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L40
            if (r2 != r5) goto L38
            java.lang.Object r10 = r0.f282170e
            kotlin.jvm.internal.h0 r10 = (kotlin.jvm.internal.h0) r10
            java.lang.Object r0 = r0.f282169d
            w65.m r0 = (w65.m) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L9d
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L40:
            java.lang.Object r10 = r0.f282170e
            kotlin.jvm.internal.h0 r10 = (kotlin.jvm.internal.h0) r10
            java.lang.Object r2 = r0.f282169d
            w65.m r2 = (w65.m) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L89
        L4c:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r3)
            java.lang.String r2 = r10.id()
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.i(r4, r11)
            kotlin.jvm.internal.h0 r11 = new kotlin.jvm.internal.h0
            r11.<init>()
            jz5.g r2 = r9.f282178f
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.sdk.coroutines.LifecycleScope r2 = (com.tencent.mm.sdk.coroutines.LifecycleScope) r2
            hm.t r8 = new hm.t
            r8.<init>(r11, r9, r10, r7)
            kotlinx.coroutines.r2 r2 = v65.i.b(r2, r7, r8, r6, r7)
            r0.f282169d = r10
            r0.f282170e = r11
            r0.f282173h = r6
            java.lang.Object r2 = r2.C(r0)
            if (r2 != r1) goto L87
            return r1
        L87:
            r2 = r10
            r10 = r11
        L89:
            java.lang.Object r11 = r10.f310123d
            x65.a r11 = (x65.a) r11
            if (r11 == 0) goto La1
            r0.f282169d = r2
            r0.f282170e = r10
            r0.f282173h = r5
            java.lang.Object r11 = r11.b(r2, r0)
            if (r11 != r1) goto L9c
            return r1
        L9c:
            r0 = r2
        L9d:
            r7 = r11
            w65.m r7 = (w65.m) r7
            r2 = r0
        La1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r3)
            java.lang.String r0 = r2.id()
            r11.append(r0)
            java.lang.String r0 = " group:"
            r11.append(r0)
            java.lang.Object r10 = r10.f310123d
            x65.a r10 = (x65.a) r10
            if (r10 == 0) goto Lbe
            java.lang.String r10 = r10.name()
            if (r10 != 0) goto Lc0
        Lbe:
            java.lang.String r10 = ""
        Lc0:
            r11.append(r10)
            java.lang.String r10 = " isSameTask:"
            r11.append(r10)
            boolean r10 = kotlin.jvm.internal.o.b(r7, r2)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.mars.xlog.Log.i(r4, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.u.U6(w65.m, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
