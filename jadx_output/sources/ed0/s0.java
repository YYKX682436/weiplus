package ed0;

/* loaded from: classes9.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f251226a;

    /* renamed from: b, reason: collision with root package name */
    public final int f251227b;

    public s0(java.util.List list, int i17) {
        this.f251226a = list;
        this.f251227b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed0.s0)) {
            return false;
        }
        ed0.s0 s0Var = (ed0.s0) obj;
        return kotlin.jvm.internal.o.b(this.f251226a, s0Var.f251226a) && this.f251227b == s0Var.f251227b;
    }

    public int hashCode() {
        java.util.List list = this.f251226a;
        return ((list == null ? 0 : list.hashCode()) * 31) + java.lang.Integer.hashCode(this.f251227b);
    }

    public java.lang.String toString() {
        return "RingtoneUiState(ringtones=" + this.f251226a + ", uiState=" + this.f251227b + ')';
    }
}
