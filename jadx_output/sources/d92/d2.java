package d92;

/* loaded from: classes.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.i2 f227464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(d92.i2 i2Var) {
        super(1);
        this.f227464d = i2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String string;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e79);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.e5k);
        java.lang.CharSequence d19 = aVar.d(it, com.tencent.mm.R.id.e77);
        java.lang.CharSequence d27 = aVar.d(it, com.tencent.mm.R.id.e7f);
        boolean J0 = com.tencent.mm.sdk.platformtools.t8.J0(d19);
        d92.i2 i2Var = this.f227464d;
        if (J0 || com.tencent.mm.sdk.platformtools.t8.J0(d27)) {
            string = com.tencent.mm.sdk.platformtools.t8.J0(d18) ? i2Var.getContext().getString(com.tencent.mm.R.string.epo, d17) : i2Var.getContext().getString(com.tencent.mm.R.string.epn, d17, d18);
            kotlin.jvm.internal.o.d(string);
        } else {
            string = com.tencent.mm.sdk.platformtools.t8.J0(d18) ? i2Var.getContext().getString(com.tencent.mm.R.string.epk, d17, d19) : i2Var.getContext().getString(com.tencent.mm.R.string.epj, d17, d18, d27, d19);
            kotlin.jvm.internal.o.d(string);
        }
        return string;
    }
}
