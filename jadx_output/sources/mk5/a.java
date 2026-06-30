package mk5;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f327161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f327162b;

    /* renamed from: c, reason: collision with root package name */
    public final int f327163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f327164d;

    /* renamed from: e, reason: collision with root package name */
    public final float f327165e;

    public a(java.lang.CharSequence charSequence, int i17, int i18, int i19, float f17) {
        this.f327161a = charSequence;
        this.f327162b = i17;
        this.f327163c = i18;
        this.f327164d = i19;
        this.f327165e = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk5.a)) {
            return false;
        }
        mk5.a aVar = (mk5.a) obj;
        return kotlin.jvm.internal.o.b(this.f327161a, aVar.f327161a) && this.f327162b == aVar.f327162b && this.f327163c == aVar.f327163c && this.f327164d == aVar.f327164d && java.lang.Float.compare(this.f327165e, aVar.f327165e) == 0;
    }

    public int hashCode() {
        java.lang.CharSequence charSequence = this.f327161a;
        return ((((((((charSequence == null ? 0 : charSequence.hashCode()) * 31) + java.lang.Integer.hashCode(this.f327162b)) * 31) + java.lang.Integer.hashCode(this.f327163c)) * 31) + java.lang.Integer.hashCode(this.f327164d)) * 31) + java.lang.Float.hashCode(this.f327165e);
    }

    public java.lang.String toString() {
        return "VasActionBarData(title=" + ((java.lang.Object) this.f327161a) + ", mapBackBtnIconColor=" + this.f327162b + ", backColor=" + this.f327163c + ", textColor=" + this.f327164d + ", titleTextSize=" + this.f327165e + ')';
    }
}
