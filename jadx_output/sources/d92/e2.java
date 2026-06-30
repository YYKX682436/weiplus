package d92;

/* loaded from: classes.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.i2 f227469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(d92.i2 i2Var) {
        super(1);
        this.f227469d = i2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e79);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.e7f);
        boolean J0 = com.tencent.mm.sdk.platformtools.t8.J0(d18);
        d92.i2 i2Var = this.f227469d;
        if (J0) {
            java.lang.String string = i2Var.getContext().getString(com.tencent.mm.R.string.epo, d17);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        java.lang.String string2 = i2Var.getContext().getString(com.tencent.mm.R.string.epn, d17, d18);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }
}
