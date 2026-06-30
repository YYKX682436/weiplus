package n3;

/* loaded from: classes13.dex */
public class k1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f334349d = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public java.util.WeakHashMap f334350a = null;

    /* renamed from: b, reason: collision with root package name */
    public android.util.SparseArray f334351b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f334352c = null;

    public final android.view.View a(android.view.View view, android.view.KeyEvent keyEvent) {
        java.util.WeakHashMap weakHashMap = this.f334350a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    android.view.View a17 = a(viewGroup.getChildAt(childCount), keyEvent);
                    if (a17 != null) {
                        return a17;
                    }
                }
            }
            b(view, keyEvent);
        }
        return null;
    }

    public final boolean b(android.view.View view, android.view.KeyEvent keyEvent) {
        int size;
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(com.tencent.mm.R.id.nxe);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return false;
        }
        android.support.v4.media.f.a(arrayList.get(size));
        throw null;
    }
}
