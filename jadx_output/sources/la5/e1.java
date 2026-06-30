package la5;

/* loaded from: classes3.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ la5.f1 f317615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(la5.f1 f1Var) {
        super(1);
        this.f317615d = f1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = this.f317615d.getContext().getString(com.tencent.mm.R.string.gtz);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
