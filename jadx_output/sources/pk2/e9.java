package pk2;

/* loaded from: classes3.dex */
public final class e9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f355712a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f355713b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f355714c;

    public e9(java.util.List items, java.lang.String title, android.view.View view, int i17, kotlin.jvm.internal.i iVar) {
        items = (i17 & 1) != 0 ? new java.util.ArrayList() : items;
        title = (i17 & 2) != 0 ? "" : title;
        view = (i17 & 4) != 0 ? null : view;
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(title, "title");
        this.f355712a = items;
        this.f355713b = title;
        this.f355714c = view;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk2.e9)) {
            return false;
        }
        pk2.e9 e9Var = (pk2.e9) obj;
        return kotlin.jvm.internal.o.b(this.f355712a, e9Var.f355712a) && kotlin.jvm.internal.o.b(this.f355713b, e9Var.f355713b) && kotlin.jvm.internal.o.b(this.f355714c, e9Var.f355714c);
    }

    public int hashCode() {
        int hashCode = ((this.f355712a.hashCode() * 31) + this.f355713b.hashCode()) * 31;
        android.view.View view = this.f355714c;
        return hashCode + (view == null ? 0 : view.hashCode());
    }

    public java.lang.String toString() {
        return "MenuLevelConfig(items=" + this.f355712a + ", title=" + this.f355713b + ", customWidget=" + this.f355714c + ')';
    }
}
