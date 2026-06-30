package kotlin.jvm.internal;

/* loaded from: classes11.dex */
public final class w implements kotlin.jvm.internal.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f310127d;

    public w(java.lang.Class jClass, java.lang.String moduleName) {
        kotlin.jvm.internal.o.g(jClass, "jClass");
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        this.f310127d = jClass;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof kotlin.jvm.internal.w) {
            if (kotlin.jvm.internal.o.b(this.f310127d, ((kotlin.jvm.internal.w) obj).f310127d)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public java.lang.Class f() {
        return this.f310127d;
    }

    public int hashCode() {
        return this.f310127d.hashCode();
    }

    public java.lang.String toString() {
        return this.f310127d.toString() + " (Kotlin reflection is not available)";
    }
}
