package mm2;

/* loaded from: classes3.dex */
public final class o6 {

    /* renamed from: a, reason: collision with root package name */
    public final mm2.p6 f329337a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f329338b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f329339c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.f1 f329340d;

    public o6(mm2.p6 state, yz5.a showBlock, yz5.a timeOutBlock, kotlinx.coroutines.f1 f1Var, int i17, kotlin.jvm.internal.i iVar) {
        f1Var = (i17 & 8) != 0 ? null : f1Var;
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(showBlock, "showBlock");
        kotlin.jvm.internal.o.g(timeOutBlock, "timeOutBlock");
        this.f329337a = state;
        this.f329338b = showBlock;
        this.f329339c = timeOutBlock;
        this.f329340d = f1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.o6)) {
            return false;
        }
        mm2.o6 o6Var = (mm2.o6) obj;
        return this.f329337a == o6Var.f329337a && kotlin.jvm.internal.o.b(this.f329338b, o6Var.f329338b) && kotlin.jvm.internal.o.b(this.f329339c, o6Var.f329339c) && kotlin.jvm.internal.o.b(this.f329340d, o6Var.f329340d);
    }

    public int hashCode() {
        int hashCode = ((((this.f329337a.hashCode() * 31) + this.f329338b.hashCode()) * 31) + this.f329339c.hashCode()) * 31;
        kotlinx.coroutines.f1 f1Var = this.f329340d;
        return hashCode + (f1Var == null ? 0 : f1Var.hashCode());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state: ");
        mm2.p6 p6Var = this.f329337a;
        sb6.append(p6Var.f329357d);
        sb6.append(" priority: ");
        sb6.append(p6Var.f329358e);
        sb6.append(" lockJob: ");
        kotlinx.coroutines.f1 f1Var = this.f329340d;
        sb6.append(f1Var != null ? java.lang.Boolean.valueOf(f1Var.a()) : null);
        return sb6.toString();
    }
}
