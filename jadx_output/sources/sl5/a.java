package sl5;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f409283a;

    /* renamed from: b, reason: collision with root package name */
    public final float f409284b;

    /* renamed from: c, reason: collision with root package name */
    public final int f409285c;

    /* renamed from: d, reason: collision with root package name */
    public final int f409286d;

    /* renamed from: e, reason: collision with root package name */
    public final long f409287e;

    public a(float f17, float f18, int i17, int i18, long j17, int i19, kotlin.jvm.internal.i iVar) {
        f17 = (i19 & 1) != 0 ? 0.02f : f17;
        f18 = (i19 & 2) != 0 ? 0.23f : f18;
        i17 = (i19 & 4) != 0 ? 500 : i17;
        i18 = (i19 & 8) != 0 ? 15 : i18;
        j17 = (i19 & 16) != 0 ? 150L : j17;
        this.f409283a = f17;
        this.f409284b = f18;
        this.f409285c = i17;
        this.f409286d = i18;
        this.f409287e = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl5.a)) {
            return false;
        }
        sl5.a aVar = (sl5.a) obj;
        return java.lang.Float.compare(this.f409283a, aVar.f409283a) == 0 && java.lang.Float.compare(this.f409284b, aVar.f409284b) == 0 && this.f409285c == aVar.f409285c && this.f409286d == aVar.f409286d && this.f409287e == aVar.f409287e;
    }

    public int hashCode() {
        return (((((((java.lang.Float.hashCode(this.f409283a) * 31) + java.lang.Float.hashCode(this.f409284b)) * 31) + java.lang.Integer.hashCode(this.f409285c)) * 31) + java.lang.Integer.hashCode(this.f409286d)) * 31) + java.lang.Long.hashCode(this.f409287e);
    }

    public java.lang.String toString() {
        return "PinchZoomConfig(directionThreshold=" + this.f409283a + ", applyThreshold=" + this.f409284b + ", autoTransitionDurationMs=" + this.f409285c + ", maxPendingFrames=" + this.f409286d + ", overlayFadeOutDurationMs=" + this.f409287e + ')';
    }
}
