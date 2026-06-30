package nr0;

/* loaded from: classes14.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f339110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f339111f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(nr0.x xVar, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339109d = xVar;
        this.f339110e = i17;
        this.f339111f = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.v(this.f339109d, this.f339110e, this.f339111f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nr0.v vVar = (nr0.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        as0.a aVar2 = as0.a.f13425a;
        int i17 = this.f339109d.f339115d;
        int i18 = this.f339110e;
        int i19 = this.f339111f;
        com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a17 = aVar2.a(i17);
        if (a17 != null) {
            a17.f55561j = i18;
            a17.f55562k = i19;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "setCameraSize:[" + this.f339110e + ' ' + this.f339111f + ']');
        nr0.x xVar = this.f339109d;
        xVar.f339131w = true;
        xr0.k kVar = xVar.f339121m;
        int i27 = this.f339110e;
        int i28 = this.f339111f;
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitModel", "updateCameraSize >> width:" + i27 + ", height:" + i28 + "  origin >> " + kVar);
        kVar.f456176b.f456173a = i27;
        kVar.f456176b.f456174b = i28;
        kVar.a();
        nr0.x xVar2 = this.f339109d;
        is0.c cVar = xVar2.f339118g;
        if (cVar != null) {
            int i29 = this.f339110e;
            int i37 = this.f339111f;
            cVar.f294400m = i29;
            cVar.f294401n = i37;
        }
        if (xVar2.f339133y != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "updateInputSize >> camerax set default >> " + this.f339110e + ", " + this.f339111f);
            nr0.x xVar3 = this.f339109d;
            android.graphics.SurfaceTexture surfaceTexture = xVar3.f339119h;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(xVar3.f339121m.f456176b.f456173a, this.f339109d.f339121m.f456176b.f456174b);
            }
        }
        return jz5.f0.f302826a;
    }
}
