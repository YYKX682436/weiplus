package vd2;

/* loaded from: classes3.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f435877a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f435878b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f435879c;

    public r2(java.util.ArrayList preList, java.util.ArrayList sufList, com.tencent.mm.protobuf.g gVar) {
        kotlin.jvm.internal.o.g(preList, "preList");
        kotlin.jvm.internal.o.g(sufList, "sufList");
        this.f435877a = preList;
        this.f435878b = sufList;
        this.f435879c = gVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd2.r2)) {
            return false;
        }
        vd2.r2 r2Var = (vd2.r2) obj;
        return kotlin.jvm.internal.o.b(this.f435877a, r2Var.f435877a) && kotlin.jvm.internal.o.b(this.f435878b, r2Var.f435878b) && kotlin.jvm.internal.o.b(this.f435879c, r2Var.f435879c);
    }

    public int hashCode() {
        int hashCode = ((this.f435877a.hashCode() * 31) + this.f435878b.hashCode()) * 31;
        com.tencent.mm.protobuf.g gVar = this.f435879c;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public java.lang.String toString() {
        return "SideBarDataCache(preList=" + this.f435877a + ", sufList=" + this.f435878b + ", lastBuffer=" + this.f435879c + ')';
    }
}
