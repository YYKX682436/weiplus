package d92;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.r f227493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d92.r rVar) {
        super(1);
        this.f227493d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e79);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.e5n);
        java.lang.CharSequence d19 = aVar.d(it, com.tencent.mm.R.id.e5l);
        java.lang.String string = this.f227493d.getContext().getString(com.tencent.mm.R.string.cpq, d17, d18, aVar.d(it, com.tencent.mm.R.id.e7f), d19);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
