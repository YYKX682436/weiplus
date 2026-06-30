package no0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f338700a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f338701b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f338702c;

    /* renamed from: d, reason: collision with root package name */
    public final int f338703d;

    /* renamed from: e, reason: collision with root package name */
    public final int f338704e;

    /* renamed from: f, reason: collision with root package name */
    public final int f338705f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f338706g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f338707h;

    /* renamed from: i, reason: collision with root package name */
    public final long f338708i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f338709j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Integer f338710k;

    /* renamed from: l, reason: collision with root package name */
    public final long f338711l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f338712m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f338713n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f338714o;

    public a(long j17, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, java.lang.String str4, long j18, byte[] bArr, java.lang.Integer num, long j19, java.lang.String str5, boolean z17, boolean z18, int i27, kotlin.jvm.internal.i iVar) {
        java.lang.Integer num2 = (i27 & 1024) != 0 ? 0 : num;
        long j27 = (i27 & 2048) != 0 ? 0L : j19;
        java.lang.String str6 = (i27 & 4096) != 0 ? null : str5;
        boolean z19 = (i27 & 8192) != 0 ? false : z17;
        boolean z27 = (i27 & 16384) == 0 ? z18 : false;
        this.f338700a = j17;
        this.f338701b = str;
        this.f338702c = str2;
        this.f338703d = i17;
        this.f338704e = i18;
        this.f338705f = i19;
        this.f338706g = str3;
        this.f338707h = str4;
        this.f338708i = j18;
        this.f338709j = bArr;
        this.f338710k = num2;
        this.f338711l = j27;
        this.f338712m = str6;
        this.f338713n = z19;
        this.f338714o = z27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no0.a)) {
            return false;
        }
        no0.a aVar = (no0.a) obj;
        return this.f338700a == aVar.f338700a && kotlin.jvm.internal.o.b(this.f338701b, aVar.f338701b) && kotlin.jvm.internal.o.b(this.f338702c, aVar.f338702c) && this.f338703d == aVar.f338703d && this.f338704e == aVar.f338704e && this.f338705f == aVar.f338705f && kotlin.jvm.internal.o.b(this.f338706g, aVar.f338706g) && kotlin.jvm.internal.o.b(this.f338707h, aVar.f338707h) && this.f338708i == aVar.f338708i && kotlin.jvm.internal.o.b(this.f338709j, aVar.f338709j) && kotlin.jvm.internal.o.b(this.f338710k, aVar.f338710k) && this.f338711l == aVar.f338711l && kotlin.jvm.internal.o.b(this.f338712m, aVar.f338712m) && this.f338713n == aVar.f338713n && this.f338714o == aVar.f338714o;
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f338700a) * 31;
        java.lang.String str = this.f338701b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f338702c;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f338703d)) * 31) + java.lang.Integer.hashCode(this.f338704e)) * 31) + java.lang.Integer.hashCode(this.f338705f)) * 31;
        java.lang.String str3 = this.f338706g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f338707h;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Long.hashCode(this.f338708i)) * 31;
        byte[] bArr = this.f338709j;
        int hashCode6 = (hashCode5 + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        java.lang.Integer num = this.f338710k;
        int hashCode7 = (((hashCode6 + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Long.hashCode(this.f338711l)) * 31;
        java.lang.String str5 = this.f338712m;
        return ((((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f338713n)) * 31) + java.lang.Boolean.hashCode(this.f338714o);
    }

    public java.lang.String toString() {
        return "AcceptLiveMicInfo(liveId=" + this.f338700a + ", micId=" + this.f338701b + ", userId=" + this.f338702c + ", sdkAppId=" + this.f338703d + ", roleId=" + this.f338704e + ", sdkLiveId=" + this.f338705f + ", userSig=" + this.f338706g + ", privateMapKey=" + this.f338707h + ", expireForPmk=" + this.f338708i + ", sdkParam=" + java.util.Arrays.toString(this.f338709j) + ", micType=" + this.f338710k + ", seq=" + this.f338711l + ", pkSign=" + this.f338712m + ", isAnchorPk=" + this.f338713n + ", isRandomMatch=" + this.f338714o + ')';
    }
}
