package com.tencent.mm.plugin.mmplayer.render;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,B#\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010-\u001a\u00020\u000e¢\u0006\u0004\b+\u0010.J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016R*\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006/"}, d2 = {"Lcom/tencent/mm/plugin/mmplayer/render/MMSurfaceViewRender;", "Landroid/view/SurfaceView;", "Lvh3/b;", "Landroid/graphics/Bitmap;", "getBitmap", "", "getLogTag", "", "isOpaque", "Ljz5/f0;", "setOpaqueInfo", "Lvh3/a;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSurfaceListener", "", "type", "setScaleType", "Landroid/graphics/Rect;", "cropRect", "setCropRect", "getScaleType", "Landroid/view/Surface;", "getSurface", "value", "h", "I", "getVideoDegree", "()I", "setVideoDegree", "(I)V", "videoDegree", "La01/d;", "q", "La01/d;", "getSurfaceViewSwitchHelper", "()La01/d;", "setSurfaceViewSwitchHelper", "(La01/d;)V", "surfaceViewSwitchHelper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "thumbplayer-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MMSurfaceViewRender extends android.view.SurfaceView implements vh3.b {

    /* renamed from: d, reason: collision with root package name */
    public rh3.p f148786d;

    /* renamed from: e, reason: collision with root package name */
    public vh3.a f148787e;

    /* renamed from: f, reason: collision with root package name */
    public int f148788f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f148789g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int videoDegree;

    /* renamed from: i, reason: collision with root package name */
    public int f148791i;

    /* renamed from: m, reason: collision with root package name */
    public int f148792m;

    /* renamed from: n, reason: collision with root package name */
    public int f148793n;

    /* renamed from: o, reason: collision with root package name */
    public int f148794o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.Surface f148795p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public a01.d surfaceViewSwitchHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMSurfaceViewRender(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f148789g = new android.graphics.Rect();
        e();
    }

    @Override // vh3.b
    public void a(int i17, int i18) {
        if (this.f148791i == i17 && this.f148792m == i18) {
            this.f148791i = i17;
            this.f148792m = i18;
        } else {
            this.f148791i = i17;
            this.f148792m = i18;
            requestLayout();
        }
    }

    @Override // vh3.b
    public void b(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(getLogTag(), "setOriginVideoWidthAndHeight videoWidth:" + this.f148791i + ", videoHeight:" + this.f148792m + ", width:" + i17 + ", height:" + i18 + " scaleType:" + this.f148788f);
        this.f148793n = i17;
        this.f148794o = i18;
    }

    public final int[] c(float f17, float f18, int i17, int i18) {
        if (f17 < f18) {
            i18 = (int) (i17 / f17);
        } else {
            i17 = (int) (i18 * f17);
        }
        return new int[]{i17, i18};
    }

    @Override // vh3.b
    public void d(rh3.p onePlayContext) {
        kotlin.jvm.internal.o.g(onePlayContext, "onePlayContext");
        com.tencent.mars.xlog.Log.i(getLogTag(), "attach onePlayContext:" + onePlayContext);
        this.f148786d = onePlayContext;
    }

    public final void e() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            getHolder().setFormat(22);
        }
        getHolder().addCallback(new vh3.d(this));
    }

    public android.graphics.Bitmap getBitmap() {
        return null;
    }

    public java.lang.String getLogTag() {
        rh3.p pVar = this.f148786d;
        return java.lang.String.valueOf(pVar != null ? ((rh3.q) pVar).f("MMSurfaceViewRender") : null);
    }

    /* renamed from: getScaleType, reason: from getter */
    public int getF148788f() {
        return this.f148788f;
    }

    /* renamed from: getSurface, reason: from getter */
    public android.view.Surface getF148795p() {
        return this.f148795p;
    }

    public final a01.d getSurfaceViewSwitchHelper() {
        return this.surfaceViewSwitchHelper;
    }

    public final int getVideoDegree() {
        return this.videoDegree;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i17, int i18) {
        int[] c17;
        int i19;
        int i27;
        int i28;
        int i29;
        super.onMeasure(i17, i18);
        if (this.f148791i == 0 || this.f148792m == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        float f17 = (this.f148791i * 1.0f) / this.f148792m;
        float f18 = defaultSize;
        float f19 = defaultSize2;
        float f27 = (1.0f * f18) / f19;
        int f148788f = getF148788f();
        if (f148788f == 0) {
            c17 = c(f17, f27, defaultSize, defaultSize2);
        } else if (f148788f == 1) {
            if (f17 > f27) {
                i27 = (int) (f18 / f17);
                i19 = defaultSize;
            } else {
                i19 = (int) (f19 * f17);
                i27 = defaultSize2;
            }
            c17 = new int[]{i19, i27};
        } else if (f148788f != 3) {
            if (f17 > f27) {
                i29 = (int) (f18 / f17);
                i28 = defaultSize;
            } else {
                i28 = (int) (f19 * f17);
                i29 = defaultSize2;
            }
            c17 = new int[]{i28, i29};
        } else if (this.f148789g.isEmpty()) {
            c17 = c(f17, f27, defaultSize, defaultSize2);
        } else {
            android.graphics.Rect rect = this.f148789g;
            if (this.f148793n == 0 || this.f148794o == 0 || rect.isEmpty()) {
                c17 = c(f17, f27, defaultSize, defaultSize2);
            } else {
                com.tencent.mars.xlog.Log.i(getLogTag(), "cropVideo, video size[" + this.f148791i + ' ' + this.f148792m + "] container:[" + defaultSize + ", " + defaultSize2 + "]  result=" + getMeasuredWidth() + ',' + getMeasuredHeight());
                c17 = c(f17, f27, defaultSize, defaultSize2);
            }
        }
        post(new vh3.c(this, c17));
        setMeasuredDimension(c17[0], c17[1]);
        com.tencent.mars.xlog.Log.i(getLogTag(), "handleOnMeasure, type:" + getF148788f() + " video size[" + this.f148791i + ' ' + this.f148792m + "] container:[" + defaultSize + ", " + defaultSize2 + "]  result=" + c17[0] + ',' + c17[1]);
    }

    @Override // vh3.b
    public void setCropRect(android.graphics.Rect cropRect) {
        kotlin.jvm.internal.o.g(cropRect, "cropRect");
        com.tencent.mars.xlog.Log.i(getLogTag(), "setCropRect, cropRect:" + cropRect);
        this.f148789g = cropRect;
    }

    @Override // vh3.b
    public void setOpaqueInfo(boolean z17) {
    }

    @Override // vh3.b
    public void setScaleType(int i17) {
        com.tencent.mars.xlog.Log.i(getLogTag(), "setScaleType type:" + i17);
        this.f148788f = i17;
    }

    @Override // vh3.b
    public void setSurfaceListener(vh3.a listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f148787e = listener;
    }

    public final void setSurfaceViewSwitchHelper(a01.d dVar) {
        this.surfaceViewSwitchHelper = dVar;
    }

    public final void setVideoDegree(int i17) {
        this.videoDegree = i17;
        com.tencent.mars.xlog.Log.i(getLogTag(), "setVideoDegree, videoDegree:" + this.videoDegree);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMSurfaceViewRender(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f148789g = new android.graphics.Rect();
        e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMSurfaceViewRender(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f148789g = new android.graphics.Rect();
        e();
    }
}
