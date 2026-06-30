package rs;

/* loaded from: classes3.dex */
public abstract class l {
    public static void a(android.view.View view) {
        n3.l1.m(view, 1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(view.getMeasuredHeight() / 2);
        view.setPivotX(view.getMeasuredWidth() / 2);
        java.lang.ref.WeakReference weakReference = n3.l1.a(view).f334454a;
        android.view.View view2 = (android.view.View) weakReference.get();
        if (view2 != null) {
            view2.animate().setInterpolator(null);
        }
        android.view.View view3 = (android.view.View) weakReference.get();
        if (view3 != null) {
            view3.animate().setStartDelay(0L);
        }
    }
}
