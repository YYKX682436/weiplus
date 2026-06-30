package com.tencent.mm.ui.widget.cropview;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0012\u001a\u0004\u0018\u00010\f¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/ui/widget/cropview/RoundCropLayout;", "Landroid/widget/FrameLayout;", "", "ratio", "Ljz5/f0;", "setCropWidthRatio", "", "width", "setCropWidth", "colorValue", "setCropLineColor", "setCropLayerColor", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "", com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "setImagePath", "getCropBitmap", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ml5/f0", "ml5/g0", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class RoundCropLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f211669d;

    /* renamed from: e, reason: collision with root package name */
    public float f211670e;

    /* renamed from: f, reason: collision with root package name */
    public int f211671f;

    /* renamed from: g, reason: collision with root package name */
    public int f211672g;

    /* renamed from: h, reason: collision with root package name */
    public final int f211673h;

    /* renamed from: i, reason: collision with root package name */
    public int f211674i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f211675m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f211676n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f211677o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.base.MultiTouchImageView f211678p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.GestureDetector f211679q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ScaleGestureDetector f211680r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundCropLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.draw(canvas);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.drawColor(this.f211674i);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, (this.f211671f / 2) + this.f211673h, this.f211675m);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f211671f / 2, this.f211676n);
        canvas.restoreToCount(saveLayer);
    }

    public final android.graphics.Bitmap getCropBitmap() {
        if (this.f211677o == null) {
            return null;
        }
        int width = (getWidth() - this.f211671f) / 2;
        int height = (getHeight() - this.f211671f) / 2;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.f211678p.getImageMatrix().invert(matrix);
        android.graphics.RectF rectF = new android.graphics.RectF();
        matrix.mapRect(rectF, new android.graphics.RectF(width, height, getWidth() - width, getHeight() - height));
        java.lang.String str = this.f211669d;
        com.tencent.mars.xlog.Log.i(str, "cropArea " + rectF);
        if (rectF.left < 0.0f) {
            rectF.left = 0.0f;
        }
        if (rectF.top < 0.0f) {
            rectF.top = 0.0f;
        }
        if (rectF.right > r0.getWidth()) {
            rectF.right = r0.getWidth();
        }
        if (rectF.bottom > r0.getHeight()) {
            rectF.bottom = r0.getHeight();
        }
        com.tencent.mars.xlog.Log.i(str, "fix cropArea " + rectF);
        if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return null;
        }
        android.graphics.Bitmap bitmap = this.f211677o;
        kotlin.jvm.internal.o.d(bitmap);
        int i17 = (int) rectF.left;
        int i18 = (int) rectF.top;
        int width2 = (int) rectF.width();
        int height2 = (int) rectF.height();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height2));
        arrayList.add(java.lang.Integer.valueOf(width2));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(bitmap);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/widget/cropview/RoundCropLayout", "getCropBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/widget/cropview/RoundCropLayout", "getCropBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f211671f == 0) {
            this.f211671f = (int) (this.f211670e * getWidth());
        }
    }

    public final void setBitmap(android.graphics.Bitmap bitmap) {
        this.f211677o = bitmap;
        if (bitmap != null) {
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f211678p;
            multiTouchImageView.setImageBitmap(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            multiTouchImageView.f197651o = width;
            multiTouchImageView.f197652p = height;
            multiTouchImageView.i();
        }
    }

    public final void setCropLayerColor(int i17) {
        this.f211674i = i17;
    }

    public final void setCropLineColor(int i17) {
        this.f211672g = i17;
    }

    public final void setCropWidth(int i17) {
        this.f211671f = i17;
    }

    public final void setCropWidthRatio(float f17) {
        this.f211670e = f17;
    }

    public final void setImagePath(java.lang.String str) {
        nz5.b.a(false, false, null, null, 0, new ml5.i0(str, this), 31, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCropLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211669d = "MicroMsg.RoundCropLayout";
        this.f211672g = -1;
        int a17 = com.tencent.mm.ui.zk.a(getContext(), 1);
        this.f211673h = a17;
        this.f211674i = getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f211675m = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f211676n = paint2;
        setWillNotDraw(false);
        paint.setColor(this.f211672g);
        paint.setStrokeWidth(a17);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = new com.tencent.mm.ui.base.MultiTouchImageView(context, null);
        this.f211678p = multiTouchImageView;
        addView(multiTouchImageView, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        ml5.f0 f0Var = new ml5.f0(this);
        this.f211679q = new android.view.GestureDetector(context, f0Var);
        android.view.ScaleGestureDetector scaleGestureDetector = new android.view.ScaleGestureDetector(context, f0Var);
        this.f211680r = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(true);
        multiTouchImageView.setOnTouchListener(new ml5.g0(this));
        setCropWidthRatio(0.9f);
    }
}
