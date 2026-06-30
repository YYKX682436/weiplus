package mu1;

/* loaded from: classes15.dex */
public abstract class a implements mu1.j {

    /* renamed from: a, reason: collision with root package name */
    public tt1.j f331334a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f331335b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f331336c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f331337d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f331338e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnClickListener f331339f;

    public a(android.content.Context context) {
        this.f331335b = context;
    }

    @Override // mu1.j
    public void a(android.graphics.drawable.ShapeDrawable shapeDrawable) {
    }

    @Override // mu1.j
    public void b(boolean z17) {
    }

    @Override // mu1.j
    public void c(boolean z17) {
    }

    @Override // mu1.j
    public void d(boolean z17, boolean z18) {
    }

    @Override // mu1.j
    public void e(int i17) {
    }

    public android.view.View f() {
        int i17;
        tt1.j jVar = this.f331334a;
        if (jVar == null || jVar.s0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
            return null;
        }
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f331335b.getSystemService("layout_inflater");
        if (!this.f331334a.d()) {
            if (this.f331334a.X()) {
                i17 = com.tencent.mm.R.layout.f488369rg;
            } else if (this.f331334a.o()) {
                i17 = com.tencent.mm.R.layout.f488341qn;
            } else if (this.f331334a.Q()) {
                i17 = com.tencent.mm.R.layout.f488296pe;
            } else if (this.f331334a.m0()) {
                i17 = com.tencent.mm.R.layout.f488330qc;
            }
            android.view.View inflate = layoutInflater.inflate(i17, (android.view.ViewGroup) null);
            this.f331336c = inflate;
            this.f331337d = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a1e);
            this.f331338e = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.a1o);
            g();
            i();
            return this.f331336c;
        }
        i17 = com.tencent.mm.R.layout.f488290p8;
        android.view.View inflate2 = layoutInflater.inflate(i17, (android.view.ViewGroup) null);
        this.f331336c = inflate2;
        this.f331337d = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.a1e);
        this.f331338e = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.a1o);
        g();
        i();
        return this.f331336c;
    }

    public abstract void g();

    public abstract void h();

    public final void i() {
        tt1.j jVar = this.f331334a;
        if (jVar == null || jVar.s0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f331334a.s0().f388546e)) {
            int dimensionPixelSize = this.f331335b.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480174qf);
            if (this.f331334a.B() && this.f331334a.d()) {
                dimensionPixelSize = this.f331335b.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480193qz);
            } else if (this.f331334a.B() && this.f331334a.o()) {
                dimensionPixelSize = this.f331335b.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480193qz);
            } else if (this.f331334a.B() && this.f331334a.X()) {
                dimensionPixelSize = this.f331335b.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480203r9);
            } else if (this.f331334a.m0()) {
                dimensionPixelSize = 0;
            }
            if (dimensionPixelSize > 0) {
                lu1.g0.b(this.f331337d, this.f331334a.s0().f388546e, dimensionPixelSize, com.tencent.mm.R.drawable.cbt, true);
            }
        } else if (this.f331334a.d()) {
            this.f331337d.setVisibility(8);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f331334a.s0().f388552m)) {
            this.f331338e.setText(this.f331334a.s0().f388552m);
        }
        h();
    }

    @Override // mu1.j
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f331339f = onClickListener;
    }
}
