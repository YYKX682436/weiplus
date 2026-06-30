package ht2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f284818a;

    /* renamed from: b, reason: collision with root package name */
    public final int f284819b;

    /* renamed from: c, reason: collision with root package name */
    public final int f284820c;

    public e(java.lang.String key, int i17, int i18) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f284818a = key;
        this.f284819b = i17;
        this.f284820c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht2.e)) {
            return false;
        }
        ht2.e eVar = (ht2.e) obj;
        return kotlin.jvm.internal.o.b(this.f284818a, eVar.f284818a) && this.f284819b == eVar.f284819b && this.f284820c == eVar.f284820c;
    }

    public int hashCode() {
        return (((this.f284818a.hashCode() * 31) + java.lang.Integer.hashCode(this.f284819b)) * 31) + java.lang.Integer.hashCode(this.f284820c);
    }

    public java.lang.String toString() {
        return "{" + this.f284818a + '[' + this.f284819b + ':' + this.f284820c + "]}";
    }
}
