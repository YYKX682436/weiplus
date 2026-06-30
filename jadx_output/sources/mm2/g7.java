package mm2;

/* loaded from: classes3.dex */
public final class g7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f329094a;

    /* renamed from: b, reason: collision with root package name */
    public final int f329095b;

    /* renamed from: c, reason: collision with root package name */
    public final int f329096c;

    /* renamed from: d, reason: collision with root package name */
    public final int f329097d;

    public g7(int i17, int i18, int i19, int i27) {
        this.f329094a = i17;
        this.f329095b = i18;
        this.f329096c = i19;
        this.f329097d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.g7)) {
            return false;
        }
        mm2.g7 g7Var = (mm2.g7) obj;
        return this.f329094a == g7Var.f329094a && this.f329095b == g7Var.f329095b && this.f329096c == g7Var.f329096c && this.f329097d == g7Var.f329097d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f329094a) * 31) + java.lang.Integer.hashCode(this.f329095b)) * 31) + java.lang.Integer.hashCode(this.f329096c)) * 31) + java.lang.Integer.hashCode(this.f329097d);
    }

    public java.lang.String toString() {
        return "IndicatorData(pos=" + this.f329094a + ", viewX=" + this.f329095b + ", viewY=" + this.f329096c + ", viewHeight=" + this.f329097d + ')';
    }
}
