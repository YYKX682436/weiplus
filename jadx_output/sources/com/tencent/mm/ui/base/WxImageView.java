package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class WxImageView extends com.tencent.mm.graphics.ui.WxBaseImageView implements db5.f0 {

    /* renamed from: y0, reason: collision with root package name */
    public static java.lang.Boolean f197740y0;
    public final android.graphics.Matrix A;
    public final android.graphics.Matrix B;
    public final android.graphics.Matrix C;
    public float D;
    public float E;
    public float F;
    public java.lang.Float G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f197741J;
    public boolean K;
    public boolean L;
    public final boolean M;
    public float N;
    public float P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float V;
    public float W;

    /* renamed from: p0, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f197742p0;

    /* renamed from: x0, reason: collision with root package name */
    public float f197743x0;

    public WxImageView(android.content.Context context) {
        super(context, null);
        this.A = new android.graphics.Matrix();
        this.B = new android.graphics.Matrix();
        this.C = new android.graphics.Matrix();
        this.D = 0.0f;
        this.E = 0.0f;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = 2.0f;
        this.P = 20.0f;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = true;
        this.U = false;
        this.f197742p0 = new com.tencent.mm.sdk.platformtools.n3();
        this.f197743x0 = 1.0f;
    }

    @Override // db5.f0
    public void a(float f17, float f18, float f19) {
        float scale = getScale();
        if (this.Q) {
            float f27 = this.D;
            if (0.0f == f27) {
                f27 = this.P * this.f197743x0;
            }
            this.E = f27;
        }
        float f28 = this.E;
        float f29 = 2.0f * f28;
        if (f17 > f29) {
            f17 = ((f17 - f28) * 0.1f) + f29;
        } else if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        float f37 = f17 / scale;
        this.B.postScale(f37, f37, f18, f19);
        w((this.T && this.R) ? false : true, true ^ this.S);
    }

    @Override // db5.f0
    public float b(float f17, float f18) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.doubleTapZoom(f17, f18);
        }
        return 0.0f;
    }

    @Override // db5.f0
    public void c(float f17, float f18) {
        this.B.postTranslate(f17, f18);
    }

    @Override // db5.f0
    public void d(float f17, float f18) {
        v();
        float scale = (this.F - getScale()) / 128.0f;
        float scale2 = getScale();
        this.f197742p0.post(new db5.ca(this, 128.0f, java.lang.System.currentTimeMillis(), scale2, scale, f17, f18));
    }

    @Override // db5.f0
    public void e(boolean z17) {
    }

    @Override // db5.f0
    public void f() {
        this.G = null;
        v();
    }

    @Override // db5.f0
    public boolean g() {
        return this.R;
    }

    public int getContentLeft() {
        if (!this.K) {
            return 0;
        }
        float f17 = this.F;
        int i17 = (int) ((this.I - (this.f68219h * f17)) / 2.0f);
        int i18 = i17 >= 0 ? i17 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxImageView", "scaleRate: %f, imageWidth: %d, viewWidth: %d, left: %d", java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(this.f68219h), java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(i18));
        return i18;
    }

    public int getContentTop() {
        if (!this.K) {
            return 0;
        }
        int imageHeight = (int) ((this.f197741J - (this.F * getImageHeight())) / 2.0f);
        int i17 = imageHeight >= 0 ? imageHeight : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxImageView", "scaleRate: %f, imageHeight: %d, viewHeight: %d, top: %d", java.lang.Float.valueOf(this.F), java.lang.Integer.valueOf(getImageHeight()), java.lang.Integer.valueOf(this.f197741J), java.lang.Integer.valueOf(i17));
        return i17;
    }

    @Override // db5.f0
    public float getDoubleTabScale() {
        float scaleRate = getScaleRate();
        float scaleWidth = getScaleWidth() * 0.7f > scaleRate ? getScaleWidth() : getScaleHeight() * 0.7f > scaleRate ? getScaleHeight() : getScaleRate() * this.N;
        if (scaleWidth < 1.0d) {
            scaleWidth = 1.0f;
        }
        return scaleWidth > getMaxZoom() ? getMaxZoom() : scaleWidth;
    }

    @Override // db5.f0
    public int getImageHeight() {
        int i17 = this.H;
        return (i17 == 90 || i17 == 270) ? this.f68219h : this.f68220i;
    }

    @Override // db5.f0
    public android.graphics.Matrix getImageMatrix() {
        android.graphics.Matrix matrix = this.A;
        android.graphics.Matrix matrix2 = this.C;
        matrix2.set(matrix);
        matrix2.postConcat(this.B);
        return matrix2;
    }

    public android.graphics.Matrix getImageViewMatrix() {
        android.graphics.Matrix matrix = this.A;
        android.graphics.Matrix matrix2 = this.C;
        matrix2.set(matrix);
        matrix2.postConcat(this.B);
        return matrix2;
    }

    @Override // com.tencent.mm.graphics.ui.WxBaseImageView, db5.f0
    public android.graphics.PointF getImageViewMatrixScale() {
        return super.getImageViewMatrixScale();
    }

    @Override // com.tencent.mm.graphics.ui.WxBaseImageView, db5.f0
    public android.graphics.PointF getImageViewMatrixTranslation() {
        return super.getImageViewMatrixTranslation();
    }

    @Override // db5.f0
    public int getImageWidth() {
        int i17 = this.H;
        return (i17 == 90 || i17 == 270) ? this.f68220i : this.f68219h;
    }

    public float getMaxZoom() {
        return this.E;
    }

    public float getMinZoom() {
        return 0.0f;
    }

    @Override // com.tencent.mm.graphics.ui.WxBaseImageView, db5.f0
    public float getScale() {
        return super.getScale();
    }

    public float getScaleHeight() {
        return this.W;
    }

    @Override // db5.f0
    public float getScaleRate() {
        return this.F;
    }

    public float getScaleWidth() {
        return this.V;
    }

    @Override // db5.f0
    public void h() {
        w((this.T && this.R) ? false : true, true ^ this.S);
    }

    public void i() {
        this.B.reset();
        v();
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.resetSize();
        }
        a(this.F, 0.0f, 0.0f);
    }

    @Override // db5.f0
    public boolean j() {
        return this.S;
    }

    @Override // db5.f0
    public android.graphics.PointF l(android.graphics.PointF pointF, int i17, int i18) {
        if (pointF == null) {
            return null;
        }
        float[] fArr = {pointF.x * getImageWidth(), pointF.y * ((int) (((1.0f * r1) * i18) / i17))};
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.mapPoint(fArr);
        }
        return null;
    }

    @Override // db5.f0
    public android.graphics.PointF m(android.graphics.PointF pointF) {
        int imageWidth = getImageWidth();
        int imageHeight = getImageHeight();
        float[] fArr = {pointF.x, pointF.y};
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        android.graphics.PointF invertMapPoint = subsamplingScaleImageView != null ? subsamplingScaleImageView.invertMapPoint(fArr) : null;
        if (invertMapPoint != null) {
            invertMapPoint.x /= imageWidth;
            invertMapPoint.y /= imageHeight;
            com.tencent.mars.xlog.Log.i("MicroMsg.WxImageView", "convertScreenToImageCoordinate screenCoordinate: %s, imageCoordinate: %s, imageWidth: %s, imageHeight: %s", pointF, invertMapPoint, java.lang.Integer.valueOf(imageWidth), java.lang.Integer.valueOf(imageHeight));
        }
        return invertMapPoint;
    }

    @Override // db5.f0
    public void n(float f17, boolean z17) {
        this.f68217f.setAnimationProgress(f17, z17);
    }

    @Override // db5.f0
    public void o() {
        if (this.Q && 0.0f == this.D) {
            this.D = getDoubleTabScale();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17 = configuration.orientation;
        if (i17 == 1 || i17 == 2) {
            this.K = false;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || !keyEvent.isTracking() || keyEvent.isCanceled() || getScale() <= 1.0f) {
            return super.onKeyUp(i17, keyEvent);
        }
        a(1.0f, this.I / 2.0f, this.f197741J / 2.0f);
        return true;
    }

    @Override // com.tencent.mm.graphics.ui.WxBaseImageView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.I == android.view.View.MeasureSpec.getSize(i17) && this.f197741J == android.view.View.MeasureSpec.getSize(i18)) {
            this.L = false;
        } else {
            this.L = true;
        }
        this.I = android.view.View.MeasureSpec.getSize(i17);
        this.f197741J = android.view.View.MeasureSpec.getSize(i18);
        if (!this.K) {
            this.K = true;
            float f17 = getContext().getResources().getDisplayMetrics().widthPixels / 720.0f;
            if (f17 > 1.0f) {
                this.f197743x0 = f17;
            }
            i();
        }
        if (this.L && this.M) {
            i();
        }
    }

    @Override // db5.f0
    public void p(float f17, float f18, float f19) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.zoomToWithAnimation(f17, f18, f19);
        }
    }

    @Override // com.tencent.mm.graphics.ui.WxBaseImageView
    public void setAllowInterceptTouchEvent(boolean z17) {
        super.setAllowInterceptTouchEvent(z17);
    }

    @Override // db5.f0
    public void setAnimationScale(float f17) {
        this.f68217f.setAnimationScale(f17);
    }

    @Override // db5.f0
    public void setBitmapPlaceHolder(android.graphics.Bitmap bitmap) {
        this.f68217f.setCustomPlaceHolderBitmap(bitmap);
    }

    @Override // com.tencent.mm.graphics.ui.WxBaseImageView, db5.f0
    public void setCanRefresh(boolean z17) {
        super.setCanRefresh(z17);
    }

    @Override // com.tencent.mm.graphics.ui.WxBaseImageView, db5.f0
    public void setCustomScaleRate(java.lang.Float f17) {
        if (f17 == null) {
            f();
        } else {
            this.G = f17;
            super.setCustomScaleRate(f17);
        }
    }

    public void setDoubleTabScaleLimit(float f17) {
        if (java.lang.Float.compare(f17, 0.0f) < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxImageView", "double tab scale limit is less than 0.0, change nothing, return");
        } else {
            this.N = f17;
        }
    }

    public void setDoubleTabZoomToNormal(boolean z17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setDoubleTabZoomToNormal(z17);
        }
    }

    public void setEnableHorLongBmpMode(boolean z17) {
        this.T = z17;
    }

    public void setImageHeight(int i17) {
        this.f68220i = i17;
    }

    @Override // com.tencent.mm.graphics.ui.WxBaseImageView, db5.f0
    public void setImageViewMatrix(android.graphics.Matrix matrix) {
        super.setImageViewMatrix(matrix);
    }

    public void setImageWidth(int i17) {
        this.f68219h = i17;
    }

    public void setMaxZoomDoubleTab(boolean z17) {
        this.Q = z17;
    }

    @Override // db5.f0
    public void setMaxZoomLimit(float f17) {
        if (java.lang.Float.compare(f17, 1.0f) < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxImageView", "max scale limit is less than 1.0, change nothing, return");
        } else {
            this.P = f17;
        }
    }

    public void setMinZoomLimit(float f17) {
        if (java.lang.Float.compare(f17, 1.0f) > 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxImageView", "min scale limit is greater than 1.0, change nothing, return");
        } else if (java.lang.Float.compare(f17, 0.0f) < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxImageView", "min scale limit is less than 0.0, change nothing, return");
        }
    }

    @Override // db5.f0
    public void setOnZoomScaleChangedListener(db5.e0 e0Var) {
        if (e0Var != null) {
            super.setOnZoomScaleChangedListener(new db5.da(this, e0Var));
        } else {
            super.setOnZoomScaleChangedListener((com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener) null);
        }
    }

    public void setOrientation(int i17) {
        this.H = i17;
        v();
    }

    public final void v() {
        float f17;
        int i17;
        java.lang.Float f18 = this.G;
        if (f18 != null) {
            this.F = f18.floatValue();
            return;
        }
        int imageWidth = getImageWidth();
        int imageHeight = getImageHeight();
        int i18 = this.I;
        float f19 = 2.2f;
        if (i18 == 0 || (i17 = this.f197741J) == 0) {
            f17 = 1.8f;
        } else {
            f17 = i17 / i18;
            if (f17 < 1.5d) {
                f19 = 2.5f;
            }
        }
        float f27 = imageWidth;
        float f28 = i18 / f27;
        this.V = f28;
        int i19 = this.f197741J;
        float f29 = imageHeight;
        float f37 = i19 / f29;
        this.W = f37;
        boolean z17 = f27 > f29 * f19;
        this.R = z17;
        boolean z18 = f29 > f27 * f19;
        this.S = z18;
        this.R = z17 && imageWidth > i18;
        this.S = z18 && imageHeight > i19;
        float f38 = f29 / f27;
        if (f38 <= f17 || f38 > f19) {
            this.F = f28;
            this.f68217f.setFitWidth(true);
        } else {
            this.F = f37;
            this.f68217f.setFitWidth(false);
        }
        if (this.S && this.U) {
            this.F = this.W;
            this.f68217f.setFitWidth(false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxImageView", "imgWidth:%s, imgHeight:%s, viewWidth:%s, viewHeight:%s, verticalLong:%b, horizontalLong:%b, scale:%s, viewScale:%s, scaleRate:%s", java.lang.Integer.valueOf(imageWidth), java.lang.Integer.valueOf(imageHeight), java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(this.f197741J), java.lang.Boolean.valueOf(this.S), java.lang.Boolean.valueOf(this.R), java.lang.Float.valueOf(f38), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(this.F));
        setScaleRate(this.F);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r0 < r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:
    
        if (r0 < r8) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(boolean r7, boolean r8) {
        /*
            r6 = this;
            android.graphics.Matrix r0 = r6.getImageViewMatrix()
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r6.f68219h
            float r2 = (float) r2
            int r3 = r6.f68220i
            float r3 = (float) r3
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            r0.mapRect(r1)
            float r0 = r1.height()
            float r2 = r1.width()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L3b
            int r8 = r6.f197741J
            float r8 = (float) r8
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 >= 0) goto L2b
            float r8 = r8 - r0
            float r8 = r8 / r3
            float r0 = r1.top
            goto L39
        L2b:
            float r0 = r1.top
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto L33
            float r8 = -r0
            goto L50
        L33:
            float r0 = r1.bottom
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 >= 0) goto L4f
        L39:
            float r8 = r8 - r0
            goto L50
        L3b:
            float r8 = r1.top
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L43
            float r8 = -r8
            goto L50
        L43:
            float r8 = r1.bottom
            int r0 = r6.f197741J
            float r0 = (float) r0
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 >= 0) goto L4f
            float r8 = r0 - r8
            goto L50
        L4f:
            r8 = r4
        L50:
            if (r7 == 0) goto L6f
            int r7 = r6.I
            float r7 = (float) r7
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L5e
            float r7 = r7 - r2
            float r7 = r7 / r3
            float r0 = r1.left
            goto L6c
        L5e:
            float r0 = r1.left
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L66
            float r4 = -r0
            goto L82
        L66:
            float r0 = r1.right
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L82
        L6c:
            float r4 = r7 - r0
            goto L82
        L6f:
            float r7 = r1.left
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L77
            float r4 = -r7
            goto L82
        L77:
            float r7 = r1.right
            int r0 = r6.I
            float r0 = (float) r0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L82
            float r4 = r0 - r7
        L82:
            r6.c(r4, r8)
            android.graphics.Matrix r7 = r6.getImageViewMatrix()
            r7.mapRect(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.WxImageView.w(boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:5:0x0007, B:12:0x001a, B:17:0x0026, B:21:0x0032, B:23:0x003e, B:24:0x0048), top: B:4:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:5:0x0007, B:12:0x001a, B:17:0x0026, B:21:0x0032, B:23:0x003e, B:24:0x0048), top: B:4:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[Catch: Exception -> 0x004d, TRY_LEAVE, TryCatch #0 {Exception -> 0x004d, blocks: (B:5:0x0007, B:12:0x001a, B:17:0x0026, B:21:0x0032, B:23:0x003e, B:24:0x0048), top: B:4:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.WxImageView"
            java.lang.Boolean r1 = com.tencent.mm.ui.base.WxImageView.f197740y0
            if (r1 != 0) goto L5a
            r1 = 0
            int r2 = com.tencent.mm.sdk.platformtools.z.f193112h     // Catch: java.lang.Exception -> L4d
            r3 = 788529167(0x2f00000f, float:1.1641553E-10)
            r4 = 1
            if (r2 == r3) goto L17
            r3 = 788529166(0x2f00000e, float:1.1641552E-10)
            if (r2 != r3) goto L15
            goto L17
        L15:
            r2 = r1
            goto L18
        L17:
            r2 = r4
        L18:
            if (r2 != 0) goto L23
            boolean r2 = z65.c.a()     // Catch: java.lang.Exception -> L4d
            if (r2 == 0) goto L21
            goto L23
        L21:
            r2 = r1
            goto L24
        L23:
            r2 = r4
        L24:
            if (r2 != 0) goto L31
            int r2 = com.tencent.mm.sdk.platformtools.z.f193112h     // Catch: java.lang.Exception -> L4d
            boolean r2 = com.tencent.mm.sdk.platformtools.v8.a(r2)     // Catch: java.lang.Exception -> L4d
            if (r2 == 0) goto L2f
            goto L31
        L2f:
            r2 = r1
            goto L32
        L31:
            r2 = r4
        L32:
            j62.e r3 = j62.e.g()     // Catch: java.lang.Exception -> L4d
            java.lang.String r5 = "clicfg_wximageview_open_hardware"
            int r2 = r3.i(r5, r2, r1, r4)     // Catch: java.lang.Exception -> L4d
            if (r2 <= 0) goto L48
            java.lang.String r2 = "openHardWare!!"
            com.tencent.mars.xlog.Log.i(r0, r2)     // Catch: java.lang.Exception -> L4d
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L4d
            com.tencent.mm.ui.base.WxImageView.f197740y0 = r2     // Catch: java.lang.Exception -> L4d
            goto L5a
        L48:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L4d
            com.tencent.mm.ui.base.WxImageView.f197740y0 = r2     // Catch: java.lang.Exception -> L4d
            goto L5a
        L4d:
            r2 = move-exception
            java.lang.String r3 = "wximageview openHardWare"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r2, r3, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            com.tencent.mm.ui.base.WxImageView.f197740y0 = r0
        L5a:
            java.lang.Boolean r0 = com.tencent.mm.ui.base.WxImageView.f197740y0
            boolean r0 = r0.booleanValue()
            r6.setOpenHardware(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.WxImageView.x():void");
    }

    public void y(float f17, float f18) {
        float translationX = getTranslationX();
        float translationY = getTranslationY();
        float f19 = f17 + translationX;
        setTranslationX(f19);
        float f27 = f18 + translationY;
        setTranslationY(f27);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxImageView", "translate x: %f, y: %f, x + dx: %f, y + dy: %f", java.lang.Float.valueOf(translationX), java.lang.Float.valueOf(translationY), java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f27));
    }

    public WxImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new android.graphics.Matrix();
        this.B = new android.graphics.Matrix();
        this.C = new android.graphics.Matrix();
        this.D = 0.0f;
        this.E = 0.0f;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = 2.0f;
        this.P = 20.0f;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = true;
        this.U = false;
        this.f197742p0 = new com.tencent.mm.sdk.platformtools.n3();
        this.f197743x0 = 1.0f;
        x();
    }

    public WxImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.A = new android.graphics.Matrix();
        this.B = new android.graphics.Matrix();
        this.C = new android.graphics.Matrix();
        this.D = 0.0f;
        this.E = 0.0f;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = 2.0f;
        this.P = 20.0f;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = true;
        this.U = false;
        this.f197742p0 = new com.tencent.mm.sdk.platformtools.n3();
        this.f197743x0 = 1.0f;
        x();
    }
}
