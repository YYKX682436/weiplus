package j00;

/* loaded from: classes9.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f296783d;

    /* renamed from: e, reason: collision with root package name */
    public int f296784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f296785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f296786g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c00.j3 f296787h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f296788i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f296789m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlinx.coroutines.z zVar, kotlinx.coroutines.z zVar2, c00.j3 j3Var, boolean z17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296785f = zVar;
        this.f296786g = zVar2;
        this.f296787h = j3Var;
        this.f296788i = z17;
        this.f296789m = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j00.i(this.f296785f, this.f296786g, this.f296787h, this.f296788i, this.f296789m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j00.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f296784e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r9.f296783d
            bw5.x7 r0 = (bw5.x7) r0
            kotlin.ResultKt.throwOnFailure(r10)
            r4 = r0
            goto L44
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L31
        L21:
            kotlin.ResultKt.throwOnFailure(r10)
            r9.f296784e = r3
            kotlinx.coroutines.z r10 = r9.f296785f
            kotlinx.coroutines.a0 r10 = (kotlinx.coroutines.a0) r10
            java.lang.Object r10 = r10.k(r9)
            if (r10 != r0) goto L31
            return r0
        L31:
            bw5.x7 r10 = (bw5.x7) r10
            r9.f296783d = r10
            r9.f296784e = r2
            kotlinx.coroutines.z r1 = r9.f296786g
            kotlinx.coroutines.a0 r1 = (kotlinx.coroutines.a0) r1
            java.lang.Object r1 = r1.k(r9)
            if (r1 != r0) goto L42
            return r0
        L42:
            r4 = r10
            r10 = r1
        L44:
            r5 = r10
            java.lang.String r5 = (java.lang.String) r5
            if (r4 == 0) goto L58
            j00.n r0 = j00.n.f296837a
            c00.j3 r1 = r9.f296787h
            boolean r2 = r9.f296788i
            int r3 = r9.f296789m
            r6 = 1
            r7 = 0
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            goto L5f
        L58:
            java.lang.String r10 = "MicroMsg.EcsGiftEntrancePreloadLogicNew"
            java.lang.String r0 = "checkPreloadWhenExposure: jumpInfo is null, skip preload"
            com.tencent.mars.xlog.Log.i(r10, r0)
        L5f:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
