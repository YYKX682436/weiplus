package ns2;

/* loaded from: classes2.dex */
public abstract class o implements ns2.l {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f339414a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f339415b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f339416c;

    public o(androidx.appcompat.app.AppCompatActivity activity, androidx.fragment.app.Fragment fragment, java.util.List list, java.util.List list2, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        fragment = (i17 & 2) != 0 ? null : fragment;
        list = (i17 & 4) != 0 ? null : list;
        list2 = (i17 & 8) != 0 ? null : list2;
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f339414a = activity;
        this.f339415b = fragment;
        this.f339416c = new java.util.ArrayList();
        b(list2, list);
    }

    public void b(java.util.List list, java.util.List list2) {
        android.view.View findViewById;
        java.util.List list3 = this.f339416c;
        if (list != null) {
            ((java.util.ArrayList) list3).addAll(list);
        }
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                androidx.fragment.app.Fragment fragment = this.f339415b;
                if (fragment != null) {
                    android.view.View view = fragment.getView();
                    findViewById = view != null ? view.findViewById(intValue) : null;
                } else {
                    findViewById = this.f339414a.findViewById(intValue);
                }
                if (findViewById != null) {
                    ((java.util.ArrayList) list3).add(findViewById);
                }
            }
        }
    }
}
