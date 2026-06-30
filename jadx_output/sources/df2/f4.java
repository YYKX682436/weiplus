package df2;

/* loaded from: classes3.dex */
public final class f4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f230107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.l4 f230108f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(com.tencent.mm.view.MMPAGView mMPAGView, df2.l4 l4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230107e = mMPAGView;
        this.f230108f = l4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.f4(this.f230107e, this.f230108f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.f4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f230106d
            java.lang.String r2 = "showAnimGuide tipPagReleased"
            java.lang.String r3 = "Finder.FinderLiveSlideToCloseGuideController"
            df2.l4 r4 = r9.f230108f
            r5 = 2
            jz5.f0 r6 = jz5.f0.f302826a
            com.tencent.mm.view.MMPAGView r7 = r9.f230107e
            r8 = 1
            if (r1 == 0) goto L26
            if (r1 == r8) goto L22
            if (r1 != r5) goto L1a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L66
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L42
        L26:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = 0
            if (r7 == 0) goto L33
            boolean r1 = r7.getUseRfx()
            if (r1 != r8) goto L33
            r10 = r8
        L33:
            if (r10 == 0) goto L59
            vl2.s r10 = vl2.s.f437868a
            vl2.h r1 = vl2.h.f437828p0
            r9.f230106d = r8
            java.lang.Object r10 = r10.f(r1, r9)
            if (r10 != r0) goto L42
            return r0
        L42:
            com.tencent.mm.rfx.RfxPagFile r10 = (com.tencent.mm.rfx.RfxPagFile) r10
            boolean r0 = r4.f230634r
            if (r0 == 0) goto L4c
            com.tencent.mars.xlog.Log.i(r3, r2)
            return r6
        L4c:
            if (r10 == 0) goto L7c
            if (r7 == 0) goto L53
            r7.setComposition(r10)
        L53:
            if (r7 == 0) goto L7c
            r7.g()
            goto L7c
        L59:
            vl2.s r10 = vl2.s.f437868a
            vl2.h r1 = vl2.h.f437828p0
            r9.f230106d = r5
            java.lang.Object r10 = r10.e(r1, r9)
            if (r10 != r0) goto L66
            return r0
        L66:
            org.libpag.PAGFile r10 = (org.libpag.PAGFile) r10
            boolean r0 = r4.f230634r
            if (r0 == 0) goto L70
            com.tencent.mars.xlog.Log.i(r3, r2)
            return r6
        L70:
            if (r10 == 0) goto L7c
            if (r7 == 0) goto L77
            r7.setComposition(r10)
        L77:
            if (r7 == 0) goto L7c
            r7.g()
        L7c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.f4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
