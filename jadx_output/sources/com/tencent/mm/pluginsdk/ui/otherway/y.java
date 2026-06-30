package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final wj.t0 f191038a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.a f191039b;

    public y(wj.t0 magicAdPosId, com.tencent.mm.pluginsdk.model.a businessType) {
        kotlin.jvm.internal.o.g(magicAdPosId, "magicAdPosId");
        kotlin.jvm.internal.o.g(businessType, "businessType");
        this.f191038a = magicAdPosId;
        this.f191039b = businessType;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.pluginsdk.ui.otherway.y)) {
            return false;
        }
        com.tencent.mm.pluginsdk.ui.otherway.y yVar = (com.tencent.mm.pluginsdk.ui.otherway.y) obj;
        return this.f191038a == yVar.f191038a && this.f191039b == yVar.f191039b;
    }

    public int hashCode() {
        return (this.f191038a.hashCode() * 31) + this.f191039b.hashCode();
    }

    public java.lang.String toString() {
        return "AdPositionInfo(magicAdPosId=" + this.f191038a + ", businessType=" + this.f191039b + ')';
    }
}
