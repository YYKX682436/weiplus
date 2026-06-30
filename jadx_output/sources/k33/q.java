package k33;

/* loaded from: classes5.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f303876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f303877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar f303878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303879g;

    public q(android.util.Size size, android.util.Size size2, com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar touchableGalleryScrollBar, yz5.l lVar) {
        this.f303876d = size;
        this.f303877e = size2;
        this.f303878f = touchableGalleryScrollBar;
        this.f303879g = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float width = this.f303876d.getWidth();
        android.util.Size size = this.f303877e;
        float width2 = width + ((size.getWidth() - r0.getWidth()) * floatValue);
        float height = r0.getHeight() + ((size.getHeight() - r0.getHeight()) * floatValue);
        com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar touchableGalleryScrollBar = this.f303878f;
        touchableGalleryScrollBar.f138680p = width2;
        touchableGalleryScrollBar.f138681q = height;
        touchableGalleryScrollBar.getLayoutParams().width = (int) width2;
        touchableGalleryScrollBar.getLayoutParams().height = (int) height;
        yz5.l lVar = this.f303879g;
        if (lVar != null) {
            lVar.invoke(java.lang.Float.valueOf(floatValue));
        }
        touchableGalleryScrollBar.requestLayout();
        touchableGalleryScrollBar.invalidate();
    }
}
