package tx2;

/* loaded from: classes2.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f422545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView f422546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView highLightGreenBgView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422546e = highLightGreenBgView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tx2.e(this.f422546e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tx2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f422545d
            r2 = 3
            r3 = 1
            com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView r4 = r8.f422546e
            r5 = 2
            r6 = 300(0x12c, double:1.48E-321)
            if (r1 == 0) goto L27
            if (r1 == r3) goto L23
            if (r1 == r5) goto L1f
            if (r1 != r2) goto L17
            kotlin.ResultKt.throwOnFailure(r9)
            goto L83
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5b
        L23:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L52
        L27:
            kotlin.ResultKt.throwOnFailure(r9)
            float[] r9 = new float[r5]
            r9 = {x0086: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            tx2.a r1 = new tx2.a
            r1.<init>(r4)
            r9.addListener(r1)
            tx2.b r1 = new tx2.b
            r1.<init>(r4)
            r9.addUpdateListener(r1)
            r9.setDuration(r6)
            r9.start()
            r8.f422545d = r3
            java.lang.Object r9 = kotlinx.coroutines.k1.b(r6, r8)
            if (r9 != r0) goto L52
            return r0
        L52:
            r8.f422545d = r5
            java.lang.Object r9 = kotlinx.coroutines.k1.b(r6, r8)
            if (r9 != r0) goto L5b
            return r0
        L5b:
            float[] r9 = new float[r5]
            r9 = {x008e: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            tx2.c r1 = new tx2.c
            r1.<init>(r4)
            r9.addListener(r1)
            tx2.d r1 = new tx2.d
            r1.<init>(r4)
            r9.addUpdateListener(r1)
            r9.setDuration(r6)
            r9.start()
            r8.f422545d = r2
            java.lang.Object r9 = kotlinx.coroutines.k1.b(r6, r8)
            if (r9 != r0) goto L83
            return r0
        L83:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tx2.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
