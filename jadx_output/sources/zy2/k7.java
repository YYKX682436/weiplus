package zy2;

/* loaded from: classes2.dex */
public final class k7 {

    /* renamed from: a, reason: collision with root package name */
    public int f477441a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f477442b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f477443c;

    public k7(int i17, boolean z17, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        z17 = (i18 & 2) != 0 ? false : z17;
        z18 = (i18 & 4) != 0 ? false : z18;
        this.f477441a = i17;
        this.f477442b = z17;
        this.f477443c = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.k7)) {
            return false;
        }
        zy2.k7 k7Var = (zy2.k7) obj;
        return this.f477441a == k7Var.f477441a && this.f477442b == k7Var.f477442b && this.f477443c == k7Var.f477443c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f477441a) * 31) + java.lang.Boolean.hashCode(this.f477442b)) * 31) + java.lang.Boolean.hashCode(this.f477443c);
    }

    public java.lang.String toString() {
        return "AutoScrollTipsStatus(consecutiveCompletePlayCnt=" + this.f477441a + ", enableAutoScrollItemHighLight=" + this.f477442b + ", hasFeedOperate=" + this.f477443c + ')';
    }
}
