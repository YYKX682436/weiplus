package um2;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(um2.x5 x5Var) {
        super(0);
        this.f428999d = x5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f428999d;
        fm2.c cVar = x5Var.f19606c;
        if (cVar == null) {
            return null;
        }
        com.tencent.mm.plugin.finder.live.plugin.ya yaVar = new com.tencent.mm.plugin.finder.live.plugin.ya((android.view.ViewGroup) x5Var.e(com.tencent.mm.R.id.eqv, cVar), cVar);
        x5Var.G0 = true;
        yaVar.K0(8);
        yaVar.z0();
        return yaVar;
    }
}
