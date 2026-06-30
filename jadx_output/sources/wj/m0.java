package wj;

/* loaded from: classes12.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f446436a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f446437b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f446438c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f446439d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f446440e;

    /* renamed from: f, reason: collision with root package name */
    public final long f446441f;

    /* renamed from: g, reason: collision with root package name */
    public final long f446442g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f446443h;

    /* renamed from: i, reason: collision with root package name */
    public final long f446444i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f446445j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f446446k;

    public m0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, long j18, java.lang.String str6, long j19, java.lang.String str7, java.lang.String str8, int i17, kotlin.jvm.internal.i iVar) {
        java.lang.String str9 = (i17 & 1) != 0 ? null : str;
        java.lang.String str10 = (i17 & 2) != 0 ? null : str2;
        java.lang.String str11 = (i17 & 4) != 0 ? null : str3;
        java.lang.String str12 = (i17 & 8) != 0 ? null : str4;
        java.lang.String str13 = (i17 & 16) != 0 ? null : str5;
        long j27 = (i17 & 32) != 0 ? 0L : j17;
        long j28 = (i17 & 64) != 0 ? 0L : j18;
        java.lang.String str14 = (i17 & 128) != 0 ? null : str6;
        long j29 = (i17 & 256) == 0 ? j19 : 0L;
        java.lang.String str15 = (i17 & 512) != 0 ? null : str7;
        java.lang.String str16 = (i17 & 1024) == 0 ? str8 : null;
        this.f446436a = str9;
        this.f446437b = str10;
        this.f446438c = str11;
        this.f446439d = str12;
        this.f446440e = str13;
        this.f446441f = j27;
        this.f446442g = j28;
        this.f446443h = str14;
        this.f446444i = j29;
        this.f446445j = str15;
        this.f446446k = str16;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj.m0)) {
            return false;
        }
        wj.m0 m0Var = (wj.m0) obj;
        return kotlin.jvm.internal.o.b(this.f446436a, m0Var.f446436a) && kotlin.jvm.internal.o.b(this.f446437b, m0Var.f446437b) && kotlin.jvm.internal.o.b(this.f446438c, m0Var.f446438c) && kotlin.jvm.internal.o.b(this.f446439d, m0Var.f446439d) && kotlin.jvm.internal.o.b(this.f446440e, m0Var.f446440e) && this.f446441f == m0Var.f446441f && this.f446442g == m0Var.f446442g && kotlin.jvm.internal.o.b(this.f446443h, m0Var.f446443h) && this.f446444i == m0Var.f446444i && kotlin.jvm.internal.o.b(this.f446445j, m0Var.f446445j) && kotlin.jvm.internal.o.b(this.f446446k, m0Var.f446446k);
    }

    public int hashCode() {
        java.lang.String str = this.f446436a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f446437b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f446438c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f446439d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f446440e;
        int hashCode5 = (((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + java.lang.Long.hashCode(this.f446441f)) * 31) + java.lang.Long.hashCode(this.f446442g)) * 31;
        java.lang.String str6 = this.f446443h;
        int hashCode6 = (((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + java.lang.Long.hashCode(this.f446444i)) * 31;
        java.lang.String str7 = this.f446445j;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f446446k;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MagicAdFallbackConfig(hintTxt=" + this.f446436a + ", adDesc=" + this.f446437b + ", imageUrl=" + this.f446438c + ", apkName=" + this.f446439d + ", urlScheme=" + this.f446440e + ", urlSchemeMinAndroidVersion=" + this.f446441f + ", appId=" + this.f446442g + ", appName=" + this.f446443h + ", canvasId=" + this.f446444i + ", canvasDynamicInfo=" + this.f446445j + ", uxinfo=" + this.f446446k + ')';
    }
}
