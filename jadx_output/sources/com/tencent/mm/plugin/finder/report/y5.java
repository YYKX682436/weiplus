package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class y5 extends fc2.a {

    /* renamed from: d, reason: collision with root package name */
    public final long f125473d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.mb4 f125474e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f125475f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125476g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f125477h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed f125478i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f125479j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f125480k;

    public y5(long j17, r45.mb4 media, java.lang.String objectNonceId, int i17, java.util.LinkedList mediaList, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        kotlin.jvm.internal.o.g(feed, "feed");
        this.f125473d = j17;
        this.f125474e = media;
        this.f125475f = objectNonceId;
        this.f125476g = i17;
        this.f125477h = mediaList;
        this.f125478i = feed;
        this.f125479j = z17;
        this.f125480k = linkedList;
    }

    public final long b() {
        return this.f125473d;
    }

    public final int c() {
        return this.f125476g;
    }

    public final r45.mb4 d() {
        return this.f125474e;
    }

    public final java.util.LinkedList e() {
        return this.f125480k;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.report.y5)) {
            return false;
        }
        com.tencent.mm.plugin.finder.report.y5 y5Var = (com.tencent.mm.plugin.finder.report.y5) obj;
        return this.f125473d == y5Var.f125473d && kotlin.jvm.internal.o.b(this.f125474e, y5Var.f125474e) && kotlin.jvm.internal.o.b(this.f125475f, y5Var.f125475f) && this.f125476g == y5Var.f125476g && kotlin.jvm.internal.o.b(this.f125477h, y5Var.f125477h) && kotlin.jvm.internal.o.b(this.f125478i, y5Var.f125478i) && this.f125479j == y5Var.f125479j && kotlin.jvm.internal.o.b(this.f125480k, y5Var.f125480k);
    }

    public final boolean f() {
        return this.f125479j;
    }

    public int hashCode() {
        int hashCode = ((((((((((((java.lang.Long.hashCode(this.f125473d) * 31) + this.f125474e.hashCode()) * 31) + this.f125475f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f125476g)) * 31) + this.f125477h.hashCode()) * 31) + this.f125478i.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f125479j)) * 31;
        java.util.LinkedList linkedList = this.f125480k;
        return hashCode + (linkedList == null ? 0 : linkedList.hashCode());
    }

    public java.lang.String toString() {
        return "PageChangeEvent(feedId=" + this.f125473d + ", media=" + this.f125474e + ", objectNonceId=" + this.f125475f + ", index=" + this.f125476g + ", mediaList=" + this.f125477h + ", feed=" + this.f125478i + ", isAuto=" + this.f125479j + ", viewInfos=" + this.f125480k + ')';
    }
}
