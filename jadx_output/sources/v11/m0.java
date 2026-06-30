package v11;

/* loaded from: classes5.dex */
public final class m0 implements q31.p {

    /* renamed from: d, reason: collision with root package name */
    public final v11.n0 f432442d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f432443e;

    public m0(v11.n0 thinkingState, yz5.p pVar) {
        kotlin.jvm.internal.o.g(thinkingState, "thinkingState");
        this.f432442d = thinkingState;
        this.f432443e = pVar;
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.m0)) {
            return false;
        }
        v11.m0 m0Var = (v11.m0) obj;
        return this.f432442d == m0Var.f432442d && kotlin.jvm.internal.o.b(this.f432443e, m0Var.f432443e);
    }

    public int hashCode() {
        int hashCode = this.f432442d.hashCode() * 31;
        yz5.p pVar = this.f432443e;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public java.lang.String toString() {
        return "ThinkingAreaViewModel(thinkingState=" + this.f432442d + ", onSwitch=" + this.f432443e + ')';
    }
}
