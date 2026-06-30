package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
class ZIDL_oeNivDgqB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.voipmp.platform.l f177202a;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[LOOP:0: B:18:0x005d->B:24:0x0081, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[EDGE_INSN: B:25:0x0085->B:26:0x0085 BREAK  A[LOOP:0: B:18:0x005d->B:24:0x0081], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long ZIDL_A(byte[] r21) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voipmp.platform.ZIDL_oeNivDgqB.ZIDL_A(byte[]):long");
    }

    public void ZIDL_B(long j17) {
        jo5.i iVar = (jo5.i) this.f177202a;
        jo5.c a17 = iVar.a(j17);
        if (a17 == null) {
            return;
        }
        iVar.c(a17);
        jo5.b bVar = a17.f300936c;
        android.hardware.camera2.CameraDevice cameraDevice = bVar.f300929e;
        if (cameraDevice != null) {
            java.util.concurrent.Semaphore semaphore = bVar.f300931g;
            semaphore.drainPermits();
            cameraDevice.close();
            semaphore.tryAcquire(3000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            bVar.f300929e = null;
            bVar.f300930f = com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusClosed;
        }
        android.view.Surface surface = a17.f300938e;
        if (surface != null) {
            surface.release();
        }
        a17.f300938e = null;
        boolean z17 = true;
        if (j17 == 0) {
            return;
        }
        int i17 = (int) (j17 - 1);
        java.util.ArrayList arrayList = iVar.f300951a;
        arrayList.set(i17, null);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        kz5.q qVar = iVar.f300952b;
        qVar.addLast(valueOf);
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!(((jo5.c) it.next()) == null)) {
                    z17 = false;
                    break;
                }
            }
        }
        if (z17) {
            arrayList.clear();
            qVar.clear();
        }
    }

    public boolean ZIDL_C(long j17) {
        jo5.c a17 = ((jo5.i) this.f177202a).a(j17);
        if (a17 == null) {
            return false;
        }
        if (!com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.active() && (!qo5.b.f365664b || !((jp5.o) i95.n0.c(jp5.o.class)).g3())) {
            return false;
        }
        jo5.b bVar = a17.f300936c;
        if (bVar.f300929e != null) {
            return true;
        }
        java.util.concurrent.Semaphore semaphore = bVar.f300931g;
        semaphore.drainPermits();
        bVar.f300932h = false;
        try {
            int i17 = android.os.Build.VERSION.SDK_INT;
            jo5.a aVar = bVar.f300933i;
            java.lang.String str = bVar.f300926b;
            if (i17 >= 28) {
                android.hardware.camera2.CameraManager cameraManager = bVar.f300925a;
                java.util.concurrent.Executor executor = bVar.f300927c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(aVar);
                arrayList.add(executor);
                arrayList.add(str);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(cameraManager, arrayList.toArray(), "com/tencent/mm/voipmp/v2/driver/VoIPMPCamera2Device", "open", "(J)Z", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V");
            } else {
                android.hardware.camera2.CameraManager cameraManager2 = bVar.f300925a;
                android.os.Handler handler = bVar.f300928d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(handler);
                arrayList2.add(aVar);
                arrayList2.add(str);
                java.util.Collections.reverse(arrayList2);
                yj0.a.k(cameraManager2, arrayList2.toArray(), "com/tencent/mm/voipmp/v2/driver/VoIPMPCamera2Device", "open", "(J)Z", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
            }
            if (semaphore.tryAcquire(5000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return bVar.f300932h;
            }
            return false;
        } catch (java.lang.SecurityException | java.lang.Exception unused) {
            return false;
        }
    }

    public boolean ZIDL_D(long j17) {
        jo5.i iVar = (jo5.i) this.f177202a;
        jo5.c a17 = iVar.a(j17);
        if (a17 == null) {
            return false;
        }
        iVar.c(a17);
        jo5.b bVar = a17.f300936c;
        android.hardware.camera2.CameraDevice cameraDevice = bVar.f300929e;
        if (cameraDevice != null) {
            java.util.concurrent.Semaphore semaphore = bVar.f300931g;
            semaphore.drainPermits();
            cameraDevice.close();
            semaphore.tryAcquire(3000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            bVar.f300929e = null;
            bVar.f300930f = com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusClosed;
        }
        android.view.Surface surface = a17.f300938e;
        if (surface != null) {
            surface.release();
        }
        a17.f300938e = null;
        return true;
    }

    public boolean ZIDL_E(long j17, long j18, byte[] bArr) {
        android.graphics.SurfaceTexture surfaceTexture;
        com.tencent.mm.plugin.voipmp.platform.l lVar = this.f177202a;
        com.tencent.mm.plugin.voipmp.platform.i iVar = (com.tencent.mm.plugin.voipmp.platform.i) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.mm.plugin.voipmp.platform.i.f177267h, bArr);
        jo5.c a17 = ((jo5.i) lVar).a(j17);
        boolean z17 = false;
        if (a17 == null) {
            return false;
        }
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver.f213781d;
        com.tencent.mm.plugin.voipmp.platform.b bVar = null;
        if (voIPMPSurfaceTextureDriver == null || voIPMPSurfaceTextureDriver.a(j18) || (surfaceTexture = ((jo5.m) voIPMPSurfaceTextureDriver.f213783b.get((int) (j18 - 1))).f300965a) == null) {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            return false;
        }
        if (iVar != null) {
            bVar = iVar.f177271g[1] ? iVar.f177268d : com.tencent.mm.plugin.voipmp.platform.b.VoIPMPCameraDefinition480P;
        }
        if (bVar == null) {
            bVar = com.tencent.mm.plugin.voipmp.platform.b.VoIPMPCameraDefinition720P;
        }
        int ordinal = bVar.ordinal();
        android.util.Size size = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? new android.util.Size(1280, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH) : new android.util.Size(1920, 1080) : new android.util.Size(1280, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH) : new android.util.Size(640, 480);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        android.view.Surface surface = a17.f300938e;
        if (surface != null) {
            surface.release();
        }
        a17.f300938e = new android.view.Surface(surfaceTexture);
        int i17 = iVar != null && iVar.f177271g[2] ? iVar.f177269e : 15;
        if (iVar != null && iVar.f177271g[3]) {
            z17 = true;
        }
        a17.f300939f = new android.util.Range(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? iVar.f177270f : 15));
        return true;
    }

    public boolean ZIDL_F(long j17) {
        android.hardware.camera2.CameraDevice cameraDevice;
        android.view.Surface surface;
        jo5.i iVar = (jo5.i) this.f177202a;
        jo5.c a17 = iVar.a(j17);
        if (a17 == null || (cameraDevice = a17.f300936c.f300929e) == null || (surface = a17.f300938e) == null) {
            return false;
        }
        iVar.c(a17);
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        jo5.h hVar = new jo5.h(a17, cameraDevice, surface, iVar, c0Var, countDownLatch);
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                cameraDevice.createCaptureSession(new android.hardware.camera2.params.SessionConfiguration(0, kz5.b0.c(new android.hardware.camera2.params.OutputConfiguration(surface)), (java.util.concurrent.Executor) ((jz5.n) iVar.f300955e).getValue(), hVar));
            } else {
                cameraDevice.createCaptureSession(kz5.b0.c(surface), hVar, iVar.b());
            }
            if (countDownLatch.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return c0Var.f310112d;
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public boolean ZIDL_G(long j17) {
        jo5.i iVar = (jo5.i) this.f177202a;
        jo5.c a17 = iVar.a(j17);
        if (a17 == null) {
            return false;
        }
        iVar.c(a17);
        jo5.b bVar = a17.f300936c;
        if (bVar.f300930f == com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusStarted) {
            bVar.f300930f = com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusOpened;
        }
        return true;
    }

    public int ZIDL_H(long j17) {
        com.tencent.mm.plugin.voipmp.platform.g gVar;
        jo5.c a17 = ((jo5.i) this.f177202a).a(j17);
        com.tencent.mm.plugin.voipmp.platform.g gVar2 = com.tencent.mm.plugin.voipmp.platform.g.VoIPMPFrameRotation0;
        if (a17 != null) {
            try {
                android.hardware.camera2.CameraCharacteristics cameraCharacteristics = a17.f300934a.getCameraCharacteristics(a17.f300935b);
                kotlin.jvm.internal.o.f(cameraCharacteristics, "getCameraCharacteristics(...)");
                java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
                if (num == null) {
                    num = 0;
                }
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == 90) {
                        gVar = com.tencent.mm.plugin.voipmp.platform.g.VoIPMPFrameRotation90;
                    } else if (intValue == 180) {
                        gVar = com.tencent.mm.plugin.voipmp.platform.g.VoIPMPFrameRotation180;
                    } else if (intValue == 270) {
                        gVar = com.tencent.mm.plugin.voipmp.platform.g.VoIPMPFrameRotation270;
                    }
                    gVar2 = gVar;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return gVar2.f177259d;
    }

    public int ZIDL_I(long j17) {
        jo5.c a17 = ((jo5.i) this.f177202a).a(j17);
        return (a17 == null ? com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusUninitialized : a17.f300936c.f300930f).f177246d;
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.f177202a = (com.tencent.mm.plugin.voipmp.platform.l) obj;
    }
}
