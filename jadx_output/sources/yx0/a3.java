package yx0;

/* loaded from: classes5.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467122d;

    /* renamed from: e, reason: collision with root package name */
    public int f467123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467124f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f467125g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(yx0.b8 b8Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467124f = b8Var;
        this.f467125g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.a3(this.f467124f, this.f467125g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.a3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f467123e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L2e
            if (r1 == r6) goto L2a
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r9.f467122d
            com.tencent.maas.camerafun.MJRecordingFinishInfo r0 = (com.tencent.maas.camerafun.MJRecordingFinishInfo) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L74
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f467122d
            com.tencent.maas.camerafun.MJRecordingFinishInfo r1 = (com.tencent.maas.camerafun.MJRecordingFinishInfo) r1
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r1
            goto L53
        L2a:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L40
        L2e:
            kotlin.ResultKt.throwOnFailure(r10)
            yx0.b8 r10 = r9.f467124f
            pp0.p0 r10 = r10.K
            if (r10 == 0) goto L43
            r9.f467123e = r6
            java.lang.Object r10 = r10.t0(r5, r9)
            if (r10 != r0) goto L40
            return r0
        L40:
            com.tencent.maas.camerafun.MJRecordingFinishInfo r10 = (com.tencent.maas.camerafun.MJRecordingFinishInfo) r10
            goto L44
        L43:
            r10 = r2
        L44:
            yx0.b8 r1 = r9.f467124f
            r9.f467122d = r10
            r9.f467123e = r4
            java.lang.String r4 = "interruptRecordingInternal"
            java.lang.Object r1 = yx0.b8.b(r1, r4, r5, r9)
            if (r1 != r0) goto L53
            return r0
        L53:
            yx0.b8 r1 = r9.f467124f
            com.tencent.maas.camstudio.MJCamTemplateInfo r1 = r1.Q
            if (r1 == 0) goto L60
            boolean r1 = r1.isHasAIGCFeature()
            if (r1 != r6) goto L60
            r5 = r6
        L60:
            if (r5 == 0) goto L75
            boolean r1 = r9.f467125g
            if (r1 != 0) goto L75
            yx0.b8 r1 = r9.f467124f
            r9.f467122d = r10
            r9.f467123e = r3
            java.lang.Object r1 = yx0.b8.j(r1, r9)
            if (r1 != r0) goto L73
            return r0
        L73:
            r0 = r10
        L74:
            r10 = r0
        L75:
            if (r10 == 0) goto L98
            java.lang.String r10 = r10.f47817a
            if (r10 == 0) goto L98
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L8a
            boolean r10 = com.tencent.mm.vfs.w6.h(r10)     // Catch: java.lang.Throwable -> L8a
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r10)     // Catch: java.lang.Throwable -> L8a
            goto L95
        L8a:
            r10 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r10)
        L95:
            kotlin.Result.m520boximpl(r10)
        L98:
            yx0.b8 r10 = r9.f467124f
            mx0.z r10 = r10.f467177d
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout r10 = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) r10
            kotlinx.coroutines.y0 r3 = r10.getScope()
            kotlinx.coroutines.p0 r0 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r4 = kotlinx.coroutines.internal.b0.f310484a
            r5 = 0
            mx0.o7 r6 = new mx0.o7
            r6.<init>(r10, r2)
            r7 = 2
            r8 = 0
            kotlinx.coroutines.l.d(r3, r4, r5, r6, r7, r8)
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.a3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
