package nr0;

/* loaded from: classes14.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f339090e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(nr0.x xVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339089d = xVar;
        this.f339090e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.k(this.f339089d, this.f339090e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        nr0.x xVar;
        android.graphics.SurfaceTexture surfaceTexture;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nr0.x xVar2 = this.f339089d;
        if (xVar2.f339119h == null) {
            xVar2.f339118g = is0.b.b(false, 21L);
            nr0.x xVar3 = this.f339089d;
            is0.c cVar = xVar3.f339118g;
            if (cVar != null) {
                int i17 = xVar3.f339121m.f456176b.f456173a;
                int i18 = this.f339089d.f339121m.f456176b.f456174b;
                cVar.f294400m = i17;
                cVar.f294401n = i18;
            }
            nr0.x xVar4 = this.f339089d;
            is0.c cVar2 = this.f339089d.f339118g;
            kotlin.jvm.internal.o.d(cVar2);
            xVar4.f339119h = new android.graphics.SurfaceTexture(cVar2.f294395e);
            if (this.f339089d.f339133y != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "getGLInputTexture >> camerax to setDefault size");
                nr0.x xVar5 = this.f339089d;
                android.graphics.SurfaceTexture surfaceTexture2 = xVar5.f339119h;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.setDefaultBufferSize(xVar5.f339121m.f456176b.f456173a, this.f339089d.f339121m.f456176b.f456174b);
                }
            }
            if (this.f339090e && (surfaceTexture = (xVar = this.f339089d).f339119h) != null) {
                final yz5.l lVar = xVar.f339134z;
                surfaceTexture.setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener(lVar) { // from class: nr0.p

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ yz5.l f339098d;

                    {
                        kotlin.jvm.internal.o.g(lVar, "function");
                        this.f339098d = lVar;
                    }

                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public final /* synthetic */ void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture3) {
                        this.f339098d.invoke(surfaceTexture3);
                    }
                });
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getGLInputTexture [");
            android.graphics.SurfaceTexture surfaceTexture3 = this.f339089d.f339119h;
            sb6.append(surfaceTexture3 != null ? new java.lang.Integer(surfaceTexture3.hashCode()) : null);
            sb6.append("] thread-id:[");
            sb6.append(android.os.Process.myTid());
            sb6.append("] name:");
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(" texturePreview:");
            sb6.append(this.f339090e);
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", sb6.toString());
        }
        android.graphics.SurfaceTexture surfaceTexture4 = this.f339089d.f339119h;
        kotlin.jvm.internal.o.d(surfaceTexture4);
        return surfaceTexture4;
    }
}
