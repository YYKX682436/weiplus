package wu;

/* loaded from: classes9.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.w0 f449615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(wu.w0 w0Var) {
        super(2);
        this.f449615d = w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View v17 = (android.view.View) obj;
        hu.b item = (hu.b) obj2;
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        s15.m s17 = item.f284997e.s();
        if (s17 != null) {
            int i17 = com.tencent.mm.storage.z3.R4(this.f449615d.f449610e.q()) ? 3 : 2;
            int p17 = s17.p();
            ya2.e1 e1Var = ya2.e1.f460472a;
            if (p17 != 0) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                android.content.Context context = v17.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                e1Var.u(context, yu.m.a(s17), i17);
            } else {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                android.content.Context context2 = v17.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                e1Var.n(context2, yu.m.a(s17), i17);
            }
        }
        return jz5.f0.f302826a;
    }
}
