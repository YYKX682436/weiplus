package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f134910a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134911b;

    public k1(long j17, int i17) {
        this.f134910a = j17;
        this.f134911b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.k1)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.k1 k1Var = (com.tencent.mm.plugin.finder.viewmodel.component.k1) obj;
        return k1Var.f134910a == this.f134910a && k1Var.f134911b == this.f134911b;
    }

    public int hashCode() {
        return (((int) this.f134910a) * 31) + this.f134911b;
    }
}
