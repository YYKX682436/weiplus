package ku3;

/* loaded from: classes10.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312256d;

    /* renamed from: e, reason: collision with root package name */
    public int f312257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout f312258f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312258f = professionalCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.i1(this.f312258f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ku3.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f312257e
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout r7 = r13.f312258f
            if (r1 == 0) goto L2e
            if (r1 == r6) goto L2a
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            kotlin.ResultKt.throwOnFailure(r14)
            goto Lc6
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.f312256d
            hu3.v0 r1 = (hu3.v0) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L9f
        L2a:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L4a
        L2e:
            kotlin.ResultKt.throwOnFailure(r14)
            hu3.n0 r14 = r7.P
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r7.getConfigProvider()
            kotlin.jvm.internal.o.d(r1)
            java.lang.String r1 = r1.D
            java.lang.String r8 = "inputPhotoPath"
            kotlin.jvm.internal.o.f(r1, r8)
            r13.f312257e = r6
            java.lang.Object r14 = r14.k(r1, r13)
            if (r14 != r0) goto L4a
            return r0
        L4a:
            r1 = r14
            hu3.v0 r1 = (hu3.v0) r1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r8 = "take picture "
            r14.<init>(r8)
            int r8 = r1.f285209a
            r14.append(r8)
            java.lang.String r14 = r14.toString()
            java.lang.String r8 = "MicroMsg.ProfessionalCameraKitPluginLayout"
            com.tencent.mars.xlog.Log.i(r8, r14)
            int r14 = r1.f285209a
            if (r14 != 0) goto Lc6
            int r14 = com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout.f155856x1
            boolean r14 = r7.getEnableLandscape()
            r8 = 0
            if (r14 == 0) goto L72
            r14 = r8
            goto L7d
        L72:
            yt3.x3 r14 = r7.getOrientationPlugin()
            int r14 = r14.f465719f
            int r14 = -r14
            int r14 = r14 + 360
            int r14 = r14 % 360
        L7d:
            ct0.b r9 = r1.f285210b
            if (r9 == 0) goto L84
            java.lang.String r10 = r9.f222213j
            goto L85
        L84:
            r10 = r5
        L85:
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG
            if (r9 == 0) goto L8c
            java.lang.String r9 = r9.f222213j
            goto L8d
        L8c:
            r9 = r5
        L8d:
            r12 = 100
            com.tencent.mm.sdk.platformtools.x.y0(r10, r14, r11, r12, r9)
            r13.f312256d = r1
            r13.f312257e = r4
            ku3.l5 r14 = r7.E
            java.lang.Object r14 = r14.a(r8, r8, r13)
            if (r14 != r0) goto L9f
            return r0
        L9f:
            int r14 = com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout.f155856x1
            it3.y r14 = r7.getNavigator()
            if (r14 == 0) goto Lae
            ct0.b r1 = r1.f285210b
            jt3.h r14 = (jt3.h) r14
            r14.e(r6, r1)
        Lae:
            r13.f312256d = r5
            r13.f312257e = r3
            kotlinx.coroutines.p0 r14 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r14 = kotlinx.coroutines.internal.b0.f310484a
            ku3.n1 r1 = new ku3.n1
            r1.<init>(r7, r5)
            java.lang.Object r14 = kotlinx.coroutines.l.g(r14, r1, r13)
            if (r14 != r0) goto Lc2
            goto Lc3
        Lc2:
            r14 = r2
        Lc3:
            if (r14 != r0) goto Lc6
            return r0
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ku3.i1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
