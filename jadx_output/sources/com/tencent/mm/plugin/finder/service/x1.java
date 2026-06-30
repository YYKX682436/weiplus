package com.tencent.mm.plugin.finder.service;

/* loaded from: classes2.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f126252a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f126253b;

    public x1(java.lang.String exportId, java.lang.String str) {
        kotlin.jvm.internal.o.g(exportId, "exportId");
        this.f126252a = exportId;
        this.f126253b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.service.x1)) {
            return false;
        }
        com.tencent.mm.plugin.finder.service.x1 x1Var = (com.tencent.mm.plugin.finder.service.x1) obj;
        return kotlin.jvm.internal.o.b(this.f126252a, x1Var.f126252a) && kotlin.jvm.internal.o.b(this.f126253b, x1Var.f126253b);
    }

    public int hashCode() {
        int hashCode = this.f126252a.hashCode() * 31;
        java.lang.String str = this.f126253b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "EncryptedObjectData(exportId=" + this.f126252a + ", nonceId=" + this.f126253b + ')';
    }
}
