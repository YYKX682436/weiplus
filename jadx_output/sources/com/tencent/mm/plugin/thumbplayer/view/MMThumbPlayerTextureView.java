package com.tencent.mm.plugin.thumbplayer.view;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B%\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "Lcom/tencent/mm/plugin/thumbplayer/view/MMTextureView;", "Lpk4/b;", "Landroid/graphics/Rect;", "cropRect", "Ljz5/f0;", "setCropRect", "", "scaleType", "setScaleType", "getScaleType", "", "isOpaque", "setOpaqueInfo", "Landroid/view/TextureView$SurfaceTextureListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setTextureListenerCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-thumbplayer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MMThumbPlayerTextureView extends com.tencent.mm.plugin.thumbplayer.view.MMTextureView implements pk4.b {

    /* renamed from: h, reason: collision with root package name */
    public int f174556h;

    /* renamed from: i, reason: collision with root package name */
    public int f174557i;

    /* renamed from: m, reason: collision with root package name */
    public int f174558m;

    /* renamed from: n, reason: collision with root package name */
    public float f174559n;

    /* renamed from: o, reason: collision with root package name */
    public float f174560o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Rect f174561p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.TextureView.SurfaceTextureListener f174562q;

    /* renamed from: r, reason: collision with root package name */
    public final pk4.s f174563r;

    public MMThumbPlayerTextureView(android.content.Context context) {
        super(context);
        this.f174561p = new android.graphics.Rect();
        this.f174563r = new pk4.s(this);
        l();
    }

    @Override // pk4.b
    /* renamed from: getScaleType, reason: from getter */
    public int getF174556h() {
        return this.f174556h;
    }

    public final void k(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "centerCrop, container:[" + i17 + ", " + i18 + ']');
        float f17 = (float) i17;
        float f18 = f17 / ((float) this.f174557i);
        float f19 = (float) i18;
        float f27 = f19 / ((float) this.f174558m);
        float max = java.lang.Math.max(f18, f27);
        float f28 = max / f18;
        float f29 = max / f27;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f28, f29, f17 / 2.0f, f19 / 2.0f);
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "centerCrop matrix:" + matrix);
        setTransform(matrix);
    }

    public final void l() {
        setOpaque(false);
        setAlpha(0.0f);
        setScaleX(1.0001f);
        setScaleY(1.0001f);
        setSurfaceTextureListener(this.f174563r);
    }

    public void m(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "setVideoWidthAndHeight videoWidth:" + this.f174557i + ", videoHeight:" + this.f174558m + ", width:" + i17 + ", height:" + i18 + " scaleType:" + this.f174556h);
        if (this.f174557i == i17 && this.f174558m == i18) {
            this.f174557i = i17;
            this.f174558m = i18;
        } else {
            this.f174557i = i17;
            this.f174558m = i18;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f174557i == 0 || this.f174558m == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        int i19 = this.f174557i;
        int i27 = this.f174558m;
        float f17 = defaultSize;
        float f18 = defaultSize2;
        int i28 = this.f174556h;
        if (i28 == 0) {
            k(defaultSize, defaultSize2);
        } else if (i28 == 1) {
            float f19 = f17 / i19;
            float f27 = f18 / i27;
            float min = java.lang.Math.min(f19, f27);
            float f28 = min / f19;
            float f29 = min / f27;
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(f28, f29, f17 / 2.0f, f18 / 2.0f);
            com.tencent.mars.xlog.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "centerFit, container:[" + defaultSize + ", " + defaultSize2 + "] matrix:" + matrix);
            setTransform(matrix);
        } else if (i28 != 3) {
            setTransform(new android.graphics.Matrix());
        } else if (this.f174561p.isEmpty()) {
            k(defaultSize, defaultSize2);
        } else {
            android.graphics.Rect rect = this.f174561p;
            if (!(this.f174559n == 0.0f)) {
                if (!(this.f174560o == 0.0f) && !rect.isEmpty()) {
                    float f37 = f17 / this.f174559n;
                    float f38 = f18 / this.f174560o;
                    float max = java.lang.Math.max(f37, f38);
                    float centerX = ((this.f174559n / 2.0f) - rect.centerX()) * (f17 / rect.width());
                    float centerY = ((this.f174560o / 2.0f) - rect.centerY()) * (f18 / rect.height());
                    android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                    matrix2.setScale(max / f37, max / f38, f17 / 2.0f, f18 / 2.0f);
                    matrix2.postTranslate(centerX, centerY);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "cropRect(), containerWidth:" + defaultSize + " containerHeight:" + defaultSize2 + ' ' + matrix2);
                    setTransform(matrix2);
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "onMeasure#handleOnMeasureLikeMM video size[" + this.f174557i + ' ' + this.f174558m + "] spec[" + android.view.View.getDefaultSize(1, i17) + ", " + android.view.View.getDefaultSize(1, i18) + "] result=" + defaultSize + ',' + defaultSize2);
    }

    @Override // pk4.b
    public void setCropRect(android.graphics.Rect cropRect) {
        kotlin.jvm.internal.o.g(cropRect, "cropRect");
        this.f174561p = cropRect;
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "setCropRect, cropRect:" + cropRect);
    }

    @Override // pk4.b
    public void setOpaqueInfo(boolean z17) {
        if (z17) {
            setOpaque(true);
            setAlpha(1.0f);
        } else {
            setOpaque(false);
            setAlpha(0.0f);
        }
    }

    @Override // pk4.b
    public void setScaleType(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "setScaleType, scaleType:" + i17);
        this.f174556h = i17;
    }

    @Override // pk4.b
    public void setTextureListenerCallback(android.view.TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f174562q = surfaceTextureListener;
    }

    public MMThumbPlayerTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f174561p = new android.graphics.Rect();
        this.f174563r = new pk4.s(this);
        l();
    }

    public MMThumbPlayerTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f174561p = new android.graphics.Rect();
        this.f174563r = new pk4.s(this);
        l();
    }
}
