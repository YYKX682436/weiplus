package d92;

/* loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.p1 f227485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(d92.p1 p1Var) {
        super(1);
        this.f227485d = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.String string = this.f227485d.getContext().getString(com.tencent.mm.R.string.f491254cj2, aVar.d(it, com.tencent.mm.R.id.e5f), aVar.d(it, com.tencent.mm.R.id.e5g), aVar.d(it, com.tencent.mm.R.id.e5e));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
