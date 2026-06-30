package n85;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f335704a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335705b;

    public e(java.util.ArrayList flipItem, int i17) {
        kotlin.jvm.internal.o.g(flipItem, "flipItem");
        this.f335704a = flipItem;
        this.f335705b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n85.e)) {
            return false;
        }
        n85.e eVar = (n85.e) obj;
        return kotlin.jvm.internal.o.b(this.f335704a, eVar.f335704a) && this.f335705b == eVar.f335705b;
    }

    public int hashCode() {
        return (this.f335704a.hashCode() * 31) + java.lang.Integer.hashCode(this.f335705b);
    }

    public java.lang.String toString() {
        return "GalleryData(flipItem=" + this.f335704a + ", position=" + this.f335705b + ')';
    }
}
