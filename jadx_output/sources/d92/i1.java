package d92;

/* loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.p1 f227483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(d92.p1 p1Var) {
        super(1);
        this.f227483d = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e6r);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.e6_);
        java.lang.CharSequence d19 = aVar.d(it, com.tencent.mm.R.id.e6p);
        boolean isEmpty = android.text.TextUtils.isEmpty(d18);
        d92.p1 p1Var = this.f227483d;
        if (isEmpty) {
            java.lang.String string = p1Var.getContext().getString(com.tencent.mm.R.string.f491709e00, d17, d19);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String string2 = p1Var.getContext().getString(com.tencent.mm.R.string.e0h, d17, d18, d19);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }
}
