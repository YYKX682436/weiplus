package g44;

/* loaded from: classes3.dex */
public final class y implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper f268844d;

    public y(com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper adOpenAppHalfScreenHelper) {
        this.f268844d = adOpenAppHalfScreenHelper;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper$doExpandClickAreaLogic$1");
        com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper adOpenAppHalfScreenHelper = this.f268844d;
        android.view.View f17 = adOpenAppHalfScreenHelper.f();
        if (f17 != null && (viewTreeObserver = f17.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        int[] iArr = new int[2];
        com.tencent.mm.ui.widget.MMRoundCornerImageView e17 = adOpenAppHalfScreenHelper.e();
        if (e17 != null) {
            e17.getLocationInWindow(iArr);
        }
        int[] iArr2 = new int[2];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTip2TextView$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = adOpenAppHalfScreenHelper.f162674r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTip2TextView$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        if (adAppCompatTextView != null) {
            adAppCompatTextView.getLocationInWindow(iArr2);
        }
        int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        android.widget.Button h17 = adOpenAppHalfScreenHelper.h();
        int width = h17 != null ? h17.getWidth() + i65.a.b(adOpenAppHalfScreenHelper.g(), 40) : 0;
        if (width <= i17) {
            i17 = width;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTip2TextView$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView2 = adOpenAppHalfScreenHelper.f162674r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTip2TextView$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        java.lang.Integer valueOf = adAppCompatTextView2 != null ? java.lang.Integer.valueOf(((adAppCompatTextView2.getHeight() + iArr2[1]) + i65.a.b(adOpenAppHalfScreenHelper.g(), 31)) - iArr[1]) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMExpandClickAreaTop$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout = adOpenAppHalfScreenHelper.f162676t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMExpandClickAreaTop$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMExpandClickAreaTop$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout2 = adOpenAppHalfScreenHelper.f162676t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMExpandClickAreaTop$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2 != null ? frameLayout2.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = valueOf.intValue();
        }
        android.widget.Button h18 = adOpenAppHalfScreenHelper.h();
        java.lang.Integer valueOf2 = h18 != null ? java.lang.Integer.valueOf(h18.getHeight() + i65.a.b(adOpenAppHalfScreenHelper.g(), 40)) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMExpandClickAreaBottom$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout3 = adOpenAppHalfScreenHelper.f162677u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMExpandClickAreaBottom$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout3 != null ? frameLayout3.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMExpandClickAreaBottom$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout4 = adOpenAppHalfScreenHelper.f162677u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMExpandClickAreaBottom$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.view.ViewGroup.LayoutParams layoutParams4 = frameLayout4 != null ? frameLayout4.getLayoutParams() : null;
        if (layoutParams4 != null) {
            layoutParams4.height = valueOf2.intValue();
        }
        android.widget.FrameLayout q17 = com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper.q(adOpenAppHalfScreenHelper);
        android.view.ViewGroup.LayoutParams layoutParams5 = q17 != null ? q17.getLayoutParams() : null;
        if (layoutParams5 != null) {
            android.widget.Button h19 = adOpenAppHalfScreenHelper.h();
            layoutParams5.width = (h19 != null ? java.lang.Integer.valueOf(h19.getWidth()) : null).intValue();
        }
        android.widget.FrameLayout q18 = com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper.q(adOpenAppHalfScreenHelper);
        android.view.ViewGroup.LayoutParams layoutParams6 = q18 != null ? q18.getLayoutParams() : null;
        if (layoutParams6 != null) {
            layoutParams6.height = (valueOf != null ? java.lang.Integer.valueOf(valueOf.intValue() - i65.a.b(adOpenAppHalfScreenHelper.g(), 15)) : null).intValue();
        }
        android.widget.FrameLayout p17 = com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper.p(adOpenAppHalfScreenHelper);
        android.view.ViewGroup.LayoutParams layoutParams7 = p17 != null ? p17.getLayoutParams() : null;
        if (layoutParams7 != null) {
            android.widget.Button h27 = adOpenAppHalfScreenHelper.h();
            layoutParams7.width = (h27 != null ? java.lang.Integer.valueOf(h27.getWidth()) : null).intValue();
        }
        android.widget.FrameLayout p18 = com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper.p(adOpenAppHalfScreenHelper);
        android.view.ViewGroup.LayoutParams layoutParams8 = p18 != null ? p18.getLayoutParams() : null;
        if (layoutParams8 != null) {
            android.widget.Button h28 = adOpenAppHalfScreenHelper.h();
            layoutParams8.height = (h28 != null ? java.lang.Integer.valueOf(h28.getHeight()) : null).intValue();
        }
        android.view.View f18 = adOpenAppHalfScreenHelper.f();
        android.view.ViewGroup.LayoutParams layoutParams9 = f18 != null ? f18.getLayoutParams() : null;
        if (layoutParams9 != null) {
            android.view.View f19 = adOpenAppHalfScreenHelper.f();
            layoutParams9.height = (f19 != null ? java.lang.Integer.valueOf(f19.getHeight()) : null).intValue();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMExpandClickArea$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.widget.LinearLayout linearLayout = adOpenAppHalfScreenHelper.f162675s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMExpandClickArea$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        if (linearLayout != null) {
            linearLayout.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper$doExpandClickAreaLogic$1");
        return true;
    }
}
