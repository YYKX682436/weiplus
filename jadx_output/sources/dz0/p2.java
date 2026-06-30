package dz0;

/* loaded from: classes5.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f244973d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f244974e;

    /* renamed from: f, reason: collision with root package name */
    public int f244975f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244976g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f244977h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244978i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(az0.n7 n7Var, com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244977h = n7Var;
        this.f244978i = maasSdkUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        dz0.p2 p2Var = new dz0.p2(this.f244977h, this.f244978i, continuation);
        p2Var.f244976g = obj;
        return p2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.p2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0092 A[Catch: all -> 0x00a6, TryCatch #0 {all -> 0x00a6, blocks: (B:7:0x001b, B:10:0x0092, B:11:0x00a1, B:21:0x0034, B:22:0x005a, B:24:0x005e, B:26:0x006a, B:28:0x0072, B:31:0x007c, B:39:0x0044), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f244975f
            java.lang.String r2 = "MaasMultiTemplate.MaasSdkUIC"
            java.lang.String r3 = ""
            r4 = 2
            r5 = 1
            jz5.f0 r6 = jz5.f0.f302826a
            r7 = 0
            if (r1 == 0) goto L38
            if (r1 == r5) goto L28
            if (r1 != r4) goto L20
            java.lang.Object r0 = r11.f244973d
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r0 = (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) r0
            java.lang.Object r1 = r11.f244976g
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> La6
            goto L8c
        L20:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L28:
            java.lang.Object r1 = r11.f244974e
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r1 = (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) r1
            java.lang.Object r5 = r11.f244973d
            az0.n7 r5 = (az0.n7) r5
            java.lang.Object r8 = r11.f244976g
            kotlinx.coroutines.y0 r8 = (kotlinx.coroutines.y0) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> La6
            goto L5a
        L38:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.f244976g
            r8 = r12
            kotlinx.coroutines.y0 r8 = (kotlinx.coroutines.y0) r8
            az0.n7 r12 = r11.f244977h
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r1 = r11.f244978i
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> La6
            java.lang.String r9 = r1.f69790n     // Catch: java.lang.Throwable -> La6
            r11.f244976g = r8     // Catch: java.lang.Throwable -> La6
            r11.f244973d = r12     // Catch: java.lang.Throwable -> La6
            r11.f244974e = r1     // Catch: java.lang.Throwable -> La6
            r11.f244975f = r5     // Catch: java.lang.Throwable -> La6
            java.lang.Object r5 = r12.j(r3, r9, r11)     // Catch: java.lang.Throwable -> La6
            if (r5 != r0) goto L57
            return r0
        L57:
            r10 = r5
            r5 = r12
            r12 = r10
        L5a:
            com.tencent.maas.model.MJTemplateRecommendResult r12 = (com.tencent.maas.model.MJTemplateRecommendResult) r12     // Catch: java.lang.Throwable -> La6
            if (r12 == 0) goto L8f
            dz0.e0 r9 = r1.D     // Catch: java.lang.Throwable -> La6
            r9.b(r12)     // Catch: java.lang.Throwable -> La6
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.R6(r1)     // Catch: java.lang.Throwable -> La6
            dz0.k r12 = r1.f69785f     // Catch: java.lang.Throwable -> La6
            if (r12 == 0) goto L8f
            com.tencent.maas.instamovie.MJMovieSession r5 = r5.f15742a     // Catch: java.lang.Throwable -> La6
            com.tencent.maas.model.MJTemplateInfo r5 = r5.getCurrentTemplateInfo()     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto L77
            java.lang.String r5 = r5.getTemplateID()     // Catch: java.lang.Throwable -> La6
            goto L78
        L77:
            r5 = r7
        L78:
            if (r5 != 0) goto L7b
            goto L7c
        L7b:
            r3 = r5
        L7c:
            r11.f244976g = r8     // Catch: java.lang.Throwable -> La6
            r11.f244973d = r1     // Catch: java.lang.Throwable -> La6
            r11.f244974e = r7     // Catch: java.lang.Throwable -> La6
            r11.f244975f = r4     // Catch: java.lang.Throwable -> La6
            java.lang.Object r12 = r12.z2(r3, r11)     // Catch: java.lang.Throwable -> La6
            if (r12 != r0) goto L8b
            return r0
        L8b:
            r0 = r1
        L8c:
            r1 = r0
            r12 = r6
            goto L90
        L8f:
            r12 = r7
        L90:
            if (r12 != 0) goto La1
            java.lang.String r12 = "triggerRecommend: recommend error"
            com.tencent.mars.xlog.Log.e(r2, r12)     // Catch: java.lang.Throwable -> La6
            androidx.lifecycle.j0 r12 = r1.f69786g     // Catch: java.lang.Throwable -> La6
            az0.o7 r0 = new az0.o7     // Catch: java.lang.Throwable -> La6
            r0.<init>(r7)     // Catch: java.lang.Throwable -> La6
            r12.postValue(r0)     // Catch: java.lang.Throwable -> La6
        La1:
            java.lang.Object r12 = kotlin.Result.m521constructorimpl(r6)     // Catch: java.lang.Throwable -> La6
            goto Lb1
        La6:
            r12 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r12 = kotlin.ResultKt.createFailure(r12)
            java.lang.Object r12 = kotlin.Result.m521constructorimpl(r12)
        Lb1:
            java.lang.Throwable r12 = kotlin.Result.m524exceptionOrNullimpl(r12)
            if (r12 == 0) goto Lbc
            java.lang.String r12 = "triggerRecommend: recommend onFailure"
            com.tencent.mars.xlog.Log.i(r2, r12)
        Lbc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.p2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
