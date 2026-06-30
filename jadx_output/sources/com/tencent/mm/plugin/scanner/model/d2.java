package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f158866a;

    /* renamed from: b, reason: collision with root package name */
    public final long f158867b;

    /* renamed from: c, reason: collision with root package name */
    public long f158868c;

    /* renamed from: d, reason: collision with root package name */
    public long f158869d;

    /* renamed from: e, reason: collision with root package name */
    public long f158870e;

    /* renamed from: f, reason: collision with root package name */
    public long f158871f;

    /* renamed from: g, reason: collision with root package name */
    public long f158872g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f158873h;

    public d2(java.util.List codeResultList, long j17) {
        kotlin.jvm.internal.o.g(codeResultList, "codeResultList");
        this.f158866a = codeResultList;
        this.f158867b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.scanner.model.d2)) {
            return false;
        }
        com.tencent.mm.plugin.scanner.model.d2 d2Var = (com.tencent.mm.plugin.scanner.model.d2) obj;
        return kotlin.jvm.internal.o.b(this.f158866a, d2Var.f158866a) && this.f158867b == d2Var.f158867b;
    }

    public int hashCode() {
        return (this.f158866a.hashCode() * 31) + java.lang.Long.hashCode(this.f158867b);
    }

    public java.lang.String toString() {
        return "ScanMultiCodeReportInfo(codeResultList=" + this.f158866a + ", scanCost=" + this.f158867b + ')';
    }
}
