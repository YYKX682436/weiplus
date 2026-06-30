package yx0;

/* loaded from: classes5.dex */
public final class z2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f467802g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f467803h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamTemplateInfo f467804i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(yx0.b8 b8Var, java.lang.String str, pp0.p0 p0Var, java.lang.Long l17, com.tencent.maas.camstudio.MJCamTemplateInfo mJCamTemplateInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467800e = b8Var;
        this.f467801f = str;
        this.f467802g = p0Var;
        this.f467803h = l17;
        this.f467804i = mJCamTemplateInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.z2(this.f467800e, this.f467801f, this.f467802g, this.f467803h, this.f467804i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.z2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f467799d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.getValue()
            goto L43
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L34
        L22:
            kotlin.ResultKt.throwOnFailure(r6)
            yx0.b8 r6 = r5.f467800e
            java.lang.String r1 = r5.f467801f
            pp0.p0 r4 = r5.f467802g
            r5.f467799d = r3
            java.lang.Object r6 = yx0.b8.k(r6, r1, r4, r5)
            if (r6 != r0) goto L34
            return r0
        L34:
            com.tencent.maas.camstudio.MJCamTemplateOverridingParams r6 = (com.tencent.maas.camstudio.MJCamTemplateOverridingParams) r6
            pp0.p0 r1 = r5.f467802g
            java.lang.String r3 = r5.f467801f
            r5.f467799d = r2
            java.lang.Object r6 = r1.p0(r3, r6, r5)
            if (r6 != r0) goto L43
            return r0
        L43:
            yx0.b8 r0 = r5.f467800e
            java.lang.Object r1 = r0.N
            java.lang.String r2 = r5.f467801f
            com.tencent.maas.camstudio.MJCamTemplateInfo r3 = r5.f467804i
            monitor-enter(r1)
            java.util.HashMap r0 = r0.P     // Catch: java.lang.Throwable -> L91
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r1)
            boolean r0 = kotlin.Result.m527isFailureimpl(r6)
            if (r0 == 0) goto L86
            java.lang.String r0 = "MicroMsg.ShootComposingCorePlugin"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "internalApplyTemplate >> but setTemplate is error "
            r1.<init>(r2)
            java.lang.String r2 = r5.f467801f
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.Long r3 = r5.f467803h
            r1.append(r3)
            r1.append(r2)
            java.lang.Throwable r2 = kotlin.Result.m524exceptionOrNullimpl(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            kotlin.Result r6 = kotlin.Result.m520boximpl(r6)
            return r6
        L86:
            yx0.b8 r0 = r5.f467800e
            com.tencent.maas.camstudio.MJCamTemplateInfo r1 = r5.f467804i
            r0.Q = r1
            kotlin.Result r6 = kotlin.Result.m520boximpl(r6)
            return r6
        L91:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.z2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
