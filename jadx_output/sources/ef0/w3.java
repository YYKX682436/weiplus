package ef0;

/* loaded from: classes8.dex */
public final class w3 implements zy2.da {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.z3 f252351a;

    public w3(ef0.z3 z3Var) {
        this.f252351a = z3Var;
    }

    @Override // zy2.da
    public boolean a(r45.vs2 ctrInfo) {
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        int i17 = ctrInfo.f388487e;
        if (i17 < 600000 || i17 >= 699999) {
            return false;
        }
        java.util.LinkedList<r45.f03> show_infos = ctrInfo.f388489g;
        kotlin.jvm.internal.o.f(show_infos, "show_infos");
        for (r45.f03 f03Var : show_infos) {
            qk.d9 d9Var = (qk.d9) i95.n0.c(qk.d9.class);
            java.lang.String str = f03Var.f373892i;
            ((ef0.z3) d9Var).getClass();
            java.util.Map map = em4.c.f255214b;
            if (str == null) {
                str = "";
            }
            ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
            this.f252351a.getClass();
            if (em4.c.f255213a.c(f03Var.f373892i)) {
                em4.c.d("red_dot_received", em4.c.b(ctrInfo, f03Var, null, 4, null));
            }
        }
        return false;
    }
}
