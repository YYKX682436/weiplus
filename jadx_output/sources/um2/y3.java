package um2;

/* loaded from: classes3.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f429099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(um2.x5 x5Var) {
        super(0);
        this.f429099d = x5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f429099d;
        fm2.c cVar = x5Var.f19606c;
        if (cVar == null) {
            return null;
        }
        com.tencent.mm.plugin.finder.live.plugin.jj0 jj0Var = new com.tencent.mm.plugin.finder.live.plugin.jj0((android.view.ViewGroup) x5Var.e(com.tencent.mm.R.id.fpy, cVar), cVar);
        x5Var.M0 = true;
        jj0Var.K0(8);
        jj0Var.z0();
        return jj0Var;
    }
}
