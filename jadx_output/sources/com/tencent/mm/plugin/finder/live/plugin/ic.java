package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ic {

    /* renamed from: a, reason: collision with root package name */
    public final float f112954a;

    /* renamed from: b, reason: collision with root package name */
    public final float f112955b;

    /* renamed from: c, reason: collision with root package name */
    public final float f112956c;

    /* renamed from: d, reason: collision with root package name */
    public final long f112957d;

    public ic(float f17, float f18, float f19, long j17, int i17, kotlin.jvm.internal.i iVar) {
        f17 = (i17 & 1) != 0 ? 1.0f : f17;
        f18 = (i17 & 2) != 0 ? 1.4f : f18;
        f19 = (i17 & 4) != 0 ? 1.1f : f19;
        j17 = (i17 & 8) != 0 ? 300L : j17;
        this.f112954a = f17;
        this.f112955b = f18;
        this.f112956c = f19;
        this.f112957d = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.ic)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.ic icVar = (com.tencent.mm.plugin.finder.live.plugin.ic) obj;
        return java.lang.Float.compare(this.f112954a, icVar.f112954a) == 0 && java.lang.Float.compare(this.f112955b, icVar.f112955b) == 0 && java.lang.Float.compare(this.f112956c, icVar.f112956c) == 0 && this.f112957d == icVar.f112957d;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f112954a) * 31) + java.lang.Float.hashCode(this.f112955b)) * 31) + java.lang.Float.hashCode(this.f112956c)) * 31) + java.lang.Long.hashCode(this.f112957d);
    }

    public java.lang.String toString() {
        return "AnimationConfig(scale40pt=" + this.f112954a + ", scale56pt=" + this.f112955b + ", scale44pt=" + this.f112956c + ", duration=" + this.f112957d + ')';
    }
}
