package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public final class tp extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f200025d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f200026e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f200027f;

    /* renamed from: g, reason: collision with root package name */
    public int f200028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.wp f200029h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp(com.tencent.mm.ui.chatting.component.wp wpVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f200029h = wpVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.component.tp(this.f200029h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.component.tp) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0095 A[Catch: all -> 0x0020, Exception -> 0x0091, TryCatch #1 {Exception -> 0x0091, blocks: (B:7:0x001b, B:8:0x008c, B:10:0x0095, B:14:0x009b, B:21:0x0059, B:23:0x005d), top: B:2:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[Catch: all -> 0x0020, Exception -> 0x0091, TRY_LEAVE, TryCatch #1 {Exception -> 0x0091, blocks: (B:7:0x001b, B:8:0x008c, B:10:0x0095, B:14:0x009b, B:21:0x0059, B:23:0x005d), top: B:2:0x0009, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f200028g
            r2 = 2
            java.lang.String r3 = "MicroMsg.YuanBaoCopyAdReportHelper"
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L39
            if (r1 == r4) goto L2b
            if (r1 != r2) goto L23
            java.lang.Object r0 = r10.f200027f
            com.tencent.mm.ui.chatting.component.tp r0 = (com.tencent.mm.ui.chatting.component.tp) r0
            java.lang.Object r0 = r10.f200026e
            com.tencent.mm.ui.chatting.component.wp r0 = (com.tencent.mm.ui.chatting.component.wp) r0
            java.lang.Object r1 = r10.f200025d
            kotlinx.coroutines.sync.d r1 = (kotlinx.coroutines.sync.d) r1
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            goto L8c
        L20:
            r11 = move-exception
            goto Lbc
        L23:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2b:
            java.lang.Object r1 = r10.f200026e
            com.tencent.mm.ui.chatting.component.wp r1 = (com.tencent.mm.ui.chatting.component.wp) r1
            java.lang.Object r6 = r10.f200025d
            kotlinx.coroutines.sync.d r6 = (kotlinx.coroutines.sync.d) r6
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r1
            r1 = r6
            goto L4f
        L39:
            kotlin.ResultKt.throwOnFailure(r11)
            com.tencent.mm.ui.chatting.component.wp r11 = r10.f200029h
            kotlinx.coroutines.sync.d r1 = r11.f200188a
            r10.f200025d = r1
            r10.f200026e = r11
            r10.f200028g = r4
            kotlinx.coroutines.sync.k r1 = (kotlinx.coroutines.sync.k) r1
            java.lang.Object r6 = r1.b(r5, r10)
            if (r6 != r0) goto L4f
            return r0
        L4f:
            xj.m r6 = r11.f200189b     // Catch: java.lang.Throwable -> L20
            if (r6 == 0) goto L59
            java.lang.String r11 = "onAdExpose: already exposed"
            com.tencent.mars.xlog.Log.w(r3, r11)     // Catch: java.lang.Throwable -> L20
            goto Lb4
        L59:
            xj.m r6 = r11.f200190c     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            if (r6 != 0) goto L93
            r10.f200025d = r1     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            r10.f200026e = r11     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            r10.f200027f = r10     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            r10.f200028g = r2     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            kotlin.coroutines.Continuation r6 = pz5.f.b(r10)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            r2.k()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            xj.i r4 = r11.a()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            wj.t0 r6 = wj.t0.f446513v     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            com.tencent.mm.ui.chatting.component.sp r7 = new com.tencent.mm.ui.chatting.component.sp     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            wj.j0 r4 = (wj.j0) r4     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            r8 = 2000(0x7d0, double:9.88E-321)
            r4.Vi(r6, r8, r7)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            java.lang.Object r2 = r2.j()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            if (r2 != r0) goto L8a
            return r0
        L8a:
            r0 = r11
            r11 = r2
        L8c:
            r6 = r11
            xj.m r6 = (xj.m) r6     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            r11 = r0
            goto L93
        L91:
            r11 = move-exception
            goto Lab
        L93:
            if (r6 != 0) goto L9b
            java.lang.String r11 = "onAdExpose: no ad info"
            com.tencent.mars.xlog.Log.e(r3, r11)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            goto Lb4
        L9b:
            r11.f200189b = r6     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            xj.i r11 = r11.a()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            java.lang.String r0 = r6.f454753a     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            wj.w0 r2 = wj.w0.f446541d     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            wj.j0 r11 = (wj.j0) r11     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            r11.mj(r0, r2, r5)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L91
            goto Lb4
        Lab:
            java.lang.String r0 = "onAdExpose: exception"
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> L20
            com.tencent.mars.xlog.Log.e(r3, r0, r11)     // Catch: java.lang.Throwable -> L20
        Lb4:
            kotlinx.coroutines.sync.k r1 = (kotlinx.coroutines.sync.k) r1
            r1.d(r5)
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        Lbc:
            kotlinx.coroutines.sync.k r1 = (kotlinx.coroutines.sync.k) r1
            r1.d(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.tp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
