package df2;

/* loaded from: classes3.dex */
public final class jd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.od f230470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.n72 f230471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(df2.od odVar, r45.n72 n72Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230470e = odVar;
        this.f230471f = n72Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.jd(this.f230470e, this.f230471f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.jd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f230469d
            r45.n72 r2 = r6.f230471f
            r3 = 0
            df2.od r4 = r6.f230470e
            r5 = 1
            if (r1 == 0) goto L1a
            if (r1 != r5) goto L12
            kotlin.ResultKt.throwOnFailure(r7)
            goto L36
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.ResultKt.throwOnFailure(r7)
            dk2.xf r7 = r4.P6()
            if (r7 == 0) goto L39
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = r4.getStore()
            gk2.e r1 = r1.getLiveRoomData()
            r6.f230469d = r5
            dk2.r4 r7 = (dk2.r4) r7
            java.lang.Object r7 = r7.n0(r1, r2, r6)
            if (r7 != r0) goto L36
            return r0
        L36:
            r45.m72 r7 = (r45.m72) r7
            goto L3a
        L39:
            r7 = r3
        L3a:
            if (r7 == 0) goto L5a
            r45.d62 r7 = r4.f230957q
            jz5.g r0 = r4.f230960t
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r2)
            r45.d62 r0 = (r45.d62) r0
            if (r0 == 0) goto L53
            if (r0 != r7) goto L53
            goto L54
        L53:
            r5 = 0
        L54:
            if (r5 == 0) goto L5a
            r4.f230957q = r3
            r4.f230958r = r3
        L5a:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.jd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
