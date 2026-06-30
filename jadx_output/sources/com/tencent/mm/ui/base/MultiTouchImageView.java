package com.tencent.mm.ui.base;

/* loaded from: classes13.dex */
public class MultiTouchImageView extends android.widget.ImageView implements db5.f0 {
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f197642J;
    public android.graphics.Paint K;
    public final android.graphics.Paint L;
    public float M;
    public float N;
    public boolean P;
    public boolean Q;
    public android.widget.ImageView.ScaleType R;
    public final android.graphics.Rect S;
    public final android.graphics.Rect T;
    public final float[] U;
    public final com.tencent.mm.sdk.platformtools.n3 V;
    public float W;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f197643d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Matrix f197644e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f197645f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f197646g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f197647h;

    /* renamed from: i, reason: collision with root package name */
    public float f197648i;

    /* renamed from: m, reason: collision with root package name */
    public float f197649m;

    /* renamed from: n, reason: collision with root package name */
    public float f197650n;

    /* renamed from: o, reason: collision with root package name */
    public int f197651o;

    /* renamed from: p, reason: collision with root package name */
    public int f197652p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f197653p0;

    /* renamed from: q, reason: collision with root package name */
    public float f197654q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Float f197655r;

    /* renamed from: s, reason: collision with root package name */
    public db5.e0 f197656s;

    /* renamed from: t, reason: collision with root package name */
    public int f197657t;

    /* renamed from: u, reason: collision with root package name */
    public int f197658u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f197659v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f197660w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f197661x;

    /* renamed from: x0, reason: collision with root package name */
    public android.graphics.drawable.Drawable f197662x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f197663y;

    /* renamed from: z, reason: collision with root package name */
    public float f197664z;

    public MultiTouchImageView(android.content.Context context, int i17, int i18) {
        super(context);
        this.f197643d = new android.graphics.Matrix();
        this.f197644e = new android.graphics.Matrix();
        this.f197645f = new android.graphics.Matrix();
        this.f197646g = new float[9];
        this.f197647h = null;
        this.f197648i = 0.0f;
        this.f197649m = 0.0f;
        this.f197650n = 0.0f;
        this.f197659v = false;
        this.f197660w = false;
        this.f197661x = true;
        this.f197663y = false;
        this.f197664z = 2.0f;
        this.A = 0.75f;
        this.B = 20.0f;
        this.C = 0.0f;
        this.D = 1.0f;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = true;
        this.K = null;
        this.L = new android.graphics.Paint();
        this.M = 1.0f;
        this.N = 1.0f;
        this.P = true;
        this.Q = true;
        this.R = android.widget.ImageView.ScaleType.MATRIX;
        this.S = new android.graphics.Rect();
        this.T = new android.graphics.Rect();
        this.U = new float[9];
        this.V = new com.tencent.mm.sdk.platformtools.n3();
        this.W = 1.0f;
        this.f197653p0 = false;
        this.f197652p = i18;
        this.f197651o = i17;
        t();
    }

    @Override // db5.f0
    public void a(float f17, float f18, float f19) {
        float scale = getScale();
        if (this.E) {
            float f27 = this.f197648i;
            if (0.0f == f27) {
                f27 = this.B * this.W;
            }
            this.f197649m = f27;
        }
        float f28 = this.f197649m;
        if (f17 > f28 * 2.0f) {
            f17 = ((f17 - f28) * 0.1f) + (2.0f * f28);
        } else {
            float f29 = this.f197650n;
            if (f17 < f29) {
                f17 = f29;
            }
        }
        float f37 = f17 / scale;
        if (!this.f197653p0) {
            setImageMatrix(getImageViewMatrix());
            this.f197644e.postScale(f37, f37, f18, f19);
        }
        db5.e0 e0Var = this.f197656s;
        if (e0Var != null) {
            ((kz3.j) e0Var).a(scale, f17);
        }
    }

    @Override // db5.f0
    public float b(float f17, float f18) {
        float doubleTabScale = getDoubleTabScale();
        this.f197648i = doubleTabScale;
        v(doubleTabScale, f17, f18, 128.0f);
        return this.f197648i;
    }

    @Override // db5.f0
    public void c(float f17, float f18) {
        this.f197644e.postTranslate(f17, f18);
        setImageMatrix(getImageViewMatrix());
        this.f197644e.getValues(new float[9]);
    }

    @Override // db5.f0
    public void d(float f17, float f18) {
        s();
        v(this.f197654q, f17, f18, 128.0f);
    }

    @Override // db5.f0
    public void e(boolean z17) {
    }

    @Override // db5.f0
    public void f() {
        this.f197655r = null;
        s();
    }

    @Override // db5.f0
    public boolean g() {
        return this.F;
    }

    @Override // db5.f0
    public float getDoubleTabScale() {
        float scaleRate = getScaleRate();
        float scaleWidth = getScaleWidth() * 0.7f > scaleRate ? getScaleWidth() : getScaleHeight() * 0.7f > scaleRate ? getScaleHeight() : getScaleRate() * this.f197664z;
        if (scaleWidth < 1.0d) {
            scaleWidth = 1.0f;
        }
        return scaleWidth > getMaxZoom() ? getMaxZoom() : scaleWidth;
    }

    @Override // db5.f0
    public int getImageHeight() {
        return this.f197652p;
    }

    public android.graphics.Matrix getImageViewMatrix() {
        android.graphics.Matrix matrix = this.f197643d;
        android.graphics.Matrix matrix2 = this.f197645f;
        matrix2.set(matrix);
        matrix2.postConcat(this.f197644e);
        return matrix2;
    }

    @Override // db5.f0
    public android.graphics.PointF getImageViewMatrixScale() {
        android.graphics.Matrix matrix = this.f197644e;
        float[] fArr = this.f197646g;
        matrix.getValues(fArr);
        return new android.graphics.PointF(fArr[0], fArr[4]);
    }

    @Override // db5.f0
    public android.graphics.PointF getImageViewMatrixTranslation() {
        android.graphics.Matrix matrix = this.f197644e;
        float[] fArr = this.f197646g;
        matrix.getValues(fArr);
        return new android.graphics.PointF(fArr[2], fArr[5]);
    }

    @Override // db5.f0
    public int getImageWidth() {
        return this.f197651o;
    }

    public float getMaxZoom() {
        return this.f197649m;
    }

    public float getMinZoom() {
        return this.f197650n;
    }

    public float getOriginScale() {
        return this.C;
    }

    public float getRealWidth() {
        return getScale() * getImageWidth();
    }

    @Override // db5.f0
    public float getScale() {
        android.graphics.Matrix matrix = this.f197644e;
        float[] fArr = this.f197646g;
        matrix.getValues(fArr);
        s();
        float f17 = this.B * this.W;
        this.f197649m = f17;
        float f18 = this.f197654q * this.A;
        this.f197650n = f18;
        if (f17 < 1.0f) {
            this.f197649m = 1.0f;
        }
        if (f18 > 1.0f) {
            this.f197650n = 1.0f;
        }
        return fArr[0];
    }

    public float getScaleHeight() {
        return this.f197642J;
    }

    @Override // db5.f0
    public float getScaleRate() {
        return this.f197654q;
    }

    public float getScaleWidth() {
        return this.I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        if (r2 < r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007b, code lost:
    
        if (r2 < r1) goto L33;
     */
    @Override // db5.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.MultiTouchImageView.h():void");
    }

    @Override // db5.f0
    public void i() {
        this.f197644e.reset();
        s();
        a(this.f197654q, 0.0f, 0.0f);
        h();
    }

    @Override // db5.f0
    public boolean j() {
        return this.G;
    }

    @Override // db5.f0
    public android.graphics.PointF l(android.graphics.PointF pointF, int i17, int i18) {
        if (pointF == null) {
            return null;
        }
        float[] fArr = {pointF.x * this.f197651o, pointF.y * ((int) (((r1 * 1.0f) * i18) / i17))};
        android.graphics.Matrix imageViewMatrix = getImageViewMatrix();
        if (imageViewMatrix == null) {
            return null;
        }
        float[] fArr2 = new float[2];
        imageViewMatrix.mapPoints(fArr2, fArr);
        return new android.graphics.PointF(fArr2[0], fArr2[1]);
    }

    @Override // db5.f0
    public android.graphics.PointF m(android.graphics.PointF pointF) {
        float[] fArr = {pointF.x, pointF.y};
        android.graphics.Matrix imageViewMatrix = getImageViewMatrix();
        android.graphics.PointF pointF2 = null;
        if (imageViewMatrix != null) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            if (imageViewMatrix.invert(matrix)) {
                float[] fArr2 = new float[2];
                matrix.mapPoints(fArr2, fArr);
                pointF2 = new android.graphics.PointF(fArr2[0], fArr2[1]);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiTouchImageView", "invertMapPoint invert matrix failed");
            }
        }
        if (pointF2 != null) {
            float f17 = pointF2.x;
            int i17 = this.f197651o;
            pointF2.x = f17 / i17;
            pointF2.y /= this.f197652p;
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTouchImageView", "convertScreenToImageCoordinate screenCoordinate: %s, imageCoordinate: %s, imageWidth: %s, imageHeight: %s", pointF, pointF2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f197652p));
        }
        return pointF2;
    }

    @Override // db5.f0
    public void n(float f17, boolean z17) {
        this.P = z17;
        this.M = f17;
        invalidate();
    }

    @Override // db5.f0
    public void o() {
        if (this.E && 0.0f == this.f197648i) {
            this.f197648i = getDoubleTabScale();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17 = configuration.orientation;
        if (i17 == 1 || i17 == 2) {
            this.f197659v = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        android.graphics.Bitmap bitmap;
        if (!this.f197653p0 && (bitmap = this.f197647h) != null && bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTouchImageView", "this bitmap is recycled! draw nothing!");
            return;
        }
        float f17 = this.M;
        if (f17 < 0.0f || f17 >= 1.0f || this.f197647h == null) {
            if (this.K == null || ((!this.f197653p0 || this.f197662x0 == null) && this.f197647h == null)) {
                super.onDraw(canvas);
                return;
            }
            android.graphics.Matrix imageMatrix = getImageMatrix();
            if (imageMatrix != null) {
                canvas.save();
                canvas.concat(imageMatrix);
                if (this.f197653p0) {
                    if (this.f197662x0.getIntrinsicWidth() > 2 && this.f197662x0.getIntrinsicHeight() > 2) {
                        canvas.drawRect(1.0f, 1.0f, this.f197662x0.getIntrinsicWidth() - 1, this.f197662x0.getIntrinsicHeight() - 1, this.K);
                    }
                } else if (this.f197647h.getWidth() > 2 && this.f197647h.getHeight() > 2) {
                    canvas.drawRect(1.0f, 1.0f, this.f197647h.getWidth() - 1, this.f197647h.getHeight() - 1, this.K);
                }
                canvas.restore();
            }
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int height2 = this.f197647h.getHeight();
        int width2 = this.f197647h.getWidth();
        float f18 = height2;
        float f19 = (f18 * 1.0f) / width2;
        if (!this.Q) {
            width = (int) (getHeight() / f19);
        }
        float f27 = width;
        int i18 = (int) (f27 * f19);
        android.graphics.Matrix imageViewMatrix = getImageViewMatrix();
        float[] fArr = this.U;
        imageViewMatrix.getValues(fArr);
        float f28 = fArr[5] / fArr[4];
        android.graphics.Rect rect = this.T;
        android.graphics.Rect rect2 = this.S;
        if (height2 > width2) {
            float f29 = this.M;
            int i19 = (int) (((height2 - width2) * (1.0f - f29)) / 2.0f);
            int i27 = f19 > (height * 1.0f) / f27 ? (int) (((int) (((f18 - (r7 * r10)) / 2.0f) * f29)) + (f28 * f29)) : 0;
            rect2.set(0, i19 - i27, width2, (height2 - i19) - i27);
            int width3 = ((height - i18) / 2) + ((int) (((i18 - getWidth()) * (1.0f - this.M)) / 2.0f));
            int width4 = (int) ((getWidth() - ((getHeight() - (width3 * 2)) / (((f19 - 1.0f) * this.M) + 1.0f))) / 2.0f);
            rect.set(width4, width3, getWidth() - width4, getHeight() - width3);
        } else {
            int i28 = (int) (((width2 - height2) * (1.0f - this.M)) / 2.0f);
            rect2.set(i28, 0, width2 - i28, height2);
            int width5 = (height - ((int) (getWidth() / (((width2 - (i28 * 2)) * 1.0f) / f18)))) / 2;
            if (!this.P) {
                float f37 = 1.0f - ((1.0f - this.N) * (1.0f - this.M));
                if ((height - (width5 * 2)) * f37 > i18) {
                    int i29 = (int) (((f27 / (1.0f / f37)) - f27) / 2.0f);
                    i17 = 0;
                    rect2.set(i29, 0, width2 - i29, height2);
                    width5 = (height - i18) / 2;
                    rect.set(i17, width5, getWidth(), getHeight() - width5);
                }
            }
            i17 = 0;
            rect.set(i17, width5, getWidth(), getHeight() - width5);
        }
        canvas.drawBitmap(this.f197647h, rect2, rect, this.L);
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
        a(1.0f, this.f197657t / 2.0f, this.f197658u / 2.0f);
        h();
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f197657t == android.view.View.MeasureSpec.getSize(i17) && this.f197658u == android.view.View.MeasureSpec.getSize(i18)) {
            this.f197660w = false;
        } else {
            this.f197660w = true;
        }
        this.f197657t = android.view.View.MeasureSpec.getSize(i17);
        this.f197658u = android.view.View.MeasureSpec.getSize(i18);
        if (!this.f197659v) {
            this.f197659v = true;
            t();
        }
        if (this.f197660w && this.f197661x) {
            i();
        }
    }

    @Override // db5.f0
    public void p(float f17, float f18, float f19) {
        v(f17, f18, f19, 128.0f);
    }

    @Override // db5.f0
    public void r(int i17, int i18) {
        this.f197651o = i17;
        this.f197652p = i18;
    }

    public final void s() {
        float f17;
        int i17;
        java.lang.Float f18 = this.f197655r;
        if (f18 != null) {
            this.f197654q = f18.floatValue();
            return;
        }
        int i18 = this.f197657t;
        float f19 = 2.2f;
        if (i18 == 0 || (i17 = this.f197658u) == 0) {
            f17 = 1.8f;
        } else {
            f17 = i17 / i18;
            if (f17 < 1.5f) {
                f19 = 2.5f;
            }
        }
        int i19 = this.f197651o;
        float f27 = i18 / i19;
        this.I = f27;
        int i27 = this.f197658u;
        int i28 = this.f197652p;
        float f28 = i27 / i28;
        this.f197642J = f28;
        boolean z17 = ((float) i19) > ((float) i28) * f19;
        this.F = z17;
        boolean z18 = ((float) i28) > ((float) i19) * f19;
        this.G = z18;
        this.F = z17 && i19 > i18;
        this.G = z18 && i28 > i27;
        float f29 = i28 / i19;
        if (f29 <= f17 || f29 > f19) {
            this.f197654q = f27 * this.D;
            this.Q = true;
        } else {
            this.f197654q = f28 * this.D;
            this.Q = false;
        }
    }

    @Override // db5.f0
    public void setAnimationScale(float f17) {
        this.N = f17;
    }

    @Override // db5.f0
    public void setBitmapPlaceHolder(android.graphics.Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    @Override // db5.f0
    public void setCanRefresh(boolean z17) {
        this.f197661x = z17;
    }

    @Override // db5.f0
    public void setCustomScaleRate(java.lang.Float f17) {
        this.f197655r = f17;
        if (f17 != null) {
            this.f197654q = f17.floatValue();
        }
    }

    public void setCustomScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.R = scaleType;
    }

    public void setDoubleTabScaleLimit(float f17) {
        if (java.lang.Float.compare(f17, 0.0f) < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTouchImageView", "double tab scale limit is less than 0.0, change nothing, return");
        } else {
            this.f197664z = f17;
        }
    }

    public void setDoubleTabZoomToNormal(boolean z17) {
    }

    public void setEnableHorLongBmpMode(boolean z17) {
        this.H = z17;
    }

    public void setGifDrawable(android.graphics.drawable.Drawable drawable) {
        this.f197653p0 = true;
        this.f197662x0 = drawable;
        setImageDrawable(drawable);
    }

    public void setGifPath(java.lang.String str) {
        this.f197653p0 = true;
        try {
            android.graphics.drawable.Drawable a17 = og5.g.a(str, str);
            this.f197662x0 = a17;
            setImageDrawable(a17);
            android.graphics.drawable.Drawable drawable = this.f197662x0;
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = this.f197662x0.getIntrinsicHeight();
                this.f197651o = intrinsicWidth;
                this.f197652p = intrinsicHeight;
            }
        } catch (java.lang.Exception unused) {
            this.f197653p0 = false;
        }
    }

    public void setImageBackgroundColor(int i17) {
        if (android.graphics.Color.alpha(i17) == 0) {
            this.K = null;
        } else {
            android.graphics.Paint paint = new android.graphics.Paint(1);
            this.K = paint;
            paint.setStyle(android.graphics.Paint.Style.FILL);
            this.K.setColor(i17);
        }
        this.L.setAntiAlias(true);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        if (this.f197663y) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTouchImageView", "ignore setImageBitmap for has set uhd image");
            return;
        }
        this.f197653p0 = false;
        this.f197647h = bitmap;
        this.f197659v = false;
        super.setImageBitmap(bitmap);
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (!(drawable instanceof android.graphics.drawable.BitmapDrawable) || bitmap == null) {
            return;
        }
        ((android.graphics.drawable.BitmapDrawable) drawable).setTargetDensity(bitmap.getDensity());
    }

    public void setImageHeight(int i17) {
        this.f197652p = i17;
    }

    @Override // db5.f0
    public void setImageViewMatrix(android.graphics.Matrix matrix) {
        float f17;
        db5.e0 e0Var;
        android.graphics.Matrix imageViewMatrix = getImageViewMatrix();
        float[] fArr = this.f197646g;
        float f18 = 0.0f;
        if (imageViewMatrix != null) {
            imageViewMatrix.getValues(fArr);
            f17 = fArr[0];
        } else {
            f17 = 0.0f;
        }
        this.f197644e.reset();
        this.f197644e.set(matrix);
        android.graphics.Matrix matrix2 = this.f197644e;
        if (matrix2 != null) {
            matrix2.getValues(fArr);
            f18 = fArr[0];
        }
        setImageMatrix(getImageViewMatrix());
        if (f18 == f17 || (e0Var = this.f197656s) == null) {
            return;
        }
        ((kz3.j) e0Var).a(f17, f18);
    }

    public void setImageWidth(int i17) {
        this.f197651o = i17;
    }

    public void setMaxZoomDoubleTab(boolean z17) {
        this.E = z17;
    }

    @Override // db5.f0
    public void setMaxZoomLimit(float f17) {
        if (java.lang.Float.compare(f17, 1.0f) < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTouchImageView", "max scale limit is less than 1.0, change nothing, return");
        } else {
            this.B = f17;
        }
    }

    public void setMinZoomLimit(float f17) {
        if (java.lang.Float.compare(f17, 1.0f) > 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTouchImageView", "min scale limit is greater than 1.0, change nothing, return");
        } else if (java.lang.Float.compare(f17, 0.0f) < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTouchImageView", "min scale limit is less than 0.0, change nothing, return");
        } else {
            this.A = f17;
        }
    }

    @Override // db5.f0
    public void setOnZoomScaleChangedListener(db5.e0 e0Var) {
        this.f197656s = e0Var;
    }

    public void setOriginScale(float f17) {
        this.C = f17;
    }

    public void setUhdImageBitmap(android.graphics.Bitmap bitmap) {
        if (this.f197647h == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTouchImageView", "setUhdImageBitmap hd image is null");
            setImageBitmap(bitmap);
            this.f197663y = true;
            return;
        }
        this.f197663y = true;
        this.f197653p0 = false;
        float width = (r0.getWidth() * 1.0f) / bitmap.getWidth();
        this.f197647h = bitmap;
        float[] fArr = new float[9];
        this.f197644e.getValues(fArr);
        float f17 = fArr[2];
        float f18 = fArr[5];
        float f19 = fArr[0];
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.f197644e = matrix;
        matrix.postScale(width, width);
        this.f197644e.postScale(f19, f19);
        this.f197644e.postTranslate(f17, f18);
        setImageMatrix(getImageViewMatrix());
        super.setImageBitmap(bitmap);
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            ((android.graphics.drawable.BitmapDrawable) drawable).setTargetDensity(bitmap.getDensity());
        }
    }

    public final void t() {
        setScaleType(this.R);
        float f17 = getContext().getResources().getDisplayMetrics().widthPixels / 720.0f;
        if (f17 > 1.0f) {
            this.W = f17;
        }
        i();
    }

    public void u(float f17) {
        if (getScale() < this.f197649m && getScale() > this.f197650n) {
            if (this.f197647h != null || this.f197653p0) {
                if (this.f197662x0 == null && this.f197653p0) {
                    return;
                }
                this.f197644e.postScale(f17, f17, this.f197657t / 2.0f, this.f197658u / 2.0f);
                setImageMatrix(getImageViewMatrix());
            }
        }
    }

    public void v(float f17, float f18, float f19, float f27) {
        float scale = (f17 - getScale()) / f27;
        this.V.post(new db5.s8(this, f27, java.lang.System.currentTimeMillis(), getScale(), scale, f18, f19));
    }

    public MultiTouchImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197643d = new android.graphics.Matrix();
        this.f197644e = new android.graphics.Matrix();
        this.f197645f = new android.graphics.Matrix();
        this.f197646g = new float[9];
        this.f197647h = null;
        this.f197648i = 0.0f;
        this.f197649m = 0.0f;
        this.f197650n = 0.0f;
        this.f197659v = false;
        this.f197660w = false;
        this.f197661x = true;
        this.f197663y = false;
        this.f197664z = 2.0f;
        this.A = 0.75f;
        this.B = 20.0f;
        this.C = 0.0f;
        this.D = 1.0f;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = true;
        this.K = null;
        this.L = new android.graphics.Paint();
        this.M = 1.0f;
        this.N = 1.0f;
        this.P = true;
        this.Q = true;
        this.R = android.widget.ImageView.ScaleType.MATRIX;
        this.S = new android.graphics.Rect();
        this.T = new android.graphics.Rect();
        this.U = new float[9];
        this.V = new com.tencent.mm.sdk.platformtools.n3();
        this.W = 1.0f;
        this.f197653p0 = false;
        this.f197652p = 0;
        this.f197651o = 0;
        t();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447208z);
        try {
            setImageBackgroundColor(obtainStyledAttributes.getColor(0, -1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
