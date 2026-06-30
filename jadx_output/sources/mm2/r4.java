package mm2;

/* loaded from: classes10.dex */
public final class r4 {

    /* renamed from: a, reason: collision with root package name */
    public int f329376a;

    /* renamed from: b, reason: collision with root package name */
    public int f329377b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f329378c;

    /* renamed from: d, reason: collision with root package name */
    public r45.f02 f329379d;

    public r4(int i17, int i18, boolean z17, r45.f02 lotteryInfo, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        i18 = (i19 & 2) != 0 ? -1 : i18;
        z17 = (i19 & 4) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(lotteryInfo, "lotteryInfo");
        this.f329376a = i17;
        this.f329377b = i18;
        this.f329378c = z17;
        this.f329379d = lotteryInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.r4)) {
            return false;
        }
        mm2.r4 r4Var = (mm2.r4) obj;
        return this.f329376a == r4Var.f329376a && this.f329377b == r4Var.f329377b && this.f329378c == r4Var.f329378c && kotlin.jvm.internal.o.b(this.f329379d, r4Var.f329379d);
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f329376a) * 31) + java.lang.Integer.hashCode(this.f329377b)) * 31) + java.lang.Boolean.hashCode(this.f329378c)) * 31) + this.f329379d.hashCode();
    }

    public java.lang.String toString() {
        return "localStatus:" + this.f329376a + ",localRemainTime:" + this.f329377b + ",haveLottering:" + this.f329378c + ", lotteryInfo:" + pm0.b0.g(this.f329379d);
    }
}
