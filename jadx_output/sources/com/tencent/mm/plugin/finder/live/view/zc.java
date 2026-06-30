package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public final class zc {

    /* renamed from: a, reason: collision with root package name */
    public float f116863a;

    /* renamed from: b, reason: collision with root package name */
    public float f116864b;

    /* renamed from: c, reason: collision with root package name */
    public float f116865c;

    /* renamed from: d, reason: collision with root package name */
    public final float f116866d;

    /* renamed from: e, reason: collision with root package name */
    public final float f116867e;

    public zc(float f17, float f18, float f19, float f27, float f28, int i17, kotlin.jvm.internal.i iVar) {
        f18 = (i17 & 2) != 0 ? 0.0f : f18;
        f27 = (i17 & 8) != 0 ? 80.0f : f27;
        f28 = (i17 & 16) != 0 ? 22.0f : f28;
        this.f116863a = f17;
        this.f116864b = f18;
        this.f116865c = f19;
        this.f116866d = f27;
        this.f116867e = f28;
    }

    public final void a(float f17) {
        float min = java.lang.Math.min(f17, 0.05f);
        float f18 = this.f116863a;
        float f19 = (-this.f116866d) * (f18 - this.f116865c);
        float f27 = -this.f116867e;
        float f28 = this.f116864b;
        float f29 = f28 + ((f19 + (f27 * f28)) * min);
        this.f116864b = f29;
        this.f116863a = f18 + (f29 * min);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.view.zc)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.view.zc zcVar = (com.tencent.mm.plugin.finder.live.view.zc) obj;
        return java.lang.Float.compare(this.f116863a, zcVar.f116863a) == 0 && java.lang.Float.compare(this.f116864b, zcVar.f116864b) == 0 && java.lang.Float.compare(this.f116865c, zcVar.f116865c) == 0 && java.lang.Float.compare(this.f116866d, zcVar.f116866d) == 0 && java.lang.Float.compare(this.f116867e, zcVar.f116867e) == 0;
    }

    public int hashCode() {
        return (((((((java.lang.Float.hashCode(this.f116863a) * 31) + java.lang.Float.hashCode(this.f116864b)) * 31) + java.lang.Float.hashCode(this.f116865c)) * 31) + java.lang.Float.hashCode(this.f116866d)) * 31) + java.lang.Float.hashCode(this.f116867e);
    }

    public java.lang.String toString() {
        return "Spring(value=" + this.f116863a + ", velocity=" + this.f116864b + ", target=" + this.f116865c + ", stiffness=" + this.f116866d + ", damping=" + this.f116867e + ')';
    }
}
