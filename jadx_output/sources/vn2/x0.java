package vn2;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f438410a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f438411b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f438412c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f438413d;

    public x0(java.util.List list, com.tencent.mm.protobuf.g gVar, java.util.List list2, com.tencent.mm.protobuf.g gVar2) {
        this.f438410a = list;
        this.f438411b = gVar;
        this.f438412c = list2;
        this.f438413d = gVar2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn2.x0)) {
            return false;
        }
        vn2.x0 x0Var = (vn2.x0) obj;
        return kotlin.jvm.internal.o.b(this.f438410a, x0Var.f438410a) && kotlin.jvm.internal.o.b(this.f438411b, x0Var.f438411b) && kotlin.jvm.internal.o.b(this.f438412c, x0Var.f438412c) && kotlin.jvm.internal.o.b(this.f438413d, x0Var.f438413d);
    }

    public int hashCode() {
        java.util.List list = this.f438410a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        com.tencent.mm.protobuf.g gVar = this.f438411b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        java.util.List list2 = this.f438412c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        com.tencent.mm.protobuf.g gVar2 = this.f438413d;
        return hashCode3 + (gVar2 != null ? gVar2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Cache(seeLaterDataList=" + this.f438410a + ", seeLaterLastBuffer=" + this.f438411b + ", megaVideoFlowList=" + this.f438412c + ", megaVideoLastBuffer=" + this.f438413d + ')';
    }
}
