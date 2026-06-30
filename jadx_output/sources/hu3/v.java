package hu3;

/* loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(hu3.n0 n0Var) {
        super(0);
        this.f285208d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hu3.n0 n0Var = this.f285208d;
        android.content.Context context = n0Var.f285160d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        hu3.q0 q0Var = new hu3.q0(context);
        q0Var.b(i65.a.r(n0Var.f285160d.getContext(), com.tencent.mm.R.string.hth));
        return q0Var;
    }
}
