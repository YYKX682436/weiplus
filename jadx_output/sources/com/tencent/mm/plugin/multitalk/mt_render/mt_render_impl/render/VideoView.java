package com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0007\u0012\u0006\u00108\u001a\u000207\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R(\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR.\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR.\u00100\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0017\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u0014\u00102\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0013R\u0016\u00106\u001a\u0004\u0018\u0001038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006="}, d2 = {"Lcom/tencent/mm/plugin/multitalk/mt_render/mt_render_impl/render/VideoView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Ljj3/d;", "", "ori", "Ljz5/f0;", "setScreenOri", "Landroid/graphics/SurfaceTexture;", "<set-?>", "d", "Landroid/graphics/SurfaceTexture;", "getRenderSurface", "()Landroid/graphics/SurfaceTexture;", "renderSurface", "Landroid/util/Size;", "e", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "size", "Lkotlin/Function1;", "g", "Lyz5/l;", "getOnOriChange", "()Lyz5/l;", "setOnOriChange", "(Lyz5/l;)V", "onOriChange", "Lkotlin/Function0;", "h", "Lyz5/a;", "getOnFrame", "()Lyz5/a;", "setOnFrame", "(Lyz5/a;)V", "onFrame", "m", "getOnSurfaceTextureDestroyedCallback", "setOnSurfaceTextureDestroyedCallback", "onSurfaceTextureDestroyedCallback", "n", "getOnSurfaceTextureAvailable", "setOnSurfaceTextureAvailable", "onSurfaceTextureAvailable", "o", "getOnSurfaceTextureUpdate", "setOnSurfaceTextureUpdate", "onSurfaceTextureUpdate", "getRenderSize", "renderSize", "", "getRenderTarget", "()Ljava/lang/Object;", "renderTarget", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class VideoView extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, jj3.d {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.graphics.SurfaceTexture renderSurface;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.util.Size size;

    /* renamed from: f, reason: collision with root package name */
    public int f150218f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.l onOriChange;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.a onFrame;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f150221i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.l onSurfaceTextureDestroyedCallback;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.l onSurfaceTextureAvailable;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public yz5.l onSurfaceTextureUpdate;

    /* renamed from: p, reason: collision with root package name */
    public int f150225p;

    /* renamed from: q, reason: collision with root package name */
    public long f150226q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.size = new android.util.Size(0, 0);
        this.f150218f = -1;
        this.onOriChange = jj3.l.f300024d;
        this.onFrame = jj3.k.f300023d;
        this.onSurfaceTextureDestroyedCallback = jj3.n.f300026d;
        this.onSurfaceTextureAvailable = jj3.m.f300025d;
        this.onSurfaceTextureUpdate = jj3.o.f300027d;
        setSurfaceTextureListener(this);
    }

    @Override // jj3.d
    public void a() {
        this.f150225p++;
        this.onFrame.invoke();
        if (java.lang.System.currentTimeMillis() - this.f150226q >= 1000) {
            zj3.g gVar = zj3.g.f473302a;
            zj3.g.f473311j += this.f150225p;
            zj3.g.f473312k++;
            this.f150225p = 0;
            this.f150226q = java.lang.System.currentTimeMillis();
        }
    }

    public final yz5.a getOnFrame() {
        return this.onFrame;
    }

    public final yz5.l getOnOriChange() {
        return this.onOriChange;
    }

    public final yz5.l getOnSurfaceTextureAvailable() {
        return this.onSurfaceTextureAvailable;
    }

    public final yz5.l getOnSurfaceTextureDestroyedCallback() {
        return this.onSurfaceTextureDestroyedCallback;
    }

    public final yz5.l getOnSurfaceTextureUpdate() {
        return this.onSurfaceTextureUpdate;
    }

    @Override // jj3.d
    /* renamed from: getRenderSize, reason: from getter */
    public android.util.Size getSize() {
        return this.size;
    }

    public final android.graphics.SurfaceTexture getRenderSurface() {
        return this.renderSurface;
    }

    @Override // jj3.d
    public java.lang.Object getRenderTarget() {
        return this.renderSurface;
    }

    public final android.util.Size getSize() {
        return this.size;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.VideoView", "onSurfaceTextureAvailable() called with: surface = " + surface + ", width = " + i17 + ", height = " + i18);
        this.renderSurface = surface;
        this.f150221i = false;
        this.size = new android.util.Size(i17, i18);
        this.onSurfaceTextureAvailable.invoke(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.VideoView", "onSurfaceTextureDestroyed() called with: surface = " + surface);
        if (this.f150221i) {
            return false;
        }
        this.onSurfaceTextureDestroyedCallback.invoke(surface);
        this.f150221i = true;
        android.graphics.SurfaceTexture surfaceTexture = this.renderSurface;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.renderSurface = null;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.VideoView", "onSurfaceTextureSizeChanged() called with: surface = " + surface + ", width = " + i17 + ", height = " + i18);
        this.size = new android.util.Size(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        this.onSurfaceTextureUpdate.invoke(surface);
    }

    public final void setOnFrame(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.onFrame = aVar;
    }

    public final void setOnOriChange(yz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.onOriChange = lVar;
    }

    public final void setOnSurfaceTextureAvailable(yz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.onSurfaceTextureAvailable = lVar;
    }

    public final void setOnSurfaceTextureDestroyedCallback(yz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.onSurfaceTextureDestroyedCallback = lVar;
    }

    public final void setOnSurfaceTextureUpdate(yz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.onSurfaceTextureUpdate = lVar;
    }

    @Override // jj3.d
    public void setScreenOri(int i17) {
        if (i17 != this.f150218f) {
            this.f150218f = i17;
            this.onOriChange.invoke(java.lang.Integer.valueOf(i17));
        }
    }
}
