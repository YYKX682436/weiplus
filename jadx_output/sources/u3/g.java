package u3;

/* loaded from: classes13.dex */
public final class g extends u3.r {
    public g(java.lang.String str) {
        super(str, null);
    }

    @Override // u3.t
    public float a(java.lang.Object obj) {
        return ((android.view.View) obj).getAlpha();
    }

    @Override // u3.t
    public void b(java.lang.Object obj, float f17) {
        android.view.View view = (android.view.View) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/dynamicanimation/animation/DynamicAnimation$12", "setValue", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "androidx/dynamicanimation/animation/DynamicAnimation$12", "setValue", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
