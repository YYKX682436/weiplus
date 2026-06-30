package nl4;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl4.r f338209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(nl4.r rVar) {
        super(0);
        this.f338209d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int nj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.player.RepairerConfigTingHearingAidEnable());
        com.tencent.mars.xlog.Log.i(this.f338209d.f338242l, "tingConfig RepairerConfigTingHearingAidEnable: " + nj6);
        return java.lang.Boolean.valueOf(nj6 == 1);
    }
}
