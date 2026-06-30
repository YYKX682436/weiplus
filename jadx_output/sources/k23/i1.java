package k23;

/* loaded from: classes12.dex */
public abstract class i1 extends android.widget.FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final android.view.animation.PathInterpolator f303584m = new android.view.animation.PathInterpolator(0.15f, 0.0f, 0.35f, 0.8f);

    /* renamed from: d, reason: collision with root package name */
    public final k23.d0 f303585d;

    /* renamed from: e, reason: collision with root package name */
    public k23.d1 f303586e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f303587f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f303588g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f303589h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f303590i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.content.Context context, k23.d0 params) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        this.f303585d = params;
        this.f303588g = jz5.h.b(new k23.g1(this));
        this.f303589h = jz5.h.b(new k23.h1(this));
        this.f303590i = jz5.h.b(new k23.e1(context));
        com.tencent.mm.ui.id.b(context).inflate(getLayoutId(), this);
        setupTouchListener(getStartBtn());
        getStartBtnTv().setTextSize(0, com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479689co) * z50.i.f470166a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getCancelLimitY() {
        return ((java.lang.Number) ((jz5.n) this.f303590i).getValue()).floatValue();
    }

    public void b() {
        if (this.f303585d.f303552i == k23.u2.f303702e) {
            int d17 = i65.a.d(getContext(), com.tencent.mm.R.color.Brand_120);
            int d18 = i65.a.d(getContext(), com.tencent.mm.R.color.aby);
            getStartBtn().setBackgroundColor(d17);
            getStartBtnTv().setTextColor(d18);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) getStartBtn().findViewById(com.tencent.mm.R.id.ugo);
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.mike_on_filled);
                weImageView.setIconColor(d18);
            }
        }
    }

    public final k23.u2 getButtonStyle() {
        return this.f303585d.f303552i;
    }

    public abstract int getLayoutId();

    public final k23.d0 getParams() {
        return this.f303585d;
    }

    public final android.view.View getStartBtn() {
        java.lang.Object value = ((jz5.n) this.f303588g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.widget.TextView getStartBtnTv() {
        java.lang.Object value = ((jz5.n) this.f303589h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public abstract java.lang.Integer getStartButtonTopToBottomHeightPx();

    public final java.lang.Integer[] getTargetActivityBarColor() {
        k23.d0 d0Var = this.f303585d;
        int ordinal = d0Var.f303548e.ordinal();
        if (ordinal == 2) {
            return new java.lang.Integer[]{0, 0};
        }
        if (ordinal == 4) {
            return new java.lang.Integer[]{java.lang.Integer.valueOf(getContext().getColor(com.tencent.mm.R.color.f479158al2)), java.lang.Integer.valueOf(getContext().getColor(com.tencent.mm.R.color.aky))};
        }
        java.lang.Integer[] numArr = d0Var.f303553j;
        if (!(numArr instanceof java.lang.Integer[])) {
            numArr = null;
        }
        return numArr == null ? new java.lang.Integer[0] : numArr;
    }

    public final void setButtonText(java.lang.String buttonTitle) {
        kotlin.jvm.internal.o.g(buttonTitle, "buttonTitle");
        if (!(buttonTitle.length() > 0) || kotlin.jvm.internal.o.b(getStartBtnTv().getText().toString(), buttonTitle)) {
            return;
        }
        getStartBtnTv().setText(buttonTitle);
    }

    public final void setButtonTextColor(int i17) {
        getStartBtnTv().setTextColor(i17);
    }

    public final void setListener(k23.d1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f303586e = listener;
    }

    public final void setupTouchListener(android.view.View btn) {
        kotlin.jvm.internal.o.g(btn, "btn");
        btn.setOnTouchListener(new k23.f1(this));
    }
}
