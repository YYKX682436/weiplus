package i33;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f288276a;

    /* renamed from: b, reason: collision with root package name */
    public final long f288277b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f288278c;

    /* renamed from: d, reason: collision with root package name */
    public long f288279d;

    /* renamed from: e, reason: collision with root package name */
    public int f288280e;

    public v(java.lang.String ticket, long j17, java.lang.String str, long j18, int i17, int i18, kotlin.jvm.internal.i iVar) {
        str = (i18 & 4) != 0 ? "" : str;
        j18 = (i18 & 8) != 0 ? 0L : j18;
        i17 = (i18 & 16) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(ticket, "ticket");
        this.f288276a = ticket;
        this.f288277b = j17;
        this.f288278c = str;
        this.f288279d = j18;
        this.f288280e = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i33.v)) {
            return false;
        }
        i33.v vVar = (i33.v) obj;
        return kotlin.jvm.internal.o.b(this.f288276a, vVar.f288276a) && this.f288277b == vVar.f288277b && kotlin.jvm.internal.o.b(this.f288278c, vVar.f288278c) && this.f288279d == vVar.f288279d && this.f288280e == vVar.f288280e;
    }

    public int hashCode() {
        int hashCode = ((this.f288276a.hashCode() * 31) + java.lang.Long.hashCode(this.f288277b)) * 31;
        java.lang.String str = this.f288278c;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f288279d)) * 31) + java.lang.Integer.hashCode(this.f288280e);
    }

    public java.lang.String toString() {
        return "AlbumQueryMediaItemSessionReportData(ticket=" + this.f288276a + ", queryStartTime=" + this.f288277b + ", queryFolderName=" + this.f288278c + ", queryFinishTime=" + this.f288279d + ", queryItemCount=" + this.f288280e + ')';
    }
}
