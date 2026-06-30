package ey4;

/* loaded from: classes8.dex */
public class s implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        if (f17 > 0.0f) {
            double d17 = f17;
            int i17 = com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter.A;
            if (d17 < 0.5d) {
                return 0.0f;
            }
        }
        double d18 = f17;
        int i18 = com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter.A;
        float f18 = 1.0f - ((float) (d18 * (1.0d - ((1.0d - d18) / 0.5d))));
        return 1.0f - (f18 * f18);
    }
}
