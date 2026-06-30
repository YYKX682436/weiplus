package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f193212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f193213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f193213e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.smiley.a0(this.f193213e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.smiley.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f193212d
            java.lang.String r2 = "MicroMsg.EmojiOcrService"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            kotlin.ResultKt.throwOnFailure(r6)
            goto L35
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.sync.d r6 = com.tencent.mm.smiley.c0.f193228d
            r1 = r6
            kotlinx.coroutines.sync.k r1 = (kotlinx.coroutines.sync.k) r1
            boolean r1 = r1.a()
            if (r1 != 0) goto L3b
            java.lang.String r1 = "wait working job to be finished"
            com.tencent.mars.xlog.Log.i(r2, r1)
            r5.f193212d = r3
            java.lang.Object r6 = kotlinx.coroutines.sync.c.a(r6, r4, r5, r3, r4)
            if (r6 != r0) goto L35
            return r0
        L35:
            java.lang.String r6 = "the job is finished, it's the time to close the Thread"
            com.tencent.mars.xlog.Log.i(r2, r6)
        L3b:
            kotlinx.coroutines.f2 r6 = com.tencent.mm.smiley.c0.f193226b
            if (r6 == 0) goto L42
            r6.close()
        L42:
            com.tencent.mm.smiley.c0.f193226b = r4
            kotlinx.coroutines.y0 r6 = com.tencent.mm.smiley.c0.f193227c
            kotlinx.coroutines.z0.e(r6, r4, r3, r4)
            java.lang.String r6 = "stop successfully"
            com.tencent.mars.xlog.Log.i(r2, r6)
            yz5.a r6 = r5.f193213e
            r6.invoke()
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.smiley.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
