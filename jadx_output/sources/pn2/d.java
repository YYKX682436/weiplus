package pn2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.f f356984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pn2.f fVar) {
        super(0);
        this.f356984d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.cz1 cz1Var;
        pn2.f fVar = this.f356984d;
        if (((mm2.c1) fVar.P0(mm2.c1.class)).a8()) {
            km2.z lotteryInfoWrapper = (km2.z) kz5.n0.Z(((on2.z2) fVar.P0(on2.z2.class)).f347091i);
            java.lang.String str = null;
            r45.cz1 cz1Var2 = lotteryInfoWrapper != null ? lotteryInfoWrapper.f309232d : null;
            if (cz1Var2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(cz1Var2.getString(0))) {
                pn2.a aVar = fVar.f356995u;
                if (aVar != null) {
                    kotlin.jvm.internal.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
                    pm0.v.X(new pn2.m((pn2.s) aVar, lotteryInfoWrapper));
                }
            } else if (!((on2.z2) fVar.P0(on2.z2.class)).f347091i.isEmpty()) {
                ((on2.z2) fVar.P0(on2.z2.class)).f347091i.removeFirst();
            }
            fVar.u1();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resumeLottery firstLotteryInfo id:");
            sb6.append(cz1Var2 != null ? cz1Var2.getString(0) : null);
            sb6.append(",lottery id:");
            km2.z zVar = ((on2.z2) fVar.P0(on2.z2.class)).f347092m;
            if (zVar != null && (cz1Var = zVar.f309232d) != null) {
                str = cz1Var.getString(0);
            }
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
