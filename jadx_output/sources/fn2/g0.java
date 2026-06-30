package fn2;

/* loaded from: classes9.dex */
public final class g0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.m0 f264261d;

    public g0(fn2.m0 m0Var) {
        this.f264261d = m0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.ox1 ox1Var = (r45.ox1) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Play list count to_sing ");
        sb6.append(ox1Var != null ? new java.lang.Integer(ox1Var.f382594d) : null);
        sb6.append(" has_sung ");
        sb6.append(ox1Var != null ? new java.lang.Integer(ox1Var.f382595e) : null);
        sb6.append(" self_to_sing ");
        sb6.append(ox1Var != null ? new java.lang.Integer(ox1Var.f382596f) : null);
        sb6.append(" self_sung ");
        sb6.append(ox1Var != null ? new java.lang.Integer(ox1Var.f382597g) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongTabRequested", sb6.toString());
        int i17 = ox1Var != null ? ox1Var.f382594d : 0;
        fn2.m0 m0Var = this.f264261d;
        fn2.m0.b(m0Var, 0, i17);
        fn2.m0.b(m0Var, 1, ox1Var != null ? ox1Var.f382595e : 0);
        fn2.m0.b(m0Var, 2, (ox1Var != null ? ox1Var.f382596f : 0) + (ox1Var != null ? ox1Var.f382597g : 0));
        return jz5.f0.f302826a;
    }
}
