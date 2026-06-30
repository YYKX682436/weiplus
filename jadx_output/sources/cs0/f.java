package cs0;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f222044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView f222045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f222046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f222047g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView, float f17, float f18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222045e = cameraFocusAndMeteringView;
        this.f222046f = f17;
        this.f222047g = f18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cs0.f(this.f222045e, this.f222046f, this.f222047g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cs0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f222044d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.throwOnFailure(r10)
            goto L4f
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L18:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L30
        L1c:
            kotlin.ResultKt.throwOnFailure(r10)
            com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView r10 = r9.f222045e
            cs0.a r10 = r10.f68895u
            if (r10 == 0) goto L33
            r9.f222044d = r3
            com.tencent.mm.media.camera.view.CameraKitView r10 = (com.tencent.mm.media.camera.view.CameraKitView) r10
            java.lang.Object r10 = r10.j(r9)
            if (r10 != r0) goto L30
            return r0
        L30:
            jz5.l r10 = (jz5.l) r10
            goto L34
        L33:
            r10 = 0
        L34:
            r4 = r10
            kotlinx.coroutines.p0 r10 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r10 = kotlinx.coroutines.internal.b0.f310484a
            cs0.e r1 = new cs0.e
            com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView r5 = r9.f222045e
            float r6 = r9.f222046f
            float r7 = r9.f222047g
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f222044d = r2
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r1, r9)
            if (r10 != r0) goto L4f
            return r0
        L4f:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cs0.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
