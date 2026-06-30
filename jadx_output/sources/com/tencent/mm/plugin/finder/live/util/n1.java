package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f115637a;

    /* renamed from: b, reason: collision with root package name */
    public final long f115638b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f115639c;

    public n1(java.lang.String comboId, long j17, java.lang.String fromNickName) {
        kotlin.jvm.internal.o.g(comboId, "comboId");
        kotlin.jvm.internal.o.g(fromNickName, "fromNickName");
        this.f115637a = comboId;
        this.f115638b = j17;
        this.f115639c = fromNickName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.util.n1)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.util.n1 n1Var = (com.tencent.mm.plugin.finder.live.util.n1) obj;
        return kotlin.jvm.internal.o.b(this.f115637a, n1Var.f115637a) && this.f115638b == n1Var.f115638b && kotlin.jvm.internal.o.b(this.f115639c, n1Var.f115639c);
    }

    public int hashCode() {
        return (((this.f115637a.hashCode() * 31) + java.lang.Long.hashCode(this.f115638b)) * 31) + this.f115639c.hashCode();
    }

    public java.lang.String toString() {
        return "OvertimeCacheData(comboId=" + this.f115637a + ", offerTime=" + this.f115638b + ", fromNickName=" + this.f115639c + ')';
    }
}
