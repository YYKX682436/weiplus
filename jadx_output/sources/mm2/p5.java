package mm2;

/* loaded from: classes3.dex */
public final class p5 {

    /* renamed from: a, reason: collision with root package name */
    public final zl2.d5 f329349a;

    /* renamed from: b, reason: collision with root package name */
    public final long f329350b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f329351c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f329352d;

    public p5(zl2.d5 noticeType, long j17) {
        kotlin.jvm.internal.o.g(noticeType, "noticeType");
        this.f329349a = noticeType;
        this.f329350b = j17;
        this.f329351c = "";
        this.f329352d = "";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.p5)) {
            return false;
        }
        mm2.p5 p5Var = (mm2.p5) obj;
        return this.f329349a == p5Var.f329349a && this.f329350b == p5Var.f329350b;
    }

    public int hashCode() {
        return (this.f329349a.hashCode() * 31) + java.lang.Long.hashCode(this.f329350b);
    }

    public java.lang.String toString() {
        return "ConsumeDialogShowData(noticeType=" + this.f329349a + ", reachAmountQuota=" + this.f329350b + ')';
    }
}
