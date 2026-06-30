package jd2;

/* loaded from: classes10.dex */
public final class a implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jd2.d f299139d;

    public a(jd2.d dVar) {
        this.f299139d = dVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f299139d.f299145b.onAnimationStart();
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("BattlePagStartView", "onAnimationEnd ");
        this.f299139d.f299145b.onAnimationEnd();
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
