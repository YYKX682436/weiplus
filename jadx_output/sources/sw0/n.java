package sw0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f413443a;

    /* renamed from: b, reason: collision with root package name */
    public final sw0.f f413444b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f413445c;

    public n(java.lang.String text, sw0.f page, android.view.View view) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(view, "view");
        this.f413443a = text;
        this.f413444b = page;
        this.f413445c = view;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.n)) {
            return false;
        }
        sw0.n nVar = (sw0.n) obj;
        return kotlin.jvm.internal.o.b(this.f413443a, nVar.f413443a) && this.f413444b == nVar.f413444b && kotlin.jvm.internal.o.b(this.f413445c, nVar.f413445c);
    }

    public int hashCode() {
        return (((this.f413443a.hashCode() * 31) + this.f413444b.hashCode()) * 31) + this.f413445c.hashCode();
    }

    public java.lang.String toString() {
        return "TextTabItem(text=" + this.f413443a + ", page=" + this.f413444b + ", view=" + this.f413445c + ')';
    }
}
