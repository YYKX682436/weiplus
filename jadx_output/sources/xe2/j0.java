package xe2;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f453871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(r45.ch1 ch1Var) {
        super(0);
        this.f453871d = ch1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yg2.b viewScope;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (viewScope = k0Var.getViewScope()) != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(viewScope, kotlinx.coroutines.internal.b0.f310484a, null, new xe2.i0(this.f453871d, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
