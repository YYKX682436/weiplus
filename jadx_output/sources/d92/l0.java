package d92;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.m0 f227489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(d92.m0 m0Var) {
        super(1);
        this.f227489d = m0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = this.f227489d.getContext().getString(com.tencent.mm.R.string.jzr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
