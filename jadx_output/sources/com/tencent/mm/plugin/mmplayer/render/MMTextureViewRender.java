package com.tencent.mm.plugin.mmplayer.render;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B#\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010#\u001a\u00020\t¢\u0006\u0004\b!\u0010$J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R*\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/tencent/mm/plugin/mmplayer/render/MMTextureViewRender;", "Landroid/view/TextureView;", "Lvh3/b;", "Landroid/view/Surface;", "getSurface", "Lvh3/a;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setSurfaceListener", "", "type", "setScaleType", "getScaleType", "Landroid/graphics/Rect;", "cropRect", "setCropRect", "", "isOpaque", "setOpaqueInfo", "", "getLogTag", "value", "h", "I", "getVideoDegree", "()I", "setVideoDegree", "(I)V", "videoDegree", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "thumbplayer-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MMTextureViewRender extends android.view.TextureView implements vh3.b {

    /* renamed from: d, reason: collision with root package name */
    public rh3.p f148797d;

    /* renamed from: e, reason: collision with root package name */
    public vh3.a f148798e;

    /* renamed from: f, reason: collision with root package name */
    public int f148799f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f148800g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int videoDegree;

    /* renamed from: i, reason: collision with root package name */
    public int f148802i;

    /* renamed from: m, reason: collision with root package name */
    public int f148803m;

    /* renamed from: n, reason: collision with root package name */
    public int f148804n;

    /* renamed from: o, reason: collision with root package name */
    public int f148805o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMTextureViewRender(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f148800g = new android.graphics.Rect();
        setSurfaceTextureListener(new vh3.e(this));
    }

    @Override // vh3.b
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(getLogTag(), "setVideoWidthAndHeight videoWidth:" + this.f148802i + ", videoHeight:" + this.f148803m + ", width:" + i17 + ", height:" + i18 + " scaleType:" + this.f148799f);
        if (this.f148802i == i17 && this.f148803m == i18) {
            this.f148802i = i17;
            this.f148803m = i18;
        } else {
            this.f148802i = i17;
            this.f148803m = i18;
            requestLayout();
        }
    }

    @Override // vh3.b
    public void b(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(getLogTag(), "setOriginVideoWidthAndHeight videoWidth:" + this.f148802i + ", videoHeight:" + this.f148803m + ", width:" + i17 + ", height:" + i18 + " scaleType:" + this.f148799f);
        this.f148804n = i17;
        this.f148805o = i18;
    }

    public final void c(int i17, int i18) {
        float f17 = i17 / this.f148802i;
        float f18 = i18 / this.f148803m;
        float max = java.lang.Math.max(f17, f18);
        float f19 = max / f17;
        float f27 = max / f18;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f19, f27, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        com.tencent.mars.xlog.Log.i(getLogTag(), "centerCrop container[" + i17 + ' ' + i18 + "] video[" + this.f148802i + ' ' + this.f148803m + "] matrix:" + matrix);
        setTransform(matrix);
    }

    @Override // vh3.b
    public void d(rh3.p onePlayContext) {
        kotlin.jvm.internal.o.g(onePlayContext, "onePlayContext");
        com.tencent.mars.xlog.Log.i(getLogTag(), "attach onePlayContext:" + onePlayContext);
        this.f148797d = onePlayContext;
    }

    public java.lang.String getLogTag() {
        java.lang.String f17;
        rh3.p pVar = this.f148797d;
        return (pVar == null || (f17 = ((rh3.q) pVar).f("MMTextureViewRender")) == null) ? "MMTextureViewRender" : f17;
    }

    /* renamed from: getScaleType, reason: from getter */
    public int getF148799f() {
        return this.f148799f;
    }

    public android.view.Surface getSurface() {
        if (getSurfaceTexture() == null) {
            com.tencent.mars.xlog.Log.w("MMTextureViewRender", "getSurface return for null");
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT > 26) {
            android.graphics.SurfaceTexture surfaceTexture = getSurfaceTexture();
            kotlin.jvm.internal.o.d(surfaceTexture);
            if (surfaceTexture.isReleased()) {
                com.tencent.mars.xlog.Log.w("MMTextureViewRender", "getSurface return for Released");
                return null;
            }
        }
        return new android.view.Surface(getSurfaceTexture());
    }

    public final int getVideoDegree() {
        return this.videoDegree;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0159, code lost:
    
        if ((getScaleY() == 1.0f) == false) goto L39;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender.onMeasure(int, int):void");
    }

    @Override // vh3.b
    public void setCropRect(android.graphics.Rect cropRect) {
        kotlin.jvm.internal.o.g(cropRect, "cropRect");
        com.tencent.mars.xlog.Log.i(getLogTag(), "setCropRect, cropRect:" + cropRect);
        this.f148800g = cropRect;
    }

    @Override // vh3.b
    public void setOpaqueInfo(boolean z17) {
        float f17;
        if (z17) {
            setOpaque(true);
            f17 = 1.0f;
        } else {
            setOpaque(false);
            f17 = 0.0f;
        }
        setAlpha(f17);
    }

    @Override // vh3.b
    public void setScaleType(int i17) {
        com.tencent.mars.xlog.Log.i(getLogTag(), "setScaleType type:" + i17);
        this.f148799f = i17;
    }

    @Override // vh3.b
    public void setSurfaceListener(vh3.a listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f148798e = listener;
    }

    public final void setVideoDegree(int i17) {
        this.videoDegree = i17;
        com.tencent.mars.xlog.Log.i(getLogTag(), "setVideoDegree, videoDegree:" + this.videoDegree);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMTextureViewRender(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f148800g = new android.graphics.Rect();
        setSurfaceTextureListener(new vh3.e(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMTextureViewRender(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f148800g = new android.graphics.Rect();
        setSurfaceTextureListener(new vh3.e(this));
    }
}
