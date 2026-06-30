package rq4;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f399093a;

    /* renamed from: b, reason: collision with root package name */
    public int f399094b;

    /* renamed from: c, reason: collision with root package name */
    public int f399095c;

    /* renamed from: d, reason: collision with root package name */
    public int f399096d;

    /* renamed from: e, reason: collision with root package name */
    public long f399097e;

    public r(int i17, int i18, int i19, int i27, long j17, int i28, kotlin.jvm.internal.i iVar) {
        i17 = (i28 & 1) != 0 ? 0 : i17;
        i18 = (i28 & 2) != 0 ? 0 : i18;
        i19 = (i28 & 4) != 0 ? 0 : i19;
        i27 = (i28 & 8) != 0 ? 0 : i27;
        j17 = (i28 & 16) != 0 ? 0L : j17;
        this.f399093a = i17;
        this.f399094b = i18;
        this.f399095c = i19;
        this.f399096d = i27;
        this.f399097e = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq4.r)) {
            return false;
        }
        rq4.r rVar = (rq4.r) obj;
        return this.f399093a == rVar.f399093a && this.f399094b == rVar.f399094b && this.f399095c == rVar.f399095c && this.f399096d == rVar.f399096d && this.f399097e == rVar.f399097e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f399093a) * 31) + java.lang.Integer.hashCode(this.f399094b)) * 31) + java.lang.Integer.hashCode(this.f399095c)) * 31) + java.lang.Integer.hashCode(this.f399096d)) * 31) + java.lang.Long.hashCode(this.f399097e);
    }

    public java.lang.String toString() {
        return "FloatCardReportData(dismissCalled=" + this.f399093a + ", viewRemoved=" + this.f399094b + ", showCallType=" + this.f399095c + ", permissionStatus=" + this.f399096d + ", duration=" + this.f399097e + ')';
    }
}
