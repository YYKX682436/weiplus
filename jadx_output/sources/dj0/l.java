package dj0;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final dj0.l f232857e = new dj0.l(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f232858a;

    /* renamed from: b, reason: collision with root package name */
    public final int f232859b;

    /* renamed from: c, reason: collision with root package name */
    public final int f232860c;

    /* renamed from: d, reason: collision with root package name */
    public final int f232861d;

    public l(int i17, int i18, int i19, int i27) {
        this.f232858a = i17;
        this.f232859b = i18;
        this.f232860c = i19;
        this.f232861d = i27;
    }

    public static dj0.l a(int i17, int i18, int i19, int i27) {
        return (i17 == 0 && i18 == 0 && i19 == 0 && i27 == 0) ? f232857e : new dj0.l(i17, i18, i19, i27);
    }

    public static dj0.l b(android.graphics.Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dj0.l.class != obj.getClass()) {
            return false;
        }
        dj0.l lVar = (dj0.l) obj;
        return this.f232861d == lVar.f232861d && this.f232858a == lVar.f232858a && this.f232860c == lVar.f232860c && this.f232859b == lVar.f232859b;
    }

    public int hashCode() {
        return (((((this.f232858a * 31) + this.f232859b) * 31) + this.f232860c) * 31) + this.f232861d;
    }

    public java.lang.String toString() {
        return "Insets{left=" + this.f232858a + ", top=" + this.f232859b + ", right=" + this.f232860c + ", bottom=" + this.f232861d + '}';
    }
}
