package com.tencent.mm.wexnet;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f214373a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f214374b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.g1 f214375c;

    public r(int i17, int[] dataShape, com.tencent.mm.plugin.appbrand.jsruntime.g1 dataHolder) {
        kotlin.jvm.internal.o.g(dataShape, "dataShape");
        kotlin.jvm.internal.o.g(dataHolder, "dataHolder");
        this.f214373a = i17;
        this.f214374b = dataShape;
        this.f214375c = dataHolder;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.wexnet.r)) {
            return false;
        }
        com.tencent.mm.wexnet.r rVar = (com.tencent.mm.wexnet.r) obj;
        return this.f214373a == rVar.f214373a && kotlin.jvm.internal.o.b(this.f214374b, rVar.f214374b) && kotlin.jvm.internal.o.b(this.f214375c, rVar.f214375c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f214373a) * 31) + java.util.Arrays.hashCode(this.f214374b)) * 31) + this.f214375c.hashCode();
    }

    public java.lang.String toString() {
        return "SharedTensorCpuB(dateType=" + this.f214373a + ", dataShape=" + java.util.Arrays.toString(this.f214374b) + ", dataHolder=" + this.f214375c + ')';
    }
}
