package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fo0 {

    /* renamed from: a, reason: collision with root package name */
    public final ce2.i f112580a;

    /* renamed from: b, reason: collision with root package name */
    public r45.e82 f112581b;

    public fo0(ce2.i giftInfo, r45.e82 e82Var) {
        kotlin.jvm.internal.o.g(giftInfo, "giftInfo");
        this.f112580a = giftInfo;
        this.f112581b = e82Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.fo0)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.fo0 fo0Var = (com.tencent.mm.plugin.finder.live.plugin.fo0) obj;
        return kotlin.jvm.internal.o.b(this.f112580a, fo0Var.f112580a) && kotlin.jvm.internal.o.b(this.f112581b, fo0Var.f112581b);
    }

    public int hashCode() {
        int hashCode = this.f112580a.hashCode() * 31;
        r45.e82 e82Var = this.f112581b;
        return hashCode + (e82Var == null ? 0 : e82Var.hashCode());
    }

    public java.lang.String toString() {
        return "PrepareRewardSendInfo(giftInfo=" + this.f112580a + ", prepareResp=" + this.f112581b + ')';
    }
}
