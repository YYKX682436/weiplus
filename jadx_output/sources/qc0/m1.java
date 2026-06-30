package qc0;

/* loaded from: classes7.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public int f361410a;

    /* renamed from: b, reason: collision with root package name */
    public final int f361411b;

    /* renamed from: c, reason: collision with root package name */
    public final int f361412c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f361413d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f361414e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo f361415f;

    /* renamed from: g, reason: collision with root package name */
    public final int f361416g;

    public m1(int i17, int i18, int i19, java.util.List list, android.os.Bundle bundle, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo, int i27) {
        this.f361410a = i17;
        this.f361411b = i18;
        this.f361412c = i19;
        this.f361413d = list;
        this.f361414e = bundle;
        this.f361415f = recordMediaReportInfo;
        this.f361416g = i27;
    }

    public final qc0.l1 a() {
        java.util.List list = this.f361413d;
        if (list != null) {
            return (qc0.l1) kz5.n0.Z(list);
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0.m1)) {
            return false;
        }
        qc0.m1 m1Var = (qc0.m1) obj;
        return this.f361410a == m1Var.f361410a && this.f361411b == m1Var.f361411b && this.f361412c == m1Var.f361412c && kotlin.jvm.internal.o.b(this.f361413d, m1Var.f361413d) && kotlin.jvm.internal.o.b(this.f361414e, m1Var.f361414e) && kotlin.jvm.internal.o.b(this.f361415f, m1Var.f361415f) && this.f361416g == m1Var.f361416g;
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f361410a) * 31) + java.lang.Integer.hashCode(this.f361411b)) * 31) + java.lang.Integer.hashCode(this.f361412c)) * 31;
        java.util.List list = this.f361413d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        android.os.Bundle bundle = this.f361414e;
        int hashCode3 = (hashCode2 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo = this.f361415f;
        return ((hashCode3 + (recordMediaReportInfo != null ? recordMediaReportInfo.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f361416g);
    }

    public java.lang.String toString() {
        return "MediaOptResult(requestCode=" + this.f361410a + ", resultCode=" + this.f361411b + ", optCode=" + this.f361412c + ", mediaList=" + this.f361413d + ", extraData=" + this.f361414e + ", reportInfo=" + this.f361415f + ", source=" + this.f361416g + ')';
    }

    public /* synthetic */ m1(int i17, int i18, int i19, java.util.List list, android.os.Bundle bundle, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo, int i27, int i28, kotlin.jvm.internal.i iVar) {
        this(i17, i18, (i28 & 4) != 0 ? -1 : i19, (i28 & 8) != 0 ? null : list, (i28 & 16) != 0 ? null : bundle, (i28 & 32) != 0 ? null : recordMediaReportInfo, (i28 & 64) != 0 ? -1 : i27);
    }
}
