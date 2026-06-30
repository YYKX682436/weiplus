package oz3;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f350257a;

    /* renamed from: b, reason: collision with root package name */
    public final int f350258b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f350259c;

    /* renamed from: d, reason: collision with root package name */
    public final int f350260d;

    /* renamed from: e, reason: collision with root package name */
    public final int f350261e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f350262f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.qbar.ScanIdentifyReportInfo f350263g;

    /* renamed from: h, reason: collision with root package name */
    public final oz3.f f350264h;

    public e(int i17, int i18, java.lang.String str, int i19, int i27, java.lang.String str2, com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo, oz3.f ocrReportType) {
        kotlin.jvm.internal.o.g(ocrReportType, "ocrReportType");
        this.f350257a = i17;
        this.f350258b = i18;
        this.f350259c = str;
        this.f350260d = i19;
        this.f350261e = i27;
        this.f350262f = str2;
        this.f350263g = scanIdentifyReportInfo;
        this.f350264h = ocrReportType;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz3.e)) {
            return false;
        }
        oz3.e eVar = (oz3.e) obj;
        return this.f350257a == eVar.f350257a && this.f350258b == eVar.f350258b && kotlin.jvm.internal.o.b(this.f350259c, eVar.f350259c) && this.f350260d == eVar.f350260d && this.f350261e == eVar.f350261e && kotlin.jvm.internal.o.b(this.f350262f, eVar.f350262f) && kotlin.jvm.internal.o.b(this.f350263g, eVar.f350263g) && this.f350264h == eVar.f350264h;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f350257a) * 31) + java.lang.Integer.hashCode(this.f350258b)) * 31;
        java.lang.String str = this.f350259c;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f350260d)) * 31) + java.lang.Integer.hashCode(this.f350261e)) * 31;
        java.lang.String str2 = this.f350262f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo = this.f350263g;
        return ((hashCode3 + (scanIdentifyReportInfo != null ? scanIdentifyReportInfo.hashCode() : 0)) * 31) + this.f350264h.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ScanCodeOcrReportRequest{getA8KeyScene: ");
        sb6.append(this.f350257a);
        sb6.append(", getA8KeyRequestId: ");
        sb6.append(this.f350258b);
        sb6.append(", codeContent: ");
        sb6.append(this.f350259c);
        sb6.append("}, codeType: ");
        sb6.append(this.f350260d);
        sb6.append(", scanSource: ");
        sb6.append(this.f350261e);
        sb6.append(", svrMsgId: ");
        sb6.append(this.f350262f);
        sb6.append(", identifyReportInfo.imagePath: ");
        com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo = this.f350263g;
        sb6.append(scanIdentifyReportInfo != null ? scanIdentifyReportInfo.f215246h : null);
        sb6.append('}');
        return sb6.toString();
    }
}
