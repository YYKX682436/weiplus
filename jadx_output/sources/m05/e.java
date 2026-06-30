package m05;

/* loaded from: classes.dex */
public abstract class e {
    public static final android.view.View a(android.view.ViewGroup viewGroup, int i17, java.lang.String str, int i18) {
        android.view.View a17;
        if (i18 > 200) {
            com.tencent.mars.xlog.Log.w("ViewTookit", "over max recurrence");
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = viewGroup.getChildAt(i19);
            if (childAt != null) {
                if (kotlin.jvm.internal.o.b(childAt.getTag(i17), str)) {
                    return childAt;
                }
                if ((childAt instanceof android.view.ViewGroup) && (a17 = a((android.view.ViewGroup) childAt, i17, str, i18 + 1)) != null) {
                    return a17;
                }
            }
        }
        return null;
    }
}
