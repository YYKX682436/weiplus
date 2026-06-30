package gc0;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f270250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.storage.f9 f9Var) {
        super(0);
        this.f270250d = f9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.f9 f9Var = this.f270250d;
        java.lang.String Q0 = f9Var.Q0();
        r45.nl5 nl5Var = (r45.nl5) gc0.y0.f270366b.get(Q0);
        if (nl5Var == null) {
            gc0.f0 f0Var = gc0.f0.f270167a;
            kotlin.jvm.internal.o.d(Q0);
            nl5Var = f0Var.a(Q0);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "sys_msg_note");
        java.lang.String Q02 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q02, "getTalker(...)");
        hashMap.put("add_username", Q02);
        hashMap.putAll(gc0.m1.e(nl5Var));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 33926);
        return jz5.f0.f302826a;
    }
}
