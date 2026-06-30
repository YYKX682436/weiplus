package jb5;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f298865a;

    /* renamed from: b, reason: collision with root package name */
    public final int f298866b;

    /* renamed from: c, reason: collision with root package name */
    public final int f298867c;

    /* renamed from: d, reason: collision with root package name */
    public final int f298868d;

    public h(int i17, int i18, int i19, int i27) {
        this.f298865a = i17;
        this.f298866b = i18;
        this.f298867c = i19;
        this.f298868d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb5.h)) {
            return false;
        }
        jb5.h hVar = (jb5.h) obj;
        return this.f298865a == hVar.f298865a && this.f298866b == hVar.f298866b && this.f298867c == hVar.f298867c && this.f298868d == hVar.f298868d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f298865a) * 31) + java.lang.Integer.hashCode(this.f298866b)) * 31) + java.lang.Integer.hashCode(this.f298867c)) * 31) + java.lang.Integer.hashCode(this.f298868d);
    }

    public java.lang.String toString() {
        return "ViewPosition(x=" + this.f298865a + ", y=" + this.f298866b + ", width=" + this.f298867c + ", height=" + this.f298868d + ')';
    }
}
