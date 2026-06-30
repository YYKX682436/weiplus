package mi1;

/* loaded from: classes7.dex */
public final class i extends com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleFrameLayoutWithHotspot implements mi1.q0, pq5.a {

    /* renamed from: i, reason: collision with root package name */
    public int f326572i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton f326573m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleHomeButton f326574n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f326575o;

    /* renamed from: p, reason: collision with root package name */
    public final int f326576p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f326577q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f326578r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.ViewStub f326579s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout f326580t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f326581u;

    public i(android.content.Context context) {
        super(context);
        this.f326572i = 0;
        this.f326581u = false;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488014eg, (android.view.ViewGroup) this, true);
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton appBrandOptionButton = (com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton) findViewById(com.tencent.mm.R.id.f482517go);
        this.f326573m = appBrandOptionButton;
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleHomeButton appBrandCapsuleHomeButton = (com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleHomeButton) findViewById(com.tencent.mm.R.id.f482516gn);
        this.f326574n = appBrandCapsuleHomeButton;
        this.f326575o = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(com.tencent.mm.R.id.f482512gk);
        this.f326577q = findViewById(com.tencent.mm.R.id.f482515gm);
        this.f326578r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.e5d);
        this.f326579s = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.f482518f91);
        appBrandOptionButton.setAccessibilityLabel(getContext().getString(com.tencent.mm.R.string.f490022iq));
        appBrandCapsuleHomeButton.setAccessibilityLabel(getContext().getString(com.tencent.mm.R.string.f490018im));
        this.f326576p = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480036m8);
    }

    private void setTranslateLayoutStyleColor(int i17) {
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout appBrandTranslateLayout = this.f326580t;
        if (appBrandTranslateLayout != null) {
            appBrandTranslateLayout.setStyleColor(i17);
        }
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        draw(canvas);
        return true;
    }

    public android.view.View getCapsuleContentAreaView() {
        return this.f326575o;
    }

    public com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleHomeButton getCapsuleHomeButton() {
        return this.f326574n;
    }

    public com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton getOptionBtn() {
        return this.f326573m;
    }

    public com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout getTranslateLayout() {
        if (this.f326580t == null) {
            com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout appBrandTranslateLayout = (com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout) this.f326579s.inflate().findViewById(com.tencent.mm.R.id.f482518f91);
            this.f326580t = appBrandTranslateLayout;
            appBrandTranslateLayout.setDivider(findViewById(com.tencent.mm.R.id.emv));
            this.f326580t.setStyleColor(this.f326572i);
        }
        return this.f326580t;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(android.view.View view, int i17, int i18, int i19, int i27) {
        if (view.getId() == com.tencent.mm.R.id.f482512gk) {
            view.getLayoutParams().height = this.f326576p;
        }
        super.measureChildWithMargins(view, i17, i18, i19, i27);
    }

    public void setCapsuleContentAreaMarginEnd(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = getCapsuleContentAreaView().getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.getMarginEnd() == i17 && marginLayoutParams.rightMargin == i17) {
                return;
            }
            marginLayoutParams.rightMargin = i17;
            marginLayoutParams.setMarginEnd(i17);
            getCapsuleContentAreaView().setLayoutParams(marginLayoutParams);
        }
    }

    public void setHomeButtonOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f326574n.setOnClickListener(onClickListener);
    }

    public void setOptionButtonOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f326573m.setOnClickListener(onClickListener);
    }

    public void setStyleColor(int i17) {
        if (i17 == this.f326572i) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleHomeButton appBrandCapsuleHomeButton = this.f326574n;
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton appBrandOptionButton = this.f326573m;
        android.widget.TextView textView = this.f326578r;
        android.view.View view = this.f326577q;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f326575o;
        if (i17 == -1) {
            this.f326572i = -1;
            view.setBackgroundResource(com.tencent.mm.R.color.f478633cs);
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478641ov));
            if (this.f326581u) {
                constraintLayout.setBackgroundResource(com.tencent.mm.R.drawable.f480773yk);
            } else {
                constraintLayout.setBackgroundResource(com.tencent.mm.R.drawable.f480787cl);
            }
            appBrandOptionButton.setColor(-1);
            appBrandCapsuleHomeButton.setColor(-1);
            setTranslateLayoutStyleColor(-1);
            return;
        }
        this.f326572i = -16777216;
        view.setBackgroundResource(com.tencent.mm.R.color.f478634ct);
        textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.afd));
        if (this.f326581u) {
            constraintLayout.setBackgroundResource(com.tencent.mm.R.drawable.aen);
        } else {
            constraintLayout.setBackgroundResource(com.tencent.mm.R.drawable.f480788cm);
        }
        appBrandOptionButton.setColor(-16777216);
        appBrandCapsuleHomeButton.setColor(-16777216);
        setTranslateLayoutStyleColor(-16777216);
    }
}
