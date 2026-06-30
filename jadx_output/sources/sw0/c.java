package sw0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f413419a;

    /* renamed from: b, reason: collision with root package name */
    public final ov0.e f413420b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f413421c;

    public c(java.lang.String text, ov0.e page, android.view.View view) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(view, "view");
        this.f413419a = text;
        this.f413420b = page;
        this.f413421c = view;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.c)) {
            return false;
        }
        sw0.c cVar = (sw0.c) obj;
        return kotlin.jvm.internal.o.b(this.f413419a, cVar.f413419a) && this.f413420b == cVar.f413420b && kotlin.jvm.internal.o.b(this.f413421c, cVar.f413421c);
    }

    public int hashCode() {
        return (((this.f413419a.hashCode() * 31) + this.f413420b.hashCode()) * 31) + this.f413421c.hashCode();
    }

    public java.lang.String toString() {
        return "TextEditTabItem(text=" + this.f413419a + ", page=" + this.f413420b + ", view=" + this.f413421c + ')';
    }
}
