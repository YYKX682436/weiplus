package zn0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f474291a;

    /* renamed from: b, reason: collision with root package name */
    public final int f474292b;

    /* renamed from: c, reason: collision with root package name */
    public final int f474293c;

    /* renamed from: d, reason: collision with root package name */
    public final int f474294d;

    /* renamed from: e, reason: collision with root package name */
    public final int f474295e;

    /* renamed from: f, reason: collision with root package name */
    public final int f474296f;

    public a(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f474291a = i17;
        this.f474292b = i18;
        this.f474293c = i19;
        this.f474294d = i27;
        this.f474295e = i28;
        this.f474296f = i29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn0.a)) {
            return false;
        }
        zn0.a aVar = (zn0.a) obj;
        return this.f474291a == aVar.f474291a && this.f474292b == aVar.f474292b && this.f474293c == aVar.f474293c && this.f474294d == aVar.f474294d && this.f474295e == aVar.f474295e && this.f474296f == aVar.f474296f;
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.f474291a) * 31) + java.lang.Integer.hashCode(this.f474292b)) * 31) + java.lang.Integer.hashCode(this.f474293c)) * 31) + java.lang.Integer.hashCode(this.f474294d)) * 31) + java.lang.Integer.hashCode(this.f474295e)) * 31) + java.lang.Integer.hashCode(this.f474296f);
    }

    public java.lang.String toString() {
        return "NormalFocusModel(micWidth=" + this.f474291a + ", micHeight=" + this.f474292b + ", offestMargin=" + this.f474293c + ", micRightMargin=" + this.f474294d + ", micTopMargin=" + this.f474295e + ", micMargin=" + this.f474296f + ')';
    }
}
