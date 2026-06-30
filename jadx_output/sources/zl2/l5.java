package zl2;

/* loaded from: classes3.dex */
public final class l5 {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.l5 f473884a = new zl2.l5();

    public final void a(android.view.View view, int i17, java.lang.StringBuilder sb6) {
        java.lang.String str;
        java.lang.String s17 = r26.i0.s("  ", i17);
        java.lang.String simpleName = view.getClass().getSimpleName();
        int id6 = view.getId();
        if (id6 == -1) {
            str = null;
        } else {
            try {
                str = view.getResources().getResourceEntryName(id6);
            } catch (java.lang.Exception unused) {
                str = "0x" + java.lang.Integer.toHexString(id6);
            }
        }
        int visibility = view.getVisibility();
        char c17 = visibility != 0 ? visibility != 4 ? visibility != 8 ? '?' : 'G' : 'I' : 'V';
        java.lang.String str2 = view instanceof android.view.ViewStub ? " [STUB]" : "";
        if (str != null) {
            sb6.append(s17 + simpleName + "(@" + str + ") " + c17 + str2);
            sb6.append('\n');
        } else {
            sb6.append(s17 + simpleName + ' ' + c17 + str2);
            sb6.append('\n');
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = viewGroup.getChildAt(i18);
                if (childAt != null) {
                    a(childAt, i17 + 1, sb6);
                }
            }
        }
    }
}
