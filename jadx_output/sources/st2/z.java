package st2;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(st2.h1 h1Var) {
        super(1);
        this.f412510d = h1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cm2.k0 item = (cm2.k0) obj;
        kotlin.jvm.internal.o.g(item, "item");
        st2.h1 h1Var = this.f412510d;
        h1Var.getClass();
        bw5.x7 x7Var = (bw5.x7) item.f43360v.getCustom(35);
        if (x7Var != null) {
            android.content.Context context = h1Var.f412333d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pq.a aVar = new pq.a(context);
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq.q.Lb((pq.q) c17, aVar, x7Var, null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
