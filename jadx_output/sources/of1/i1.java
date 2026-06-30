package of1;

/* loaded from: classes7.dex */
public final class i1 implements com.tencent.mm.plugin.appbrand.widget.input.k2 {

    /* renamed from: d, reason: collision with root package name */
    public int f344938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f344939e;

    public i1(of1.w1 w1Var) {
        this.f344939e = w1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void a(boolean z17) {
        of1.w1 w1Var = this.f344939e;
        of1.x1 controller = w1Var.getController();
        int i17 = this.f344938d;
        nw4.n g07 = ((of1.v0) controller).g0();
        int i18 = 0;
        if (!z17) {
            i17 = 0;
        }
        g07.L(i17, 0);
        if (w1Var.f345038i && z17) {
            if (1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_html_webview_adjust_resize_for_keyboard, 1)) {
                i18 = this.f344938d;
            }
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = w1Var.f345045s;
        mMWebView.setPadding(mMWebView.getPaddingLeft(), w1Var.f345045s.getPaddingTop(), w1Var.f345045s.getPaddingRight(), i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void d(int i17) {
        this.f344938d = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public int getHeight() {
        return this.f344938d;
    }
}
