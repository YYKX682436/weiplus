package n3;

/* loaded from: classes13.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.DisplayCutout f334361a;

    public l(android.view.DisplayCutout displayCutout) {
        this.f334361a = displayCutout;
    }

    public int a() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return n3.j.c(this.f334361a);
        }
        return 0;
    }

    public int b() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return n3.j.d(this.f334361a);
        }
        return 0;
    }

    public int c() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return n3.j.e(this.f334361a);
        }
        return 0;
    }

    public int d() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return n3.j.f(this.f334361a);
        }
        return 0;
    }

    public e3.d e() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? e3.d.d(n3.k.b(this.f334361a)) : e3.d.f247043e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3.l.class != obj.getClass()) {
            return false;
        }
        return m3.c.a(this.f334361a, ((n3.l) obj).f334361a);
    }

    public int hashCode() {
        android.view.DisplayCutout displayCutout = this.f334361a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.f334361a + "}";
    }
}
