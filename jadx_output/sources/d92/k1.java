package d92;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.p1 f227487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(d92.p1 p1Var) {
        super(1);
        this.f227487d = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.f484408e61);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.e5o);
        boolean a17 = aVar.a(it, com.tencent.mm.R.id.f484407e60);
        boolean a18 = aVar.a(it, com.tencent.mm.R.id.e5z);
        int c17 = aVar.c(it, com.tencent.mm.R.id.f484416e73);
        d92.p1 p1Var = this.f227487d;
        java.lang.String string = c17 != 2 ? c17 != 4 ? c17 != 9 ? "" : p1Var.getContext().getString(com.tencent.mm.R.string.eld) : p1Var.getContext().getString(com.tencent.mm.R.string.ele) : p1Var.getContext().getString(com.tencent.mm.R.string.elb);
        kotlin.jvm.internal.o.d(string);
        if (a17) {
            string = p1Var.getContext().getString(com.tencent.mm.R.string.f8k) + string;
        }
        java.lang.String string2 = p1Var.getContext().getString(a18 ? com.tencent.mm.R.string.ci7 : com.tencent.mm.R.string.ci6);
        kotlin.jvm.internal.o.d(string2);
        java.lang.String string3 = p1Var.getContext().getString(com.tencent.mm.R.string.ez8, string, string2, d17, d18);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        return string3;
    }
}
