package kp3;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp3.x f310998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f310999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311000g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kp3.x xVar, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310998e = xVar;
        this.f310999f = i17;
        this.f311000g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp3.i(this.f310998e, this.f310999f, this.f311000g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp3.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f310997d
            r2 = 0
            r3 = 1
            kp3.x r4 = r5.f310998e
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            kotlin.ResultKt.throwOnFailure(r6)
            goto L2b
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.throwOnFailure(r6)
            r4.S6()
            com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout r6 = r4.f311051g
            if (r6 == 0) goto L2e
            r5.f310997d = r3
            java.lang.Object r6 = r6.j(r5)
            if (r6 != r0) goto L2b
            return r0
        L2b:
            jz5.l r6 = (jz5.l) r6
            goto L2f
        L2e:
            r6 = r2
        L2f:
            if (r6 == 0) goto L36
            java.lang.Object r0 = r6.f302833d
            r2 = r0
            java.lang.Integer r2 = (java.lang.Integer) r2
        L36:
            if (r2 != 0) goto L39
            goto L44
        L39:
            int r0 = r2.intValue()
            if (r0 != 0) goto L44
            java.lang.Object r6 = r6.f302834e
            java.lang.String r6 = (java.lang.String) r6
            goto L46
        L44:
            java.lang.String r6 = ""
        L46:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[handleTimeout] errCode: "
            r0.<init>(r1)
            int r1 = r5.f310999f
            r0.append(r1)
            java.lang.String r3 = ", recordRet: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = ", videoPath: "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.PalmPrintCameraSettingUIC"
            com.tencent.mars.xlog.Log.i(r2, r0)
            java.lang.String r0 = r5.f311000g
            r4.R6(r1, r0, r6)
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kp3.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
