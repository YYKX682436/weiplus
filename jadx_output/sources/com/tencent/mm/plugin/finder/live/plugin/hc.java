package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hc {

    /* renamed from: a, reason: collision with root package name */
    public final int f112795a;

    /* renamed from: b, reason: collision with root package name */
    public final int f112796b;

    public hc(int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 1) != 0 ? android.graphics.Color.parseColor("#66000000") : i17;
        i18 = (i19 & 2) != 0 ? android.graphics.Color.parseColor("#59000000") : i18;
        this.f112795a = i17;
        this.f112796b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.hc)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.hc hcVar = (com.tencent.mm.plugin.finder.live.plugin.hc) obj;
        return this.f112795a == hcVar.f112795a && this.f112796b == hcVar.f112796b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f112795a) * 31) + java.lang.Integer.hashCode(this.f112796b);
    }

    public java.lang.String toString() {
        return "AnimationColors(color40Percent=" + this.f112795a + ", color35Percent=" + this.f112796b + ')';
    }
}
