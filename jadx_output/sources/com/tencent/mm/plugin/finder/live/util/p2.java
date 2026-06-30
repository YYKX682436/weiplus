package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f115647a;

    /* renamed from: b, reason: collision with root package name */
    public final int f115648b;

    public p2(java.lang.String comboId, int i17) {
        kotlin.jvm.internal.o.g(comboId, "comboId");
        this.f115647a = comboId;
        this.f115648b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.util.p2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.util.p2 p2Var = (com.tencent.mm.plugin.finder.live.util.p2) obj;
        return kotlin.jvm.internal.o.b(this.f115647a, p2Var.f115647a) && this.f115648b == p2Var.f115648b;
    }

    public int hashCode() {
        return (this.f115647a.hashCode() * 31) + java.lang.Integer.hashCode(this.f115648b);
    }

    public java.lang.String toString() {
        return "ClickObject(comboId=" + this.f115647a + ", cnt=" + this.f115648b + ')';
    }
}
