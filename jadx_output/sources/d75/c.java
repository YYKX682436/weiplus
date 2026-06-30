package d75;

/* loaded from: classes3.dex */
public final class c extends java.lang.ref.WeakReference {
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof d75.c)) {
            return false;
        }
        d75.c cVar = (d75.c) obj;
        if (cVar.get() == 0 && get() == 0) {
            return hashCode() == cVar.hashCode();
        }
        T t17 = get();
        return t17 != 0 && t17.equals(cVar.get());
    }

    public int hashCode() {
        T t17 = get();
        return t17 != 0 ? t17.hashCode() : super.hashCode();
    }
}
