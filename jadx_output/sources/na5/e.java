package na5;

/* loaded from: classes9.dex */
public abstract class e {
    public static android.view.animation.Animation a(android.content.Context context) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAnimationEffectLoader", "hy: context is null.");
            return null;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477727o);
        loadAnimation.setInterpolator(new ta5.i());
        return loadAnimation;
    }
}
