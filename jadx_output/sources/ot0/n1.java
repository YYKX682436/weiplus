package ot0;

/* loaded from: classes8.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f348608a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f348609b;

    /* renamed from: c, reason: collision with root package name */
    public final int f348610c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f348611d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f348612e;

    public n1(java.lang.String field, java.lang.String operator, int i17, boolean z17, java.lang.Integer num, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 8) != 0 ? false : z17;
        num = (i18 & 16) != 0 ? null : num;
        kotlin.jvm.internal.o.g(field, "field");
        kotlin.jvm.internal.o.g(operator, "operator");
        this.f348608a = field;
        this.f348609b = operator;
        this.f348610c = i17;
        this.f348611d = z17;
        this.f348612e = num;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot0.n1)) {
            return false;
        }
        ot0.n1 n1Var = (ot0.n1) obj;
        return kotlin.jvm.internal.o.b(this.f348608a, n1Var.f348608a) && kotlin.jvm.internal.o.b(this.f348609b, n1Var.f348609b) && this.f348610c == n1Var.f348610c && this.f348611d == n1Var.f348611d && kotlin.jvm.internal.o.b(this.f348612e, n1Var.f348612e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f348608a.hashCode() * 31) + this.f348609b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f348610c)) * 31) + java.lang.Boolean.hashCode(this.f348611d)) * 31;
        java.lang.Integer num = this.f348612e;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public java.lang.String toString() {
        return "FilterCondition(field=" + this.f348608a + ", operator=" + this.f348609b + ", value=" + this.f348610c + ", isNegated=" + this.f348611d + ", bitMask=" + this.f348612e + ')';
    }
}
