package d92;

/* loaded from: classes.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.i2 f227476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(d92.i2 i2Var) {
        super(1);
        this.f227476d = i2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String string;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e79);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.e5k);
        java.lang.CharSequence d19 = aVar.d(it, com.tencent.mm.R.id.f484418e75);
        java.lang.CharSequence d27 = aVar.d(it, com.tencent.mm.R.id.e77);
        java.lang.CharSequence d28 = aVar.d(it, com.tencent.mm.R.id.e7f);
        boolean J0 = com.tencent.mm.sdk.platformtools.t8.J0(d27);
        d92.i2 i2Var = this.f227476d;
        if (J0 || com.tencent.mm.sdk.platformtools.t8.J0(d28)) {
            string = com.tencent.mm.sdk.platformtools.t8.J0(d18) ? i2Var.getContext().getString(com.tencent.mm.R.string.ep7, d17, d19) : i2Var.getContext().getString(com.tencent.mm.R.string.ep6, d17, d19, d18);
            kotlin.jvm.internal.o.d(string);
        } else {
            string = com.tencent.mm.sdk.platformtools.t8.J0(d18) ? i2Var.getContext().getString(com.tencent.mm.R.string.f491938ep5, d17, d19, d28, d27) : i2Var.getContext().getString(com.tencent.mm.R.string.f491937ep4, d17, d19, d18, d28, d27);
            kotlin.jvm.internal.o.d(string);
        }
        return string;
    }
}
