package fk2;

/* loaded from: classes3.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.v2 f263483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(fk2.v2 v2Var) {
        super(1);
        this.f263483d = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r4Var.G(context, this.f263483d.f263501m);
        return java.lang.Boolean.TRUE;
    }
}
