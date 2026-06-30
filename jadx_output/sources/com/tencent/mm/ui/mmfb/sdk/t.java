package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f209231a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f209232b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f209233c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f209234d;

    public t(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3) {
        this.f209231a = str;
        this.f209232b = num;
        this.f209233c = str2;
        this.f209234d = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.mmfb.sdk.t)) {
            return false;
        }
        com.tencent.mm.ui.mmfb.sdk.t tVar = (com.tencent.mm.ui.mmfb.sdk.t) obj;
        return kotlin.jvm.internal.o.b(this.f209231a, tVar.f209231a) && kotlin.jvm.internal.o.b(this.f209232b, tVar.f209232b) && kotlin.jvm.internal.o.b(this.f209233c, tVar.f209233c) && kotlin.jvm.internal.o.b(this.f209234d, tVar.f209234d);
    }

    public int hashCode() {
        java.lang.String str = this.f209231a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Integer num = this.f209232b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str2 = this.f209233c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f209234d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GatewayLoginParam(mobile=" + this.f209231a + ", carrierType=" + this.f209232b + ", protocalTitle=" + this.f209233c + ", protocalUrl=" + this.f209234d + ')';
    }
}
