package hf2;

/* loaded from: classes10.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f281196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281197f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(hf2.y0 y0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281196e = y0Var;
        this.f281197f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hf2.x0(this.f281196e, this.f281197f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f281195d
            java.lang.String r2 = "maas_updateText"
            r3 = 2
            r4 = 1
            hf2.y0 r5 = r6.f281196e
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r7)
            goto L3b
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L2c
        L20:
            kotlin.ResultKt.throwOnFailure(r7)
            r6.f281195d = r4
            java.lang.Object r7 = r5.d(r2, r6)
            if (r7 != r0) goto L2c
            return r0
        L2c:
            hf2.x r7 = r5.f281200a
            r45.h84 r7 = r7.f281186r
            r6.f281195d = r3
            java.lang.String r1 = r6.f281197f
            java.lang.Object r7 = r5.a(r7, r1, r6)
            if (r7 != r0) goto L3b
            return r0
        L3b:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 == 0) goto L4a
            hf2.x r0 = r5.f281200a
            hf2.b2 r0 = r0.h7()
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.d(r2, r7, r1)
        L4a:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
