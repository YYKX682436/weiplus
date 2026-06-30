package xi2;

/* loaded from: classes10.dex */
public final class b implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xi2.d f454719d;

    public b(xi2.d dVar) {
        this.f454719d = dVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f454719d.f454722b.onAnimationStart();
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("BattlePagStartView", "onAnimationEnd ");
        this.f454719d.f454722b.onAnimationEnd();
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
