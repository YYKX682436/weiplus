package d92;

/* loaded from: classes.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.a2 f227514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(d92.a2 a2Var) {
        super(1);
        this.f227514d = a2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String string;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e79);
        int c17 = aVar.c(it, com.tencent.mm.R.id.e5t);
        int c18 = aVar.c(it, com.tencent.mm.R.id.e5i);
        d92.a2 a2Var = this.f227514d;
        android.app.Activity context = a2Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        if (c18 == 1) {
            string = context.getString(com.tencent.mm.R.string.clx);
            kotlin.jvm.internal.o.d(string);
        } else if (c18 != 2) {
            string = "";
        } else {
            string = context.getString(com.tencent.mm.R.string.clu);
            kotlin.jvm.internal.o.d(string);
        }
        java.lang.String string2 = a2Var.getContext().getString(com.tencent.mm.R.string.ch9, d17, string, java.lang.Integer.valueOf(c17));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }
}
