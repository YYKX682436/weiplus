package r81;

/* loaded from: classes4.dex */
public abstract class e extends android.util.SparseIntArray {
    public int a(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        return super.get(obj.hashCode(), -1);
    }

    public void b(java.lang.Object obj, int i17) {
        if (obj == null) {
            return;
        }
        super.put(obj.hashCode(), i17);
    }
}
