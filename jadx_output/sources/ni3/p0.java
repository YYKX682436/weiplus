package ni3;

/* loaded from: classes10.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final so2.j5 f337670a;

    /* renamed from: b, reason: collision with root package name */
    public final ni3.o0 f337671b;

    /* renamed from: c, reason: collision with root package name */
    public ni3.r0 f337672c;

    /* renamed from: d, reason: collision with root package name */
    public final ni3.q0 f337673d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f337674e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f337675f;

    /* renamed from: g, reason: collision with root package name */
    public final ni3.s0 f337676g;

    /* renamed from: h, reason: collision with root package name */
    public final ni3.s0 f337677h;

    /* renamed from: i, reason: collision with root package name */
    public final ni3.s0 f337678i;

    public p0(so2.j5 feed, ni3.o0 feedContext, ni3.r0 feedPlayInfo, ni3.q0 feedLifeTimeMs, boolean z17, boolean z18, ni3.s0 stageOneLoadLife, ni3.s0 stageTwoLoadLife, ni3.s0 stagePreRenderLoadLife) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(feedContext, "feedContext");
        kotlin.jvm.internal.o.g(feedPlayInfo, "feedPlayInfo");
        kotlin.jvm.internal.o.g(feedLifeTimeMs, "feedLifeTimeMs");
        kotlin.jvm.internal.o.g(stageOneLoadLife, "stageOneLoadLife");
        kotlin.jvm.internal.o.g(stageTwoLoadLife, "stageTwoLoadLife");
        kotlin.jvm.internal.o.g(stagePreRenderLoadLife, "stagePreRenderLoadLife");
        this.f337670a = feed;
        this.f337671b = feedContext;
        this.f337672c = feedPlayInfo;
        this.f337673d = feedLifeTimeMs;
        this.f337674e = z17;
        this.f337675f = z18;
        this.f337676g = stageOneLoadLife;
        this.f337677h = stageTwoLoadLife;
        this.f337678i = stagePreRenderLoadLife;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.p0)) {
            return false;
        }
        ni3.p0 p0Var = (ni3.p0) obj;
        return kotlin.jvm.internal.o.b(this.f337670a, p0Var.f337670a) && kotlin.jvm.internal.o.b(this.f337671b, p0Var.f337671b) && kotlin.jvm.internal.o.b(this.f337672c, p0Var.f337672c) && kotlin.jvm.internal.o.b(this.f337673d, p0Var.f337673d) && this.f337674e == p0Var.f337674e && this.f337675f == p0Var.f337675f && kotlin.jvm.internal.o.b(this.f337676g, p0Var.f337676g) && kotlin.jvm.internal.o.b(this.f337677h, p0Var.f337677h) && kotlin.jvm.internal.o.b(this.f337678i, p0Var.f337678i);
    }

    public int hashCode() {
        return (((((((((((((((this.f337670a.hashCode() * 31) + this.f337671b.hashCode()) * 31) + this.f337672c.hashCode()) * 31) + this.f337673d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f337674e)) * 31) + java.lang.Boolean.hashCode(this.f337675f)) * 31) + this.f337676g.hashCode()) * 31) + this.f337677h.hashCode()) * 31) + this.f337678i.hashCode();
    }

    public java.lang.String toString() {
        ni3.o0 o0Var = this.f337671b;
        return o0Var.f337650d != -1 ? o0Var.toString() : hc2.b0.h(this.f337670a, false, 1, null);
    }
}
