package nv2;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f340623a;

    public x() {
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(new java.util.HashSet());
        kotlin.jvm.internal.o.f(synchronizedSet, "synchronizedSet(...)");
        this.f340623a = synchronizedSet;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f340623a.iterator();
        while (it.hasNext()) {
            sb6.append(((java.lang.String) it.next()) + ';');
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
