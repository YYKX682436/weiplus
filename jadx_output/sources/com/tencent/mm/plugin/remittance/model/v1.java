package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f157042a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f157043b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f157044c;

    public v1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        str = (i17 & 1) != 0 ? "" : str;
        str2 = (i17 & 2) != 0 ? "" : str2;
        str3 = (i17 & 4) != 0 ? "" : str3;
        this.f157042a = str;
        this.f157043b = str2;
        this.f157044c = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.remittance.model.v1)) {
            return false;
        }
        com.tencent.mm.plugin.remittance.model.v1 v1Var = (com.tencent.mm.plugin.remittance.model.v1) obj;
        return kotlin.jvm.internal.o.b(this.f157042a, v1Var.f157042a) && kotlin.jvm.internal.o.b(this.f157043b, v1Var.f157043b) && kotlin.jvm.internal.o.b(this.f157044c, v1Var.f157044c);
    }

    public int hashCode() {
        java.lang.String str = this.f157042a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f157043b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f157044c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LimitInfo{iconUrl='" + this.f157042a + "', darkIconUrl='" + this.f157043b + "', jumpInfo='" + this.f157044c + "', }";
    }
}
