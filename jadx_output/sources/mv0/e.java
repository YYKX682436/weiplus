package mv0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f331538a;

    /* renamed from: b, reason: collision with root package name */
    public final mv0.d f331539b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f331540c;

    public e(java.lang.String text, mv0.d page, android.view.View view) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(view, "view");
        this.f331538a = text;
        this.f331539b = page;
        this.f331540c = view;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv0.e)) {
            return false;
        }
        mv0.e eVar = (mv0.e) obj;
        return kotlin.jvm.internal.o.b(this.f331538a, eVar.f331538a) && this.f331539b == eVar.f331539b && kotlin.jvm.internal.o.b(this.f331540c, eVar.f331540c);
    }

    public int hashCode() {
        return (((this.f331538a.hashCode() * 31) + this.f331539b.hashCode()) * 31) + this.f331540c.hashCode();
    }

    public java.lang.String toString() {
        return "ToolbarTabItem(text=" + this.f331538a + ", page=" + this.f331539b + ", view=" + this.f331540c + ')';
    }
}
