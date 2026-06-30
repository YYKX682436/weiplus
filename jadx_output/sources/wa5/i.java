package wa5;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f444321a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f444322b;

    public i(java.lang.String transitionName, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(transitionName, "transitionName");
        this.f444321a = transitionName;
        this.f444322b = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa5.i)) {
            return false;
        }
        wa5.i iVar = (wa5.i) obj;
        return kotlin.jvm.internal.o.b(this.f444321a, iVar.f444321a) && kotlin.jvm.internal.o.b(this.f444322b, iVar.f444322b);
    }

    public int hashCode() {
        int hashCode = this.f444321a.hashCode() * 31;
        java.lang.Object obj = this.f444322b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "TransitionInfo(transitionName=" + this.f444321a + ", extraInfo=" + this.f444322b + ')';
    }
}
