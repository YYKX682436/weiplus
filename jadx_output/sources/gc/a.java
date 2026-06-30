package gc;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f270080a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f270081b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f270082c;

    public a(int i17, java.lang.String username, android.graphics.Rect rect) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(rect, "rect");
        this.f270080a = i17;
        this.f270081b = username;
        this.f270082c = rect;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc.a)) {
            return false;
        }
        gc.a aVar = (gc.a) obj;
        return this.f270080a == aVar.f270080a && kotlin.jvm.internal.o.b(this.f270081b, aVar.f270081b) && kotlin.jvm.internal.o.b(this.f270082c, aVar.f270082c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f270080a) * 31) + this.f270081b.hashCode()) * 31) + this.f270082c.hashCode();
    }

    public java.lang.String toString() {
        return "LayoutInfo(idx=" + this.f270080a + ", username=" + this.f270081b + ", rect=" + this.f270082c + ')';
    }
}
