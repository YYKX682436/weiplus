package d92;

/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.u1 f227508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(d92.u1 u1Var) {
        super(1);
        this.f227508d = u1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e79);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.f484408e61);
        java.lang.CharSequence d19 = aVar.d(it, com.tencent.mm.R.id.e5o);
        int c17 = aVar.c(it, com.tencent.mm.R.id.e5i);
        int c18 = aVar.c(it, com.tencent.mm.R.id.f484416e73);
        d92.f fVar = d92.f.f227470a;
        d92.u1 u1Var = this.f227508d;
        java.lang.CharSequence c19 = fVar.c(u1Var.getContext(), c17);
        java.lang.CharSequence f17 = fVar.f(u1Var.getContext(), c18);
        if (((java.lang.String) f17).length() == 0) {
            return "";
        }
        java.lang.String string = u1Var.getContext().getString(com.tencent.mm.R.string.ci6);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = u1Var.getContext().getString(com.tencent.mm.R.string.f2e, d17, f17, c19, string, d18, d19);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }
}
