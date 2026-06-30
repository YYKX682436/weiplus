package fd4;

/* loaded from: classes4.dex */
public class b implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u74.d f261285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fd4.c f261286e;

    public b(fd4.c cVar, u74.d dVar) {
        this.f261286e = cVar;
        this.f261285d = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$2");
        u74.d dVar = this.f261285d;
        if (!dVar.f425165z.isAttachedToWindow()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$2");
            return true;
        }
        int width = dVar.f425165z.getWidth();
        int height = dVar.f425165z.getHeight();
        com.tencent.mars.xlog.Log.i("BaseFullCardAdBusiness", "onPreDraw, w=" + width + ", h=" + height);
        fd4.c cVar = this.f261286e;
        cVar.q(width, height);
        if (cVar.f261295o != null) {
            android.view.View findViewById = cVar.m() ? dVar.f425163x.findViewById(com.tencent.mm.R.id.afc) : dVar.f425163x.findViewById(com.tencent.mm.R.id.f482668kq);
            if (findViewById != null) {
                int[] iArr = new int[2];
                dVar.f425163x.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                findViewById.getLocationOnScreen(iArr2);
                int height2 = (iArr2[1] + findViewById.getHeight()) - iArr[1];
                int width2 = dVar.f425164y.getWidth();
                android.view.ViewGroup.LayoutParams layoutParams = cVar.f261295o.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = height2;
                cVar.f261295o.setLayoutParams(layoutParams);
                cVar.p(cVar.f261295o, width2, height2);
            } else {
                com.tencent.mars.xlog.Log.e("BaseFullCardAdBusiness", "onPreDraw, commentLayout==null");
            }
        } else {
            com.tencent.mars.xlog.Log.e("BaseFullCardAdBusiness", "onPreDraw, breakFrameContainer==null");
        }
        if (width > 0 && height > 0) {
            com.tencent.mars.xlog.Log.i("BaseFullCardAdBusiness", "onPreDraw, removeOnPreDrawListener, isAttached=true, hash=" + hashCode());
            dVar.f425165z.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$2");
        return true;
    }
}
