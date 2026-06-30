package d92;

/* loaded from: classes.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.p1 f227492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(d92.p1 p1Var) {
        super(1);
        this.f227492d = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e7k);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.e5k);
        java.lang.CharSequence d19 = aVar.d(it, com.tencent.mm.R.id.f484408e61);
        java.lang.String string = this.f227492d.getContext().getString(com.tencent.mm.R.string.ezx, d17, d18, aVar.d(it, com.tencent.mm.R.id.e7b), d19);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
