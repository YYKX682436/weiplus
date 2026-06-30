package pr0;

/* loaded from: classes14.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357901d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pr0.r f357903f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(pr0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357903f = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pr0.o oVar = new pr0.o(this.f357903f, continuation);
        oVar.f357902e = obj;
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0085  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f357901d
            r2 = 1
            pr0.r r3 = r6.f357903f
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r6.f357902e
            kotlinx.coroutines.y0 r0 = (kotlinx.coroutines.y0) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L34
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.f357902e
            kotlinx.coroutines.y0 r7 = (kotlinx.coroutines.y0) r7
            kotlinx.coroutines.r2 r1 = r3.f357909t
            if (r1 == 0) goto L35
            r6.f357902e = r7
            r6.f357901d = r2
            kotlinx.coroutines.c3 r1 = (kotlinx.coroutines.c3) r1
            java.lang.Object r1 = r1.C(r6)
            if (r1 != r0) goto L33
            return r0
        L33:
            r0 = r7
        L34:
            r7 = r0
        L35:
            java.lang.String r0 = "MicroMsg.Camera.CameraKit"
            java.lang.String r1 = "exec camerakit release"
            com.tencent.mars.xlog.Log.i(r0, r1)
            kotlinx.coroutines.y0 r0 = r3.f357898n
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r7 = " release."
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r1 = 2
            r4 = 0
            kotlinx.coroutines.z0.d(r0, r7, r4, r1, r4)
            android.os.HandlerThread r7 = r3.f357897m
            r7.quitSafely()
            nr0.x r7 = r3.k()
            zr0.s r7 = (zr0.s) r7
            r7.getClass()
            zr0.r r0 = new zr0.r
            r0.<init>(r7, r4)
            r7.l(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "destroyGLEnv hash:"
            r0.<init>(r1)
            int r1 = r7.hashCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.Camera.GLEnvBuilder"
            com.tencent.mars.xlog.Log.i(r1, r0)
            android.os.Handler r0 = r7.f339117f
            if (r0 == 0) goto L88
            r0.removeCallbacksAndMessages(r4)
        L88:
            nr0.h r0 = new nr0.h
            r0.<init>(r7, r4)
            r7.l(r0)
            android.hardware.display.DisplayManager r7 = r3.f357838i
            r7.unregisterDisplayListener(r3)
            or0.c r7 = or0.c.f347429a
            r7 = 0
            or0.c.f347433e = r7
            as0.a r0 = as0.a.f13425a
            int r1 = r3.f357833d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "markExit sessionId:"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r4 = " contain:"
            r3.append(r4)
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r4 = r0.a(r1)
            if (r4 == 0) goto Lb4
            goto Lb5
        Lb4:
            r2 = r7
        Lb5:
            r3.append(r2)
            java.lang.String r7 = " size:"
            r3.append(r7)
            android.util.SparseArray r7 = as0.a.f13426b
            int r2 = r7.size()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MicroMsg.CameraKitReport"
            com.tencent.mars.xlog.Log.i(r3, r2)
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r0 = r0.a(r1)
            if (r0 == 0) goto Le7
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r0.f55566o
            long r2 = r2 - r4
            r0.f55574w = r2
            long r2 = java.lang.System.currentTimeMillis()
            r0.f55567p = r2
            r0.k()
        Le7:
            r7.remove(r1)
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
