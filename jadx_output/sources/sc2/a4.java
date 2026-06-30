package sc2;

/* loaded from: classes.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.b4 f405747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405749f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f405750g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f405751h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f405752i;

    public a4(sc2.b4 b4Var, android.view.View view, in5.s0 s0Var, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f405747d = b4Var;
        this.f405748e = view;
        this.f405749f = s0Var;
        this.f405750g = weImageView;
        this.f405751h = textView;
        this.f405752i = textView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredWidth;
        java.lang.String str;
        this.f405747d.getClass();
        java.lang.Object parent = this.f405748e.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        int i17 = 0;
        if (view == null) {
            measuredWidth = 0;
        } else if (view.getLayoutParams().width == -2) {
            java.lang.Object parent2 = view.getParent();
            android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
            measuredWidth = view2 != null ? view2.getMeasuredWidth() : view.getMeasuredWidth();
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        android.widget.TextView textView = this.f405752i;
        if (measuredWidth <= 0) {
            if (textView == null) {
                return;
            }
            textView.setMaxWidth(Integer.MAX_VALUE);
            return;
        }
        int measuredWidth2 = (measuredWidth - this.f405750g.getMeasuredWidth()) - this.f405749f.f293121e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn);
        android.widget.TextView textView2 = this.f405751h;
        if (textView2 != null && textView2.getVisibility() == 0) {
            android.text.TextPaint paint = textView2.getPaint();
            java.lang.CharSequence text = textView2.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            i17 = (int) paint.measureText(str);
        }
        int i18 = measuredWidth2 - i17;
        if (textView == null) {
            return;
        }
        textView.setMaxWidth(i18);
    }
}
