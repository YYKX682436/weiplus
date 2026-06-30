package db5;

/* loaded from: classes15.dex */
public class y8 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View[] f228584a = new android.view.View[0];

    /* renamed from: b, reason: collision with root package name */
    public final int[] f228585b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public android.util.SparseArray[] f228586c;

    /* renamed from: d, reason: collision with root package name */
    public int f228587d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.SparseArray f228588e;

    public static android.view.View a(android.util.SparseArray sparseArray, int i17) {
        int size = sparseArray.size();
        if (size <= 0) {
            return null;
        }
        for (int i18 = 0; i18 < size; i18++) {
            int keyAt = sparseArray.keyAt(i18);
            android.view.View view = (android.view.View) sparseArray.get(keyAt);
            if (keyAt == i17) {
                sparseArray.remove(keyAt);
                return view;
            }
        }
        int i19 = size - 1;
        android.view.View view2 = (android.view.View) sparseArray.valueAt(i19);
        sparseArray.remove(sparseArray.keyAt(i19));
        return view2;
    }
}
