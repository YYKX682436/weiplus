package pn2;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.f f356990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(pn2.f fVar) {
        super(0);
        this.f356990d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        pn2.f fVar = this.f356990d;
        if (((mm2.c1) fVar.P0(mm2.c1.class)).a8()) {
            km2.z lotteryInfoWrapper = (km2.z) kz5.n0.Z(((on2.z2) fVar.P0(on2.z2.class)).f347091i);
            java.lang.String str = null;
            r45.cz1 cz1Var3 = lotteryInfoWrapper != null ? lotteryInfoWrapper.f309232d : null;
            if (cz1Var3 == null || com.tencent.mm.sdk.platformtools.t8.K0(cz1Var3.getString(0))) {
                km2.z zVar = ((on2.z2) fVar.P0(on2.z2.class)).f347092m;
                java.lang.String string = (zVar == null || (cz1Var2 = zVar.f309232d) == null) ? null : cz1Var2.getString(0);
                if (!(string == null || string.length() == 0)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLottery error firstLotteryInfo id:");
                    sb6.append(cz1Var3 != null ? cz1Var3.getString(0) : null);
                    sb6.append(",local lottery id:");
                    km2.z zVar2 = ((on2.z2) fVar.P0(on2.z2.class)).f347092m;
                    if (zVar2 != null && (cz1Var = zVar2.f309232d) != null) {
                        str = cz1Var.getString(0);
                    }
                    sb6.append(str);
                    com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", sb6.toString());
                }
                if (!((on2.z2) fVar.P0(on2.z2.class)).f347091i.isEmpty()) {
                    ((on2.z2) fVar.P0(on2.z2.class)).f347091i.removeFirst();
                }
            } else {
                pn2.a aVar = fVar.f356995u;
                if (aVar != null) {
                    kotlin.jvm.internal.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
                    pm0.v.X(new pn2.r(lotteryInfoWrapper, (pn2.s) aVar));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
