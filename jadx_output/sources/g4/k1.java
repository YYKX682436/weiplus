package g4;

/* loaded from: classes5.dex */
public final class k1 extends g4.l1 {

    /* renamed from: d, reason: collision with root package name */
    public static final g4.j1 f268401d = new g4.j1(null);

    /* renamed from: a, reason: collision with root package name */
    public final g4.a1 f268402a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f268403b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.y0 f268404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(g4.a1 loadType, boolean z17, g4.y0 loadState) {
        super(null);
        kotlin.jvm.internal.o.g(loadType, "loadType");
        kotlin.jvm.internal.o.g(loadState, "loadState");
        this.f268402a = loadType;
        this.f268403b = z17;
        this.f268404c = loadState;
        if (!((loadType == g4.a1.REFRESH && !z17 && (loadState instanceof g4.x0) && loadState.f268627a) ? false : true)) {
            throw new java.lang.IllegalArgumentException("LoadStateUpdate for local REFRESH may not set endOfPaginationReached = true".toString());
        }
        if (!f268401d.a(loadState, z17)) {
            throw new java.lang.IllegalArgumentException("LoadStateUpdates cannot be used to dispatch NotLoading unless it is from remote mediator and remote mediator reached end of pagination.".toString());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.k1)) {
            return false;
        }
        g4.k1 k1Var = (g4.k1) obj;
        return kotlin.jvm.internal.o.b(this.f268402a, k1Var.f268402a) && this.f268403b == k1Var.f268403b && kotlin.jvm.internal.o.b(this.f268404c, k1Var.f268404c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        g4.a1 a1Var = this.f268402a;
        int hashCode = (a1Var != null ? a1Var.hashCode() : 0) * 31;
        boolean z17 = this.f268403b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode + i17) * 31;
        g4.y0 y0Var = this.f268404c;
        return i18 + (y0Var != null ? y0Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LoadStateUpdate(loadType=" + this.f268402a + ", fromMediator=" + this.f268403b + ", loadState=" + this.f268404c + ")";
    }
}
