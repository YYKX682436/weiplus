package i06;

/* loaded from: classes5.dex */
public final class p4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f286723a;

    /* renamed from: b, reason: collision with root package name */
    public final int f286724b;

    public p4(java.lang.ClassLoader classLoader) {
        kotlin.jvm.internal.o.g(classLoader, "classLoader");
        this.f286723a = new java.lang.ref.WeakReference(classLoader);
        this.f286724b = java.lang.System.identityHashCode(classLoader);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof i06.p4) && this.f286723a.get() == ((i06.p4) obj).f286723a.get();
    }

    public int hashCode() {
        return this.f286724b;
    }

    public java.lang.String toString() {
        java.lang.String obj;
        java.lang.ClassLoader classLoader = (java.lang.ClassLoader) this.f286723a.get();
        return (classLoader == null || (obj = classLoader.toString()) == null) ? "<null>" : obj;
    }
}
