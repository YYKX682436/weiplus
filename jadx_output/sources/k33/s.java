package k33;

/* loaded from: classes5.dex */
public final class s implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f303881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar f303882e;

    public s(yz5.a aVar, com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar touchableGalleryScrollBar) {
        this.f303881d = aVar;
        this.f303882e = touchableGalleryScrollBar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        yz5.a aVar = this.f303881d;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar touchableGalleryScrollBar = this.f303882e;
        touchableGalleryScrollBar.post(new k33.r(touchableGalleryScrollBar));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
