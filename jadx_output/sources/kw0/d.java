package kw0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f312798a;

    /* renamed from: b, reason: collision with root package name */
    public final kw0.c f312799b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f312800c;

    public d(java.lang.String text, kw0.c page, android.view.View view) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(view, "view");
        this.f312798a = text;
        this.f312799b = page;
        this.f312800c = view;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw0.d)) {
            return false;
        }
        kw0.d dVar = (kw0.d) obj;
        return kotlin.jvm.internal.o.b(this.f312798a, dVar.f312798a) && this.f312799b == dVar.f312799b && kotlin.jvm.internal.o.b(this.f312800c, dVar.f312800c);
    }

    public int hashCode() {
        return (((this.f312798a.hashCode() * 31) + this.f312799b.hashCode()) * 31) + this.f312800c.hashCode();
    }

    public java.lang.String toString() {
        return "StickerTabItem(text=" + this.f312798a + ", page=" + this.f312799b + ", view=" + this.f312800c + ')';
    }
}
