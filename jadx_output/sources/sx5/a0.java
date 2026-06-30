package sx5;

/* loaded from: classes13.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413668d;

    public a0(sx5.a1 a1Var) {
        this.f413668d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f413668d;
        android.widget.FrameLayout frameLayout = a1Var.f413689w;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        a1Var.C.setTextColor(a1Var.p().getColorStateList(com.tencent.xwebsdk.R.color.xweb_white_text_color_selector));
        a1Var.D.setTextColor(a1Var.p().getColorStateList(com.tencent.xwebsdk.R.color.xweb_white_text_color_selector));
        a1Var.E.setTextColor(a1Var.p().getColorStateList(com.tencent.xwebsdk.R.color.xweb_white_text_color_selector));
        a1Var.F.setTextColor(a1Var.p().getColorStateList(com.tencent.xwebsdk.R.color.xweb_white_text_color_selector));
        a1Var.G.setTextColor(a1Var.p().getColorStateList(com.tencent.xwebsdk.R.color.xweb_white_text_color_selector));
        a1Var.H.setTextColor(a1Var.p().getColorStateList(com.tencent.xwebsdk.R.color.xweb_white_text_color_selector));
        double d17 = a1Var.S;
        if (d17 == 0.5d) {
            a1Var.C.setTextColor(a1Var.p().getColorStateList(com.tencent.xwebsdk.R.color.xweb_green_text_color_selector));
            return;
        }
        if (d17 == 0.75d) {
            a1Var.D.setTextColor(a1Var.p().getColorStateList(com.tencent.xwebsdk.R.color.xweb_green_text_color_selector));
            return;
        }
        if (d17 == 1.0d) {
            a1Var.E.setTextColor(a1Var.p().getColorStateList(com.tencent.xwebsdk.R.color.xweb_green_text_color_selector));
            return;
        }
        if (d17 == 1.5d) {
            a1Var.F.setTextColor(a1Var.p().getColorStateList(com.tencent.xwebsdk.R.color.xweb_green_text_color_selector));
        } else if (d17 == 2.0d) {
            a1Var.G.setTextColor(a1Var.p().getColorStateList(com.tencent.xwebsdk.R.color.xweb_green_text_color_selector));
        } else if (d17 == 3.0d) {
            a1Var.H.setTextColor(a1Var.p().getColorStateList(com.tencent.xwebsdk.R.color.xweb_green_text_color_selector));
        }
    }
}
