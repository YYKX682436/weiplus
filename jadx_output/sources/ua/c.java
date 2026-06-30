package ua;

/* loaded from: classes16.dex */
public abstract class c {
    public abstract boolean a(java.lang.Object obj, java.lang.Object obj2);

    public abstract int b(java.lang.Object obj);

    public final boolean c(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }
}
