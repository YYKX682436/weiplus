package d92;

/* loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.p1 f227498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(d92.p1 p1Var) {
        super(1);
        this.f227498d = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.String string = this.f227498d.getContext().getString(com.tencent.mm.R.string.f492031f02, aVar.d(it, com.tencent.mm.R.id.e7k), aVar.d(it, com.tencent.mm.R.id.e7h));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
