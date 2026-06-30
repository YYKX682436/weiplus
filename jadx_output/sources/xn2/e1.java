package xn2;

/* loaded from: classes2.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f455489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(xn2.f1 f1Var) {
        super(0);
        this.f455489d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        xn2.f1 f1Var = this.f455489d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) f1Var.h().findViewById(com.tencent.mm.R.id.qqk);
        wxRecyclerView.i(new xn2.d1(f0Var, f1Var));
        return wxRecyclerView;
    }
}
