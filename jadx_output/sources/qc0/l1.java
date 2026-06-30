package qc0;

/* loaded from: classes7.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final qc0.n1 f361395a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f361396b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f361397c;

    /* renamed from: d, reason: collision with root package name */
    public long f361398d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f361399e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f361400f;

    /* renamed from: g, reason: collision with root package name */
    public final long f361401g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f361402h;

    /* renamed from: i, reason: collision with root package name */
    public int f361403i;

    /* renamed from: j, reason: collision with root package name */
    public long f361404j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f361405k;

    /* renamed from: l, reason: collision with root package name */
    public final qc0.o1 f361406l;

    public l1(qc0.n1 type, java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4, long j18, boolean z17, int i17, long j19, java.lang.String str5, qc0.o1 o1Var, int i18, kotlin.jvm.internal.i iVar) {
        long j27;
        java.lang.String str6;
        java.lang.String str7 = (i18 & 2) != 0 ? null : str;
        java.lang.String str8 = (i18 & 4) != 0 ? null : str2;
        long j28 = (i18 & 8) != 0 ? -1L : j17;
        java.lang.String str9 = (i18 & 16) != 0 ? "" : str3;
        java.lang.String str10 = (i18 & 32) == 0 ? str4 : "";
        long j29 = (i18 & 64) == 0 ? j18 : -1L;
        boolean z18 = (i18 & 128) != 0 ? true : z17;
        int i19 = (i18 & 256) != 0 ? 0 : i17;
        long j37 = (i18 & 512) != 0 ? 0L : j19;
        if ((i18 & 1024) != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(j29);
            j27 = j37;
            sb6.append('_');
            sb6.append(str7 != null ? str7.hashCode() : 0);
            str6 = sb6.toString();
        } else {
            j27 = j37;
            str6 = str5;
        }
        qc0.o1 o1Var2 = (i18 & 2048) != 0 ? null : o1Var;
        kotlin.jvm.internal.o.g(type, "type");
        this.f361395a = type;
        this.f361396b = str7;
        this.f361397c = str8;
        this.f361398d = j28;
        this.f361399e = str9;
        this.f361400f = str10;
        this.f361401g = j29;
        this.f361402h = z18;
        this.f361403i = i19;
        this.f361404j = j27;
        this.f361405k = str6;
        this.f361406l = o1Var2;
    }

    public final boolean a() {
        return this.f361395a == qc0.n1.f361418e;
    }

    public final boolean b() {
        return this.f361395a == qc0.n1.f361417d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0.l1)) {
            return false;
        }
        qc0.l1 l1Var = (qc0.l1) obj;
        return this.f361395a == l1Var.f361395a && kotlin.jvm.internal.o.b(this.f361396b, l1Var.f361396b) && kotlin.jvm.internal.o.b(this.f361397c, l1Var.f361397c) && this.f361398d == l1Var.f361398d && kotlin.jvm.internal.o.b(this.f361399e, l1Var.f361399e) && kotlin.jvm.internal.o.b(this.f361400f, l1Var.f361400f) && this.f361401g == l1Var.f361401g && this.f361402h == l1Var.f361402h && this.f361403i == l1Var.f361403i && this.f361404j == l1Var.f361404j && kotlin.jvm.internal.o.b(this.f361405k, l1Var.f361405k) && kotlin.jvm.internal.o.b(this.f361406l, l1Var.f361406l);
    }

    public int hashCode() {
        int hashCode = this.f361395a.hashCode() * 31;
        java.lang.String str = this.f361396b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f361397c;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Long.hashCode(this.f361398d)) * 31;
        java.lang.String str3 = this.f361399e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f361400f;
        int hashCode5 = (((((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Long.hashCode(this.f361401g)) * 31) + java.lang.Boolean.hashCode(this.f361402h)) * 31) + java.lang.Integer.hashCode(this.f361403i)) * 31) + java.lang.Long.hashCode(this.f361404j)) * 31;
        java.lang.String str5 = this.f361405k;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        qc0.o1 o1Var = this.f361406l;
        return hashCode6 + (o1Var != null ? o1Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MediaOptModel(type=" + this.f361395a + ", path=" + this.f361396b + ", thumb=" + this.f361397c + ", durationMs=" + this.f361398d + ", livePhotoVideoPath=" + this.f361399e + ", livePhotoTempVideoPath=" + this.f361400f + ", mediaId=" + this.f361401g + ", compress=" + this.f361402h + ", parseState=" + this.f361403i + ", coverTimeStampMs=" + this.f361404j + ", mediaUniqueKey=" + this.f361405k + ", textCoverInfo=" + this.f361406l + ')';
    }
}
