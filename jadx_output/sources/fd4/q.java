package fd4;

/* loaded from: classes4.dex */
public class q implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fd4.r f261324d;

    public q(fd4.r rVar) {
        this.f261324d = rVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        fd4.r rVar = this.f261324d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$2");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "resizeBreakFrameContainer, onPreDraw exp is " + th6);
        }
        if (!rVar.f261289f.f425165z.isAttachedToWindow()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$2");
            return true;
        }
        int width = rVar.f261289f.f425165z.getWidth();
        int height = rVar.f261289f.f425165z.getHeight();
        com.tencent.mars.xlog.Log.i("ShakeAdBusiness", "onPreDraw, w=" + width + ", h=" + height);
        rVar.q(width, height);
        if (rVar.f261295o != null) {
            android.view.View findViewById = rVar.m() ? rVar.f261289f.f425163x.findViewById(com.tencent.mm.R.id.afc) : rVar.f261289f.f425163x.findViewById(com.tencent.mm.R.id.f482668kq);
            if (findViewById != null) {
                int[] iArr = new int[2];
                rVar.f261289f.f425163x.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                findViewById.getLocationOnScreen(iArr2);
                int height2 = (iArr2[1] + findViewById.getHeight()) - iArr[1];
                int width2 = rVar.f261289f.f425164y.getWidth();
                android.view.ViewGroup.LayoutParams layoutParams = rVar.f261295o.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = height2;
                rVar.f261295o.setLayoutParams(layoutParams);
                rVar.p(rVar.f261295o, width2, height2);
            } else {
                com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "onPreDraw, commentLayout==null");
            }
        } else {
            com.tencent.mars.xlog.Log.e("ShakeAdBusiness", "onPreDraw, breakFrameContainer==null");
        }
        if (width > 0 && height > 0) {
            com.tencent.mars.xlog.Log.i("ShakeAdBusiness", "onPreDraw, removeOnPreDrawListener, isAttached=true, hash=" + hashCode());
            rVar.f261289f.f425165z.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        rVar.A = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$2");
        return true;
    }
}
