package pn2;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f356985a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f356986b;

    /* renamed from: c, reason: collision with root package name */
    public int f356987c;

    /* renamed from: d, reason: collision with root package name */
    public int f356988d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f356989e;

    public d0(boolean z17, boolean z18, int i17, int i18, boolean z19, int i19, kotlin.jvm.internal.i iVar) {
        z17 = (i19 & 1) != 0 ? false : z17;
        z18 = (i19 & 2) != 0 ? false : z18;
        i17 = (i19 & 4) != 0 ? 0 : i17;
        i18 = (i19 & 8) != 0 ? 0 : i18;
        z19 = (i19 & 16) != 0 ? false : z19;
        this.f356985a = z17;
        this.f356986b = z18;
        this.f356987c = i17;
        this.f356988d = i18;
        this.f356989e = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn2.d0)) {
            return false;
        }
        pn2.d0 d0Var = (pn2.d0) obj;
        return this.f356985a == d0Var.f356985a && this.f356986b == d0Var.f356986b && this.f356987c == d0Var.f356987c && this.f356988d == d0Var.f356988d && this.f356989e == d0Var.f356989e;
    }

    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.f356985a) * 31) + java.lang.Boolean.hashCode(this.f356986b)) * 31) + java.lang.Integer.hashCode(this.f356987c)) * 31) + java.lang.Integer.hashCode(this.f356988d)) * 31) + java.lang.Boolean.hashCode(this.f356989e);
    }

    public java.lang.String toString() {
        return "LotteryUpdateStatus localStatus:" + this.f356987c + ",lotteryStatus:" + this.f356988d + ",statusChange:" + this.f356985a + ",newLottery:" + this.f356986b + ",resumeState:" + this.f356989e;
    }
}
