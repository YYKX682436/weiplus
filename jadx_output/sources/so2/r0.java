package so2;

/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f410567a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410568b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410569c;

    /* renamed from: d, reason: collision with root package name */
    public final int f410570d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f410571e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f410572f;

    public r0(long j17, int i17, int i18, int i19, boolean z17, boolean z18, int i27, kotlin.jvm.internal.i iVar) {
        if ((i27 & 1) != 0) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            j17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.N8).getValue()).r()).intValue();
        }
        i17 = (i27 & 2) != 0 ? -1 : i17;
        i18 = (i27 & 4) != 0 ? -1 : i18;
        i19 = (i27 & 8) != 0 ? -1 : i19;
        z17 = (i27 & 16) != 0 ? true : z17;
        z18 = (i27 & 32) != 0 ? false : z18;
        this.f410567a = j17;
        this.f410568b = i17;
        this.f410569c = i18;
        this.f410570d = i19;
        this.f410571e = z17;
        this.f410572f = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.r0)) {
            return false;
        }
        so2.r0 r0Var = (so2.r0) obj;
        return this.f410567a == r0Var.f410567a && this.f410568b == r0Var.f410568b && this.f410569c == r0Var.f410569c && this.f410570d == r0Var.f410570d && this.f410571e == r0Var.f410571e && this.f410572f == r0Var.f410572f;
    }

    public int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.f410567a) * 31) + java.lang.Integer.hashCode(this.f410568b)) * 31) + java.lang.Integer.hashCode(this.f410569c)) * 31) + java.lang.Integer.hashCode(this.f410570d)) * 31) + java.lang.Boolean.hashCode(this.f410571e)) * 31) + java.lang.Boolean.hashCode(this.f410572f);
    }

    public java.lang.String toString() {
        return "Config(fastScrollThreshold=" + this.f410567a + ", fastScrollCount=" + this.f410568b + ", continueFastScrollCount=" + this.f410569c + ", upwardFastScrollCount=" + this.f410570d + ", resetDataAfterCallback=" + this.f410571e + ", fastScrollCheckWhenStateIdle=" + this.f410572f + ')';
    }
}
