package jj2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f299974a;

    /* renamed from: b, reason: collision with root package name */
    public int f299975b;

    /* renamed from: c, reason: collision with root package name */
    public float f299976c;

    /* renamed from: d, reason: collision with root package name */
    public final int f299977d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint.Style f299978e;

    public d(int i17, int i18, float f17, int i19, android.graphics.Paint.Style style) {
        kotlin.jvm.internal.o.g(style, "style");
        this.f299974a = i17;
        this.f299975b = i18;
        this.f299976c = f17;
        this.f299977d = i19;
        this.f299978e = style;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj2.d)) {
            return false;
        }
        jj2.d dVar = (jj2.d) obj;
        return this.f299974a == dVar.f299974a && this.f299975b == dVar.f299975b && java.lang.Float.compare(this.f299976c, dVar.f299976c) == 0 && this.f299977d == dVar.f299977d && this.f299978e == dVar.f299978e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f299974a) * 31) + java.lang.Integer.hashCode(this.f299975b)) * 31) + java.lang.Float.hashCode(this.f299976c)) * 31) + java.lang.Integer.hashCode(this.f299977d)) * 31) + this.f299978e.hashCode();
    }

    public java.lang.String toString() {
        return "AnimateData(strokeWidth=" + this.f299974a + ", circleColor=" + this.f299975b + ", initRadius=" + this.f299976c + ", initAlpha=" + this.f299977d + ", style=" + this.f299978e + ')';
    }
}
