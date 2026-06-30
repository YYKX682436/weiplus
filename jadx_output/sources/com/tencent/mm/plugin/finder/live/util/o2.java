package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f115643a;

    /* renamed from: b, reason: collision with root package name */
    public final km2.m f115644b;

    public o2(long j17, km2.m mVar) {
        this.f115643a = j17;
        this.f115644b = mVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.util.o2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.util.o2 o2Var = (com.tencent.mm.plugin.finder.live.util.o2) obj;
        return this.f115643a == o2Var.f115643a && kotlin.jvm.internal.o.b(this.f115644b, o2Var.f115644b);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f115643a) * 31;
        km2.m mVar = this.f115644b;
        return hashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    public java.lang.String toString() {
        return "LoadMoreInfo(loadMoreCostMs=" + this.f115643a + ", firstLiveData=" + this.f115644b + ')';
    }

    public /* synthetic */ o2(long j17, km2.m mVar, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? 0L : j17, (i17 & 2) != 0 ? null : mVar);
    }
}
