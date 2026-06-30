package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
class ZIDL_SIvakOGDB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.mm.plugin.voipmp.platform.o {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.voipmp.platform.p f177198a;

    private native void ZIDL_II(long j17, long j18);

    public long ZIDL_A(int i17) {
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = (com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver) this.f177198a;
        voIPMPSurfaceTextureDriver.getClass();
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(i17);
        kz5.q qVar = voIPMPSurfaceTextureDriver.f213784c;
        boolean isEmpty = qVar.isEmpty();
        java.util.ArrayList arrayList = voIPMPSurfaceTextureDriver.f213783b;
        if (isEmpty) {
            arrayList.add(new jo5.m(surfaceTexture, null, 0L, 6, null));
            return arrayList.size();
        }
        int intValue = ((java.lang.Number) qVar.removeLast()).intValue();
        java.lang.Object obj = arrayList.get(intValue);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        jo5.m mVar = (jo5.m) obj;
        mVar.f300965a = surfaceTexture;
        mVar.f300966b = null;
        return intValue + 1;
    }

    public void ZIDL_B(long j17) {
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = (com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver) this.f177198a;
        if (voIPMPSurfaceTextureDriver.a(j17)) {
            return;
        }
        int i17 = (int) (j17 - 1);
        java.util.ArrayList arrayList = voIPMPSurfaceTextureDriver.f213783b;
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        jo5.m mVar = (jo5.m) obj;
        android.graphics.SurfaceTexture surfaceTexture = mVar.f300965a;
        android.view.Surface surface = mVar.f300966b;
        if (surface != null) {
            voIPMPSurfaceTextureDriver.unregisterSurface(surface);
            surface.release();
        }
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        mVar.f300965a = null;
        mVar.f300966b = null;
        mVar.f300967c = 0L;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        kz5.q qVar = voIPMPSurfaceTextureDriver.f213784c;
        qVar.addLast(valueOf);
        if (arrayList.size() == qVar.d()) {
            arrayList.clear();
            qVar.clear();
        }
    }

    public boolean ZIDL_C(long j17) {
        android.graphics.SurfaceTexture surfaceTexture;
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = (com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver) this.f177198a;
        if (voIPMPSurfaceTextureDriver.a(j17) || (surfaceTexture = ((jo5.m) voIPMPSurfaceTextureDriver.f213783b.get((int) (j17 - 1))).f300965a) == null) {
            return false;
        }
        surfaceTexture.updateTexImage();
        return true;
    }

    public long ZIDL_D(long j17) {
        android.graphics.SurfaceTexture surfaceTexture;
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = (com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver) this.f177198a;
        if (voIPMPSurfaceTextureDriver.a(j17) || (surfaceTexture = ((jo5.m) voIPMPSurfaceTextureDriver.f213783b.get((int) (j17 - 1))).f300965a) == null) {
            return 0L;
        }
        return surfaceTexture.getTimestamp();
    }

    public long ZIDL_E(long j17) {
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = (com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver) this.f177198a;
        if (voIPMPSurfaceTextureDriver.a(j17)) {
            return 0L;
        }
        java.lang.Object obj = voIPMPSurfaceTextureDriver.f213783b.get((int) (j17 - 1));
        kotlin.jvm.internal.o.f(obj, "get(...)");
        jo5.m mVar = (jo5.m) obj;
        android.view.Surface surface = mVar.f300966b;
        long j18 = mVar.f300967c;
        if (surface != null) {
            return j18;
        }
        android.graphics.SurfaceTexture surfaceTexture = mVar.f300965a;
        if (surfaceTexture == null) {
            return 0L;
        }
        android.view.Surface surface2 = new android.view.Surface(surfaceTexture);
        long registerSurface = voIPMPSurfaceTextureDriver.registerSurface(surface2);
        mVar.f300966b = surface2;
        mVar.f300967c = registerSurface;
        return registerSurface;
    }

    public long ZIDL_F(long j17) {
        this.f177198a.getClass();
        return 0L;
    }

    public boolean ZIDL_G(long j17) {
        android.graphics.SurfaceTexture surfaceTexture;
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = (com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver) this.f177198a;
        if (voIPMPSurfaceTextureDriver.a(j17) || (surfaceTexture = ((jo5.m) voIPMPSurfaceTextureDriver.f213783b.get((int) (j17 - 1))).f300965a) == null) {
            return false;
        }
        surfaceTexture.setOnFrameAvailableListener(new jo5.n(voIPMPSurfaceTextureDriver, j17));
        return true;
    }

    public boolean ZIDL_H(long j17) {
        android.graphics.SurfaceTexture surfaceTexture;
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = (com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver) this.f177198a;
        if (voIPMPSurfaceTextureDriver.a(j17) || (surfaceTexture = ((jo5.m) voIPMPSurfaceTextureDriver.f213783b.get((int) (j17 - 1))).f300965a) == null) {
            return false;
        }
        surfaceTexture.setOnFrameAvailableListener(null);
        return true;
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.mm.plugin.voipmp.platform.p pVar = (com.tencent.mm.plugin.voipmp.platform.p) obj;
        this.f177198a = pVar;
        ((com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver) pVar).f213782a = this;
    }

    @Override // com.tencent.mm.plugin.voipmp.platform.o
    public void y0(long j17) {
        ZIDL_II(this.nativeHandler, j17);
    }
}
