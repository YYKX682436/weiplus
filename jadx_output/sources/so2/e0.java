package so2;

/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public long f410321a;

    /* renamed from: b, reason: collision with root package name */
    public long f410322b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f410323c;

    public e0(long j17, long j18, java.lang.String remindFinderList, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        j18 = (i17 & 2) != 0 ? 0L : j18;
        remindFinderList = (i17 & 4) != 0 ? "" : remindFinderList;
        kotlin.jvm.internal.o.g(remindFinderList, "remindFinderList");
        this.f410321a = j17;
        this.f410322b = j18;
        this.f410323c = remindFinderList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.e0)) {
            return false;
        }
        so2.e0 e0Var = (so2.e0) obj;
        return this.f410321a == e0Var.f410321a && this.f410322b == e0Var.f410322b && kotlin.jvm.internal.o.b(this.f410323c, e0Var.f410323c);
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f410321a) * 31) + java.lang.Long.hashCode(this.f410322b)) * 31) + this.f410323c.hashCode();
    }

    public java.lang.String toString() {
        return "FinderCommentAtReportData(clickChooseFinderCnt=" + this.f410321a + ", inputFinderCnt=" + this.f410322b + ", remindFinderList=" + this.f410323c + ')';
    }
}
