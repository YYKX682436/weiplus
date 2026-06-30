package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/view/LazyPlayPAGView;", "Lcom/tencent/mm/view/MMPAGView;", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "Ljz5/f0;", "setComposition", "Lorg/libpag/PAGFile;", "pagFile", "Lcom/tencent/mm/rfx/RfxPagFile;", "rfxPagFile", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LazyPlayPAGView extends com.tencent.mm.view.MMPAGView {

    /* renamed from: w, reason: collision with root package name */
    public boolean f213324w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f213325x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LazyPlayPAGView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.view.MMPAGView
    public boolean f() {
        return this.f213324w || super.f();
    }

    @Override // com.tencent.mm.view.MMPAGView
    public void g() {
        if (this.f213325x) {
            super.g();
        } else {
            this.f213324w = true;
        }
    }

    @Override // com.tencent.mm.view.MMPAGView
    public void k(android.content.res.AssetManager assetManager, java.lang.String path) {
        kotlin.jvm.internal.o.g(assetManager, "assetManager");
        kotlin.jvm.internal.o.g(path, "path");
        super.k(assetManager, path);
        p();
    }

    @Override // com.tencent.mm.view.MMPAGView
    public void n() {
        this.f213324w = false;
        super.n();
    }

    public final void p() {
        this.f213325x = (getUseRfx() ? getRfxComposition() : getComposition()) != null;
        com.tencent.mars.xlog.Log.i("LazyPlayPAGView", "onCompositionUpdated: " + this.f213325x);
        if (this.f213324w && this.f213325x) {
            this.f213324w = false;
            super.g();
        }
    }

    @Override // com.tencent.mm.view.MMPAGView
    public void setComposition(java.lang.String str) {
        super.setComposition(str);
        p();
    }

    public /* synthetic */ LazyPlayPAGView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPlayPAGView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.view.MMPAGView
    public void setComposition(org.libpag.PAGFile pAGFile) {
        super.setComposition(pAGFile);
        p();
    }

    @Override // com.tencent.mm.view.MMPAGView
    public void setComposition(com.tencent.mm.rfx.RfxPagFile rfxPagFile) {
        super.setComposition(rfxPagFile);
        p();
    }
}
