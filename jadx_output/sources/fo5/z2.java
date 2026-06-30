package fo5;

/* loaded from: classes14.dex */
public final class z2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f265160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f265162f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265161e = str;
        this.f265162f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.z2(this.f265161e, this.f265162f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fo5.z2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r3.f265160d
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.ResultKt.throwOnFailure(r4)
            goto L27
        Ld:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L15:
            kotlin.ResultKt.throwOnFailure(r4)
            fo5.a r4 = fo5.f3.f264986c
            if (r4 == 0) goto L2a
            r3.f265160d = r2
            java.lang.String r1 = r3.f265161e
            java.lang.Object r4 = r4.d(r1, r3)
            if (r4 != r0) goto L27
            return r0
        L27:
            er4.p r4 = (er4.p) r4
            goto L2b
        L2a:
            r4 = 0
        L2b:
            com.tencent.mm.plugin.voipmp.platform.w r0 = fo5.f3.f264985b
            if (r0 == 0) goto L34
            long r1 = r3.f265162f
            r0.n0(r1, r4)
        L34:
            jz5.f0 r4 = jz5.f0.f302826a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fo5.z2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
