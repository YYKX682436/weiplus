package vr0;

/* loaded from: classes14.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.SurfaceRequest f439494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nr0.x f439496g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nr0.y f439497h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.camera.core.SurfaceRequest surfaceRequest, vr0.z zVar, nr0.x xVar, nr0.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439494e = surfaceRequest;
        this.f439495f = zVar;
        this.f439496g = xVar;
        this.f439497h = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vr0.p(this.f439494e, this.f439495f, this.f439496g, this.f439497h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr0.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a7  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f439493d
            r2 = 0
            nr0.x r3 = r11.f439496g
            java.lang.String r4 = "MicroMsg.Camera.CameraXImpl"
            r5 = 3
            r6 = 2
            r7 = 1
            vr0.z r8 = r11.f439495f
            androidx.camera.core.SurfaceRequest r9 = r11.f439494e
            if (r1 == 0) goto L2d
            if (r1 == r7) goto L29
            if (r1 == r6) goto L25
            if (r1 != r5) goto L1d
            kotlin.ResultKt.throwOnFailure(r12)
            goto La1
        L1d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L25:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L8b
        L29:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L7f
        L2d:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "onSurfaceRequested:"
            r12.<init>(r1)
            android.util.Size r1 = r9.getResolution()
            r12.append(r1)
            java.lang.String r1 = " rotate:"
            r12.append(r1)
            androidx.camera.core.Preview r1 = r8.f439542z
            if (r1 == 0) goto L51
            int r1 = r1.getTargetRotation()
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r1)
            goto L52
        L51:
            r10 = r2
        L52:
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            com.tencent.mars.xlog.Log.i(r4, r12)
            android.util.Size r12 = r9.getResolution()
            int r12 = r12.getWidth()
            android.util.Size r1 = r9.getResolution()
            int r1 = r1.getHeight()
            r11.f439493d = r7
            r3.getClass()
            nr0.v r7 = new nr0.v
            r7.<init>(r3, r12, r1, r2)
            java.lang.String r12 = "updateInputSize"
            java.lang.Object r12 = r3.m(r12, r7, r11)
            if (r12 != r0) goto L7f
            return r0
        L7f:
            r11.f439493d = r6
            r8.getClass()
            java.lang.Object r12 = sr0.f.G(r8, r11)
            if (r12 != r0) goto L8b
            return r0
        L8b:
            r8.getClass()
            r11.f439493d = r5
            r3.getClass()
            nr0.j r12 = new nr0.j
            r12.<init>(r3, r2)
            java.lang.String r1 = "getGlInputSurface"
            java.lang.Object r12 = r3.m(r1, r12, r11)
            if (r12 != r0) goto La1
            return r0
        La1:
            android.view.Surface r12 = (android.view.Surface) r12
            jz5.f0 r0 = jz5.f0.f302826a
            if (r12 != 0) goto Lad
            java.lang.String r12 = "getGLInputSurface error"
            com.tencent.mars.xlog.Log.e(r4, r12)
            return r0
        Lad:
            vr0.o r1 = new vr0.o
            nr0.y r2 = r11.f439497h
            r1.<init>(r2, r8)
            r9.provideSurface(r12, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
