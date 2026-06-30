package lc;

/* loaded from: classes14.dex */
public final class c implements com.tencent.cloud.aicamare.callback.CameraEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.g f317792a;

    public c(lc.g gVar) {
        this.f317792a = gVar;
    }

    @Override // com.tencent.cloud.aicamare.callback.CameraEventListener
    public final void onAutoFocusSucceed() {
    }

    @Override // com.tencent.cloud.aicamare.callback.CameraEventListener
    public final void onCameraClosed() {
    }

    @Override // com.tencent.cloud.aicamare.callback.CameraEventListener
    public final void onCameraSucceed() {
        this.f317792a.a(new java.lang.Runnable() { // from class: lc.c$$a
            /* JADX WARN: Removed duplicated region for block: B:35:0x0298  */
            /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 705
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: lc.c$$a.run():void");
            }
        });
    }

    @Override // com.tencent.cloud.aicamare.callback.CameraEventListener
    public final void onDataFrameCallBack(byte[] bArr) {
        mc.r rVar;
        byte[] bArr2;
        byte[] bArr3;
        if (bArr == null) {
            return;
        }
        int i17 = ic.d.f290281k;
        ic.d dVar = ic.c.f290280a;
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = dVar.f290290i;
        if (huiYanSdkConfig == null || huiYanSdkConfig.isJustCheckRawCamera() || this.f317792a.f317820u == null) {
            return;
        }
        if (this.f317792a.f317825z) {
            oc.h hVar = oc.g.f344101a;
            if (hVar.f344107f && hVar.f344105d != null) {
                if (hVar.f344110i == null) {
                    mc.p.f325531a.e("TuringSdkHelper", "cancelWaitFirstFrameTimeOut handler == null!");
                } else if (!hVar.f344103b) {
                    hVar.f344103b = true;
                    mc.p.f325531a.b("TuringSdkHelper", "remove first frame time out event!");
                    hVar.f344110i.removeMessages(3);
                    if (dVar.f290289h && (rVar = hVar.f344106e) != null) {
                        rVar.k();
                    }
                }
                pc.d dVar2 = pc.c.f353202a;
                synchronized (pc.d.class) {
                    com.tencent.cloud.component.common.ai.utils.SimplePool simplePool = dVar2.f353203a;
                    bArr2 = simplePool == null ? null : (byte[]) simplePool.acquire();
                }
                if (bArr2 == null) {
                    bArr2 = (byte[]) bArr.clone();
                } else {
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                }
                if (hVar.f344102a) {
                    hVar.f344105d.getClass();
                    mc.r rVar2 = hVar.f344106e;
                    if (rVar2 != null) {
                        if (rVar2.i()) {
                            dVar2.a(bArr2);
                        } else if (rVar2.f325549j) {
                            dVar2.a(bArr2);
                        } else {
                            int i18 = rVar2.f325551l;
                            if (i18 < 10) {
                                rVar2.f325551l = i18 + 1;
                                dVar2.a(bArr2);
                            } else {
                                if (rVar2.f325540a.size() >= 10 && (bArr3 = (byte[]) rVar2.f325540a.poll()) != null) {
                                    dVar2.a(bArr3);
                                }
                                rVar2.f325540a.add(bArr2);
                            }
                        }
                    }
                }
            }
        }
        android.hardware.Camera.Size cameraSize = this.f317792a.f317820u != null ? this.f317792a.f317820u.getCameraSize() : this.f317792a.f317821v;
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig2 = dVar.f290290i;
        if (huiYanSdkConfig2 == null || cameraSize == null) {
            return;
        }
        com.tencent.cloud.huiyan.api.HuiYanNativeApi.updateFrame(bArr, cameraSize.width, cameraSize.height, 1, huiYanSdkConfig2.isLandMode() ? 1 : 8, null, 0, 0, 0);
    }

    @Override // com.tencent.cloud.aicamare.callback.CameraEventListener
    public final void onEventError(int i17, java.lang.String str) {
        int i18;
        int i19;
        if (i17 == 4 || i17 == 5) {
            mc.p.f325531a.e("AuthingFragment", str);
            return;
        }
        mc.q qVar = mc.p.f325531a;
        qVar.e("AuthingFragment", "camera, error:" + i17 + " msg:" + str);
        if (i17 == 7) {
            i19 = 230;
            i18 = com.tencent.mm.R.string.pj9;
        } else {
            i18 = com.tencent.mm.R.string.f493892pj1;
            i19 = 215;
        }
        if (i19 == 215) {
            i18 = com.tencent.mm.R.string.f493891pj0;
        }
        lc.g gVar = this.f317792a;
        if (gVar.getContext() != null) {
            java.lang.String string = gVar.b().getString(i18);
            com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig = gVar.B;
            if (authUiConfig == null ? true : authUiConfig.isShowErrorDialog()) {
                gVar.a(new lc.g$$f(gVar, i19, string));
                return;
            } else {
                pc.f.c(i19, string);
                return;
            }
        }
        qVar.e("AuthingFragment", "camera on error context is null! code " + i19);
        pc.f.c(213, gVar.b().getString(com.tencent.mm.R.string.f493892pj1) + " camera error code: " + i19);
    }

    @Override // com.tencent.cloud.aicamare.callback.CameraEventListener
    public final void onPreviewSucceed() {
        this.f317792a.f317825z = false;
        this.f317792a.getClass();
        if (this.f317792a.f317820u == null) {
            mc.p.f325531a.e("AuthingFragment", "cameraHolder is null  ");
            pc.f.c(213, this.f317792a.b().getString(com.tencent.mm.R.string.f493892pj1) + " cameraHolder is null ");
            return;
        }
        pc.m mVar = pc.l.f353211a;
        android.hardware.Camera currentCamera = this.f317792a.f317820u.getCurrentCamera();
        mVar.getClass();
        new java.lang.ref.WeakReference(currentCamera);
        mc.p.f325531a.b("AuthingFragment", "on preview succeed!");
        mc.d.f325515a.f325503g = oc.g.f344101a.f344106e;
        this.f317792a.a(new lc.d(this));
    }
}
