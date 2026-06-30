package vr3;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f439628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f439629b;

    public f(int i17, int i18) {
        this.f439628a = i17;
        this.f439629b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr3.f)) {
            return false;
        }
        vr3.f fVar = (vr3.f) obj;
        return this.f439628a == fVar.f439628a && this.f439629b == fVar.f439629b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f439628a) * 31) + java.lang.Integer.hashCode(this.f439629b);
    }

    public java.lang.String toString() {
        return "DeleteData(appMsgId=" + this.f439628a + ", index=" + this.f439629b + ')';
    }
}
