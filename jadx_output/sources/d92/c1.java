package d92;

/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.e1 f227460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d92.e1 e1Var) {
        super(1);
        this.f227460d = e1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = this.f227460d.getContext().getString(com.tencent.mm.R.string.dfp, ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.i_e)).getText().toString());
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
