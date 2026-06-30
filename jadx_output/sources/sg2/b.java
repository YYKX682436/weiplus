package sg2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f407885a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f407886b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f407887c;

    public b(java.lang.String f_color_png, java.lang.String f_darkmode_png, java.lang.String f_lightmode_png) {
        kotlin.jvm.internal.o.g(f_color_png, "f_color_png");
        kotlin.jvm.internal.o.g(f_darkmode_png, "f_darkmode_png");
        kotlin.jvm.internal.o.g(f_lightmode_png, "f_lightmode_png");
        this.f407885a = f_color_png;
        this.f407886b = f_darkmode_png;
        this.f407887c = f_lightmode_png;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg2.b)) {
            return false;
        }
        sg2.b bVar = (sg2.b) obj;
        return kotlin.jvm.internal.o.b(this.f407885a, bVar.f407885a) && kotlin.jvm.internal.o.b(this.f407886b, bVar.f407886b) && kotlin.jvm.internal.o.b(this.f407887c, bVar.f407887c);
    }

    public int hashCode() {
        return (((this.f407885a.hashCode() * 31) + this.f407886b.hashCode()) * 31) + this.f407887c.hashCode();
    }

    public java.lang.String toString() {
        return "GestureIconStatus(f_color_png=" + this.f407885a + ", f_darkmode_png=" + this.f407886b + ", f_lightmode_png=" + this.f407887c + ')';
    }
}
