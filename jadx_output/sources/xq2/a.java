package xq2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f456029a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f456030b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f456031c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f456032d;

    /* renamed from: e, reason: collision with root package name */
    public int f456033e;

    /* renamed from: f, reason: collision with root package name */
    public int f456034f;

    /* renamed from: g, reason: collision with root package name */
    public long f456035g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yz2 f456036h;

    public a(java.lang.String themeId, java.lang.String themeTag) {
        kotlin.jvm.internal.o.g(themeId, "themeId");
        kotlin.jvm.internal.o.g(themeTag, "themeTag");
        this.f456029a = themeId;
        this.f456030b = themeTag;
        this.f456031c = new java.util.LinkedList();
        this.f456032d = new java.util.LinkedList();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq2.a)) {
            return false;
        }
        xq2.a aVar = (xq2.a) obj;
        return kotlin.jvm.internal.o.b(this.f456029a, aVar.f456029a) && kotlin.jvm.internal.o.b(this.f456030b, aVar.f456030b);
    }

    public int hashCode() {
        return (this.f456029a.hashCode() * 31) + this.f456030b.hashCode();
    }

    public java.lang.String toString() {
        return "Cache(themeId=" + this.f456029a + ", themeTag=" + this.f456030b + ')';
    }
}
