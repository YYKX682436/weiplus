package t40;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f415468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f415469b;

    public a(java.lang.String str, int i17) {
        this.f415468a = str;
        this.f415469b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t40.a)) {
            return false;
        }
        t40.a aVar = (t40.a) obj;
        return kotlin.jvm.internal.o.b(this.f415468a, aVar.f415468a) && this.f415469b == aVar.f415469b;
    }

    public int hashCode() {
        java.lang.String str = this.f415468a;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f415469b);
    }

    public java.lang.String toString() {
        return "AuthIconParams(authInfoIconUrl=" + this.f415468a + ", authIconType=" + this.f415469b + ')';
    }
}
