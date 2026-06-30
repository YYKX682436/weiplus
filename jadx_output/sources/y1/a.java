package y1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f458692a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.b f458693b;

    public a(java.lang.String str, jz5.b bVar) {
        this.f458692a = str;
        this.f458693b = bVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1.a)) {
            return false;
        }
        y1.a aVar = (y1.a) obj;
        return kotlin.jvm.internal.o.b(this.f458692a, aVar.f458692a) && kotlin.jvm.internal.o.b(this.f458693b, aVar.f458693b);
    }

    public int hashCode() {
        java.lang.String str = this.f458692a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        jz5.b bVar = this.f458693b;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AccessibilityAction(label=" + this.f458692a + ", action=" + this.f458693b + ')';
    }
}
