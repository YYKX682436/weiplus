package te2;

/* loaded from: classes3.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f418285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(te2.p1 p1Var) {
        super(1);
        this.f418285d = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.e("FinderLiveAnchorMusicPresenter", "showMusic loadMoreData incrementNum:" + intValue + '!');
        te2.p1 p1Var = this.f418285d;
        if (intValue <= 0) {
            te2.k0 k0Var = p1Var.f418290h;
            if (k0Var != null) {
                ((te2.q1) k0Var).d(false);
            }
        } else {
            te2.k0 k0Var2 = p1Var.f418290h;
            if (k0Var2 != null) {
                ((te2.q1) k0Var2).a(((mm2.c1) p1Var.f418287e.a(mm2.c1.class)).Z6().f233877f);
            }
            bm2.m mVar = p1Var.f418291i;
            if (mVar != null) {
                mVar.b(true);
            }
        }
        return jz5.f0.f302826a;
    }
}
