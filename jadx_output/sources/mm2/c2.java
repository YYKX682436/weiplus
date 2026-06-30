package mm2;

/* loaded from: classes3.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f328930a;

    /* renamed from: b, reason: collision with root package name */
    public int f328931b;

    public c2(int i17, int i18) {
        this.f328930a = i17;
        this.f328931b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.c2)) {
            return false;
        }
        mm2.c2 c2Var = (mm2.c2) obj;
        return this.f328930a == c2Var.f328930a && this.f328931b == c2Var.f328931b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f328930a) * 31) + java.lang.Integer.hashCode(this.f328931b);
    }

    public java.lang.String toString() {
        return "DanmakuSpeed(landscapeDuration=" + this.f328930a + ", landscapeInterval=" + this.f328931b + ')';
    }
}
