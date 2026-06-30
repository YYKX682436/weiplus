package ey2;

/* loaded from: classes2.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public int f257493a;

    /* renamed from: b, reason: collision with root package name */
    public int f257494b;

    /* renamed from: c, reason: collision with root package name */
    public int f257495c;

    public r2(int i17, int i18, int i19) {
        this.f257493a = i17;
        this.f257494b = i18;
        this.f257495c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.r2)) {
            return false;
        }
        ey2.r2 r2Var = (ey2.r2) obj;
        return this.f257493a == r2Var.f257493a && this.f257494b == r2Var.f257494b && this.f257495c == r2Var.f257495c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f257493a) * 31) + java.lang.Integer.hashCode(this.f257494b)) * 31) + java.lang.Integer.hashCode(this.f257495c);
    }

    public java.lang.String toString() {
        return "EndStateCache(completePlayCnt=" + this.f257493a + ", completePlayCntInThisPlay=" + this.f257494b + ", maxProgress=" + this.f257495c + ')';
    }
}
