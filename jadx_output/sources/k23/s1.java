package k23;

/* loaded from: classes12.dex */
public final class s1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303691d;

    public s1(k23.j2 j2Var) {
        this.f303691d = j2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.ui.widget.imageview.WeImageView leftVoiceIcon;
        com.tencent.mm.ui.widget.imageview.WeImageView leftVoiceIcon2;
        kotlin.jvm.internal.o.g(animation, "animation");
        k23.j2 j2Var = this.f303691d;
        leftVoiceIcon = j2Var.getLeftVoiceIcon();
        leftVoiceIcon.setVisibility(8);
        leftVoiceIcon2 = j2Var.getLeftVoiceIcon();
        leftVoiceIcon2.setAlpha(1.0f);
    }
}
