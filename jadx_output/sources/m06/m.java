package m06;

/* loaded from: classes15.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final n16.c f322607a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f322608b;

    public m(n16.c packageFqName, java.lang.String classNamePrefix, boolean z17, n16.b bVar) {
        kotlin.jvm.internal.o.g(packageFqName, "packageFqName");
        kotlin.jvm.internal.o.g(classNamePrefix, "classNamePrefix");
        this.f322607a = packageFqName;
        this.f322608b = classNamePrefix;
    }

    public final n16.g a(int i17) {
        return n16.g.k(this.f322608b + i17);
    }

    public java.lang.String toString() {
        return this.f322607a + '.' + this.f322608b + 'N';
    }
}
