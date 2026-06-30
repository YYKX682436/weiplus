package mm2;

/* loaded from: classes3.dex */
public final class s5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f329415a;

    /* renamed from: b, reason: collision with root package name */
    public final int f329416b;

    /* renamed from: c, reason: collision with root package name */
    public final dk2.g f329417c;

    /* renamed from: d, reason: collision with root package name */
    public final int f329418d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f329419e;

    public s5(java.lang.String curGiftId, int i17, dk2.g comboData, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(curGiftId, "curGiftId");
        kotlin.jvm.internal.o.g(comboData, "comboData");
        this.f329415a = curGiftId;
        this.f329416b = i17;
        this.f329417c = comboData;
        this.f329418d = i18;
        this.f329419e = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.s5)) {
            return false;
        }
        mm2.s5 s5Var = (mm2.s5) obj;
        return kotlin.jvm.internal.o.b(this.f329415a, s5Var.f329415a) && this.f329416b == s5Var.f329416b && kotlin.jvm.internal.o.b(this.f329417c, s5Var.f329417c) && this.f329418d == s5Var.f329418d && this.f329419e == s5Var.f329419e;
    }

    public int hashCode() {
        return (((((((this.f329415a.hashCode() * 31) + java.lang.Integer.hashCode(this.f329416b)) * 31) + this.f329417c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f329418d)) * 31) + java.lang.Boolean.hashCode(this.f329419e);
    }

    public java.lang.String toString() {
        return "QuotaSendGiftData(curGiftId=" + this.f329415a + ", clickCnt=" + this.f329416b + ", comboData=" + this.f329417c + ", diffCnt=" + this.f329418d + ", isFromPatchSend=" + this.f329419e + ')';
    }
}
