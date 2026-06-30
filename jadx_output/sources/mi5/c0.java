package mi5;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.e0 f326805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l15.c f326806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(mi5.e0 e0Var, l15.c cVar) {
        super(1);
        this.f326805d = e0Var;
        this.f326806e = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        a11.c holder = (a11.c) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        mi5.e0 e0Var = this.f326805d;
        android.view.View view = holder.f504a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e0Var.c(context, this.f326806e, holder.f505b, holder.f506c, mi5.a0.f326793d);
        mi5.e0 e0Var2 = this.f326805d;
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        e0Var2.d(context2, this.f326806e, holder.f505b, holder.f506c, new mi5.b0(holder));
        return jz5.f0.f302826a;
    }
}
