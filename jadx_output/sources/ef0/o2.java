package ef0;

/* loaded from: classes.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f252292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(ef0.y2 y2Var) {
        super(0);
        this.f252292d = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int nj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.RepairerConfigTingDiscoverEntryWithPlayState());
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "tingConfig enableTingDiscoverEntryPlayState: " + nj6);
        return java.lang.Boolean.valueOf(nj6 == 1 && this.f252292d.Vi());
    }
}
