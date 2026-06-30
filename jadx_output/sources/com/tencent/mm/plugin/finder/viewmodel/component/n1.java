package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f135244a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f135245b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f135246c;

    /* renamed from: d, reason: collision with root package name */
    public final long f135247d;

    public n1(long j17, java.lang.String step, org.json.JSONObject extraData, long j18) {
        kotlin.jvm.internal.o.g(step, "step");
        kotlin.jvm.internal.o.g(extraData, "extraData");
        this.f135244a = j17;
        this.f135245b = step;
        this.f135246c = extraData;
        this.f135247d = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.n1)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.n1 n1Var = (com.tencent.mm.plugin.finder.viewmodel.component.n1) obj;
        return this.f135244a == n1Var.f135244a && kotlin.jvm.internal.o.b(this.f135245b, n1Var.f135245b) && kotlin.jvm.internal.o.b(this.f135246c, n1Var.f135246c) && this.f135247d == n1Var.f135247d;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f135244a) * 31) + this.f135245b.hashCode()) * 31) + this.f135246c.hashCode()) * 31) + java.lang.Long.hashCode(this.f135247d);
    }

    public java.lang.String toString() {
        return "Trace(feedId=" + this.f135244a + ", step=" + this.f135245b + ", extraData=" + this.f135246c + ", aid=" + this.f135247d + ')';
    }
}
