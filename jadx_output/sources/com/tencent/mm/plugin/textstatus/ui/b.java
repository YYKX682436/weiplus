package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f173737a;

    /* renamed from: b, reason: collision with root package name */
    public final float f173738b;

    /* renamed from: c, reason: collision with root package name */
    public final int f173739c;

    /* renamed from: d, reason: collision with root package name */
    public final int f173740d;

    /* renamed from: e, reason: collision with root package name */
    public final long f173741e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.animation.Interpolator f173742f;

    public b(float f17, float f18, int i17, int i18, long j17, android.view.animation.Interpolator interpolator, int i19, kotlin.jvm.internal.i iVar) {
        interpolator = (i19 & 32) != 0 ? ta5.h.f416879a.a() : interpolator;
        kotlin.jvm.internal.o.g(interpolator, "interpolator");
        this.f173737a = f17;
        this.f173738b = f18;
        this.f173739c = i17;
        this.f173740d = i18;
        this.f173741e = j17;
        this.f173742f = interpolator;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.textstatus.ui.b)) {
            return false;
        }
        com.tencent.mm.plugin.textstatus.ui.b bVar = (com.tencent.mm.plugin.textstatus.ui.b) obj;
        return java.lang.Float.compare(this.f173737a, bVar.f173737a) == 0 && java.lang.Float.compare(this.f173738b, bVar.f173738b) == 0 && this.f173739c == bVar.f173739c && this.f173740d == bVar.f173740d && this.f173741e == bVar.f173741e && kotlin.jvm.internal.o.b(this.f173742f, bVar.f173742f);
    }

    public int hashCode() {
        return (((((((((java.lang.Float.hashCode(this.f173737a) * 31) + java.lang.Float.hashCode(this.f173738b)) * 31) + java.lang.Integer.hashCode(this.f173739c)) * 31) + java.lang.Integer.hashCode(this.f173740d)) * 31) + java.lang.Long.hashCode(this.f173741e)) * 31) + this.f173742f.hashCode();
    }

    public java.lang.String toString() {
        return "AnimationStage(startSize=" + this.f173737a + ", endSize=" + this.f173738b + ", startColor=" + this.f173739c + ", endColor=" + this.f173740d + ", duration=" + this.f173741e + ", interpolator=" + this.f173742f + ')';
    }
}
