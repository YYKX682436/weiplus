package qm2;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f364715a;

    /* renamed from: b, reason: collision with root package name */
    public final int f364716b;

    /* renamed from: c, reason: collision with root package name */
    public final float f364717c;

    /* renamed from: d, reason: collision with root package name */
    public final float f364718d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f364719e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f364720f;

    /* renamed from: g, reason: collision with root package name */
    public final int f364721g;

    public f(int i17, int i18, float f17, float f18, boolean z17, boolean z18, int i19) {
        this.f364715a = i17;
        this.f364716b = i18;
        this.f364717c = f17;
        this.f364718d = f18;
        this.f364719e = z17;
        this.f364720f = z18;
        this.f364721g = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm2.f)) {
            return false;
        }
        qm2.f fVar = (qm2.f) obj;
        return this.f364715a == fVar.f364715a && this.f364716b == fVar.f364716b && java.lang.Float.compare(this.f364717c, fVar.f364717c) == 0 && java.lang.Float.compare(this.f364718d, fVar.f364718d) == 0 && this.f364719e == fVar.f364719e && this.f364720f == fVar.f364720f && this.f364721g == fVar.f364721g;
    }

    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.f364715a) * 31) + java.lang.Integer.hashCode(this.f364716b)) * 31) + java.lang.Float.hashCode(this.f364717c)) * 31) + java.lang.Float.hashCode(this.f364718d)) * 31) + java.lang.Boolean.hashCode(this.f364719e)) * 31) + java.lang.Boolean.hashCode(this.f364720f)) * 31) + java.lang.Integer.hashCode(this.f364721g);
    }

    public java.lang.String toString() {
        return "NetSpeedTestResult(testResult=" + this.f364715a + ", avgSpeed=" + this.f364716b + ", rtt=" + this.f364717c + ", jitter=" + this.f364718d + ", uploadSuccessful=" + this.f364719e + ", downloadSuccessful=" + this.f364720f + ", aveDownSpeed=" + this.f364721g + ')';
    }

    public /* synthetic */ f(int i17, int i18, float f17, float f18, boolean z17, boolean z18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        this((i27 & 1) != 0 ? -1 : i17, (i27 & 2) != 0 ? 0 : i18, (i27 & 4) != 0 ? 0.0f : f17, (i27 & 8) == 0 ? f18 : 0.0f, (i27 & 16) != 0 ? false : z17, (i27 & 32) != 0 ? false : z18, (i27 & 64) == 0 ? i19 : 0);
    }
}
