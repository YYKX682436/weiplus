package in2;

/* loaded from: classes10.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.n0 f292861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(in2.n0 n0Var, android.view.View view) {
        super(0);
        this.f292861d = n0Var;
        this.f292862e = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in2.n0 n0Var = this.f292861d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = n0Var.N;
        if (wxRecyclerView != null) {
            wxRecyclerView.post(new in2.l0(n0Var, this.f292862e));
        }
        return jz5.f0.f302826a;
    }
}
