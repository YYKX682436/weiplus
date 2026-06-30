package d92;

/* loaded from: classes.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.a2 f227517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(d92.a2 a2Var) {
        super(1);
        this.f227517d = a2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int c17 = e92.b.f250347d.c(it, com.tencent.mm.R.id.e76);
        d92.a2 a2Var = this.f227517d;
        if (c17 > 0) {
            java.lang.String string = a2Var.getContext().getString(com.tencent.mm.R.string.f491950er2, java.lang.Integer.valueOf(c17));
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String string2 = a2Var.getContext().getString(com.tencent.mm.R.string.ep_);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }
}
