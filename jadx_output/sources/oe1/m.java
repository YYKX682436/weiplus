package oe1;

/* loaded from: classes15.dex */
public class m implements oe1.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView f344719a;

    public m(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView) {
        this.f344719a = appBrandVideoView;
    }

    public void a(int i17, int i18) {
        if (i18 <= 0) {
            return;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        if (i17 > i18) {
            i17 = i18;
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f344719a;
        int width = (i17 * appBrandVideoView.f83545v.getWidth()) / i18;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) appBrandVideoView.f83544u.getLayoutParams();
        layoutParams.width = width;
        appBrandVideoView.f83544u.setLayoutParams(layoutParams);
        appBrandVideoView.f83544u.requestLayout();
    }
}
