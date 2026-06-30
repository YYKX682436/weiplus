package w9;

/* loaded from: classes.dex */
public class d extends android.util.Property {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.Property f444040a = new w9.d("childrenAlpha");

    public d(java.lang.String str) {
        super(java.lang.Float.class, str);
    }

    @Override // android.util.Property
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Float f17 = (java.lang.Float) ((android.view.ViewGroup) obj).getTag(com.tencent.mm.R.id.juh);
        return f17 != null ? f17 : java.lang.Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
        float floatValue = ((java.lang.Float) obj2).floatValue();
        viewGroup.setTag(com.tencent.mm.R.id.juh, java.lang.Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(childAt, arrayList.toArray(), "com/google/android/material/animation/ChildrenAlphaProperty", "set", "(Landroid/view/ViewGroup;Ljava/lang/Float;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(childAt, "com/google/android/material/animation/ChildrenAlphaProperty", "set", "(Landroid/view/ViewGroup;Ljava/lang/Float;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
