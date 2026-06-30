package rt1;

/* loaded from: classes7.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f399493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI f399494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399495f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI carLicensePlateEditUI, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f399494e = carLicensePlateEditUI;
        this.f399495f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rt1.w(this.f399494e, this.f399495f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt1.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041 A[Catch: f -> 0x002c, TryCatch #0 {f -> 0x002c, blocks: (B:15:0x0028, B:20:0x0031, B:22:0x0035, B:27:0x0041, B:30:0x004f), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f A[Catch: f -> 0x002c, TRY_LEAVE, TryCatch #0 {f -> 0x002c, blocks: (B:15:0x0028, B:20:0x0031, B:22:0x0035, B:27:0x0041, B:30:0x004f), top: B:2:0x000e }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f399493d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 4
            r4 = 3
            r5 = 2
            java.lang.String r6 = r9.f399495f
            r7 = 1
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI r8 = r9.f399494e
            if (r1 == 0) goto L2e
            if (r1 == r7) goto L28
            if (r1 == r5) goto L28
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            kotlin.ResultKt.throwOnFailure(r10)
            goto L70
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L7f
        L28:
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: qt1.f -> L2c
            goto L62
        L2c:
            r10 = move-exception
            goto L71
        L2e:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = r8.f94613h     // Catch: qt1.f -> L2c
            if (r10 == 0) goto L3e
            int r10 = r10.length()     // Catch: qt1.f -> L2c
            if (r10 != 0) goto L3c
            goto L3e
        L3c:
            r10 = 0
            goto L3f
        L3e:
            r10 = r7
        L3f:
            if (r10 == 0) goto L4f
            qt1.d r10 = new qt1.d     // Catch: qt1.f -> L2c
            r10.<init>(r6)     // Catch: qt1.f -> L2c
            r9.f399493d = r7     // Catch: qt1.f -> L2c
            java.lang.Object r10 = r10.e(r9)     // Catch: qt1.f -> L2c
            if (r10 != r0) goto L62
            return r0
        L4f:
            qt1.k r10 = new qt1.k     // Catch: qt1.f -> L2c
            java.lang.String r1 = r8.f94613h     // Catch: qt1.f -> L2c
            kotlin.jvm.internal.o.d(r1)     // Catch: qt1.f -> L2c
            r10.<init>(r1, r6)     // Catch: qt1.f -> L2c
            r9.f399493d = r5     // Catch: qt1.f -> L2c
            java.lang.Object r10 = r10.e(r9)     // Catch: qt1.f -> L2c
            if (r10 != r0) goto L62
            return r0
        L62:
            rt1.v r10 = new rt1.v
            r10.<init>(r8, r6)
            r9.f399493d = r3
            java.lang.Object r10 = st1.g.d(r10, r9)
            if (r10 != r0) goto L70
            return r0
        L70:
            return r2
        L71:
            rt1.u r1 = new rt1.u
            r1.<init>(r10, r8)
            r9.f399493d = r4
            java.lang.Object r10 = st1.g.d(r1, r9)
            if (r10 != r0) goto L7f
            return r0
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rt1.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
