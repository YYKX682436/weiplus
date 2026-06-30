package so5;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f410886a;

    /* renamed from: b, reason: collision with root package name */
    public int f410887b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f410888c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f410889d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f410890e;

    public n(int i17, int i18, boolean z17, boolean z18, boolean z19) {
        this.f410886a = i17;
        this.f410887b = i18;
        this.f410888c = z17;
        this.f410889d = z18;
        this.f410890e = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so5.n)) {
            return false;
        }
        so5.n nVar = (so5.n) obj;
        return this.f410886a == nVar.f410886a && this.f410887b == nVar.f410887b && this.f410888c == nVar.f410888c && this.f410889d == nVar.f410889d && this.f410890e == nVar.f410890e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f410886a) * 31) + java.lang.Integer.hashCode(this.f410887b)) * 31) + java.lang.Boolean.hashCode(this.f410888c)) * 31) + java.lang.Boolean.hashCode(this.f410889d)) * 31) + java.lang.Boolean.hashCode(this.f410890e);
    }

    public java.lang.String toString() {
        return "CodecErrorInfo(avcErrorNum=" + this.f410886a + ", hevcErrorNum=" + this.f410887b + ", nowInRenderState=" + this.f410888c + ", needReset=" + this.f410889d + ", needRecreate=" + this.f410890e + ')';
    }
}
