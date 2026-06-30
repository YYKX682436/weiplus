package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f150064d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f150065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.s0 f150066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f150067g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.multitalk.model.s0 s0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f150066f = s0Var;
        this.f150067g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.multitalk.model.p0 p0Var = new com.tencent.mm.plugin.multitalk.model.p0(this.f150066f, this.f150067g, continuation);
        p0Var.f150065e = obj;
        return p0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.multitalk.model.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f150064d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 1
            com.tencent.mm.plugin.multitalk.model.s0 r4 = r5.f150066f
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            java.lang.Object r0 = r5.f150065e
            kotlinx.coroutines.y0 r0 = (kotlinx.coroutines.y0) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L39
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.f150065e
            kotlinx.coroutines.y0 r6 = (kotlinx.coroutines.y0) r6
            com.tencent.mm.plugin.multitalk.model.v0 r1 = com.tencent.mm.plugin.multitalk.model.e3.Ri()
            com.tencent.mm.plugin.multitalk.model.a2 r1 = r1.n()
            if (r1 == 0) goto L56
            r5.f150065e = r6
            r5.f150064d = r3
            java.lang.Object r6 = r1.d(r5)
            if (r6 != r0) goto L39
            return r0
        L39:
            jz5.l r6 = (jz5.l) r6
            if (r6 == 0) goto L56
            java.lang.Object r0 = r6.f302833d
            is0.c r0 = (is0.c) r0
            r4.f150121p = r0
            java.lang.Object r6 = r6.f302834e
            r0 = r6
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0
            r4.f150120o = r0
            android.graphics.SurfaceTexture r6 = (android.graphics.SurfaceTexture) r6
            com.tencent.mm.plugin.multitalk.model.o0 r0 = new com.tencent.mm.plugin.multitalk.model.o0
            r0.<init>(r4)
            r6.setOnFrameAvailableListener(r0)
            r6 = r2
            goto L57
        L56:
            r6 = 0
        L57:
            if (r6 != 0) goto L60
            java.lang.String r6 = "MicroMsg.MultiTalkCameraManager"
            java.lang.String r0 = "startCaptureRenderer: camera texture is null"
            com.tencent.mars.xlog.Log.e(r6, r0)
        L60:
            r4.g()
            boolean r6 = r5.f150067g
            if (r6 == 0) goto L6e
            com.tencent.mm.app.w r6 = com.tencent.mm.app.w.INSTANCE
            com.tencent.mm.app.y2 r0 = r4.f150124s
            r6.b(r0)
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
