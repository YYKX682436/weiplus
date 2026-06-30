package db5;

/* loaded from: classes15.dex */
public class da implements com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.e0 f228321d;

    public da(com.tencent.mm.ui.base.WxImageView wxImageView, db5.e0 e0Var) {
        this.f228321d = e0Var;
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener
    public void onCenterChanged(android.graphics.PointF pointF, int i17) {
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener
    public void onScaleChanged(float f17, float f18, int i17) {
        ((kz3.j) this.f228321d).a(f18, f17);
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener
    public void onScaleFinish(float f17) {
    }
}
