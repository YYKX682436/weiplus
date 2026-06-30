package k50;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f304218a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f304219b;

    /* renamed from: c, reason: collision with root package name */
    public final k50.o0 f304220c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f304221d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f304222e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f304223f;

    public h0(android.graphics.drawable.Drawable drawable, java.lang.String name, k50.o0 selectedApp, java.lang.String str, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(selectedApp, "selectedApp");
        this.f304218a = drawable;
        this.f304219b = name;
        this.f304220c = selectedApp;
        this.f304221d = str;
        this.f304222e = z17;
        this.f304223f = aVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k50.h0)) {
            return false;
        }
        k50.h0 h0Var = (k50.h0) obj;
        return kotlin.jvm.internal.o.b(this.f304218a, h0Var.f304218a) && kotlin.jvm.internal.o.b(this.f304219b, h0Var.f304219b) && this.f304220c == h0Var.f304220c && kotlin.jvm.internal.o.b(this.f304221d, h0Var.f304221d) && this.f304222e == h0Var.f304222e && kotlin.jvm.internal.o.b(this.f304223f, h0Var.f304223f);
    }

    public int hashCode() {
        android.graphics.drawable.Drawable drawable = this.f304218a;
        int hashCode = (((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f304219b.hashCode()) * 31) + this.f304220c.hashCode()) * 31;
        java.lang.String str = this.f304221d;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f304222e)) * 31;
        yz5.a aVar = this.f304223f;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AppItem(icon=" + this.f304218a + ", name=" + this.f304219b + ", selectedApp=" + this.f304220c + ", subtitle=" + this.f304221d + ", isSubtitleBelow=" + this.f304222e + ", onClick=" + this.f304223f + ')';
    }

    public /* synthetic */ h0(android.graphics.drawable.Drawable drawable, java.lang.String str, k50.o0 o0Var, java.lang.String str2, boolean z17, yz5.a aVar, int i17, kotlin.jvm.internal.i iVar) {
        this(drawable, str, o0Var, (i17 & 8) != 0 ? null : str2, (i17 & 16) != 0 ? false : z17, (i17 & 32) != 0 ? null : aVar);
    }
}
