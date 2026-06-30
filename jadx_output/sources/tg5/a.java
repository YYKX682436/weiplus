package tg5;

/* loaded from: classes8.dex */
public class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.findmore.preference.ting.TingIconViewTipPreference f419231d;

    public a(com.tencent.mm.ui.findmore.preference.ting.TingIconViewTipPreference tingIconViewTipPreference) {
        this.f419231d = tingIconViewTipPreference;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.ui.findmore.preference.ting.TingIconViewTipPreference tingIconViewTipPreference = this.f419231d;
        if (tingIconViewTipPreference.h() != null) {
            tingIconViewTipPreference.h().setBackground(tingIconViewTipPreference.Y1.getResources().getDrawable(com.tencent.mm.R.drawable.azm));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
