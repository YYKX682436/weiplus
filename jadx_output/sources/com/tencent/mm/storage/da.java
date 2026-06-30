package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class da {

    /* renamed from: a, reason: collision with root package name */
    public final long f193843a;

    /* renamed from: b, reason: collision with root package name */
    public final int f193844b;

    /* renamed from: c, reason: collision with root package name */
    public final int f193845c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193846d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f193847e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f193848f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f193849g;

    public da(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num) {
        this.f193843a = j17;
        this.f193844b = i17;
        this.f193845c = i18;
        this.f193846d = str;
        this.f193847e = str2;
        this.f193848f = str3;
        this.f193849g = num;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.storage.da)) {
            return false;
        }
        com.tencent.mm.storage.da daVar = (com.tencent.mm.storage.da) obj;
        return this.f193843a == daVar.f193843a && this.f193844b == daVar.f193844b && this.f193845c == daVar.f193845c && kotlin.jvm.internal.o.b(this.f193846d, daVar.f193846d) && kotlin.jvm.internal.o.b(this.f193847e, daVar.f193847e) && kotlin.jvm.internal.o.b(this.f193848f, daVar.f193848f) && kotlin.jvm.internal.o.b(this.f193849g, daVar.f193849g);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Long.hashCode(this.f193843a) * 31) + java.lang.Integer.hashCode(this.f193844b)) * 31) + java.lang.Integer.hashCode(this.f193845c)) * 31;
        java.lang.String str = this.f193846d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f193847e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f193848f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Integer num = this.f193849g;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "RecMsgReportInfo(mid=" + this.f193843a + ", idx=" + this.f193844b + ", style=" + this.f193845c + ", recInfo=" + this.f193846d + ", extData=" + this.f193847e + ", bizUsername=" + this.f193848f + ", bizUin=" + this.f193849g + ')';
    }
}
