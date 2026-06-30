package uy3;

/* loaded from: classes8.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.box.BaseBoxDialogView f431967d;

    public l(com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView) {
        this.f431967d = baseBoxDialogView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = this.f431967d;
        android.view.View view = baseBoxDialogView.f158690n;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        baseBoxDialogView.f158708z = view.getTranslationY();
        android.view.View view2 = baseBoxDialogView.f158690n;
        if (view2 != null) {
            baseBoxDialogView.i(view2.getTranslationY());
        } else {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
    }
}
