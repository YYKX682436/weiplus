package nh2;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f337105d;

    /* renamed from: e, reason: collision with root package name */
    public int f337106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView f337107f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView ktvRenderLayoutView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f337107f = ktvRenderLayoutView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nh2.g(this.f337107f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nh2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0072 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f337106e
            r2 = 2
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView r5 = r6.f337107f
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r6.f337105d
            com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView r0 = (com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L6a
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            java.lang.Object r0 = r6.f337105d
            com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView r0 = (com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L43
        L28:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r7 = r5.f111681p
            if (r7 == 0) goto L56
            com.tencent.mm.rfx.RfxPagFile r7 = r5.B
            if (r7 != 0) goto L47
            vl2.s r7 = vl2.s.f437868a
            vl2.h r1 = vl2.h.M
            r6.f337105d = r5
            r6.f337106e = r4
            java.lang.Object r7 = r7.f(r1, r6)
            if (r7 != r0) goto L42
            return r0
        L42:
            r0 = r5
        L43:
            com.tencent.mm.rfx.RfxPagFile r7 = (com.tencent.mm.rfx.RfxPagFile) r7
            r0.B = r7
        L47:
            int r7 = r5.f111689x
            if (r7 == r4) goto L4c
            return r3
        L4c:
            com.tencent.mm.rfx.RfxPagFile r7 = r5.B
            if (r7 == 0) goto L7c
            com.tencent.mm.view.MMPAGView r0 = r5.f111684s
            r0.setComposition(r7)
            goto L7c
        L56:
            org.libpag.PAGFile r7 = r5.f111691z
            if (r7 != 0) goto L6e
            vl2.s r7 = vl2.s.f437868a
            vl2.h r1 = vl2.h.M
            r6.f337105d = r5
            r6.f337106e = r2
            java.lang.Object r7 = r7.e(r1, r6)
            if (r7 != r0) goto L69
            return r0
        L69:
            r0 = r5
        L6a:
            org.libpag.PAGFile r7 = (org.libpag.PAGFile) r7
            r0.f111691z = r7
        L6e:
            int r7 = r5.f111689x
            if (r7 == r4) goto L73
            return r3
        L73:
            org.libpag.PAGFile r7 = r5.f111691z
            if (r7 == 0) goto L7c
            com.tencent.mm.view.MMPAGView r0 = r5.f111684s
            r0.setComposition(r7)
        L7c:
            com.tencent.mm.view.MMPAGView r7 = r5.f111684s
            r0 = 0
            r7.setProgress(r0)
            com.tencent.mm.view.MMPAGView r7 = r5.f111684s
            r7.setRepeatCount(r4)
            com.tencent.mm.view.MMPAGView r7 = r5.f111684s
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L95
            com.tencent.mm.view.MMPAGView r7 = r5.f111684s
            r7.g()
        L95:
            com.tencent.mm.view.MMPAGView r7 = r5.f111684s
            r0 = 0
            r7.setVisibility(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nh2.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
