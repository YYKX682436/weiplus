package qq;

/* loaded from: classes9.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f365879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context) {
        super(1);
        this.f365879d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("EcsTestService", "[OracleTest] clickAction, jump to mini app");
        bw5.x7 x7Var = new bw5.x7();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("wxa");
        x7Var.j(linkedList);
        bw5.u7 u7Var = new bw5.u7();
        u7Var.e("wxca8d4b8e8feedc2a");
        u7Var.f("subpackages/testenv/pages/testJsApi/index.html");
        u7Var.j(2);
        u7Var.g(1011);
        x7Var.k(u7Var);
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q.Lb((pq.q) c17, new pq.a(this.f365879d), x7Var, null, 4, null);
        return jz5.f0.f302826a;
    }
}
