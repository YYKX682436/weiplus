package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kj {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f113256a;

    /* renamed from: b, reason: collision with root package name */
    public final int f113257b;

    /* renamed from: c, reason: collision with root package name */
    public final int f113258c;

    /* renamed from: d, reason: collision with root package name */
    public final long f113259d;

    /* renamed from: e, reason: collision with root package name */
    public final int f113260e;

    /* renamed from: f, reason: collision with root package name */
    public final int f113261f;

    /* renamed from: g, reason: collision with root package name */
    public final int f113262g;

    public kj(java.lang.String tabName, int i17, int i18, long j17, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(tabName, "tabName");
        this.f113256a = tabName;
        this.f113257b = i17;
        this.f113258c = i18;
        this.f113259d = j17;
        this.f113260e = i19;
        this.f113261f = i27;
        this.f113262g = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.kj)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.kj kjVar = (com.tencent.mm.plugin.finder.live.plugin.kj) obj;
        return kotlin.jvm.internal.o.b(this.f113256a, kjVar.f113256a) && this.f113257b == kjVar.f113257b && this.f113258c == kjVar.f113258c && this.f113259d == kjVar.f113259d && this.f113260e == kjVar.f113260e && this.f113261f == kjVar.f113261f && this.f113262g == kjVar.f113262g;
    }

    public int hashCode() {
        return (((((((((((this.f113256a.hashCode() * 31) + java.lang.Integer.hashCode(this.f113257b)) * 31) + java.lang.Integer.hashCode(this.f113258c)) * 31) + java.lang.Long.hashCode(this.f113259d)) * 31) + java.lang.Integer.hashCode(this.f113260e)) * 31) + java.lang.Integer.hashCode(this.f113261f)) * 31) + java.lang.Integer.hashCode(this.f113262g);
    }

    public java.lang.String toString() {
        return "LoadMoreReportCtx(tabName=" + this.f113256a + ", groupId=" + this.f113257b + ", pageIndex=" + this.f113258c + ", requestStartMs=" + this.f113259d + ", oldItemCount=" + this.f113260e + ", oldGiftCacheSize=" + this.f113261f + ", lastBufferSize=" + this.f113262g + ')';
    }
}
