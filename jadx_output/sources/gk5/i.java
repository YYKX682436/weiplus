package gk5;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.j f272668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gk5.j jVar) {
        super(1);
        this.f272668d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        gk5.j jVar = this.f272668d;
        if (c0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SelectConfirmAction usernameList:");
            java.util.List list = c0Var.f446282b;
            sb6.append(list);
            sb6.append(": ");
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardFinderFeedUIC", sb6.toString());
            jVar.f272675t.clear();
            jVar.f272675t.addAll(list);
        }
        wi5.t0 t0Var = (wi5.t0) state.a(wi5.t0.class);
        if (t0Var != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SelectUserAction usernameList:");
            ri5.j jVar2 = t0Var.f446341b;
            sb7.append(jVar2);
            sb7.append(": ");
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardFinderFeedUIC", sb7.toString());
            boolean contains = jVar.f272675t.contains(jVar2.f396111f);
            java.util.Set set = jVar.f272675t;
            java.lang.String str = jVar2.f396111f;
            if (contains) {
                set.remove(str);
            } else if (state.f446316i <= 0 || state.f446319o.size() < state.f446316i) {
                set.add(str);
            }
        }
        wi5.x0 x0Var = (wi5.x0) state.a(wi5.x0.class);
        if (x0Var != null) {
            jVar.f272675t.remove(x0Var.f446361b);
        }
        return jz5.f0.f302826a;
    }
}
