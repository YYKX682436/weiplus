package com.tencent.mm.plugin.mmsight.api;

/* loaded from: classes10.dex */
public class MMSightRecordView extends android.widget.FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final bi3.d f148831e = ((kt3.s) ((com.tencent.mm.feature.sight.api.m) i95.n0.c(com.tencent.mm.feature.sight.api.m.class))).f312022e;

    /* renamed from: d, reason: collision with root package name */
    public bi3.g f148832d;

    public MMSightRecordView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b(context);
    }

    public void a(android.view.MotionEvent motionEvent) {
        float f17;
        kt3.n nVar = (kt3.n) this.f148832d;
        nVar.getClass();
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            if (nVar.f312010g <= 0 || android.os.SystemClock.elapsedRealtime() - nVar.f312010g >= 400) {
                nVar.b(motionEvent.getX(), motionEvent.getY());
            }
            nVar.f312010g = android.os.SystemClock.elapsedRealtime();
            nVar.f312011h = -1.0f;
            return;
        }
        if (valueOf != null && valueOf.intValue() == 5) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == 6) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            nVar.f312011h = -1.0f;
            return;
        }
        if (valueOf != null && valueOf.intValue() == 2 && motionEvent.getPointerCount() >= 2) {
            try {
                f17 = java.lang.Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) + java.lang.Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppRecordViewImpl", "pointerDistance error: %s", e17.getMessage());
                f17 = 0.0f;
            }
            if (f17 > 0.0f) {
                float f18 = nVar.f312011h;
                if (f18 <= 0.0f) {
                    nVar.f312011h = f17;
                } else if (java.lang.Math.abs(f17 - f18) > 15) {
                    if (f17 > nVar.f312011h) {
                        nVar.d();
                    } else {
                        nVar.c();
                    }
                    nVar.f312011h = f17;
                }
            }
        }
    }

    public final void b(android.content.Context context) {
        ((kt3.m) f148831e).getClass();
        kt3.n nVar = new kt3.n();
        this.f148832d = nVar;
        kotlin.jvm.internal.o.g(context, "context");
        kt3.l lVar = new kt3.l(context);
        nVar.f312007d = lVar;
        lVar.setTouchListener(nVar);
        kt3.l lVar2 = nVar.f312007d;
        if (lVar2 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -1);
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = new com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView(context, null);
            lVar2.f311994n = cameraPreviewGLSurfaceView;
            cameraPreviewGLSurfaceView.setOnTouchListener(lVar2.f312003w);
            addView(lVar2.f311994n, marginLayoutParams);
            di3.d dVar = new di3.d(context, 2);
            lVar2.f311997q = dVar;
            dVar.enable();
            com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = new com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView(context);
            lVar2.B = mMSightCameraGLSurfaceView;
            mMSightCameraGLSurfaceView.setBackgroundColor(android.graphics.Color.argb(0, 0, 0, 0));
            addView(lVar2.B, new android.view.ViewGroup.MarginLayoutParams(1, 1));
        }
        nVar.f312009f = new com.tencent.mm.modelcontrol.VideoTransPara();
    }

    public void c(java.nio.ByteBuffer byteBuffer, bi3.h hVar) {
        com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView;
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        if (lVar != null) {
            if (hVar == null && byteBuffer == null) {
                com.tencent.mm.plugin.api.recordView.m mVar = lVar.f312004x;
                if (mVar != null) {
                    mVar.f74758d = null;
                    com.tencent.mm.plugin.api.recordView.l lVar2 = new com.tencent.mm.plugin.api.recordView.l(mVar);
                    if (mVar.f74755a.isAlive()) {
                        mVar.f74756b.post(lVar2);
                    }
                    lVar.f312004x = null;
                    com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView2 = lVar.B;
                    if (mMSightCameraGLSurfaceView2 == null) {
                        return;
                    }
                    mMSightCameraGLSurfaceView2.setVisibility(8);
                    return;
                }
                return;
            }
            if (lVar.f312004x == null) {
                lVar.f312004x = new com.tencent.mm.plugin.api.recordView.m();
                lVar.z();
                com.tencent.mm.plugin.api.recordView.m mVar2 = lVar.f312004x;
                if (mVar2 != null) {
                    mVar2.f74758d = new kt3.h(hVar, byteBuffer);
                }
                at0.n nVar = lVar.f311996p;
                java.lang.Boolean valueOf = nVar != null ? java.lang.Boolean.valueOf(((ts0.b) nVar.f13594b).G()) : null;
                kotlin.jvm.internal.o.d(valueOf);
                if (!valueOf.booleanValue() || (mMSightCameraGLSurfaceView = lVar.B) == null) {
                    return;
                }
                if (mMSightCameraGLSurfaceView.getEglContext() != null) {
                    com.tencent.mm.plugin.api.recordView.m mVar3 = lVar.f312004x;
                    if (mVar3 != null) {
                        mVar3.b(mMSightCameraGLSurfaceView.getEglContext());
                    }
                } else {
                    com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView3 = lVar.B;
                    if (mMSightCameraGLSurfaceView3 != null) {
                        mMSightCameraGLSurfaceView3.setOnEglEnableListener(new kt3.i(lVar, mMSightCameraGLSurfaceView));
                    }
                }
                com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView4 = lVar.B;
                if (mMSightCameraGLSurfaceView4 == null) {
                    return;
                }
                mMSightCameraGLSurfaceView4.setVisibility(0);
            }
        }
    }

    public void d(int i17, int i18, int i19, int i27, int i28) {
        kt3.l lVar;
        st3.b bVar;
        kt3.n nVar = (kt3.n) this.f148832d;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = nVar.f312009f;
        if (videoTransPara != null) {
            videoTransPara.f71195h = i17;
        }
        if (videoTransPara != null) {
            videoTransPara.f71194g = i18;
        }
        if (videoTransPara != null) {
            videoTransPara.f71193f = i19;
        }
        if (videoTransPara != null) {
            videoTransPara.f71198n = i27;
        }
        if (videoTransPara != null) {
            videoTransPara.f71199o = i28;
        }
        if (videoTransPara == null || (lVar = nVar.f312007d) == null || (bVar = lVar.f311995o) == null) {
            return;
        }
        bVar.f412520d = videoTransPara;
    }

    public boolean e(float f17) {
        kt3.n nVar = (kt3.n) this.f148832d;
        float[] fArr = nVar.f312016p;
        if (fArr == null) {
            return false;
        }
        if (fArr.length == 0) {
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((kz5.u) kz5.v.d(fArr)).indexOf(java.lang.Float.valueOf(f17)));
        kotlin.jvm.internal.o.d(valueOf);
        if (valueOf.intValue() < 0) {
            return false;
        }
        kt3.l lVar = nVar.f312007d;
        if (lVar != null) {
            lVar.setForceZoomTargetRatio(f17);
        }
        return true;
    }

    public void f() {
        int i17;
        kt3.n nVar = (kt3.n) this.f148832d;
        float f17 = nVar.f312012i;
        if (f17 > 0.0f && (i17 = nVar.f312013m) > 0) {
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = nVar.f312009f;
            if (videoTransPara != null) {
                videoTransPara.f71191d = i17;
            }
            if (videoTransPara != null) {
                videoTransPara.f71192e = (int) (i17 / f17);
            }
        }
        kt3.l lVar = nVar.f312007d;
        if (lVar != null) {
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = nVar.f312009f;
            kotlin.jvm.internal.o.d(videoTransPara2);
            java.lang.String str = nVar.f312008e;
            kotlin.jvm.internal.o.d(str);
            android.util.Size size = nVar.f312017q;
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = lVar.f311994n;
            kotlin.jvm.internal.o.d(cameraPreviewGLSurfaceView);
            st3.b bVar = new st3.b(videoTransPara2, cameraPreviewGLSurfaceView, str);
            lVar.f311995o = bVar;
            at0.n nVar2 = new at0.n(bVar);
            lVar.f311996p = nVar2;
            if (true != nVar2.f13609q) {
                nVar2.f13609q = true;
            }
            ts0.r rVar = nVar2.f13594b;
            ((ts0.b) rVar).f421535q = size;
            kt3.b bVar2 = new kt3.b(lVar);
            ((ts0.b) rVar).f421528j = true;
            rVar.k(new at0.a(bVar2));
            at0.n nVar3 = lVar.f311996p;
            kotlin.jvm.internal.o.d(nVar3);
            at0.n.i(nVar3, lVar.f312005y, null, new kt3.e(lVar), 2, null);
        }
    }

    public boolean g(boolean z17, boolean z18) {
        kt3.n nVar = (kt3.n) this.f148832d;
        nVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_RECORD_RESULT_MIRROR_BOOLEAN", z17);
        bundle.putBoolean("PARAM_RECORD_MUTED_BOOLEAN", z18);
        kt3.l lVar = nVar.f312007d;
        if (lVar == null) {
            return true;
        }
        lVar.w(ju3.c0.f301881i, bundle);
        return true;
    }

    public int getCameraRotation() {
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        if (lVar != null) {
            return lVar.getCameraRotation();
        }
        return 0;
    }

    public android.graphics.Bitmap getCurrentFramePicture() {
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        if (lVar != null) {
            return lVar.getCurrentFramePicture();
        }
        return null;
    }

    public android.graphics.Point getDrawSizePoint() {
        android.graphics.Point drawSizePoint;
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        return (lVar == null || (drawSizePoint = lVar.getDrawSizePoint()) == null) ? new android.graphics.Point() : drawSizePoint;
    }

    public int getFlashMode() {
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        if (lVar != null) {
            return lVar.getFlashMode();
        }
        return 0;
    }

    public android.graphics.Point getPictureSize() {
        android.graphics.Point pictureSize;
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        return (lVar == null || (pictureSize = lVar.getPictureSize()) == null) ? new android.graphics.Point() : pictureSize;
    }

    public android.graphics.Point getPreviewSize() {
        android.graphics.Point previewSize;
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        return (lVar == null || (previewSize = lVar.getPreviewSize()) == null) ? new android.graphics.Point() : previewSize;
    }

    public float[] getSupportZoomMultiple() {
        kt3.l lVar;
        kt3.n nVar = (kt3.n) this.f148832d;
        if (nVar.f312016p == null && (lVar = nVar.f312007d) != null) {
            nVar.f312016p = lVar.getSupportZoomRatios();
        }
        return nVar.f312016p;
    }

    public java.lang.String getVideoFilePath() {
        java.lang.String str = ((kt3.n) this.f148832d).f312008e;
        return str == null ? "" : str;
    }

    public android.graphics.Point getVideoSize() {
        android.graphics.Point videoSize;
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        return (lVar == null || (videoSize = lVar.getVideoSize()) == null) ? new android.graphics.Point() : videoSize;
    }

    public void h(bi3.j jVar) {
        kt3.n nVar = (kt3.n) this.f148832d;
        kt3.l lVar = nVar.f312007d;
        if (lVar != null) {
            lVar.setRecordCallback(jVar);
        }
        kt3.l lVar2 = nVar.f312007d;
        if (lVar2 != null) {
            ju3.d0.k(lVar2, ju3.c0.f301887m, null, 2, null);
        }
    }

    public void i() {
        kt3.n nVar = (kt3.n) this.f148832d;
        nVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_IGNORE_FLIP_CHECK_BOOLEAN", true);
        kt3.l lVar = nVar.f312007d;
        if (lVar != null) {
            lVar.w(ju3.c0.f301875f, bundle);
        }
    }

    public void j(bi3.i iVar, boolean z17, boolean z18) {
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        if (lVar != null) {
            lVar.f311998r = iVar;
            lVar.f312006z = z17;
            lVar.A = z18;
        }
        if (lVar != null) {
            ju3.d0.k(lVar, ju3.c0.f301901s, null, 2, null);
        }
    }

    public void setClipPictureSize(boolean z17) {
        this.f148832d.getClass();
    }

    public void setClipVideoSize(boolean z17) {
        this.f148832d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDisplayRatio(float r8) {
        /*
            r7 = this;
            bi3.g r0 = r7.f148832d
            kt3.n r0 = (kt3.n) r0
            r0.getClass()
            android.content.Context r1 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.o.e(r1, r2)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getRotation()
            r2 = 270(0x10e, float:3.78E-43)
            r3 = 90
            if (r1 == 0) goto L36
            r4 = 1
            if (r1 == r4) goto L34
            r4 = 2
            if (r1 == r4) goto L31
            r4 = 3
            if (r1 == r4) goto L2f
            goto L36
        L2f:
            r1 = r2
            goto L37
        L31:
            r1 = 180(0xb4, float:2.52E-43)
            goto L37
        L34:
            r1 = r3
            goto L37
        L36:
            r1 = 0
        L37:
            java.lang.Float r4 = java.lang.Float.valueOf(r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "MicroMsg.AppRecordViewImpl"
            java.lang.String r6 = "setDisplayRatio: %s, screenRotation: %s"
            com.tencent.mars.xlog.Log.i(r5, r6, r4)
            r0.f312012i = r8
            if (r1 == r3) goto L52
            if (r1 == r2) goto L52
            goto L57
        L52:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r8
            r0.f312012i = r1
        L57:
            kt3.l r8 = r0.f312007d
            if (r8 != 0) goto L5c
            goto L61
        L5c:
            float r0 = r0.f312012i
            r8.setDisplayRatio(r0)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mmsight.api.MMSightRecordView.setDisplayRatio(float):void");
    }

    public void setDisplayScreenSize(android.util.Size size) {
        ((kt3.n) this.f148832d).f312017q = size;
    }

    public void setEnableDragZoom(boolean z17) {
        ((kt3.n) this.f148832d).f312014n = z17;
    }

    public void setEnableTouchFocus(boolean z17) {
        ((kt3.n) this.f148832d).f312015o = z17;
    }

    public void setFlashMode(int i17) {
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        if (lVar != null) {
            lVar.setFlashMode(i17);
        }
    }

    public void setFrameDataCallback(bi3.c cVar) {
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        if (lVar != null) {
            lVar.setFrameDataCallback(cVar);
        }
    }

    public void setInitDoneCallback(bi3.e eVar) {
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        if (lVar != null) {
            lVar.setInitDoneCallback(eVar);
        }
    }

    public void setInitErrorCallback(bi3.f fVar) {
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        if (lVar != null) {
            lVar.setInitErrorCallback(fVar);
        }
    }

    public void setPreviewMode(int i17) {
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        if (lVar != null) {
            lVar.setPreviewMode(i17);
        }
    }

    public void setPreviewSizeLimit(int i17) {
        kt3.n nVar = (kt3.n) this.f148832d;
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppRecordViewImpl", "setPreviewSizeLimit: %s", java.lang.Integer.valueOf(i17));
        nVar.f312013m = i17;
    }

    public void setRGBSizeLimit(int i17) {
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        if (lVar != null) {
            lVar.setRGBSizeLimit(i17);
        }
    }

    public void setUseBackCamera(boolean z17) {
        kt3.l lVar = ((kt3.n) this.f148832d).f312007d;
        if (lVar != null) {
            lVar.setUseBackCamera(z17);
        }
    }

    public void setVideoFilePath(java.lang.String str) {
        kt3.l lVar;
        st3.b bVar;
        kt3.n nVar = (kt3.n) this.f148832d;
        nVar.f312008e = str;
        if (str != null && (lVar = nVar.f312007d) != null && (bVar = lVar.f311995o) != null) {
            bVar.f412522f = str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppRecordViewImpl", "video path has been set %s", str);
    }

    public MMSightRecordView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public MMSightRecordView(android.content.Context context) {
        super(context);
        b(context);
    }

    public MMSightRecordView(android.content.Context context, android.view.Surface surface, int i17, int i18) {
        super(context);
        ((kt3.m) f148831e).getClass();
        kt3.n nVar = new kt3.n();
        this.f148832d = nVar;
        kotlin.jvm.internal.o.g(context, "context");
        kt3.l lVar = new kt3.l(context);
        nVar.f312007d = lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraPluginLayout", "surface is %s", surface);
        kotlin.jvm.internal.o.d(surface);
        lVar.f311994n = new at0.o(context, surface, i17, i18);
        di3.d dVar = new di3.d(context, 2);
        lVar.f311997q = dVar;
        dVar.enable();
        com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = new com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView(context);
        lVar.B = mMSightCameraGLSurfaceView;
        mMSightCameraGLSurfaceView.setBackgroundColor(android.graphics.Color.argb(0, 0, 0, 0));
        addView(lVar.B, new android.view.ViewGroup.MarginLayoutParams(-1, -1));
        nVar.f312009f = new com.tencent.mm.modelcontrol.VideoTransPara();
    }
}
