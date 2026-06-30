package xt2;

/* loaded from: classes.dex */
public final class f6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f456746d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f456747e;

    /* renamed from: f, reason: collision with root package name */
    public int f456748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f456749g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f456750h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f456751i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f456752m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f456753n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f456754o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f456755p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(long j17, long j18, long j19, java.lang.String str, int i17, boolean z17, com.tencent.mm.ipcinvoker.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456749g = j17;
        this.f456750h = j18;
        this.f456751i = j19;
        this.f456752m = str;
        this.f456753n = i17;
        this.f456754o = z17;
        this.f456755p = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.f6(this.f456749g, this.f456750h, this.f456751i, this.f456752m, this.f456753n, this.f456754o, this.f456755p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.f6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x007c, code lost:
    
        if (r15 == null) goto L22;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r13 = r17
            pz5.a r14 = pz5.a.f359186d
            int r0 = r13.f456748f
            com.tencent.mm.ipcinvoker.r r12 = r13.f456755p
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r13.f456747e
            gk2.e r0 = (gk2.e) r0
            java.lang.Object r1 = r13.f456746d
            com.tencent.mm.ipcinvoker.r r1 = (com.tencent.mm.ipcinvoker.r) r1
            kotlin.ResultKt.throwOnFailure(r18)
            r15 = r0
            r13 = r12
            r0 = r18
            r12 = r1
            goto L65
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L26:
            kotlin.ResultKt.throwOnFailure(r18)
            dk2.ef r0 = dk2.ef.f233372a
            gk2.e r11 = dk2.ef.I
            if (r11 == 0) goto L7f
            long r2 = r13.f456749g
            long r4 = r13.f456750h
            long r6 = r13.f456751i
            int r9 = r13.f456753n
            boolean r10 = r13.f456754o
            java.lang.Class<com.tencent.mm.feature.finder.live.z5> r0 = com.tencent.mm.feature.finder.live.z5.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.feature.finder.live.z5 r0 = (com.tencent.mm.feature.finder.live.z5) r0
            android.content.Context r8 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r15 = "getContext(...)"
            kotlin.jvm.internal.o.f(r8, r15)
            java.lang.String r15 = r13.f456752m
            kotlin.jvm.internal.o.d(r15)
            r16 = 0
            r13.f456746d = r12
            r13.f456747e = r11
            r13.f456748f = r1
            r1 = r8
            r8 = r15
            r15 = r11
            r11 = r16
            r13 = r12
            r12 = r17
            java.lang.Object r0 = r0.Zi(r1, r2, r4, r6, r8, r9, r10, r11, r12)
            if (r0 != r14) goto L64
            return r14
        L64:
            r12 = r13
        L65:
            r45.s42 r0 = (r45.s42) r0
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            if (r0 == 0) goto L73
            byte[] r0 = r0.toByteArray()
            goto L74
        L73:
            r0 = 0
        L74:
            java.lang.String r2 = "FinderProductAutoScrollRespKey"
            r1.putByteArray(r2, r0)
            r12.a(r1)
            if (r15 != 0) goto L84
            goto L80
        L7f:
            r13 = r12
        L80:
            r0 = 0
            r13.a(r0)
        L84:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.f6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
