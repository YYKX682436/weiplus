package qn2;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f365122a;

    /* renamed from: b, reason: collision with root package name */
    public final int f365123b;

    /* renamed from: c, reason: collision with root package name */
    public final int f365124c;

    /* renamed from: d, reason: collision with root package name */
    public final int f365125d;

    /* renamed from: e, reason: collision with root package name */
    public final int f365126e;

    public o(int i17, int i18, int i19, int i27, int i28) {
        this.f365122a = i17;
        this.f365123b = i18;
        this.f365124c = i19;
        this.f365125d = i27;
        this.f365126e = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn2.o)) {
            return false;
        }
        qn2.o oVar = (qn2.o) obj;
        return this.f365122a == oVar.f365122a && this.f365123b == oVar.f365123b && this.f365124c == oVar.f365124c && this.f365125d == oVar.f365125d && this.f365126e == oVar.f365126e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f365122a) * 31) + java.lang.Integer.hashCode(this.f365123b)) * 31) + java.lang.Integer.hashCode(this.f365124c)) * 31) + java.lang.Integer.hashCode(this.f365125d)) * 31) + java.lang.Integer.hashCode(this.f365126e);
    }

    public java.lang.String toString() {
        return "GiftLayoutParams(iconSize=" + this.f365122a + ", layoutBottomMargin=" + this.f365123b + ", line1BottomMargin=" + this.f365124c + ", line1InsideItemMargin=" + this.f365125d + ", line2InsideItemMargin=" + this.f365126e + ')';
    }
}
