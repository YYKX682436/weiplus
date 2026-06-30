package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jc {

    /* renamed from: a, reason: collision with root package name */
    public final float f113079a;

    /* renamed from: b, reason: collision with root package name */
    public final float f113080b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f113081c;

    /* renamed from: d, reason: collision with root package name */
    public final int f113082d;

    public jc(float f17, float f18, android.graphics.drawable.Drawable drawable, int i17) {
        this.f113079a = f17;
        this.f113080b = f18;
        this.f113081c = drawable;
        this.f113082d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.jc)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.jc jcVar = (com.tencent.mm.plugin.finder.live.plugin.jc) obj;
        return java.lang.Float.compare(this.f113079a, jcVar.f113079a) == 0 && java.lang.Float.compare(this.f113080b, jcVar.f113080b) == 0 && kotlin.jvm.internal.o.b(this.f113081c, jcVar.f113081c) && this.f113082d == jcVar.f113082d;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Float.hashCode(this.f113079a) * 31) + java.lang.Float.hashCode(this.f113080b)) * 31;
        android.graphics.drawable.Drawable drawable = this.f113081c;
        return ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + java.lang.Integer.hashCode(this.f113082d);
    }

    public java.lang.String toString() {
        return "AnimationState(originalScaleX=" + this.f113079a + ", originalScaleY=" + this.f113080b + ", originalBackground=" + this.f113081c + ", originalBgColor=" + this.f113082d + ')';
    }
}
