package kotlinx.coroutines;

/* loaded from: classes5.dex */
public final class x0 extends oz5.a {

    /* renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.w0 f310695e = new kotlinx.coroutines.w0(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f310696d;

    public x0(java.lang.String str) {
        super(f310695e);
        this.f310696d = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kotlinx.coroutines.x0) && kotlin.jvm.internal.o.b(this.f310696d, ((kotlinx.coroutines.x0) obj).f310696d);
    }

    public int hashCode() {
        return this.f310696d.hashCode();
    }

    public java.lang.String toString() {
        return "CoroutineName(" + this.f310696d + ')';
    }
}
