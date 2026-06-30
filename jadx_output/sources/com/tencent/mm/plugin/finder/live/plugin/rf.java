package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f114131d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f114132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f114133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f114134g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(dk2.zf zfVar, com.tencent.mm.plugin.finder.live.plugin.mg mgVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114133f = zfVar;
        this.f114134g = mgVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.rf rfVar = new com.tencent.mm.plugin.finder.live.plugin.rf(this.f114133f, this.f114134g, continuation);
        rfVar.f114132e = obj;
        return rfVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.rf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x009e, code lost:
    
        return jz5.f0.f302826a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        if (kotlinx.coroutines.z0.h(r0) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007f, code lost:
    
        if (kotlinx.coroutines.z0.h(r0) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0081, code lost:
    
        r11 = com.tencent.mm.plugin.finder.live.plugin.mg.f113495p0;
        r4.G1();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f114131d
            r2 = 1
            java.lang.String r3 = "#onStickTopShowingTitleMsgReceived timeout finally"
            com.tencent.mm.plugin.finder.live.plugin.mg r4 = r10.f114134g
            java.lang.String r5 = "Finder.LiveCommentPlugin"
            if (r1 == 0) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r10.f114132e
            kotlinx.coroutines.y0 r0 = (kotlinx.coroutines.y0) r0
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L17 kotlinx.coroutines.x3 -> L8d
            goto L78
        L17:
            r11 = move-exception
            goto L9f
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f114132e
            kotlinx.coroutines.y0 r11 = (kotlinx.coroutines.y0) r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "#onStickTopShowingTitleMsgReceived timeout start content="
            r1.<init>(r6)
            dk2.zf r6 = r10.f114133f
            java.lang.String r7 = r6.j()
            r1.append(r7)
            java.lang.String r7 = " contentExtend="
            r1.append(r7)
            java.lang.String r7 = r6.x()
            r1.append(r7)
            java.lang.String r7 = " msgType="
            r1.append(r7)
            int r7 = r6.getType()
            r1.append(r7)
            java.lang.String r7 = " seq="
            r1.append(r7)
            long r7 = r6.m()
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r5, r1)
            com.tencent.mm.plugin.finder.live.plugin.qf r1 = new com.tencent.mm.plugin.finder.live.plugin.qf     // Catch: java.lang.Throwable -> L87 kotlinx.coroutines.x3 -> L8c
            r7 = 0
            r1.<init>(r4, r6, r7)     // Catch: java.lang.Throwable -> L87 kotlinx.coroutines.x3 -> L8c
            r10.f114132e = r11     // Catch: java.lang.Throwable -> L87 kotlinx.coroutines.x3 -> L8c
            r10.f114131d = r2     // Catch: java.lang.Throwable -> L87 kotlinx.coroutines.x3 -> L8c
            r6 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r1 = kotlinx.coroutines.a4.b(r6, r1, r10)     // Catch: java.lang.Throwable -> L87 kotlinx.coroutines.x3 -> L8c
            if (r1 != r0) goto L77
            return r0
        L77:
            r0 = r11
        L78:
            com.tencent.mars.xlog.Log.i(r5, r3)
            boolean r11 = kotlinx.coroutines.z0.h(r0)
            if (r11 == 0) goto L9c
        L81:
            com.tencent.mm.plugin.finder.live.plugin.me r11 = com.tencent.mm.plugin.finder.live.plugin.mg.f113495p0
            r4.G1()
            goto L9c
        L87:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
            goto L9f
        L8c:
            r0 = r11
        L8d:
            java.lang.String r11 = "#onStickTopShowingTitleMsgReceived timeout catch"
            com.tencent.mars.xlog.Log.i(r5, r11)     // Catch: java.lang.Throwable -> L17
            com.tencent.mars.xlog.Log.i(r5, r3)
            boolean r11 = kotlinx.coroutines.z0.h(r0)
            if (r11 == 0) goto L9c
            goto L81
        L9c:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        L9f:
            com.tencent.mars.xlog.Log.i(r5, r3)
            boolean r0 = kotlinx.coroutines.z0.h(r0)
            if (r0 == 0) goto Lad
            com.tencent.mm.plugin.finder.live.plugin.me r0 = com.tencent.mm.plugin.finder.live.plugin.mg.f113495p0
            r4.G1()
        Lad:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.rf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
