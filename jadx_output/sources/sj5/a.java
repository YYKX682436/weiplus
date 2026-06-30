package sj5;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f408910a;

    /* renamed from: b, reason: collision with root package name */
    public final float f408911b;

    /* renamed from: c, reason: collision with root package name */
    public final long f408912c;

    /* renamed from: d, reason: collision with root package name */
    public float f408913d;

    /* renamed from: e, reason: collision with root package name */
    public final float f408914e;

    public a(float f17, float f18, long j17, float f19, float f27) {
        this.f408910a = f17;
        this.f408911b = f18;
        this.f408912c = j17;
        this.f408913d = f19;
        this.f408914e = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj5.a)) {
            return false;
        }
        sj5.a aVar = (sj5.a) obj;
        return java.lang.Float.compare(this.f408910a, aVar.f408910a) == 0 && java.lang.Float.compare(this.f408911b, aVar.f408911b) == 0 && this.f408912c == aVar.f408912c && java.lang.Float.compare(this.f408913d, aVar.f408913d) == 0 && java.lang.Float.compare(this.f408914e, aVar.f408914e) == 0;
    }

    public int hashCode() {
        return (((((((java.lang.Float.hashCode(this.f408910a) * 31) + java.lang.Float.hashCode(this.f408911b)) * 31) + java.lang.Long.hashCode(this.f408912c)) * 31) + java.lang.Float.hashCode(this.f408913d)) * 31) + java.lang.Float.hashCode(this.f408914e);
    }

    public java.lang.String toString() {
        return "TouchSession(downRawY=" + this.f408910a + ", downPosition=" + this.f408911b + ", downUptimeMs=" + this.f408912c + ", maxMoveDistance=" + this.f408913d + ", grabOffsetY=" + this.f408914e + ')';
    }

    public /* synthetic */ a(float f17, float f18, long j17, float f19, float f27, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? 0.0f : f17, (i17 & 2) != 0 ? 0.0f : f18, (i17 & 4) != 0 ? 0L : j17, (i17 & 8) != 0 ? 0.0f : f19, (i17 & 16) != 0 ? 0.0f : f27);
    }
}
