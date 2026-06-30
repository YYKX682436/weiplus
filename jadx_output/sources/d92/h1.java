package d92;

/* loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.p1 f227479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(d92.p1 p1Var) {
        super(1);
        this.f227479d = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        int c17 = aVar.c(it, com.tencent.mm.R.id.e5i);
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e5j);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.e5h);
        d92.p1 p1Var = this.f227479d;
        if (c17 == 1) {
            java.lang.String string = android.text.TextUtils.isEmpty(d18) ? p1Var.getContext().getString(com.tencent.mm.R.string.cly, d17) : p1Var.getContext().getString(com.tencent.mm.R.string.clz, d17, d18);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (c17 == 2) {
            java.lang.String string2 = p1Var.getContext().getString(com.tencent.mm.R.string.clv, d17);
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        if (c17 != 100) {
            return "";
        }
        java.lang.String string3 = p1Var.getContext().getString(com.tencent.mm.R.string.f491281cm0);
        kotlin.jvm.internal.o.d(string3);
        return string3;
    }
}
