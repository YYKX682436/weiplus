package fa;

/* loaded from: classes3.dex */
public class c0 extends androidx.transition.Transition {
    @Override // androidx.transition.Transition
    public void g(u4.m1 m1Var) {
        android.view.View view = m1Var.f424515b;
        if (view instanceof android.widget.TextView) {
            ((java.util.HashMap) m1Var.f424514a).put("android:textscale:scale", java.lang.Float.valueOf(((android.widget.TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public void j(u4.m1 m1Var) {
        android.view.View view = m1Var.f424515b;
        if (view instanceof android.widget.TextView) {
            ((java.util.HashMap) m1Var.f424514a).put("android:textscale:scale", java.lang.Float.valueOf(((android.widget.TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator n(android.view.ViewGroup viewGroup, u4.m1 m1Var, u4.m1 m1Var2) {
        if (m1Var == null || m1Var2 == null || !(m1Var.f424515b instanceof android.widget.TextView)) {
            return null;
        }
        android.view.View view = m1Var2.f424515b;
        if (!(view instanceof android.widget.TextView)) {
            return null;
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        java.util.Map map = m1Var.f424514a;
        java.util.Map map2 = m1Var2.f424514a;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((java.lang.Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        java.util.HashMap hashMap2 = (java.util.HashMap) map2;
        float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((java.lang.Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new fa.b0(this, textView));
        return ofFloat;
    }
}
