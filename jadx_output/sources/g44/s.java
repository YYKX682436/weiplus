package g44;

/* loaded from: classes3.dex */
public final class s implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper f268838d;

    public s(com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper adGalleryOpenAppHalfScreenHelper) {
        this.f268838d = adGalleryOpenAppHalfScreenHelper;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper$doExpandClickAreaLogic$1");
        com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper adGalleryOpenAppHalfScreenHelper = this.f268838d;
        android.view.View f17 = adGalleryOpenAppHalfScreenHelper.f();
        if (f17 != null && (viewTreeObserver = f17.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        int[] iArr = new int[2];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMGalleryContainer$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.LinearLayout linearLayout = adGalleryOpenAppHalfScreenHelper.f162666r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMGalleryContainer$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        if (linearLayout != null) {
            linearLayout.getLocationInWindow(iArr);
        }
        int[] iArr2 = new int[2];
        com.tencent.mm.ui.widget.MMRoundCornerImageView e17 = adGalleryOpenAppHalfScreenHelper.e();
        if (e17 != null) {
            e17.getLocationInWindow(iArr2);
        }
        int i17 = iArr[1] - iArr2[1];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMGalleryContainer$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.LinearLayout linearLayout2 = adGalleryOpenAppHalfScreenHelper.f162666r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMGalleryContainer$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        int height = i17 + (linearLayout2 != null ? linearLayout2.getHeight() : 0) + i65.a.b(adGalleryOpenAppHalfScreenHelper.g(), 12);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMExpandClickAreaTop", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout = adGalleryOpenAppHalfScreenHelper.f162668t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMExpandClickAreaTop", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.height = height;
        }
        int[] iArr3 = new int[2];
        android.widget.Button h17 = adGalleryOpenAppHalfScreenHelper.h();
        if (h17 != null) {
            h17.getLocationInWindow(iArr3);
        }
        int b17 = i65.a.b(adGalleryOpenAppHalfScreenHelper.g(), 12) * 2;
        android.widget.Button h18 = adGalleryOpenAppHalfScreenHelper.h();
        int width = (h18 != null ? h18.getWidth() : 0) + b17;
        android.widget.Button h19 = adGalleryOpenAppHalfScreenHelper.h();
        int height2 = b17 + (h19 != null ? h19.getHeight() : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMExpandClickAreaBottom", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout2 = adGalleryOpenAppHalfScreenHelper.f162669u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMExpandClickAreaBottom", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        java.lang.Object layoutParams2 = frameLayout2 != null ? frameLayout2.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.width = width;
            marginLayoutParams2.height = height2;
            marginLayoutParams2.topMargin = ((iArr3[1] - iArr2[1]) - height) - i65.a.b(adGalleryOpenAppHalfScreenHelper.g(), 12);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMExpandClickArea$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.LinearLayout linearLayout3 = adGalleryOpenAppHalfScreenHelper.f162667s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMExpandClickArea$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        if (linearLayout3 != null) {
            linearLayout3.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper$doExpandClickAreaLogic$1");
        return true;
    }
}
