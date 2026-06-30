package um2;

/* loaded from: classes3.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f428974d = x5Var;
        this.f428975e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f428974d;
        com.tencent.mm.plugin.finder.live.plugin.ad adVar = x5Var.W0;
        return adVar == null ? new com.tencent.mm.plugin.finder.live.plugin.ad((android.view.ViewGroup) x5Var.e(com.tencent.mm.R.id.euo, this.f428975e), this.f428975e, null, 4, null) : adVar;
    }
}
