package vk0;

/* loaded from: classes.dex */
public class d extends java.lang.ref.WeakReference {
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vk0.d)) {
            return false;
        }
        java.lang.Object obj2 = ((vk0.d) obj).get();
        T t17 = get();
        if (obj2 != t17) {
            return t17 != 0 && t17.equals(obj2);
        }
        return true;
    }
}
