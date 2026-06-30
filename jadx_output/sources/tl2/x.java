package tl2;

/* loaded from: classes3.dex */
public final class x extends androidx.transition.Transition {
    @Override // androidx.transition.Transition
    public void g(u4.m1 transitionValues) {
        kotlin.jvm.internal.o.g(transitionValues, "transitionValues");
    }

    @Override // androidx.transition.Transition
    public void j(u4.m1 transitionValues) {
        kotlin.jvm.internal.o.g(transitionValues, "transitionValues");
        java.util.Map values = transitionValues.f424514a;
        kotlin.jvm.internal.o.f(values, "values");
        java.lang.Object tag = transitionValues.f424515b.getTag();
        ((java.util.HashMap) values).put("com.tencent.mm:View:click_listener", tag instanceof android.view.View.OnClickListener ? (android.view.View.OnClickListener) tag : null);
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator n(android.view.ViewGroup sceneRoot, u4.m1 m1Var, u4.m1 m1Var2) {
        android.view.View view;
        java.util.Map map;
        java.util.Map map2;
        kotlin.jvm.internal.o.g(sceneRoot, "sceneRoot");
        if ((((m1Var == null || (map2 = m1Var.f424514a) == null) ? null : ((java.util.HashMap) map2).get("com.tencent.mm:View:click_listener")) instanceof android.view.View.OnClickListener) && m1Var2 != null && (view = m1Var2.f424515b) != null) {
            java.lang.Object obj = (m1Var == null || (map = m1Var.f424514a) == null) ? null : ((java.util.HashMap) map).get("com.tencent.mm:View:click_listener");
            view.setOnClickListener(obj instanceof android.view.View.OnClickListener ? (android.view.View.OnClickListener) obj : null);
        }
        return null;
    }
}
