package uj0;

/* loaded from: classes13.dex */
public class a implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.graphics.ui.WxBaseImageView f428182d;

    public a(com.tencent.mm.graphics.ui.WxBaseImageView wxBaseImageView) {
        this.f428182d = wxBaseImageView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        sj0.g.INSTANCE.h();
        int i17 = com.tencent.mm.graphics.ui.WxBaseImageView.f68214z;
        com.tencent.mm.graphics.ui.WxBaseImageView wxBaseImageView = this.f428182d;
        wxBaseImageView.getClass();
        sj0.e eVar = sj0.e.INSTANCE;
        if (eVar.f408353g) {
            eVar.i();
        }
        if (!wxBaseImageView.f68222n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxBaseImageView", "hasReportPerformance can't report");
        } else {
            if (wxBaseImageView.f68231w) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxBaseImageView", "hasReportPerformance and return");
                return;
            }
            if (wxBaseImageView.f68233y == null) {
                wxBaseImageView.f68233y = new com.tencent.mm.sdk.platformtools.n3("WxBaseImageViewReport");
            }
            wxBaseImageView.f68233y.postToWorker(new uj0.b(wxBaseImageView));
        }
    }
}
