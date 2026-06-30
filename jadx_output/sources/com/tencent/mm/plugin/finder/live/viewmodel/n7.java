package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class n7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117287e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.n7(this.f117287e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.n7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if ((!com.tencent.mm.sdk.platformtools.t8.K0(r3) && com.tencent.mm.vfs.w6.j(r3)) == true) goto L19;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f117286d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            kotlin.ResultKt.throwOnFailure(r7)
            goto Lbb
        Le:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L16:
            kotlin.ResultKt.throwOnFailure(r7)
            r6.f117286d = r2
            com.tencent.mm.plugin.finder.live.viewmodel.b8 r7 = r6.f117287e
            r7.getClass()
            kotlinx.coroutines.r r1 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r3 = pz5.f.b(r6)
            r1.<init>(r3, r2)
            r1.k()
            com.tencent.mm.plugin.finder.live.widget.u70 r3 = r7.T6()
            r4 = 0
            if (r3 == 0) goto L49
            java.lang.String r3 = r3.d7()
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r5 != 0) goto L45
            boolean r3 = com.tencent.mm.vfs.w6.j(r3)
            if (r3 == 0) goto L45
            r3 = r2
            goto L46
        L45:
            r3 = r4
        L46:
            if (r3 != r2) goto L49
            goto L4a
        L49:
            r2 = r4
        L4a:
            java.lang.String r3 = "Finder.FinderLivePostUIC"
            java.lang.String r4 = ""
            if (r2 == 0) goto L88
            com.tencent.mm.plugin.finder.live.viewmodel.r6 r2 = com.tencent.mm.plugin.finder.live.viewmodel.r6.f117364d
            r1.m(r2)
            com.tencent.mm.plugin.finder.live.widget.u70 r2 = r7.T6()
            if (r2 == 0) goto L5f
            java.lang.String r4 = r2.d7()
        L5f:
            java.lang.String r2 = "choose live cover:"
            java.lang.String r2 = r2.concat(r4)
            com.tencent.mars.xlog.Log.i(r3, r2)
            java.lang.Class<w40.e> r2 = w40.e.class
            i95.m r2 = i95.n0.c(r2)
            w40.e r2 = (w40.e) r2
            qs2.q r2 = (qs2.q) r2
            r2.getClass()
            mv2.f0 r2 = mv2.f0.f331561a
            android.app.Activity r3 = r7.getContext()
            java.lang.String r3 = xy2.c.e(r3)
            com.tencent.mm.plugin.finder.live.viewmodel.s6 r5 = new com.tencent.mm.plugin.finder.live.viewmodel.s6
            r5.<init>(r1, r4, r7)
            r2.x(r4, r3, r5)
            goto Lb4
        L88:
            com.tencent.mm.plugin.finder.live.widget.u70 r7 = r7.T6()
            if (r7 == 0) goto L93
            java.lang.String r7 = r7.d7()
            goto L94
        L93:
            r7 = r4
        L94:
            java.lang.String r2 = "[dealWithCoverUrl] upload end, defaultThumbUrl:"
            java.lang.String r2 = r2.concat(r7)
            com.tencent.mars.xlog.Log.i(r3, r2)
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            com.tencent.mm.plugin.finder.live.viewmodel.b6 r2 = new com.tencent.mm.plugin.finder.live.viewmodel.b6
            r2.<init>(r7, r7, r4, r4)
            java.lang.Object r2 = kotlin.Result.m521constructorimpl(r2)
            r1.resumeWith(r2)
            java.lang.String r2 = "choose default cover:"
            java.lang.String r7 = r2.concat(r7)
            com.tencent.mars.xlog.Log.i(r3, r7)
        Lb4:
            java.lang.Object r7 = r1.j()
            if (r7 != r0) goto Lbb
            return r0
        Lbb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.n7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
