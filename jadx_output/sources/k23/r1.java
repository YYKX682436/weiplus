package k23;

/* loaded from: classes12.dex */
public final class r1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303682d;

    public r1(k23.j2 j2Var) {
        this.f303682d = j2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.ui.widget.imageview.WeImageView leftKeyboardIcon;
        com.tencent.mm.ui.widget.imageview.WeImageView leftKeyboardIcon2;
        kotlin.jvm.internal.o.g(animation, "animation");
        k23.j2 j2Var = this.f303682d;
        leftKeyboardIcon = j2Var.getLeftKeyboardIcon();
        leftKeyboardIcon.setVisibility(8);
        leftKeyboardIcon2 = j2Var.getLeftKeyboardIcon();
        leftKeyboardIcon2.setAlpha(1.0f);
    }
}
