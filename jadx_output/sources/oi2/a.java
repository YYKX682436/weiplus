package oi2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f345610a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f345611b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f345612c;

    /* renamed from: d, reason: collision with root package name */
    public final int f345613d;

    public a(int i17, java.lang.String content, boolean z17, int i18) {
        kotlin.jvm.internal.o.g(content, "content");
        this.f345610a = i17;
        this.f345611b = content;
        this.f345612c = z17;
        this.f345613d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi2.a)) {
            return false;
        }
        oi2.a aVar = (oi2.a) obj;
        return this.f345610a == aVar.f345610a && kotlin.jvm.internal.o.b(this.f345611b, aVar.f345611b) && this.f345612c == aVar.f345612c && this.f345613d == aVar.f345613d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f345610a) * 31) + this.f345611b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f345612c)) * 31) + java.lang.Integer.hashCode(this.f345613d);
    }

    public java.lang.String toString() {
        return "PayMicDataModel(requestType=" + this.f345610a + ", content=" + this.f345611b + ", isAnonymous=" + this.f345612c + ", wecoinCount=" + this.f345613d + ')';
    }
}
