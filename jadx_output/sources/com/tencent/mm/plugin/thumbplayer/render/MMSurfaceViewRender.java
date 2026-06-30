package com.tencent.mm.plugin.thumbplayer.render;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010-\u001a\u00020,\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101B#\b\u0016\u0012\u0006\u0010-\u001a\u00020,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u00102\u001a\u00020\u0011¢\u0006\u0004\b0\u00103J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016R*\u0010#\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00064"}, d2 = {"Lcom/tencent/mm/plugin/thumbplayer/render/MMSurfaceViewRender;", "Landroid/view/SurfaceView;", "Lmk4/b;", "", "getTagPrefix", "Landroid/graphics/Bitmap;", "getBitmap", "getLogTag", "", "isOpaque", "Ljz5/f0;", "setOpaqueInfo", "tag", "setTagPrefix", "Lmk4/a;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSurfaceListener", "", "type", "setScaleType", "Landroid/graphics/Rect;", "cropRect", "setCropRect", "getScaleType", "Landroid/view/Surface;", "getSurface", "getVideoWidth", "getVideoHeight", "value", "h", "I", "getVideoDegree", "()I", "setVideoDegree", "(I)V", "videoDegree", "Lmk4/h;", "o", "Lmk4/h;", "getSurfaceViewSwitchHelper", "()Lmk4/h;", "setSurfaceViewSwitchHelper", "(Lmk4/h;)V", "surfaceViewSwitchHelper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "thumbplayer-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MMSurfaceViewRender extends android.view.SurfaceView implements mk4.b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f174495d;

    /* renamed from: e, reason: collision with root package name */
    public mk4.a f174496e;

    /* renamed from: f, reason: collision with root package name */
    public int f174497f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f174498g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int videoDegree;

    /* renamed from: i, reason: collision with root package name */
    public int f174500i;

    /* renamed from: m, reason: collision with root package name */
    public int f174501m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.Surface f174502n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public mk4.h surfaceViewSwitchHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMSurfaceViewRender(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f174495d = "PREFIX";
        this.f174498g = new android.graphics.Rect();
        c();
    }

    /* renamed from: getTagPrefix, reason: from getter */
    private final java.lang.String getF174495d() {
        return this.f174495d;
    }

    @Override // mk4.b
    public void a(int i17, int i18) {
        if (this.f174500i == i17 && this.f174501m == i18) {
            this.f174500i = i17;
            this.f174501m = i18;
        } else {
            this.f174500i = i17;
            this.f174501m = i18;
            requestLayout();
        }
    }

    public final int[] b(float f17, float f18, int i17, int i18) {
        if (f17 < f18) {
            i18 = (int) (i17 / f17);
        } else {
            i17 = (int) (i18 * f17);
        }
        return new int[]{i17, i18};
    }

    public final void c() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            getHolder().setFormat(22);
        }
        getHolder().addCallback(new mk4.d(this));
    }

    @Override // mk4.b
    public android.graphics.Bitmap getBitmap() {
        return null;
    }

    public java.lang.String getLogTag() {
        return getF174495d() + "_MMSurfaceViewRender";
    }

    @Override // mk4.b
    /* renamed from: getScaleType, reason: from getter */
    public int getF174497f() {
        return this.f174497f;
    }

    @Override // mk4.b
    /* renamed from: getSurface, reason: from getter */
    public android.view.Surface getF174502n() {
        return this.f174502n;
    }

    public final mk4.h getSurfaceViewSwitchHelper() {
        return this.surfaceViewSwitchHelper;
    }

    public final int getVideoDegree() {
        return this.videoDegree;
    }

    @Override // mk4.b
    /* renamed from: getVideoHeight, reason: from getter */
    public int getF174501m() {
        return this.f174501m;
    }

    @Override // mk4.b
    /* renamed from: getVideoWidth, reason: from getter */
    public int getF174500i() {
        return this.f174500i;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i17, int i18) {
        int[] b17;
        int i19;
        int i27;
        int i28;
        int i29;
        super.onMeasure(i17, i18);
        if (this.f174500i == 0 || this.f174501m == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        float f17 = (this.f174500i * 1.0f) / this.f174501m;
        float f18 = defaultSize;
        float f19 = defaultSize2;
        float f27 = (1.0f * f18) / f19;
        int f174497f = getF174497f();
        if (f174497f == 0) {
            b17 = b(f17, f27, defaultSize, defaultSize2);
        } else if (f174497f == 1) {
            if (f17 > f27) {
                i27 = (int) (f18 / f17);
                i19 = defaultSize;
            } else {
                i19 = (int) (f19 * f17);
                i27 = defaultSize2;
            }
            b17 = new int[]{i19, i27};
        } else if (f174497f != 3) {
            if (f17 > f27) {
                i29 = (int) (f18 / f17);
                i28 = defaultSize;
            } else {
                i28 = (int) (f19 * f17);
                i29 = defaultSize2;
            }
            b17 = new int[]{i28, i29};
        } else if (this.f174498g.isEmpty()) {
            b17 = b(f17, f27, defaultSize, defaultSize2);
        } else {
            android.graphics.Rect rect = this.f174498g;
            if (this.f174500i == 0 || this.f174501m == 0 || rect.isEmpty()) {
                b17 = b(f17, f27, defaultSize, defaultSize2);
            } else {
                com.tencent.mars.xlog.Log.i(getLogTag(), "cropVideo, video size[" + this.f174500i + ' ' + this.f174501m + "] container:[" + defaultSize + ", " + defaultSize2 + "]  result=" + getMeasuredWidth() + ',' + getMeasuredHeight());
                b17 = b(f17, f27, defaultSize, defaultSize2);
            }
        }
        post(new mk4.c(this, b17));
        setMeasuredDimension(b17[0], b17[1]);
        com.tencent.mars.xlog.Log.i(getLogTag(), "handleOnMeasure, type:" + getF174497f() + " video size[" + this.f174500i + ' ' + this.f174501m + "] container:[" + defaultSize + ", " + defaultSize2 + "]  result=" + b17[0] + ',' + b17[1]);
    }

    @Override // mk4.b
    public void reset() {
    }

    @Override // mk4.b
    public void setCropRect(android.graphics.Rect cropRect) {
        kotlin.jvm.internal.o.g(cropRect, "cropRect");
        com.tencent.mars.xlog.Log.i(getLogTag(), "setCropRect, cropRect:" + cropRect);
        this.f174498g = cropRect;
    }

    @Override // mk4.b
    public void setOpaqueInfo(boolean z17) {
    }

    @Override // mk4.b
    public void setScaleType(int i17) {
        com.tencent.mars.xlog.Log.i(getLogTag(), "setScaleType type:" + i17);
        this.f174497f = i17;
    }

    @Override // mk4.b
    public void setSurfaceListener(mk4.a listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f174496e = listener;
    }

    public final void setSurfaceViewSwitchHelper(mk4.h hVar) {
        this.surfaceViewSwitchHelper = hVar;
    }

    @Override // mk4.b
    public void setTagPrefix(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f174495d = tag;
    }

    public final void setVideoDegree(int i17) {
        this.videoDegree = i17;
        com.tencent.mars.xlog.Log.i(getLogTag(), "setVideoDegree, videoDegree:" + this.videoDegree);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMSurfaceViewRender(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f174495d = "PREFIX";
        this.f174498g = new android.graphics.Rect();
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMSurfaceViewRender(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f174495d = "PREFIX";
        this.f174498g = new android.graphics.Rect();
        c();
    }
}
