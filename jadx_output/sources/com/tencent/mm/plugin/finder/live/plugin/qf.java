package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113996d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f113997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f113998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f113999g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, dk2.zf zfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113998f = mgVar;
        this.f113999g = zfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.qf qfVar = new com.tencent.mm.plugin.finder.live.plugin.qf(this.f113998f, this.f113999g, continuation);
        qfVar.f113997e = obj;
        return qfVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.qf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:7:0x0038, B:9:0x0076, B:14:0x007c, B:19:0x0088, B:21:0x0090, B:28:0x00a3, B:29:0x00aa), top: B:6:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0076 A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:7:0x0038, B:9:0x0076, B:14:0x007c, B:19:0x0088, B:21:0x0090, B:28:0x00a3, B:29:0x00aa), top: B:6:0x0038 }] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.tencent.mm.plugin.finder.live.plugin.qf] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [jz5.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0031 -> B:5:0x0034). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Class<mm2.x4> r0 = mm2.x4.class
            java.lang.String r1 = "Finder.LiveCommentPlugin"
            pz5.a r2 = pz5.a.f359186d
            int r3 = r12.f113996d
            r4 = 1
            if (r3 == 0) goto L1e
            if (r3 != r4) goto L16
            java.lang.Object r3 = r12.f113997e
            kotlinx.coroutines.y0 r3 = (kotlinx.coroutines.y0) r3
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
            goto L34
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.f113997e
            kotlinx.coroutines.y0 r13 = (kotlinx.coroutines.y0) r13
            r3 = r13
            r13 = r12
        L27:
            r13.f113997e = r3
            r13.f113996d = r4
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r5 = kotlinx.coroutines.k1.b(r5, r13)
            if (r5 != r2) goto L34
            return r2
        L34:
            dk2.zf r5 = r13.f113999g
            com.tencent.mm.plugin.finder.live.plugin.mg r6 = r13.f113998f
            bm2.o1 r7 = r6.D     // Catch: java.lang.Exception -> Laf
            java.util.ArrayList r7 = r7.f22180m     // Catch: java.lang.Exception -> Laf
            int r7 = r7.indexOf(r5)     // Catch: java.lang.Exception -> Laf
            androidx.lifecycle.c1 r8 = r6.P0(r0)     // Catch: java.lang.Exception -> Laf
            mm2.x4 r8 = (mm2.x4) r8     // Catch: java.lang.Exception -> Laf
            int r8 = r8.f329537r     // Catch: java.lang.Exception -> Laf
            androidx.lifecycle.c1 r9 = r6.P0(r0)     // Catch: java.lang.Exception -> Laf
            mm2.x4 r9 = (mm2.x4) r9     // Catch: java.lang.Exception -> Laf
            int r9 = r9.f329536q     // Catch: java.lang.Exception -> Laf
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Laf
            r10.<init>()     // Catch: java.lang.Exception -> Laf
            java.lang.String r11 = "#onStickTopShowingTitleMsgReceived indexInCommentList="
            r10.append(r11)     // Catch: java.lang.Exception -> Laf
            r10.append(r7)     // Catch: java.lang.Exception -> Laf
            java.lang.String r11 = " firstVisible="
            r10.append(r11)     // Catch: java.lang.Exception -> Laf
            r10.append(r8)     // Catch: java.lang.Exception -> Laf
            java.lang.String r11 = " lastVisible="
            r10.append(r11)     // Catch: java.lang.Exception -> Laf
            r10.append(r9)     // Catch: java.lang.Exception -> Laf
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> Laf
            com.tencent.mars.xlog.Log.i(r1, r10)     // Catch: java.lang.Exception -> Laf
            if (r7 >= 0) goto L7c
            com.tencent.mm.plugin.finder.live.plugin.me r5 = com.tencent.mm.plugin.finder.live.plugin.mg.f113495p0     // Catch: java.lang.Exception -> Laf
            r6.G1()     // Catch: java.lang.Exception -> Laf
            goto L27
        L7c:
            int r8 = r8 + 1
            r10 = 0
            if (r8 > r7) goto L85
            if (r7 > r9) goto L85
            r11 = r4
            goto L86
        L85:
            r11 = r10
        L86:
            if (r11 == 0) goto L9c
            android.view.View r11 = r6.f113508u     // Catch: java.lang.Exception -> Laf
            boolean r11 = r11.isShown()     // Catch: java.lang.Exception -> Laf
            if (r11 == 0) goto L9c
            r5 = 0
            kotlinx.coroutines.z0.e(r3, r5, r4, r5)     // Catch: java.lang.Exception -> Laf
            com.tencent.mm.plugin.finder.live.plugin.me r5 = com.tencent.mm.plugin.finder.live.plugin.mg.f113495p0     // Catch: java.lang.Exception -> Laf
            r6.G1()     // Catch: java.lang.Exception -> Laf
            jz5.f0 r13 = jz5.f0.f302826a     // Catch: java.lang.Exception -> Laf
            return r13
        L9c:
            if (r8 > r7) goto La1
            if (r7 > r9) goto La1
            r10 = r4
        La1:
            if (r10 == 0) goto Laa
            com.tencent.mm.plugin.finder.live.plugin.me r5 = com.tencent.mm.plugin.finder.live.plugin.mg.f113495p0     // Catch: java.lang.Exception -> Laf
            r6.G1()     // Catch: java.lang.Exception -> Laf
            goto L27
        Laa:
            com.tencent.mm.plugin.finder.live.plugin.mg.u1(r6, r5)     // Catch: java.lang.Exception -> Laf
            goto L27
        Laf:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.e(r1, r5)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.qf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
