package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
class ZIDL_hlVbXEKwB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.mm.plugin.voipmp.platform.m {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.voipmp.platform.n f177200a;

    private native void ZIDL_GI(long j17, int i17, int i18, int i19);

    private native void ZIDL_HI(long j17, int i17, long j18);

    @Override // com.tencent.mm.plugin.voipmp.platform.m
    public void F1(int i17, long j17) {
        ZIDL_HI(this.nativeHandler, i17, j17);
    }

    @Override // com.tencent.mm.plugin.voipmp.platform.m
    public void X0(int i17, int i18, int i19) {
        ZIDL_GI(this.nativeHandler, i17, i18, i19);
    }

    public boolean ZIDL_A(long j17, int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19) {
        android.graphics.SurfaceTexture surfaceTexture;
        jo5.l lVar = (jo5.l) this.f177200a;
        lVar.getClass();
        if (byteBuffer == null || i18 <= 0) {
            return false;
        }
        if (!((i19 & 18) == 18 || (i19 & 19) == 19) || byteBuffer.capacity() < i18) {
            return false;
        }
        java.util.HashMap hashMap = lVar.f300960b;
        jz5.l lVar2 = (jz5.l) hashMap.get(java.lang.Integer.valueOf(i17));
        if (!(lVar2 != null && ((java.lang.Number) lVar2.f302833d).longValue() == j17)) {
            com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver.f213781d;
            android.graphics.SurfaceTexture surfaceTexture2 = null;
            if (voIPMPSurfaceTextureDriver != null && !voIPMPSurfaceTextureDriver.a(j17) && (surfaceTexture = ((jo5.m) voIPMPSurfaceTextureDriver.f213783b.get((int) (j17 - 1))).f300965a) != null) {
                surfaceTexture2 = surfaceTexture;
            }
            if (surfaceTexture2 == null) {
                com.tencent.mars.xlog.Log.e("VoIPMPCodecDriver", "Cannot find corresponding surface texture for memberId: " + i17 + ", dstSurfaceTextureHandle: " + j17);
            } else {
                hashMap.put(java.lang.Integer.valueOf(i17), new jz5.l(java.lang.Long.valueOf(j17), surfaceTexture2));
            }
        }
        cp5.a a17 = lVar.f300962d.a(i18, false);
        java.nio.ByteBuffer a18 = a17.a();
        if (a18 == null) {
            return false;
        }
        synchronized (a18) {
            byteBuffer.clear();
            byteBuffer.limit(i18);
            a18.clear();
            a18.put(byteBuffer);
            a18.rewind();
        }
        lVar.f300963e.c(new to5.a(i17, a17, 0, 0, i19, (i19 & 128) == 128, 4, (i19 & 2048) == 2048));
        return true;
    }

    public void ZIDL_B() {
        ((jo5.l) this.f177200a).f300963e.close();
    }

    public void ZIDL_C(int i17, boolean z17, boolean z18, int i18, int i19, int i27, int i28) {
        ((jo5.l) this.f177200a).b(false, i17, z17, z18, i18, i19, i27, i28);
    }

    public void ZIDL_D(int i17, boolean z17, boolean z18, int i18, int i19, int i27, int i28) {
        ((jo5.l) this.f177200a).b(true, i17, z17, z18, i18, i19, i27, i28);
    }

    public void ZIDL_E(int i17) {
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver;
        jo5.l lVar = (jo5.l) this.f177200a;
        so5.y yVar = lVar.f300964f;
        so5.t[] tVarArr = yVar.f410930q;
        so5.t tVar = tVarArr[i17];
        so5.q qVar = so5.q.f410906b;
        if (!kotlin.jvm.internal.o.b(tVar, qVar)) {
            yVar.i(i17);
            tVarArr[i17] = qVar;
        }
        jz5.l lVar2 = (jz5.l) lVar.f300961c.get(java.lang.Integer.valueOf(i17));
        if (lVar2 != null && (voIPMPSurfaceTextureDriver = com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver.f213781d) != null) {
            voIPMPSurfaceTextureDriver.unregisterSurface((android.view.Surface) lVar2.f302834e);
        }
        lVar.a(i17, null);
    }

    public void ZIDL_F() {
        jo5.l lVar = (jo5.l) this.f177200a;
        lVar.f300963e.close();
        lVar.f300960b.clear();
        lVar.f300964f.close();
        for (java.util.Map.Entry entry : lVar.f300961c.entrySet()) {
            android.view.Surface surface = (android.view.Surface) ((jz5.l) entry.getValue()).f302834e;
            com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver.f213781d;
            if (voIPMPSurfaceTextureDriver != null) {
                voIPMPSurfaceTextureDriver.unregisterSurface(surface);
            }
            lVar.a(((java.lang.Number) entry.getKey()).intValue(), null);
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.mm.plugin.voipmp.platform.n nVar = (com.tencent.mm.plugin.voipmp.platform.n) obj;
        this.f177200a = nVar;
        ((jo5.l) nVar).f300959a = this;
    }
}
