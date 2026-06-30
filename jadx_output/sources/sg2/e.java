package sg2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f407894a;

    public e(java.lang.String f_tips_icon_png) {
        kotlin.jvm.internal.o.g(f_tips_icon_png, "f_tips_icon_png");
        this.f407894a = f_tips_icon_png;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg2.e) && kotlin.jvm.internal.o.b(this.f407894a, ((sg2.e) obj).f407894a);
    }

    public int hashCode() {
        return this.f407894a.hashCode();
    }

    public java.lang.String toString() {
        return "TipsIconStatus(f_tips_icon_png=" + this.f407894a + ')';
    }
}
