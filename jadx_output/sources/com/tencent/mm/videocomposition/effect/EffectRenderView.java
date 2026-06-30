package com.tencent.mm.videocomposition.effect;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B!\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0007R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/videocomposition/effect/EffectRenderView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/graphics/Bitmap;", "bitmap", "Ljz5/f0;", "setInputBitmap", "Lcom/tencent/mm/xeffect/effect/EffectManager;", "getEffectManager", "Lum5/x;", "getReportData", "()Lum5/x;", "reportData", "Lum5/e;", "value", "getSurfaceCallback", "()Lum5/e;", "setSurfaceCallback", "(Lum5/e;)V", "surfaceCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "composer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EffectRenderView extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f213282d;

    /* renamed from: e, reason: collision with root package name */
    public um5.p f213283e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectRenderView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f213282d = "EffectRenderView@" + hashCode();
        this.f213283e = new um5.p();
        setSurfaceTextureListener(this);
        getReportData().f429212a = 2;
    }

    public final void a(int i17, int i18, int i19) {
        xm5.b.c(this.f213282d, "setInputContentInfo, size:[" + i17 + ',' + i18 + "], rotate:" + i19, new java.lang.Object[0]);
        this.f213283e.m(i17, i18, i19);
    }

    public final com.tencent.mm.xeffect.effect.EffectManager getEffectManager() {
        return this.f213283e.f429193b;
    }

    public final um5.x getReportData() {
        return this.f213283e.f429209r;
    }

    public final um5.e getSurfaceCallback() {
        return this.f213283e.A;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        xm5.b.c(this.f213282d, "onSurfaceTextureAvailable, surface:" + surface.hashCode() + ", size:[" + i17 + ", " + i18 + ']', new java.lang.Object[0]);
        um5.p pVar = this.f213283e;
        pVar.getClass();
        pVar.f429198g = new android.view.Surface(surface);
        pVar.j(i17, i18);
        pVar.d();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        xm5.b.c(this.f213282d, "onSurfaceTextureDestroyed, surface:" + surface.hashCode(), new java.lang.Object[0]);
        this.f213283e.b();
        um5.p pVar = this.f213283e;
        com.tencent.mm.xeffect.effect.EffectManager effectManager = pVar.f429193b;
        um5.e eVar = pVar.A;
        um5.p pVar2 = new um5.p();
        this.f213283e = pVar2;
        pVar2.n(eVar);
        um5.p pVar3 = this.f213283e;
        pVar3.getClass();
        kotlin.jvm.internal.o.g(effectManager, "<set-?>");
        pVar3.f429193b = effectManager;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        xm5.b.c(this.f213282d, "onSurfaceTextureSizeChanged, surface:" + surface.hashCode() + ", size:[" + i17 + ", " + i18 + ']', new java.lang.Object[0]);
        this.f213283e.j(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }

    public final void setInputBitmap(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        xm5.b.c(this.f213282d, "setInputBitmap: " + bitmap + ", size:[" + bitmap.getWidth() + ',' + bitmap.getHeight() + ']', new java.lang.Object[0]);
        this.f213283e.l(bitmap);
    }

    public final void setSurfaceCallback(um5.e eVar) {
        this.f213283e.n(eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectRenderView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f213282d = "EffectRenderView@" + hashCode();
        this.f213283e = new um5.p();
        setSurfaceTextureListener(this);
        getReportData().f429212a = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectRenderView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f213282d = "EffectRenderView@" + hashCode();
        this.f213283e = new um5.p();
        setSurfaceTextureListener(this);
        getReportData().f429212a = 2;
    }
}
