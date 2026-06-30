package qf2;

/* loaded from: classes3.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f362562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.s3 f362563f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(kotlin.jvm.internal.f0 f0Var, qf2.s3 s3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362562e = f0Var;
        this.f362563f = s3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.r3(this.f362562e, this.f362563f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.r3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x002b). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f362561d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            goto L2b
        Le:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L16:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
        L1a:
            kotlin.jvm.internal.f0 r1 = r8.f362562e
            int r1 = r1.f310116d
            if (r1 <= 0) goto L56
            r8.f362561d = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = kotlinx.coroutines.k1.b(r3, r8)
            if (r1 != r0) goto L2b
            return r0
        L2b:
            kotlin.jvm.internal.f0 r1 = r8.f362562e
            int r3 = r1.f310116d
            int r3 = r3 + (-1)
            r1.f310116d = r3
            qf2.s3 r3 = r8.f362563f
            java.lang.String r4 = r3.f362576b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "countDown: "
            r5.<init>(r6)
            int r6 = r1.f310116d
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r4, r5)
            qf2.a4 r3 = r3.f362578d
            if (r3 == 0) goto L1a
            int r1 = r1.f310116d
            wj2.j0 r3 = (wj2.j0) r3
            r3.a(r1)
            goto L1a
        L56:
            qf2.s3 r8 = r8.f362563f
            java.lang.String r0 = r8.f362576b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "onTimeOut isKeepMic: "
            r1.<init>(r3)
            boolean r3 = r8.f362579e
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            boolean r0 = r8.f362579e
            if (r0 != 0) goto Lc8
            qf2.t3 r0 = r8.f362580f
            qf2.q3 r1 = r0.f362590a
            java.lang.Class<mm2.o4> r3 = mm2.o4.class
            androidx.lifecycle.c1 r1 = r1.business(r3)
            mm2.o4 r1 = (mm2.o4) r1
            r45.il4 r1 = r1.U
            r45.kf5 r1 = r1.f377132g
            if (r1 == 0) goto L86
            int r1 = r1.f378657e
            goto L87
        L86:
            r1 = 0
        L87:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onTimeOut breakType: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r8.f362576b
            com.tencent.mars.xlog.Log.i(r4, r3)
            if (r1 == r2) goto L9d
            goto Lc8
        L9d:
            zl2.r4 r1 = zl2.r4.f473950a
            boolean r1 = r1.x1()
            if (r1 == 0) goto Lc8
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            xh2.a r8 = r8.f362575a
            km2.q r8 = r8.f454520a
            if (r8 == 0) goto Lb4
            java.lang.String r8 = r8.f309175f
            if (r8 != 0) goto Lb6
        Lb4:
            java.lang.String r8 = ""
        Lb6:
            java.lang.String r2 = "PARAM_FINDER_LIVE_MIC_ID"
            r1.putString(r2, r8)
            java.lang.String r8 = "PARAM_FINDER_LIVE_MIC_CLOSE_SCENE"
            r2 = 6
            r1.putInt(r8, r2)
            qo0.b r8 = qo0.b.M3
            qf2.q3 r0 = r0.f362590a
            r0.X6(r8, r1)
        Lc8:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.r3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
