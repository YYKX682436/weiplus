package ro5;

/* loaded from: classes14.dex */
public final class a0 implements ro5.b {

    /* renamed from: a, reason: collision with root package name */
    public ro5.j f398134a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f398135b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f398136c = true;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f398137d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final so5.n0 f398138e;

    public a0() {
        so5.n0 n0Var = new so5.n0();
        n0Var.a(new ro5.w());
        this.f398138e = n0Var;
    }

    @Override // ro5.b
    public void A(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27, int i28) {
        com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPRenderController2", "onVideoFrame: should not reach here");
    }

    @Override // ro5.b
    public void B() {
        this.f398138e.c();
        this.f398135b = false;
        this.f398136c = true;
        java.util.HashMap hashMap = this.f398137d;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            c(((java.lang.Number) ((java.util.Map.Entry) it.next()).getKey()).intValue(), null);
        }
        hashMap.clear();
    }

    @Override // ro5.b
    public void C(int i17) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocateDirect.put((byte) i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController2", "setOri: " + i17 + ", ret: " + com.tencent.mm.plugin.voipmp.platform.v0.f177287b.D(21, allocateDirect, allocateDirect.capacity()));
    }

    @Override // ro5.b
    public void D(int i17) {
        ro5.j jVar = this.f398134a;
        if (jVar != null) {
            jVar.f398218e = i17;
        }
    }

    public final void E(int i17, java.lang.Object obj) {
        java.util.HashMap hashMap = this.f398137d;
        jz5.l lVar = (jz5.l) hashMap.get(java.lang.Integer.valueOf(i17));
        android.view.Surface surface = obj instanceof android.view.Surface ? (android.view.Surface) obj : obj instanceof android.graphics.SurfaceTexture ? new android.view.Surface((android.graphics.SurfaceTexture) obj) : null;
        if (kotlin.jvm.internal.o.b(lVar, surface)) {
            return;
        }
        c(i17, null);
        if (surface == null) {
            return;
        }
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver.f213781d;
        java.lang.Long valueOf = voIPMPSurfaceTextureDriver != null ? java.lang.Long.valueOf(voIPMPSurfaceTextureDriver.registerSurface(surface)) : null;
        if (valueOf == null) {
            return;
        }
        hashMap.put(java.lang.Integer.valueOf(i17), new jz5.l(valueOf, surface));
        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.c(i17, valueOf.longValue(), ro5.u.f398298a);
    }

    @Override // ro5.b
    public boolean H0() {
        com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPRenderController2", "isCameraPause: should not reach here");
        return false;
    }

    @Override // ro5.b
    public void a() {
        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.o(ro5.x.f398303a);
    }

    @Override // ro5.b
    public boolean b() {
        return this.f398136c;
    }

    @Override // ro5.b
    public void c(int i17, bp5.h hVar) {
        jz5.l lVar = (jz5.l) this.f398137d.get(java.lang.Integer.valueOf(i17));
        if (lVar == null) {
            return;
        }
        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.c(i17, 0L, new ro5.z(lVar));
    }

    @Override // ro5.b
    public void d(er4.r roomType) {
        kotlin.jvm.internal.o.g(roomType, "roomType");
    }

    @Override // ro5.b
    public void e() {
    }

    @Override // ro5.b
    public boolean f() {
        com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPRenderController2", "checkVirtualBackgroundState: should not reach here");
        return false;
    }

    @Override // ro5.b
    public void g() {
    }

    @Override // ro5.b
    public er4.w h(long j17) {
        int i17 = (int) j17;
        E(i17, null);
        ro5.j jVar = this.f398134a;
        ro5.c a17 = jVar != null ? jVar.a(i17) : null;
        er4.w wVar = new er4.w();
        wVar.d(a17 != null ? a17.f398168b : 1.0d);
        wVar.e(a17 != null ? a17.f398169c : 0L);
        wVar.f(a17 != null ? a17.f398167a : 0L);
        wVar.g(a17 != null ? a17.f398170d : 0.0d);
        wVar.b(a17 != null ? a17.f398171e : 0.0d);
        wVar.c(a17 != null && a17.f398172f);
        wVar.f256193m = a17 != null ? a17.f398173g : 0L;
        wVar.f256194n[7] = true;
        return wVar;
    }

    @Override // ro5.b
    public void i(int i17, bp5.h renderTargetHolder) {
        kotlin.jvm.internal.o.g(renderTargetHolder, "renderTargetHolder");
        E(i17, renderTargetHolder.getRenderTarget());
    }

    @Override // ro5.b
    public boolean isCameraOn() {
        return this.f398135b;
    }

    @Override // ro5.b
    public void j(fp5.a remoteCameraStatusListener) {
        kotlin.jvm.internal.o.g(remoteCameraStatusListener, "remoteCameraStatusListener");
    }

    @Override // ro5.b
    public void k(int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPRenderController2", "updateCameraResolution: should not reach here");
    }

    @Override // ro5.b
    public void l() {
    }

    @Override // ro5.b
    public void m(int i17) {
        int i18 = ((i17 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / 90) % 4;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController2", "setLocalEncoderRotation: rotation=" + i17 + ", encoderRotation=" + i18);
        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.E(i18, ro5.y.f398315a);
    }

    @Override // ro5.b
    public fo5.f n() {
        return new fo5.f(0, 0, 0, 0, 0);
    }

    @Override // ro5.b
    public void o(boolean z17, boolean z18) {
        this.f398135b = z17;
        this.f398136c = z18;
        if (z17) {
            this.f398138e.b();
        }
    }

    @Override // ro5.b
    public void p(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPRenderController2", "flipCamera: should not reach here");
    }

    @Override // ro5.b
    public void q(java.util.ArrayList arrayList) {
    }

    @Override // ro5.b
    public void r(boolean z17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPRenderController2", "pauseCamera: should not reach here");
    }

    @Override // ro5.b
    public void s(er4.l mainUiScene) {
        kotlin.jvm.internal.o.g(mainUiScene, "mainUiScene");
    }

    @Override // ro5.b
    public long t(int i17, int i18, int i19) {
        ro5.j jVar = this.f398134a;
        if (jVar != null) {
            return jVar.c(i17, i18, i19);
        }
        return 0L;
    }

    @Override // ro5.b
    public void u(io.flutter.view.TextureRegistry flutterTextureRegisterHelper) {
        kotlin.jvm.internal.o.g(flutterTextureRegisterHelper, "flutterTextureRegisterHelper");
        this.f398134a = new ro5.j(flutterTextureRegisterHelper);
    }

    @Override // ro5.b
    public void v(byte[] imageData, int i17, int i18) {
        kotlin.jvm.internal.o.g(imageData, "imageData");
        com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPRenderController2", "onScreenFrame: should not reach here");
    }

    @Override // ro5.b
    public void w() {
        ro5.j jVar = this.f398134a;
        if (jVar != null) {
            jVar.b();
        }
        this.f398134a = null;
    }

    @Override // ro5.b
    public void x() {
    }

    @Override // ro5.b
    public void y() {
        com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPRenderController2", "startCamera: should not reach here");
    }

    @Override // ro5.b
    public void z(boolean z17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPRenderController2", "setVirtualBackground: should not reach here");
    }
}
