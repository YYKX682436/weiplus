package ya2;

/* loaded from: classes8.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f460538a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f460539b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f460540c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f460541d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f460542e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qt2 f460543f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f460544g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f460545h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f460546i;

    /* renamed from: j, reason: collision with root package name */
    public int f460547j;

    public t1(java.lang.String finderEntranceTipsId, java.util.LinkedList finderCtrlInfoList, java.lang.String nearbyEntranceTipsId, java.util.LinkedList nearbyCtrlInfoList, java.util.LinkedList snsCtrlInfoList, int i17, kotlin.jvm.internal.i iVar) {
        finderEntranceTipsId = (i17 & 1) != 0 ? "" : finderEntranceTipsId;
        finderCtrlInfoList = (i17 & 2) != 0 ? new java.util.LinkedList() : finderCtrlInfoList;
        nearbyEntranceTipsId = (i17 & 4) != 0 ? "" : nearbyEntranceTipsId;
        nearbyCtrlInfoList = (i17 & 8) != 0 ? new java.util.LinkedList() : nearbyCtrlInfoList;
        snsCtrlInfoList = (i17 & 16) != 0 ? new java.util.LinkedList() : snsCtrlInfoList;
        kotlin.jvm.internal.o.g(finderEntranceTipsId, "finderEntranceTipsId");
        kotlin.jvm.internal.o.g(finderCtrlInfoList, "finderCtrlInfoList");
        kotlin.jvm.internal.o.g(nearbyEntranceTipsId, "nearbyEntranceTipsId");
        kotlin.jvm.internal.o.g(nearbyCtrlInfoList, "nearbyCtrlInfoList");
        kotlin.jvm.internal.o.g(snsCtrlInfoList, "snsCtrlInfoList");
        this.f460538a = finderEntranceTipsId;
        this.f460539b = finderCtrlInfoList;
        this.f460540c = nearbyEntranceTipsId;
        this.f460541d = nearbyCtrlInfoList;
        this.f460542e = snsCtrlInfoList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya2.t1)) {
            return false;
        }
        ya2.t1 t1Var = (ya2.t1) obj;
        return kotlin.jvm.internal.o.b(this.f460538a, t1Var.f460538a) && kotlin.jvm.internal.o.b(this.f460539b, t1Var.f460539b) && kotlin.jvm.internal.o.b(this.f460540c, t1Var.f460540c) && kotlin.jvm.internal.o.b(this.f460541d, t1Var.f460541d) && kotlin.jvm.internal.o.b(this.f460542e, t1Var.f460542e);
    }

    public int hashCode() {
        return (((((((this.f460538a.hashCode() * 31) + this.f460539b.hashCode()) * 31) + this.f460540c.hashCode()) * 31) + this.f460541d.hashCode()) * 31) + this.f460542e.hashCode();
    }

    public java.lang.String toString() {
        return "SyncArgs(finderEntranceTipsId=" + this.f460538a + ", finderCtrlInfoList=" + this.f460539b + ", nearbyEntranceTipsId=" + this.f460540c + ", nearbyCtrlInfoList=" + this.f460541d + ", snsCtrlInfoList=" + this.f460542e + ')';
    }
}
