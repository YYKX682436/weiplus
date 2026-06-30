package jb5;

/* loaded from: classes13.dex */
public final class b extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.blur.mask.AbstractBlurMaskView f298862a;

    public b(com.tencent.mm.ui.blur.mask.AbstractBlurMaskView abstractBlurMaskView) {
        this.f298862a = abstractBlurMaskView;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(outline, "outline");
        android.graphics.drawable.Drawable background = this.f298862a.getBackground();
        if (background != null) {
            background.getOutline(outline);
        }
        outline.setAlpha(1.0f);
    }
}
