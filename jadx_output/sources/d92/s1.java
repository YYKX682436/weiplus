package d92;

/* loaded from: classes.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.u1 f227505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(d92.u1 u1Var) {
        super(1);
        this.f227505d = u1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = this.f227505d.getContext().getString(com.tencent.mm.R.string.f2u, e92.b.f250347d.d(it, com.tencent.mm.R.id.e5o));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
