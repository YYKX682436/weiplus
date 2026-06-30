package os5;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f348292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f348293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f348294c;

    public u(int i17, int i18, int i19) {
        this.f348292a = i17;
        this.f348293b = i18;
        this.f348294c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os5.u)) {
            return false;
        }
        os5.u uVar = (os5.u) obj;
        return this.f348292a == uVar.f348292a && this.f348293b == uVar.f348293b && this.f348294c == uVar.f348294c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f348292a) * 31) + java.lang.Integer.hashCode(this.f348293b)) * 31) + java.lang.Integer.hashCode(this.f348294c);
    }

    public java.lang.String toString() {
        return "ShowBoxConfig(textSize=" + this.f348292a + ", tagHeight=" + this.f348293b + ", paddingHorizontal=" + this.f348294c + ')';
    }
}
