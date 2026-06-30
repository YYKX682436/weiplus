package com.tencent.mm.protobuf;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protobuf.k f192158a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f192159b;

    public j(com.tencent.mm.protobuf.k attr, java.lang.Object obj, int i17, kotlin.jvm.internal.i iVar) {
        obj = (i17 & 2) != 0 ? null : obj;
        kotlin.jvm.internal.o.g(attr, "attr");
        this.f192158a = attr;
        this.f192159b = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.protobuf.j)) {
            return false;
        }
        com.tencent.mm.protobuf.j jVar = (com.tencent.mm.protobuf.j) obj;
        if (!kotlin.jvm.internal.o.b(this.f192158a.f192161b, jVar.f192158a.f192161b)) {
            return false;
        }
        if (kotlin.jvm.internal.o.b(this.f192159b, jVar.f192159b)) {
            return true;
        }
        java.lang.Object obj2 = this.f192159b;
        if (!(obj2 instanceof java.util.List) || !(jVar.f192159b instanceof java.util.List)) {
            if (!(obj2 instanceof com.tencent.mm.protobuf.e) || !(jVar.f192159b instanceof com.tencent.mm.protobuf.e)) {
                return false;
            }
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProto3Buf");
            java.lang.Object obj3 = jVar.f192159b;
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProto3Buf");
            return ((com.tencent.mm.protobuf.e) obj2).compareContent((com.tencent.mm.protobuf.e) obj3);
        }
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
        java.util.List list = (java.util.List) obj2;
        java.lang.Object obj4 = jVar.f192159b;
        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.collections.List<*>");
        java.util.List list2 = (java.util.List) obj4;
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (!kotlin.jvm.internal.o.b(list.get(i17), list2.get(i17))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f192158a.hashCode() * 31;
        java.lang.Object obj = this.f192159b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.Object obj = this.f192159b;
        com.tencent.mm.protobuf.k kVar = this.f192158a;
        if (obj != null) {
            return kVar + " => " + obj;
        }
        return kVar + " => " + kVar.f192166g + "(default)";
    }
}
