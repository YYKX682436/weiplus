package ro5;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f398181a;

    /* renamed from: b, reason: collision with root package name */
    public final int f398182b;

    /* renamed from: c, reason: collision with root package name */
    public final int f398183c;

    /* renamed from: d, reason: collision with root package name */
    public final int f398184d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f398185e;

    public e(int i17, int i18, int i19, int i27, boolean z17) {
        this.f398181a = i17;
        this.f398182b = i18;
        this.f398183c = i19;
        this.f398184d = i27;
        this.f398185e = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro5.e)) {
            return false;
        }
        ro5.e eVar = (ro5.e) obj;
        return this.f398181a == eVar.f398181a && this.f398182b == eVar.f398182b && this.f398183c == eVar.f398183c && this.f398184d == eVar.f398184d && this.f398185e == eVar.f398185e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f398181a) * 31) + java.lang.Integer.hashCode(this.f398182b)) * 31) + java.lang.Integer.hashCode(this.f398183c)) * 31) + java.lang.Integer.hashCode(this.f398184d)) * 31) + java.lang.Boolean.hashCode(this.f398185e);
    }

    public java.lang.String toString() {
        return "MemberInfo(memberId=" + this.f398181a + ", width=" + this.f398182b + ", height=" + this.f398183c + ", rotate=" + this.f398184d + ", isLandscapeMode=" + this.f398185e + ')';
    }
}
