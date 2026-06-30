package com.tencent.mm.plugin.thumbplayer.render;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-B#\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010.\u001a\u00020\r¢\u0006\u0004\b,\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016R\"\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010'\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00060"}, d2 = {"Lcom/tencent/mm/plugin/thumbplayer/render/MMTextureViewRender;", "Landroid/view/TextureView;", "Lmk4/b;", "", "getTagPrefix", "Landroid/view/Surface;", "getSurface", "tag", "Ljz5/f0;", "setTagPrefix", "Lmk4/a;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSurfaceListener", "", "type", "setScaleType", "getScaleType", "Landroid/graphics/Rect;", "cropRect", "setCropRect", "", "isOpaque", "setOpaqueInfo", "getVideoWidth", "getVideoHeight", "getLogTag", "h", "Z", "isPreloadMode", "()Z", "setPreloadMode", "(Z)V", "value", "i", "I", "getVideoDegree", "()I", "setVideoDegree", "(I)V", "videoDegree", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "thumbplayer-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MMTextureViewRender extends android.view.TextureView implements mk4.b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f174504d;

    /* renamed from: e, reason: collision with root package name */
    public mk4.a f174505e;

    /* renamed from: f, reason: collision with root package name */
    public int f174506f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f174507g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isPreloadMode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int videoDegree;

    /* renamed from: m, reason: collision with root package name */
    public int f174510m;

    /* renamed from: n, reason: collision with root package name */
    public int f174511n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMTextureViewRender(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f174504d = "PREFIX";
        this.f174507g = new android.graphics.Rect();
        setSurfaceTextureListener(new mk4.i(this));
    }

    /* renamed from: getTagPrefix, reason: from getter */
    private final java.lang.String getF174504d() {
        return this.f174504d;
    }

    @Override // mk4.b
    public void a(int i17, int i18) {
        if (this.f174510m == i17 && this.f174511n == i18) {
            this.f174510m = i17;
            this.f174511n = i18;
        } else {
            this.f174510m = i17;
            this.f174511n = i18;
            requestLayout();
        }
    }

    public final void b(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(getLogTag(), "centerCrop, container:[" + i17 + ", " + i18 + ']');
        float f17 = ((float) i17) / ((float) this.f174510m);
        float f18 = ((float) i18) / ((float) this.f174511n);
        float max = java.lang.Math.max(f17, f18);
        float f19 = max / f17;
        float f27 = max / f18;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f19, f27, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        com.tencent.mars.xlog.Log.i(getLogTag(), "centerCrop sx:" + f19 + " sy:" + f27 + " px:" + (getMeasuredWidth() / 2.0f) + " py:" + (getMeasuredHeight() / 2.0f) + " matrix:" + matrix);
        setTransform(matrix);
    }

    public java.lang.String getLogTag() {
        return getF174504d() + "_MMTextureViewRender";
    }

    @Override // mk4.b
    /* renamed from: getScaleType, reason: from getter */
    public int getF174506f() {
        return this.f174506f;
    }

    @Override // mk4.b
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

    @Override // mk4.b
    /* renamed from: getVideoHeight, reason: from getter */
    public int getF174511n() {
        return this.f174511n;
    }

    @Override // mk4.b
    /* renamed from: getVideoWidth, reason: from getter */
    public int getF174510m() {
        return this.f174510m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0170, code lost:
    
        if ((getScaleY() == 1.0f) == false) goto L47;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender.onMeasure(int, int):void");
    }

    @Override // mk4.b
    public void reset() {
        com.tencent.mars.xlog.Log.i(getLogTag(), "reset cropRect=" + this.f174507g);
        this.f174507g = new android.graphics.Rect();
    }

    @Override // mk4.b
    public void setCropRect(android.graphics.Rect cropRect) {
        kotlin.jvm.internal.o.g(cropRect, "cropRect");
        com.tencent.mars.xlog.Log.i(getLogTag(), "setCropRect, cropRect:" + cropRect);
        this.f174507g = cropRect;
    }

    @Override // mk4.b
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

    public final void setPreloadMode(boolean z17) {
        this.isPreloadMode = z17;
    }

    @Override // mk4.b
    public void setScaleType(int i17) {
        com.tencent.mars.xlog.Log.i(getLogTag(), "setScaleType type:" + i17);
        this.f174506f = i17;
    }

    @Override // mk4.b
    public void setSurfaceListener(mk4.a listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f174505e = listener;
    }

    @Override // mk4.b
    public void setTagPrefix(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f174504d = tag;
    }

    public final void setVideoDegree(int i17) {
        this.videoDegree = i17;
        com.tencent.mars.xlog.Log.i(getLogTag(), "setVideoDegree, videoDegree:" + this.videoDegree);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMTextureViewRender(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f174504d = "PREFIX";
        this.f174507g = new android.graphics.Rect();
        setSurfaceTextureListener(new mk4.i(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMTextureViewRender(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f174504d = "PREFIX";
        this.f174507g = new android.graphics.Rect();
        setSurfaceTextureListener(new mk4.i(this));
    }
}
