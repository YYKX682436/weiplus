package in5;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f293143a;

    /* renamed from: b, reason: collision with root package name */
    public int f293144b;

    /* renamed from: c, reason: collision with root package name */
    public int f293145c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f293146d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.LongSparseArray f293147e;

    public v0(int i17, int i18, int i19) {
        this.f293143a = i17;
        this.f293144b = i18;
        this.f293145c = i19;
    }

    public final boolean a() {
        return this.f293146d;
    }

    public final void b(boolean z17) {
        this.f293146d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in5.v0)) {
            return false;
        }
        in5.v0 v0Var = (in5.v0) obj;
        return this.f293143a == v0Var.f293143a && this.f293144b == v0Var.f293144b && this.f293145c == v0Var.f293145c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f293143a) * 31) + java.lang.Integer.hashCode(this.f293144b)) * 31) + java.lang.Integer.hashCode(this.f293145c);
    }

    public java.lang.String toString() {
        return "WxItemShowInfo(spanIndex=" + this.f293143a + ", width=" + this.f293144b + ", height=" + this.f293145c + ')';
    }
}
