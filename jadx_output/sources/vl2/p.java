package vl2;

/* loaded from: classes3.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f437861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vl2.h f437862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f437863f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(vl2.h hVar, com.tencent.mm.view.MMPAGView mMPAGView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f437862e = hVar;
        this.f437863f = mMPAGView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vl2.p(this.f437862e, this.f437863f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vl2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0093  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f437861d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 2
            r4 = 1
            com.tencent.mm.view.MMPAGView r5 = r8.f437863f
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            kotlin.ResultKt.throwOnFailure(r9)
            goto L8f
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7c
        L21:
            kotlin.ResultKt.throwOnFailure(r9)
            vl2.h r9 = vl2.h.f437819e
            java.lang.String r1 = "LiveUdrResourceLoader"
            vl2.h r6 = r8.f437862e
            if (r6 != r9) goto L45
            vl2.s r9 = vl2.s.f437868a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = r6.f437840d
            r9.append(r0)
            java.lang.String r0 = " loadMMPAG failed, resourceName is Unknown"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.i(r1, r9)
            return r2
        L45:
            vl2.s r9 = vl2.s.f437868a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r7 = "loadMMPAG resourceName:"
            r9.<init>(r7)
            java.lang.String r7 = r6.f437840d
            r9.append(r7)
            java.lang.String r7 = ", useRfx:"
            r9.append(r7)
            boolean r7 = r5.getUseRfx()
            r9.append(r7)
            r7 = 32
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.i(r1, r9)
            boolean r9 = r5.getUseRfx()
            if (r9 == 0) goto L84
            vl2.s r9 = vl2.s.f437868a
            r8.f437861d = r4
            java.lang.Object r9 = r9.f(r6, r8)
            if (r9 != r0) goto L7c
            return r0
        L7c:
            com.tencent.mm.rfx.RfxPagFile r9 = (com.tencent.mm.rfx.RfxPagFile) r9
            if (r9 == 0) goto L96
            r5.setComposition(r9)
            goto L96
        L84:
            vl2.s r9 = vl2.s.f437868a
            r8.f437861d = r3
            java.lang.Object r9 = r9.e(r6, r8)
            if (r9 != r0) goto L8f
            return r0
        L8f:
            org.libpag.PAGFile r9 = (org.libpag.PAGFile) r9
            if (r9 == 0) goto L96
            r5.setComposition(r9)
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
