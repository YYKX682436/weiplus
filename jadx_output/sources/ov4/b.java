package ov4;

/* loaded from: classes.dex */
public final class b implements nv4.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349188a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f349189b;

    /* renamed from: c, reason: collision with root package name */
    public final int f349190c;

    public b(java.lang.String sessionId, java.lang.String exposeInfo, int i17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(exposeInfo, "exposeInfo");
        this.f349188a = sessionId;
        this.f349189b = exposeInfo;
        this.f349190c = i17;
    }

    @Override // nv4.h
    public java.lang.String A() {
        return "22369-" + this.f349188a + '-' + this.f349189b;
    }

    @Override // nv4.h
    public nv4.h B(nv4.h item) {
        kotlin.jvm.internal.o.g(item, "item");
        ov4.b bVar = item instanceof ov4.b ? (ov4.b) item : null;
        if (bVar == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("22369 merge ");
        java.lang.String str = this.f349189b;
        sb6.append(str);
        sb6.append(" with ");
        java.lang.String str2 = bVar.f349189b;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("FTSReportItem22369", sb6.toString());
        java.lang.String exposeInfo = str + ';' + str2;
        java.lang.String sessionId = this.f349188a;
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(exposeInfo, "exposeInfo");
        return new ov4.b(sessionId, exposeInfo, this.f349190c);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov4.b)) {
            return false;
        }
        ov4.b bVar = (ov4.b) obj;
        return kotlin.jvm.internal.o.b(this.f349188a, bVar.f349188a) && kotlin.jvm.internal.o.b(this.f349189b, bVar.f349189b) && this.f349190c == bVar.f349190c;
    }

    public int hashCode() {
        return (((this.f349188a.hashCode() * 31) + this.f349189b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f349190c);
    }

    public java.lang.String toString() {
        return "FTSReportItem22369(sessionId=" + this.f349188a + ", exposeInfo=" + this.f349189b + ", h5Version=" + this.f349190c + ')';
    }

    @Override // nv4.h
    public void z() {
        jx3.f.INSTANCE.kvStat(22369, this.f349188a + ',' + fp.s0.b(this.f349189b, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + ',' + this.f349190c);
    }
}
