package xc5;

/* loaded from: classes12.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f453432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f453433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f453434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453435g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.storage.f9 f9Var, xc5.h0 h0Var, mf3.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453433e = f9Var;
        this.f453434f = h0Var;
        this.f453435g = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.e0(this.f453433e, this.f453434f, this.f453435g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.MsgHistoryGalleryImageBottomBarLayer"
            java.lang.Class<xs.d1> r1 = xs.d1.class
            pz5.a r2 = pz5.a.f359186d
            int r3 = r12.f453432d
            jz5.f0 r4 = jz5.f0.f302826a
            r5 = 3
            r6 = 2
            r7 = 0
            mf3.k r8 = r12.f453435g
            xc5.h0 r9 = r12.f453434f
            r10 = 1
            if (r3 == 0) goto L2f
            if (r3 == r10) goto L2b
            if (r3 == r6) goto L27
            if (r3 != r5) goto L1f
            kotlin.ResultKt.throwOnFailure(r13)
            goto La5
        L1f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L27:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L91
        L2b:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L73
        L2f:
            kotlin.ResultKt.throwOnFailure(r13)
            i95.m r13 = i95.n0.c(r1)     // Catch: java.lang.Exception -> L43
            xs.d1 r13 = (xs.d1) r13     // Catch: java.lang.Exception -> L43
            com.tencent.mm.storage.f9 r3 = r12.f453433e     // Catch: java.lang.Exception -> L43
            s70.c r11 = s70.c.f403920h     // Catch: java.lang.Exception -> L43
            v70.w r13 = (v70.w) r13     // Catch: java.lang.Exception -> L43
            l70.d r13 = r13.cj(r3, r11, r10)     // Catch: java.lang.Exception -> L43
            goto L5a
        L43:
            r13 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r11 = "genDownloadParams Big failed: "
            r3.<init>(r11)
            java.lang.String r13 = r13.getMessage()
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            com.tencent.mars.xlog.Log.e(r0, r13)
            r13 = r7
        L5a:
            if (r13 != 0) goto L74
            java.lang.String r13 = "download origin failed, params null"
            com.tencent.mars.xlog.Log.e(r0, r13)
            kotlinx.coroutines.p0 r13 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r13 = kotlinx.coroutines.internal.b0.f310484a
            xc5.z r0 = new xc5.z
            r0.<init>(r9, r8, r7)
            r12.f453432d = r10
            java.lang.Object r13 = kotlinx.coroutines.l.g(r13, r0, r12)
            if (r13 != r2) goto L73
            return r2
        L73:
            return r4
        L74:
            xc5.d0 r0 = new xc5.d0
            r0.<init>(r9, r8)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r13.f316813n = r3
            i95.m r0 = i95.n0.c(r1)
            xs.d1 r0 = (xs.d1) r0
            r12.f453432d = r6
            v70.w r0 = (v70.w) r0
            java.lang.Object r13 = r0.bj(r13, r12)
            if (r13 != r2) goto L91
            return r2
        L91:
            l70.e r13 = (l70.e) r13
            kotlinx.coroutines.p0 r0 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r0 = kotlinx.coroutines.internal.b0.f310484a
            xc5.a0 r1 = new xc5.a0
            r1.<init>(r9, r13, r8, r7)
            r12.f453432d = r5
            java.lang.Object r13 = kotlinx.coroutines.l.g(r0, r1, r12)
            if (r13 != r2) goto La5
            return r2
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
