package hr3;

/* loaded from: classes5.dex */
public class rh implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f283957d;

    public rh(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, android.widget.TextView textView) {
        this.f283957d = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f283957d.setTextColor(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
