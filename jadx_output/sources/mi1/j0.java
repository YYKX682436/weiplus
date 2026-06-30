package mi1;

/* loaded from: classes7.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f326585a;

    /* renamed from: b, reason: collision with root package name */
    public int f326586b;

    /* renamed from: c, reason: collision with root package name */
    public final int f326587c;

    /* renamed from: d, reason: collision with root package name */
    public final long f326588d;

    /* renamed from: e, reason: collision with root package name */
    public final int f326589e;

    /* renamed from: f, reason: collision with root package name */
    public long f326590f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f326591g;

    /* renamed from: h, reason: collision with root package name */
    public int f326592h;

    /* renamed from: i, reason: collision with root package name */
    public final long f326593i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f326594j;

    public j0(int i17, int i18, int i19, long j17, int i27, long j18, java.lang.Object obj, int i28, long j19, yz5.a aVar, int i29, kotlin.jvm.internal.i iVar) {
        int i37;
        int i38 = (i29 & 1) != 0 ? 0 : i17;
        int i39 = (i29 & 2) != 0 ? Integer.MIN_VALUE : i18;
        int i47 = (i29 & 4) != 0 ? 0 : i19;
        long j27 = (i29 & 8) != 0 ? 0L : j17;
        if ((i29 & 16) != 0) {
            mi1.z0 z0Var = mi1.z0.f326739e;
            i37 = 1;
        } else {
            i37 = i27;
        }
        long j28 = (i29 & 32) != 0 ? 0L : j18;
        java.lang.Object obj2 = (i29 & 64) != 0 ? null : obj;
        int i48 = (i29 & 128) == 0 ? i28 : 0;
        long j29 = (i29 & 256) == 0 ? j19 : 0L;
        yz5.a aVar2 = (i29 & 512) == 0 ? aVar : null;
        this.f326585a = i38;
        this.f326586b = i39;
        this.f326587c = i47;
        this.f326588d = j27;
        this.f326589e = i37;
        this.f326590f = j28;
        this.f326591g = obj2;
        this.f326592h = i48;
        this.f326593i = j29;
        this.f326594j = aVar2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi1.j0)) {
            return false;
        }
        mi1.j0 j0Var = (mi1.j0) obj;
        return this.f326585a == j0Var.f326585a && this.f326586b == j0Var.f326586b && this.f326587c == j0Var.f326587c && this.f326588d == j0Var.f326588d && this.f326589e == j0Var.f326589e && this.f326590f == j0Var.f326590f && kotlin.jvm.internal.o.b(this.f326591g, j0Var.f326591g) && this.f326592h == j0Var.f326592h && this.f326593i == j0Var.f326593i && kotlin.jvm.internal.o.b(this.f326594j, j0Var.f326594j);
    }

    public int hashCode() {
        int hashCode = ((((((((((java.lang.Integer.hashCode(this.f326585a) * 31) + java.lang.Integer.hashCode(this.f326586b)) * 31) + java.lang.Integer.hashCode(this.f326587c)) * 31) + java.lang.Long.hashCode(this.f326588d)) * 31) + java.lang.Integer.hashCode(this.f326589e)) * 31) + java.lang.Long.hashCode(this.f326590f)) * 31;
        java.lang.Object obj = this.f326591g;
        int hashCode2 = (((((hashCode + (obj == null ? 0 : obj.hashCode())) * 31) + java.lang.Integer.hashCode(this.f326592h)) * 31) + java.lang.Long.hashCode(this.f326593i)) * 31;
        yz5.a aVar = this.f326594j;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CapsuleAnimatorEvent(eventType=" + this.f326585a + ", targetState=" + this.f326586b + ", priority=" + this.f326587c + ", pendingTime=" + this.f326588d + ", type=" + this.f326589e + ", enqueueTime=" + this.f326590f + ", data=" + this.f326591g + ", dispatchState=" + this.f326592h + ", showTime=" + this.f326593i + ", onFirstExecute=" + this.f326594j + ')';
    }
}
