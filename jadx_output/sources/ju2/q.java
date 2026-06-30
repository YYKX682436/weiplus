package ju2;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f301830a;

    /* renamed from: b, reason: collision with root package name */
    public final long f301831b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f301832c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f301833d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f301834e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Float f301835f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f301836g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f301837h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f301838i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Integer f301839j;

    public q(int i17, long j17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Float f17, java.lang.Integer num4, java.lang.String str, java.lang.Integer num5, java.lang.Integer num6, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        j17 = (i18 & 2) != 0 ? 0L : j17;
        num = (i18 & 4) != 0 ? null : num;
        num2 = (i18 & 8) != 0 ? null : num2;
        num3 = (i18 & 16) != 0 ? null : num3;
        f17 = (i18 & 32) != 0 ? null : f17;
        num4 = (i18 & 64) != 0 ? null : num4;
        str = (i18 & 128) != 0 ? null : str;
        num5 = (i18 & 256) != 0 ? null : num5;
        num6 = (i18 & 512) != 0 ? null : num6;
        this.f301830a = i17;
        this.f301831b = j17;
        this.f301832c = num;
        this.f301833d = num2;
        this.f301834e = num3;
        this.f301835f = f17;
        this.f301836g = num4;
        this.f301837h = str;
        this.f301838i = num5;
        this.f301839j = num6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju2.q)) {
            return false;
        }
        ju2.q qVar = (ju2.q) obj;
        return this.f301830a == qVar.f301830a && this.f301831b == qVar.f301831b && kotlin.jvm.internal.o.b(this.f301832c, qVar.f301832c) && kotlin.jvm.internal.o.b(this.f301833d, qVar.f301833d) && kotlin.jvm.internal.o.b(this.f301834e, qVar.f301834e) && kotlin.jvm.internal.o.b(this.f301835f, qVar.f301835f) && kotlin.jvm.internal.o.b(this.f301836g, qVar.f301836g) && kotlin.jvm.internal.o.b(this.f301837h, qVar.f301837h) && kotlin.jvm.internal.o.b(this.f301838i, qVar.f301838i) && kotlin.jvm.internal.o.b(this.f301839j, qVar.f301839j);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f301830a) * 31) + java.lang.Long.hashCode(this.f301831b)) * 31;
        java.lang.Integer num = this.f301832c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f301833d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f301834e;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.Float f17 = this.f301835f;
        int hashCode5 = (hashCode4 + (f17 == null ? 0 : f17.hashCode())) * 31;
        java.lang.Integer num4 = this.f301836g;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        java.lang.String str = this.f301837h;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num5 = this.f301838i;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        java.lang.Integer num6 = this.f301839j;
        return hashCode8 + (num6 != null ? num6.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderThanksButtonConfig(iconType=" + this.f301830a + ", magicEmojiId=" + this.f301831b + ", backgroundColor=" + this.f301832c + ", titleTextColor=" + this.f301833d + ", thankedTitleTextColor=" + this.f301834e + ", titleTextSize=" + this.f301835f + ", titleTextWeight=" + this.f301836g + ", defaultTitleStr=" + this.f301837h + ", defaultThankImgColor=" + this.f301838i + ", defaultThankImgResId=" + this.f301839j + ')';
    }
}
