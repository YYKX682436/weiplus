package pn2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.s f356998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pn2.s sVar) {
        super(0);
        this.f356998d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.cz1 cz1Var;
        pn2.s sVar = this.f356998d;
        km2.z zVar = ((on2.z2) sVar.f357013e.a(on2.z2.class)).f347092m;
        if (zVar != null) {
            zVar.f309235g = true;
        }
        gk2.e eVar = sVar.f357013e;
        km2.z zVar2 = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
        if (!(zVar2 != null && zVar2.f309234f)) {
            on2.z2 z2Var = (on2.z2) eVar.a(on2.z2.class);
            km2.z zVar3 = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
            pm0.v.X(new on2.t2(((on2.z2) eVar.a(on2.z2.class)).S6(), z2Var, (zVar3 == null || (cz1Var = zVar3.f309232d) == null) ? null : cz1Var.getString(0)));
        }
        com.tencent.mars.xlog.Log.i(sVar.f357015g, "closeBubbleTask running lotteryInfo:" + ((on2.z2) eVar.a(on2.z2.class)).f347092m);
        return jz5.f0.f302826a;
    }
}
