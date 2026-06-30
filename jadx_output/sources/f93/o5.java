package f93;

/* loaded from: classes3.dex */
public final class o5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.p5 f260415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(f93.p5 p5Var) {
        super(0);
        this.f260415d = p5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f260415d.f281403i;
        if (view != null) {
            return (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odf);
        }
        return null;
    }
}
