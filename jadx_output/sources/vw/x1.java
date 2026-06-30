package vw;

/* loaded from: classes7.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw.m2 f440753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(vw.m2 m2Var) {
        super(0);
        this.f440753d = m2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_tl_first_screen_card_info_report, 0) == 1);
        boolean booleanValue = valueOf.booleanValue();
        com.tencent.mars.xlog.Log.i(this.f440753d.f440684d, "openFirstScreenCardExposeReport " + booleanValue);
        return valueOf;
    }
}
