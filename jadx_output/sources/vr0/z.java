package vr0;

/* loaded from: classes14.dex */
public final class z extends sr0.f implements androidx.lifecycle.k0 {
    public static boolean F;
    public volatile androidx.camera.core.Camera A;
    public final vr0.b0 B;
    public final vr0.a C;
    public boolean D;
    public yz5.l E;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f439536t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.camera.lifecycle.ProcessCameraProvider f439537u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.camera.extensions.ExtensionsManager f439538v;

    /* renamed from: w, reason: collision with root package name */
    public wa.a f439539w;

    /* renamed from: x, reason: collision with root package name */
    public wa.a f439540x;

    /* renamed from: y, reason: collision with root package name */
    public androidx.camera.core.ImageCapture f439541y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.camera.core.Preview f439542z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kotlinx.coroutines.flow.j2 stateFlow, int i17) {
        super(i17);
        kotlin.jvm.internal.o.g(stateFlow, "stateFlow");
        this.f439536t = stateFlow;
        this.B = new vr0.b0();
        this.C = new vr0.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(vr0.z r10, androidx.camera.core.CameraSelector r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.z.I(vr0.z, androidx.camera.core.CameraSelector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object J(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        nr0.x xVar;
        androidx.camera.core.Preview preview;
        nr0.y yVar = zVar.f411433g;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (yVar != null && (xVar = zVar.f411434h) != null && (preview = zVar.f439542z) != null) {
            preview.setSurfaceProvider(yVar, new vr0.r(yVar, zVar, xVar));
        }
        return f0Var;
    }

    @Override // sr0.f
    public void F(int i17) {
        this.f411437n.f456163e = i17;
        nr0.x xVar = this.f411434h;
        kotlin.jvm.internal.o.d(xVar);
        xr0.j jVar = xVar.f339121m.f456175a;
        vr0.b0 b0Var = this.B;
        boolean v17 = v();
        b0Var.f439449a.a(v17, i17, B().f456173a, B().f456174b, jVar.f456173a, jVar.f456174b);
        android.graphics.Matrix matrix = b0Var.f439450b;
        matrix.reset();
        matrix.setScale(v17 ? -1.0f : 1.0f, 1.0f);
        matrix.setRotate(-i17, 0.5f, 0.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof vr0.d
            if (r0 == 0) goto L13
            r0 = r8
            vr0.d r0 = (vr0.d) r0
            int r1 = r0.f439464h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f439464h = r1
            goto L18
        L13:
            vr0.d r0 = new vr0.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f439462f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f439464h
            r3 = 2
            r4 = 1
            java.lang.String r5 = "MicroMsg.Camera.CameraXImpl"
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L8a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            java.lang.Object r2 = r0.f439461e
            vr0.z r2 = (vr0.z) r2
            java.lang.Object r4 = r0.f439460d
            vr0.z r4 = (vr0.z) r4
            kotlin.ResultKt.throwOnFailure(r8)
            goto L60
        L41:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "buildCameraUsage"
            com.tencent.mars.xlog.Log.i(r5, r8)
            androidx.camera.lifecycle.ProcessCameraProvider r8 = r7.f439537u
            if (r8 != 0) goto L6e
            wa.a r8 = r7.f439539w
            if (r8 == 0) goto L63
            r0.f439460d = r7
            r0.f439461e = r7
            r0.f439464h = r4
            java.lang.Object r8 = t2.s.a(r8, r0)
            if (r8 != r1) goto L5e
            return r1
        L5e:
            r2 = r7
            r4 = r2
        L60:
            androidx.camera.lifecycle.ProcessCameraProvider r8 = (androidx.camera.lifecycle.ProcessCameraProvider) r8
            goto L66
        L63:
            r2 = r7
            r4 = r2
            r8 = r6
        L66:
            r2.f439537u = r8
            java.lang.String r8 = "buildCameraUsage await provider init"
            com.tencent.mars.xlog.Log.i(r5, r8)
            goto L6f
        L6e:
            r4 = r7
        L6f:
            java.lang.String r8 = "buildCameraUsage switch context start"
            com.tencent.mars.xlog.Log.i(r5, r8)
            kotlinx.coroutines.p0 r8 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r8 = kotlinx.coroutines.internal.b0.f310484a
            vr0.e r2 = new vr0.e
            r2.<init>(r4, r6)
            r0.f439460d = r6
            r0.f439461e = r6
            r0.f439464h = r3
            java.lang.Object r8 = kotlinx.coroutines.l.g(r8, r2, r0)
            if (r8 != r1) goto L8a
            return r1
        L8a:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.z.K(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void L() {
        nr0.y yVar = this.f411433g;
        if (yVar != null) {
            ((pr0.n) yVar).l("emitOpenError", new vr0.f(this, null));
        }
    }

    public final int M(androidx.camera.core.CameraSelector cameraSelector, int i17) {
        androidx.camera.extensions.ExtensionsManager extensionsManager = this.f439538v;
        boolean z17 = false;
        if (extensionsManager != null && extensionsManager.isExtensionAvailable(cameraSelector, i17)) {
            z17 = true;
        }
        return z17 ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N() {
        int i17;
        java.util.List<androidx.camera.core.CameraInfo> availableCameraInfos;
        java.lang.Object obj;
        java.lang.Integer num;
        nr0.x xVar = this.f411434h;
        if (xVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "buildCameraUsage switch context finish");
        androidx.camera.core.Preview preview = this.f439542z;
        android.util.Size size = null;
        if (preview != null) {
            preview.setSurfaceProvider(null);
        }
        xr0.j jVar = xVar.f339121m.f456175a;
        jVar.getClass();
        android.util.Size size2 = new android.util.Size(jVar.f456173a, jVar.f456174b);
        xr0.c cVar = this.f411435i;
        if ((cVar != null ? cVar.f456157c : -1) > 500) {
            java.lang.Integer valueOf = cVar != null ? java.lang.Integer.valueOf(cVar.f456157c) : null;
            kotlin.jvm.internal.o.d(valueOf);
            i17 = valueOf.intValue();
        } else {
            i17 = 2600;
        }
        androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider = this.f439537u;
        boolean z17 = this.f411437n.f456161c;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "calculatePreviewResolution >> lensFacing " + (z17 ? 1 : 0) + ", viewWidth: " + size2.getWidth() + " viewHeight: " + size2.getHeight() + ", limitSize: " + i17);
        if (processCameraProvider == null || (availableCameraInfos = processCameraProvider.getAvailableCameraInfos()) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "availableCameraInfos is null");
        } else {
            java.util.Iterator it = ((java.util.ArrayList) availableCameraInfos).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                androidx.camera.core.CameraInfo cameraInfo = (androidx.camera.core.CameraInfo) obj;
                if ((cameraInfo instanceof androidx.camera.camera2.internal.Camera2CameraInfoImpl) && (num = (java.lang.Integer) ((androidx.camera.camera2.internal.Camera2CameraInfoImpl) cameraInfo).getCameraCharacteristicsCompat().get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)) != null && num.intValue() == z17) {
                    break;
                }
            }
            androidx.camera.core.CameraInfo cameraInfo2 = (androidx.camera.core.CameraInfo) obj;
            if (cameraInfo2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraXImpl", "selectInfo is null");
            } else if (cameraInfo2 instanceof androidx.camera.camera2.internal.Camera2CameraInfoImpl) {
                androidx.camera.camera2.internal.Camera2CameraInfoImpl camera2CameraInfoImpl = (androidx.camera.camera2.internal.Camera2CameraInfoImpl) cameraInfo2;
                android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) camera2CameraInfoImpl.getCameraCharacteristicsCompat().get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap != null) {
                    android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(34);
                    kotlin.jvm.internal.o.d(outputSizes);
                    if (!(outputSizes.length == 0)) {
                        android.util.Size[] sizeArr = new android.util.Size[0];
                        if (qr0.a.f366055a.a() == 2) {
                            sizeArr = streamConfigurationMap.getOutputSizes(256);
                            kotlin.jvm.internal.o.f(sizeArr, "getOutputSizes(...)");
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (sizeArr.length == 0) {
                            kz5.h0.w(arrayList, outputSizes);
                        } else {
                            for (android.util.Size size3 : outputSizes) {
                                if (kz5.z.G(sizeArr, size3)) {
                                    arrayList.add(size3);
                                }
                            }
                        }
                        kz5.g0.t(arrayList, new vr0.a0((java.lang.Math.max(r9, r8) * 1.0f) / java.lang.Math.min(r9, r8)));
                        java.util.Iterator it6 = arrayList.iterator();
                        int i18 = 0;
                        while (it6.hasNext()) {
                            java.lang.Object next = it6.next();
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "index:" + i18 + " resolution:" + ((android.util.Size) next));
                            i18 = i19;
                        }
                        java.util.Iterator it7 = arrayList.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                break;
                            }
                            java.lang.Object next2 = it7.next();
                            android.util.Size size4 = (android.util.Size) next2;
                            if (java.lang.Math.min(size4.getWidth(), size4.getHeight()) > 500 && java.lang.Math.max(size4.getWidth(), size4.getHeight()) <= i17) {
                                size = next2;
                                break;
                            }
                        }
                        android.util.Size size5 = size;
                        if (size5 == null) {
                            size5 = (android.util.Size) kz5.n0.X(arrayList);
                        }
                        java.lang.Integer num2 = (java.lang.Integer) camera2CameraInfoImpl.getCameraCharacteristicsCompat().get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
                        if (num2 == null) {
                            num2 = 0;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "calculatePreviewResolution result:" + size5 + " rotation:" + num2.intValue());
                        size = new android.util.Size(size5.getHeight(), size5.getWidth());
                    }
                }
            }
        }
        if (size == null) {
            size = size2;
        }
        this.f439542z = new androidx.camera.core.Preview.Builder().setTargetResolution(size).setTargetRotation(0).build();
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "imageResolution " + size);
        this.f439541y = new androidx.camera.core.ImageCapture.Builder().setTargetResolution(size).setTargetRotation(0).setJpegQuality(100).build();
        android.util.Rational rational = size.getWidth() > size.getHeight() ? new android.util.Rational(java.lang.Math.max(size2.getWidth(), size2.getHeight()), java.lang.Math.min(size2.getWidth(), size2.getHeight())) : new android.util.Rational(java.lang.Math.min(size2.getWidth(), size2.getHeight()), java.lang.Math.max(size2.getWidth(), size2.getHeight()));
        androidx.camera.core.ImageCapture imageCapture = this.f439541y;
        if (imageCapture != null) {
            imageCapture.setCropAspectRatio(rational);
        }
    }

    @Override // sr0.i
    public java.lang.Float a() {
        androidx.camera.core.CameraControl cameraControl;
        androidx.camera.core.Camera camera;
        androidx.camera.core.CameraInfo cameraInfo;
        androidx.lifecycle.g0 zoomState;
        androidx.camera.core.ZoomState zoomState2;
        androidx.camera.core.Camera camera2 = this.A;
        if (camera2 != null && (cameraControl = camera2.getCameraControl()) != null && (camera = this.A) != null && (cameraInfo = camera.getCameraInfo()) != null && (zoomState = cameraInfo.getZoomState()) != null && (zoomState2 = (androidx.camera.core.ZoomState) zoomState.getValue()) != null) {
            float maxZoomRatio = zoomState2.getMaxZoomRatio();
            androidx.camera.core.ZoomState zoomState3 = (androidx.camera.core.ZoomState) zoomState.getValue();
            if (zoomState3 != null) {
                float min = java.lang.Math.min(maxZoomRatio, zoomState3.getZoomRatio() + 0.15f);
                com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "onZoomOut current:" + min + " max:" + maxZoomRatio);
                cameraControl.setZoomRatio(min);
                return java.lang.Float.valueOf(min);
            }
        }
        return null;
    }

    @Override // sr0.i
    public java.lang.Float b() {
        androidx.camera.core.CameraControl cameraControl;
        androidx.camera.core.Camera camera;
        androidx.camera.core.CameraInfo cameraInfo;
        androidx.lifecycle.g0 zoomState;
        androidx.camera.core.ZoomState zoomState2;
        androidx.camera.core.Camera camera2 = this.A;
        if (camera2 != null && (cameraControl = camera2.getCameraControl()) != null && (camera = this.A) != null && (cameraInfo = camera.getCameraInfo()) != null && (zoomState = cameraInfo.getZoomState()) != null && (zoomState2 = (androidx.camera.core.ZoomState) zoomState.getValue()) != null) {
            float minZoomRatio = zoomState2.getMinZoomRatio();
            androidx.camera.core.ZoomState zoomState3 = (androidx.camera.core.ZoomState) zoomState.getValue();
            if (zoomState3 != null) {
                float max = java.lang.Math.max(minZoomRatio, zoomState3.getZoomRatio() - 0.15f);
                com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "onZoomIn current:" + max + " min:" + minZoomRatio);
                cameraControl.setZoomRatio(max);
                return java.lang.Float.valueOf(max);
            }
        }
        return null;
    }

    @Override // sr0.h
    public int c(int i17) {
        xr0.d dVar = this.f411437n;
        if (i17 == 1) {
            nr0.a aVar = nr0.a.f339064a;
            return nr0.a.f339068e.o(dVar.f456161c ? "key_ext_night_enable_back" : "key_ext_night_enable_front", 3);
        }
        if (i17 == 2) {
            nr0.a aVar2 = nr0.a.f339064a;
            return nr0.a.f339068e.o(dVar.f456161c ? "key_ext_bokeh_enable_back" : "key_ext_bokeh_enable_front", 3);
        }
        if (i17 != 3) {
            return 2;
        }
        nr0.a aVar3 = nr0.a.f339064a;
        return nr0.a.f339068e.o(dVar.f456161c ? "key_ext_hdr_enable_back" : "key_ext_hdr_enable_front", 3);
    }

    @Override // sr0.i
    public int d() {
        androidx.camera.core.CameraInfo cameraInfo;
        androidx.camera.core.Camera camera = this.A;
        if (camera == null || (cameraInfo = camera.getCameraInfo()) == null) {
            return 0;
        }
        return cameraInfo.getSensorRotationDegrees();
    }

    @Override // sr0.i
    public void e(boolean z17) {
        xr0.b bVar = this.f411436m;
        boolean z18 = false;
        if (bVar != null && bVar.f456151b) {
            z18 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "switchFlash >> " + z17 + ", " + this.f411440q + ", " + v() + ", " + z18);
        if (z18) {
            this.f411440q = z17;
            if (v()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "switchFlash >> " + z17);
                androidx.camera.core.ImageCapture imageCapture = this.f439541y;
                if (imageCapture == null) {
                    return;
                }
                imageCapture.setFlashMode(z17 ? 1 : 2);
            }
        }
    }

    @Override // sr0.h
    public java.lang.Object f(int i17, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        return kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new vr0.m(this, i17, null), continuation);
    }

    @Override // sr0.i
    public boolean g(float f17) {
        androidx.camera.core.CameraControl cameraControl;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "setZoomValue >> " + f17);
        androidx.camera.core.Camera camera = this.A;
        if (camera == null || (cameraControl = camera.getCameraControl()) == null) {
            return false;
        }
        cameraControl.setZoomRatio(f17);
        return true;
    }

    @Override // sr0.i
    public java.lang.Float getHorizontalViewAngle() {
        androidx.camera.core.CameraInfo cameraInfo;
        androidx.camera.core.Camera camera = this.A;
        if (camera != null && (cameraInfo = camera.getCameraInfo()) != null) {
            androidx.camera.camera2.interop.Camera2CameraInfo from = androidx.camera.camera2.interop.Camera2CameraInfo.from(cameraInfo);
            kotlin.jvm.internal.o.f(from, "from(...)");
            float[] fArr = (float[]) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            android.util.SizeF sizeF = (android.util.SizeF) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (fArr != null) {
                if (!(fArr.length == 0) && sizeF != null) {
                    return java.lang.Float.valueOf((float) java.lang.Math.toDegrees(java.lang.Math.atan(sizeF.getWidth() / (kz5.z.J(fArr) * 2.0d)) * 2.0d));
                }
            }
        }
        return null;
    }

    @Override // sr0.i
    public void h(float f17, float f18) {
        androidx.camera.core.CameraControl cameraControl;
        androidx.camera.core.FocusMeteringAction build = new androidx.camera.core.FocusMeteringAction.Builder(this.B.createPoint(f17, f18)).setAutoCancelDuration(3L, java.util.concurrent.TimeUnit.SECONDS).build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        androidx.camera.core.Camera camera = this.A;
        wa.a startFocusAndMetering = (camera == null || (cameraControl = camera.getCameraControl()) == null) ? null : cameraControl.startFocusAndMetering(build);
        if (startFocusAndMetering != null) {
            vr0.i iVar = new vr0.i(startFocusAndMetering);
            nr0.y yVar = this.f411433g;
            kotlin.jvm.internal.o.d(yVar);
            startFocusAndMetering.addListener(iVar, yVar);
        }
        this.C.b();
    }

    @Override // sr0.i
    public jz5.l k() {
        vr0.a aVar = this.C;
        android.util.Range range = aVar.f439443c;
        int i17 = aVar.f439444d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "getExpoData >> " + range + ", " + i17);
        return new jz5.l(range, java.lang.Integer.valueOf(i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // sr0.f, sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(int r17, int r18, int r19, boolean r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.z.l(int, int, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sr0.i
    public int m() {
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.Boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof vr0.t
            if (r0 == 0) goto L13
            r0 = r11
            vr0.t r0 = (vr0.t) r0
            int r1 = r0.f439516h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f439516h = r1
            goto L18
        L13:
            vr0.t r0 = new vr0.t
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f439514f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f439516h
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            r5 = 3
            r6 = 2
            java.lang.String r7 = "MicroMsg.Camera.CameraXImpl"
            if (r2 == 0) goto L52
            if (r2 == r4) goto L46
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r10 = r0.f439512d
            vr0.z r10 = (vr0.z) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lb6
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            java.lang.Object r10 = r0.f439512d
            vr0.z r10 = (vr0.z) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto La6
        L46:
            java.lang.Object r10 = r0.f439513e
            nr0.x r10 = (nr0.x) r10
            java.lang.Object r2 = r0.f439512d
            vr0.z r2 = (vr0.z) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L97
        L52:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "startPreview backCamera:"
            r11.<init>(r2)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.i(r7, r11)
            nr0.x r11 = r9.f411434h
            if (r11 != 0) goto L70
            java.lang.String r10 = "glEnvBuilder is null"
            com.tencent.mars.xlog.Log.e(r7, r10)
            return r3
        L70:
            xr0.d r2 = r9.f411437n
            boolean r8 = r2.f456164f
            if (r8 == 0) goto L8a
            boolean r8 = r9.v()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r10 = kotlin.jvm.internal.o.b(r10, r8)
            if (r10 == 0) goto L8a
            java.lang.String r10 = "camerax already started"
            com.tencent.mars.xlog.Log.w(r7, r10)
            return r3
        L8a:
            r0.f439512d = r9
            r0.f439513e = r11
            r0.f439516h = r4
            r2.f456164f = r4
            if (r3 != r1) goto L95
            return r1
        L95:
            r2 = r9
            r10 = r11
        L97:
            r0.f439512d = r2
            r11 = 0
            r0.f439513e = r11
            r0.f439516h = r6
            java.lang.Object r10 = r10.j(r0)
            if (r10 != r1) goto La5
            return r1
        La5:
            r10 = r2
        La6:
            java.lang.String r11 = "makeSureEnvSetup finish"
            com.tencent.mars.xlog.Log.i(r7, r11)
            r0.f439512d = r10
            r0.f439516h = r5
            java.lang.Object r11 = r10.K(r0)
            if (r11 != r1) goto Lb6
            return r1
        Lb6:
            r11 = 0
            r10.D = r11
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.z.n(java.lang.Boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sr0.f, sr0.i
    public boolean needMirror() {
        return v();
    }

    @Override // sr0.f, sr0.i
    public boolean o() {
        androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider = this.f439537u;
        if (processCameraProvider == null) {
            return false;
        }
        androidx.camera.core.CameraSelector DEFAULT_BACK_CAMERA = androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA;
        kotlin.jvm.internal.o.f(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
        return processCameraProvider.hasCamera(DEFAULT_BACK_CAMERA);
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        androidx.camera.core.CameraState cameraState = (androidx.camera.core.CameraState) obj;
        kotlin.jvm.internal.o.g(cameraState, "cameraState");
        int i17 = vr0.b.f439448a[cameraState.getType().ordinal()];
        int i18 = this.f411430d;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "CameraState: Pending Open");
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "CameraState: Opening");
        } else if (i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "CameraState: Open");
            as0.a.f13425a.b(i18, true);
            nr0.y yVar = this.f411433g;
            if (yVar != null) {
                ((pr0.n) yVar).l("emitZoomData", new vr0.g(this, null));
            }
        } else if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "CameraState: Closing");
        } else if (i17 == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "CameraState: Closed");
        }
        androidx.camera.core.CameraState.StateError error = cameraState.getError();
        if (error != null) {
            switch (error.getCode()) {
                case 1:
                    com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraXImpl", "Max cameras in use");
                    as0.a.f13425a.b(i18, false);
                    L();
                    return;
                case 2:
                    com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraXImpl", "Camera in use");
                    as0.a.f13425a.b(i18, false);
                    L();
                    return;
                case 3:
                    com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraXImpl", "Other recoverable error");
                    as0.a.f13425a.b(i18, false);
                    L();
                    return;
                case 4:
                    com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraXImpl", "Stream config error");
                    as0.a.f13425a.b(i18, false);
                    L();
                    return;
                case 5:
                    com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraXImpl", "Camera disabled");
                    return;
                case 6:
                    com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraXImpl", "Fatal error");
                    return;
                case 7:
                    com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraXImpl", "Do not disturb mode enabled");
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof vr0.u
            if (r0 == 0) goto L13
            r0 = r6
            vr0.u r0 = (vr0.u) r0
            int r1 = r0.f439519f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f439519f = r1
            goto L18
        L13:
            vr0.u r0 = new vr0.u
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f439517d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f439519f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            xr0.d r6 = r5.f411437n
            boolean r2 = r6.f456161c
            r2 = r2 ^ r3
            r6.f456161c = r2
            kotlinx.coroutines.p0 r6 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r6 = kotlinx.coroutines.internal.b0.f310484a
            vr0.w r2 = new vr0.w
            r4 = 0
            r2.<init>(r5, r4)
            r0.f439519f = r3
            java.lang.Object r6 = kotlinx.coroutines.l.g(r6, r2, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.z.p(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0136 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // sr0.f, sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(android.content.Context r17, androidx.lifecycle.y r18, nr0.x r19, nr0.y r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.z.s(android.content.Context, androidx.lifecycle.y, nr0.x, nr0.y, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sr0.i
    public void setLightTorch(boolean z17) {
        androidx.camera.core.Camera camera;
        androidx.camera.core.CameraControl cameraControl;
        xr0.b bVar = this.f411436m;
        boolean z18 = false;
        if (bVar != null && bVar.f456151b) {
            z18 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "setRecordStatus >> " + z18 + ' ' + this.f411440q + ' ' + v() + ' ' + z17);
        if (!z18 || !v() || (camera = this.A) == null || (cameraControl = camera.getCameraControl()) == null) {
            return;
        }
        cameraControl.enableTorch(z17);
    }

    @Override // sr0.f, sr0.i
    public boolean t() {
        androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider = this.f439537u;
        if (processCameraProvider == null) {
            return false;
        }
        androidx.camera.core.CameraSelector DEFAULT_FRONT_CAMERA = androidx.camera.core.CameraSelector.DEFAULT_FRONT_CAMERA;
        kotlin.jvm.internal.o.f(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
        return processCameraProvider.hasCamera(DEFAULT_FRONT_CAMERA);
    }

    @Override // sr0.i
    public void u(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "onLargeExpo >> " + i17);
        vr0.a aVar = this.C;
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraXExpoHelper", "enlargeExpoDuration >> " + i17 + ", " + aVar.f439442b + ", " + aVar.f439443c);
        android.util.Range range = aVar.f439443c;
        if (range != null) {
            java.lang.Integer valueOf = range.contains((android.util.Range) java.lang.Integer.valueOf(aVar.f439442b + i17)) ? java.lang.Integer.valueOf(aVar.f439442b + i17) : (java.lang.Integer) range.getUpper();
            int i18 = aVar.f439442b;
            if (valueOf != null && valueOf.intValue() == i18) {
                return;
            }
            kotlin.jvm.internal.o.d(valueOf);
            aVar.f439442b = valueOf.intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraXExpoHelper", "enlarge after >> " + aVar.f439442b);
            aVar.c(aVar.f439442b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // sr0.f, sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(bs0.f r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vr0.j
            if (r0 == 0) goto L13
            r0 = r8
            vr0.j r0 = (vr0.j) r0
            int r1 = r0.f439481g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f439481g = r1
            goto L18
        L13:
            vr0.j r0 = new vr0.j
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f439479e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f439481g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f439478d
            vr0.z r7 = (vr0.z) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4a
        L3c:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f439478d = r6
            r0.f439481g = r5
            super.w(r7, r0)
            if (r3 != r1) goto L49
            return r1
        L49:
            r7 = r6
        L4a:
            kotlinx.coroutines.p0 r8 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r8 = kotlinx.coroutines.internal.b0.f310484a
            vr0.l r2 = new vr0.l
            r5 = 0
            r2.<init>(r7, r5)
            r0.f439478d = r5
            r0.f439481g = r4
            java.lang.Object r7 = kotlinx.coroutines.l.g(r8, r2, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.z.w(bs0.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sr0.i
    public void x(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "onReduceExpo >> " + i17);
        vr0.a aVar = this.C;
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraXExpoHelper", "reduceExpoDuration >> " + i17 + ", " + aVar.f439442b + ", " + aVar.f439443c);
        android.util.Range range = aVar.f439443c;
        if (range != null) {
            java.lang.Integer valueOf = range.contains((android.util.Range) java.lang.Integer.valueOf(aVar.f439442b - i17)) ? java.lang.Integer.valueOf(aVar.f439442b - i17) : (java.lang.Integer) range.getLower();
            int i18 = aVar.f439442b;
            if (valueOf != null && i18 == valueOf.intValue()) {
                return;
            }
            kotlin.jvm.internal.o.d(valueOf);
            aVar.f439442b = valueOf.intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraXExpoHelper", "reduce after >> " + aVar.f439442b);
            aVar.c(aVar.f439442b);
        }
    }
}
