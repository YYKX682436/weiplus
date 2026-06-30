package mm2;

/* loaded from: classes3.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f329364a;

    /* renamed from: b, reason: collision with root package name */
    public final int f329365b;

    public q2(boolean z17, int i17) {
        this.f329364a = z17;
        this.f329365b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.q2)) {
            return false;
        }
        mm2.q2 q2Var = (mm2.q2) obj;
        return this.f329364a == q2Var.f329364a && this.f329365b == q2Var.f329365b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f329364a) * 31) + java.lang.Integer.hashCode(this.f329365b);
    }

    public java.lang.String toString() {
        return "PanelTurnOnParameters(isTurnOn=" + this.f329364a + ", from=" + this.f329365b + ')';
    }

    public /* synthetic */ q2(boolean z17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(z17, (i18 & 2) != 0 ? 0 : i17);
    }
}
