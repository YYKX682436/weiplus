package gu1;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f275869a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f275870b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f275871c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f275872d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f275873e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f275874f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f275875g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f275876h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f275877i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.CheckBox f275878j;

    /* renamed from: k, reason: collision with root package name */
    public tt1.j f275879k;

    /* renamed from: n, reason: collision with root package name */
    public gu1.c f275882n;

    /* renamed from: l, reason: collision with root package name */
    public int f275880l = 1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f275881m = false;

    /* renamed from: o, reason: collision with root package name */
    public float f275883o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f275884p = new gu1.a(this);

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f275885q = new gu1.b(this);

    public d(com.tencent.mm.ui.MMActivity mMActivity, android.view.View view) {
        this.f275870b = mMActivity;
        this.f275869a = view;
    }

    public void a() {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeCodeController", "doUpdate()");
        if (!this.f275881m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeCodeController", "doUpdate() not ready show!");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f275879k.i0().C)) {
            str = this.f275879k.i0().C;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeCodeController", "code:%s from sign_number", str);
        } else if (this.f275879k.N()) {
            str = xt1.t0.Ai().b();
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeCodeController", "code:%s from dynamic code", str);
        } else {
            str = this.f275879k.i0().f385189o;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeCodeController", "code:%s from dataInfo", str);
        }
        int i17 = this.f275879k.i0().f385190p;
        android.view.View.OnLongClickListener onLongClickListener = this.f275885q;
        android.view.View view = this.f275869a;
        if (i17 == 0) {
            if (this.f275873e == null) {
                this.f275873e = ((android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.f483567b94)).inflate();
            }
            android.widget.TextView textView = (android.widget.TextView) this.f275873e.findViewById(com.tencent.mm.R.id.c0u);
            textView.setText(lu1.g0.a(4, str, true));
            textView.setOnLongClickListener(onLongClickListener);
            if (!this.f275879k.o()) {
                textView.setTextColor(lu1.a0.d(this.f275879k.s0().f388555p));
            }
            if (str.length() <= 12) {
                textView.setTextSize(1, 33.0f);
            } else if (str.length() > 12 && str.length() <= 16) {
                textView.setTextSize(1, 30.0f);
            } else if (str.length() > 16 && str.length() <= 20) {
                textView.setTextSize(1, 24.0f);
            } else if (str.length() > 20 && str.length() <= 40) {
                textView.setTextSize(1, 18.0f);
            } else if (str.length() > 40) {
                textView.setVisibility(8);
            }
            c(this.f275873e);
        } else if (i17 == 1) {
            if (this.f275872d == null) {
                this.f275872d = ((android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.b8w)).inflate();
            }
            android.view.View view2 = this.f275872d;
            android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.f483777c06);
            android.widget.TextView textView2 = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.c0u);
            if (!this.f275879k.o()) {
                textView2.setTextColor(lu1.a0.d(this.f275879k.s0().f388555p));
            }
            if (android.text.TextUtils.isEmpty(str) || str.length() > 40) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(lu1.g0.a(4, str, true));
                if (this.f275879k.b()) {
                    textView2.setVisibility(0);
                    textView2.setOnLongClickListener(onLongClickListener);
                } else {
                    textView2.setVisibility(8);
                }
            }
            if (this.f275880l != 1) {
                textView2.setVisibility(4);
            }
            try {
                lu1.a0.F(this.f275875g);
                if (android.text.TextUtils.isEmpty(str)) {
                    this.f275875g = null;
                    imageView.setImageBitmap(null);
                } else {
                    android.graphics.Bitmap Bi = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(this.f275870b, str, 5, 0);
                    this.f275875g = Bi;
                    b(imageView, Bi);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardConsumeCodeController", e17, "", new java.lang.Object[0]);
            }
            c(this.f275872d);
        } else if (i17 == 2) {
            if (this.f275871c == null) {
                this.f275871c = ((android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.f483564b91)).inflate();
            }
            android.view.View view3 = this.f275871c;
            android.widget.ImageView imageView2 = (android.widget.ImageView) view3.findViewById(com.tencent.mm.R.id.c0m);
            android.widget.TextView textView3 = (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.c0u);
            if (!this.f275879k.o()) {
                textView3.setTextColor(lu1.a0.d(this.f275879k.s0().f388555p));
            }
            if (str.length() <= 40) {
                textView3.setText(lu1.g0.a(4, str, true));
                if (this.f275879k.b()) {
                    textView3.setVisibility(0);
                    textView3.setOnLongClickListener(onLongClickListener);
                } else {
                    textView3.setVisibility(8);
                }
            } else {
                textView3.setVisibility(8);
            }
            if (this.f275880l != 1) {
                textView3.setVisibility(4);
            }
            try {
                lu1.a0.F(this.f275874f);
                if (android.text.TextUtils.isEmpty(str)) {
                    this.f275874f = null;
                    imageView2.setImageBitmap(null);
                } else {
                    android.graphics.Bitmap Bi2 = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(this.f275870b, str, 12, 3);
                    this.f275874f = Bi2;
                    b(imageView2, Bi2);
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardConsumeCodeController", e18, "", new java.lang.Object[0]);
            }
            c(this.f275871c);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f275879k.s0().f388558q)) {
            this.f275876h.setVisibility(8);
            this.f275877i.setVisibility(8);
        } else if (this.f275879k.s0().Z != null) {
            this.f275877i.setText(this.f275879k.s0().f388558q);
            this.f275877i.setVisibility(0);
            this.f275876h.setVisibility(8);
            android.view.View view4 = this.f275871c;
            if (view4 != null) {
                android.widget.ImageView imageView3 = (android.widget.ImageView) view4.findViewById(com.tencent.mm.R.id.c0m);
                android.view.ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
                layoutParams.height = i65.a.b(this.f275870b, 180);
                layoutParams.width = i65.a.b(this.f275870b, 180);
                imageView3.setLayoutParams(layoutParams);
            }
        } else {
            this.f275876h.setText(this.f275879k.s0().f388558q);
            this.f275876h.setVisibility(0);
        }
        if (!this.f275879k.i() || android.text.TextUtils.isEmpty(this.f275879k.a()) || this.f275879k.a().equals(c01.z1.r())) {
            this.f275878j.setChecked(false);
            this.f275878j.setVisibility(8);
            return;
        }
        this.f275878j.setVisibility(0);
        java.lang.String str2 = " " + this.f275870b.getString(com.tencent.mm.R.string.arv, lu1.a0.p(this.f275879k.a()));
        android.widget.CheckBox checkBox = this.f275878j;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.tencent.mm.ui.MMActivity mMActivity = this.f275870b;
        int dimensionPixelOffset = mMActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479929j9);
        ((ke0.e) xVar).getClass();
        checkBox.setText(com.tencent.mm.pluginsdk.ui.span.c0.h(mMActivity, str2, dimensionPixelOffset, true));
    }

    public final void b(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        if (imageView == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
        if (this.f275880l != 1) {
            imageView.setAlpha(10);
        } else {
            imageView.setAlpha(255);
        }
    }

    public final void c(android.view.View view) {
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.c0l);
        if (this.f275880l == 1) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
        }
        if (this.f275880l == -1) {
            button.setText(com.tencent.mm.R.string.atz);
        }
    }
}
