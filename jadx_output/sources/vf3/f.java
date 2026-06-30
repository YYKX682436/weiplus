package vf3;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public vf3.e f436389a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f436391c;

    /* renamed from: d, reason: collision with root package name */
    public final float f436392d;

    public f(vf3.e state, java.lang.String msg, int i17, float f17, int i18, kotlin.jvm.internal.i iVar) {
        state = (i18 & 1) != 0 ? vf3.e.f436387q : state;
        msg = (i18 & 2) != 0 ? "" : msg;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        f17 = (i18 & 8) != 0 ? 0.0f : f17;
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f436389a = state;
        this.f436390b = msg;
        this.f436391c = i17;
        this.f436392d = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf3.f)) {
            return false;
        }
        vf3.f fVar = (vf3.f) obj;
        return this.f436389a == fVar.f436389a && kotlin.jvm.internal.o.b(this.f436390b, fVar.f436390b) && this.f436391c == fVar.f436391c && java.lang.Float.compare(this.f436392d, fVar.f436392d) == 0;
    }

    public int hashCode() {
        return (((((this.f436389a.hashCode() * 31) + this.f436390b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f436391c)) * 31) + java.lang.Float.hashCode(this.f436392d);
    }

    public java.lang.String toString() {
        return "LiveStateInfo(state=" + this.f436389a + ", msg=" + this.f436390b + ", ret=" + this.f436391c + ", progress=" + this.f436392d + ')';
    }
}
