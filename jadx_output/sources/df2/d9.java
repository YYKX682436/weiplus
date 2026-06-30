package df2;

/* loaded from: classes3.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f229955a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f229956b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229957c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f229958d;

    /* renamed from: e, reason: collision with root package name */
    public final int f229959e;

    /* renamed from: f, reason: collision with root package name */
    public final int f229960f;

    public d9(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i17, int i18) {
        this.f229955a = str;
        this.f229956b = str2;
        this.f229957c = str3;
        this.f229958d = num;
        this.f229959e = i17;
        this.f229960f = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2.d9)) {
            return false;
        }
        df2.d9 d9Var = (df2.d9) obj;
        return kotlin.jvm.internal.o.b(this.f229955a, d9Var.f229955a) && kotlin.jvm.internal.o.b(this.f229956b, d9Var.f229956b) && kotlin.jvm.internal.o.b(this.f229957c, d9Var.f229957c) && kotlin.jvm.internal.o.b(this.f229958d, d9Var.f229958d) && this.f229959e == d9Var.f229959e && this.f229960f == d9Var.f229960f;
    }

    public int hashCode() {
        java.lang.String str = this.f229955a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f229956b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f229957c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Integer num = this.f229958d;
        return ((((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f229959e)) * 31) + java.lang.Integer.hashCode(this.f229960f);
    }

    public java.lang.String toString() {
        return "GuideBubbleInfo(title=" + this.f229955a + ", desc=" + this.f229956b + ", btnText=" + this.f229957c + ", btnIconResId=" + this.f229958d + ", btnBgRes=" + this.f229959e + ", btnTextColorRes=" + this.f229960f + ')';
    }

    public /* synthetic */ d9(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(str, str2, str3, num, (i19 & 16) != 0 ? com.tencent.mm.R.drawable.csa : i17, (i19 & 32) != 0 ? com.tencent.mm.R.color.UN_BW_0_Alpha_0_9 : i18);
    }
}
