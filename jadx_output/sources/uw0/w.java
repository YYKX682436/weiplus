package uw0;

/* loaded from: classes5.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f431618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tw0.b f431619e;

    public w(uw0.x xVar, tw0.b bVar) {
        this.f431618d = xVar;
        this.f431619e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View recommendTitleView;
        uw0.x xVar = this.f431618d;
        recommendTitleView = xVar.getRecommendTitleView();
        if (recommendTitleView.isAttachedToWindow()) {
            xVar.W(this.f431619e);
        }
    }
}
