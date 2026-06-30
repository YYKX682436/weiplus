package dk2;

/* loaded from: classes3.dex */
public final class vg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.d22 f234254a;

    /* renamed from: b, reason: collision with root package name */
    public int f234255b;

    /* renamed from: c, reason: collision with root package name */
    public int f234256c;

    /* renamed from: d, reason: collision with root package name */
    public final int f234257d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f234258e;

    /* renamed from: f, reason: collision with root package name */
    public long f234259f;

    public vg(r45.d22 musicInfo, int i17, int i18, int i19, boolean z17, long j17, int i27, kotlin.jvm.internal.i iVar) {
        i19 = (i27 & 8) != 0 ? 2 : i19;
        z17 = (i27 & 16) != 0 ? false : z17;
        j17 = (i27 & 32) != 0 ? 0L : j17;
        kotlin.jvm.internal.o.g(musicInfo, "musicInfo");
        this.f234254a = musicInfo;
        this.f234255b = i17;
        this.f234256c = i18;
        this.f234257d = i19;
        this.f234258e = z17;
        this.f234259f = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.vg)) {
            return false;
        }
        dk2.vg vgVar = (dk2.vg) obj;
        return kotlin.jvm.internal.o.b(this.f234254a, vgVar.f234254a) && this.f234255b == vgVar.f234255b && this.f234256c == vgVar.f234256c && this.f234257d == vgVar.f234257d && this.f234258e == vgVar.f234258e && this.f234259f == vgVar.f234259f;
    }

    public int hashCode() {
        return (((((((((this.f234254a.hashCode() * 31) + java.lang.Integer.hashCode(this.f234255b)) * 31) + java.lang.Integer.hashCode(this.f234256c)) * 31) + java.lang.Integer.hashCode(this.f234257d)) * 31) + java.lang.Boolean.hashCode(this.f234258e)) * 31) + java.lang.Long.hashCode(this.f234259f);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("musicInfo:");
        r45.d22 d22Var = this.f234254a;
        boolean z17 = true;
        sb6.append(d22Var.getString(1));
        sb6.append(',');
        sb6.append(dk2.q.e(d22Var));
        sb6.append(",url is empty:");
        java.lang.String string = d22Var.getString(7);
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        sb6.append(z17);
        sb6.append(",playStatus:");
        sb6.append(this.f234255b);
        sb6.append(",favState:");
        sb6.append(this.f234256c);
        sb6.append(", type:");
        sb6.append(this.f234257d);
        sb6.append(", select:");
        sb6.append(this.f234258e);
        return sb6.toString();
    }
}
