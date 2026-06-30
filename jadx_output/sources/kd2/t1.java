package kd2;

/* loaded from: classes10.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f306833a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f306834b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f306835c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f306836d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f306837e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f306838f;

    public t1(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? true : z17;
        z18 = (i17 & 2) != 0 ? true : z18;
        z19 = (i17 & 4) != 0 ? true : z19;
        z27 = (i17 & 8) != 0 ? true : z27;
        z28 = (i17 & 16) != 0 ? true : z28;
        z29 = (i17 & 32) != 0 ? true : z29;
        this.f306833a = z17;
        this.f306834b = z18;
        this.f306835c = z19;
        this.f306836d = z27;
        this.f306837e = z28;
        this.f306838f = z29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd2.t1)) {
            return false;
        }
        kd2.t1 t1Var = (kd2.t1) obj;
        return this.f306833a == t1Var.f306833a && this.f306834b == t1Var.f306834b && this.f306835c == t1Var.f306835c && this.f306836d == t1Var.f306836d && this.f306837e == t1Var.f306837e && this.f306838f == t1Var.f306838f;
    }

    public int hashCode() {
        return (((((((((java.lang.Boolean.hashCode(this.f306833a) * 31) + java.lang.Boolean.hashCode(this.f306834b)) * 31) + java.lang.Boolean.hashCode(this.f306835c)) * 31) + java.lang.Boolean.hashCode(this.f306836d)) * 31) + java.lang.Boolean.hashCode(this.f306837e)) * 31) + java.lang.Boolean.hashCode(this.f306838f);
    }

    public java.lang.String toString() {
        return "LiveMinimizeState(isPlaying=" + this.f306833a + ", enablePlayButton=" + this.f306834b + ", showPlayButton=" + this.f306835c + ", showDeleteButton=" + this.f306836d + ", isShowAudioAnimation=" + this.f306837e + ", isShowPlayModeButton=" + this.f306838f + ')';
    }
}
