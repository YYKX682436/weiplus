package ku1;

/* loaded from: classes15.dex */
public abstract class i extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f312093b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.x3 f312094c;

    /* renamed from: d, reason: collision with root package name */
    public tt1.j f312095d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f312096e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f312097f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f312098g;

    /* renamed from: h, reason: collision with root package name */
    public ku1.l0 f312099h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f312100i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.ViewStub f312101j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f312102k = new ku1.h(this);

    @Override // ku1.m
    public void c() {
        com.tencent.mm.plugin.card.ui.s4 s4Var = this.f312132a;
        this.f312093b = ((com.tencent.mm.plugin.card.ui.b0) s4Var).f94936e;
        this.f312094c = ((com.tencent.mm.plugin.card.ui.b0) s4Var).C;
        tt1.j jVar = ((com.tencent.mm.plugin.card.ui.b0) s4Var).E;
        this.f312095d = jVar;
        if (jVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "initView failure! cardInfo is null!");
            return;
        }
        int i17 = jVar.i0().f385190p;
        if (i17 == 0) {
            this.f312099h = i();
        } else if (i17 == 1) {
            this.f312099h = g();
        } else if (i17 != 2) {
            this.f312099h = j();
        } else {
            this.f312099h = j();
        }
        if (this.f312099h == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
            return;
        }
        int i18 = this.f312095d.i0().f385190p;
        if (i18 != 0) {
            if (i18 != 1) {
                if (i18 != 2) {
                    if (this.f312101j == null) {
                        this.f312101j = (android.view.ViewStub) b(com.tencent.mm.R.id.bbl);
                    }
                } else if (this.f312101j == null) {
                    this.f312101j = (android.view.ViewStub) b(com.tencent.mm.R.id.bbl);
                }
            } else if (this.f312101j == null) {
                this.f312101j = (android.view.ViewStub) b(com.tencent.mm.R.id.f483560b83);
            }
        } else if (this.f312101j == null) {
            this.f312101j = (android.view.ViewStub) b(com.tencent.mm.R.id.f483565b92);
        }
        if (this.f312101j == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "initTargetView failure! viewStub is null!");
        } else {
            ku1.l0 l0Var = this.f312099h;
            if (l0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
            } else if (l0Var.getLayoutId() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "initTargetView failure! codeContainer.getLayoutId()  is 0!");
            } else {
                this.f312101j.setLayoutResource(this.f312099h.getLayoutId());
                if (this.f312098g == null) {
                    this.f312098g = (android.view.ViewGroup) this.f312101j.inflate();
                }
            }
        }
        if (this.f312098g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "iniView failure! targetView is null!");
        }
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.ViewGroup viewGroup = this.f312098g;
        if (viewGroup != null) {
            viewGroup.setVisibility(i17);
        }
    }

    @Override // ku1.m
    public void e() {
        if (this.f312095d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "update  failure! mCardInfo is null!");
            return;
        }
        if (this.f312099h == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "update failure! codeContainer is null!");
            return;
        }
        if (this.f312098g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "update failure! targetView is null!");
            return;
        }
        com.tencent.mm.plugin.card.ui.x3 x3Var = this.f312094c;
        if (x3Var.f95451o < 0.8f) {
            android.view.WindowManager.LayoutParams attributes = x3Var.f95437a.getWindow().getAttributes();
            attributes.screenBrightness = 0.8f;
            x3Var.f95437a.getWindow().setAttributes(attributes);
        }
        l(lu1.e.CARDCODEREFRESHACTION_ENTERCHANGE);
        this.f312099h.a(this.f312098g, this.f312095d);
    }

    public void f() {
        this.f312132a = null;
        this.f312093b = null;
        this.f312094c = null;
        this.f312095d = null;
        this.f312098g = null;
        this.f312099h = null;
        lu1.a0.F(this.f312096e);
        lu1.a0.F(this.f312097f);
    }

    public abstract ku1.l0 g();

    public abstract java.lang.String h(lu1.e eVar);

    public abstract ku1.l0 i();

    public abstract ku1.l0 j();

    public abstract boolean k(tt1.j jVar);

    public void l(lu1.e eVar) {
        tt1.j jVar;
        android.view.ViewGroup viewGroup;
        tt1.j jVar2 = this.f312095d;
        if (jVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "updateCodeView getCode mCardInfo  is null ! cannot show code view");
            return;
        }
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "updateCodeView failure!refreshReason is null!");
            return;
        }
        boolean d17 = this.f312099h.d(jVar2);
        int i17 = eVar.f321337d;
        if (!d17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "updateCodeView failure! can not get qrcode! refreshReason = %s", java.lang.Integer.valueOf(i17));
            ku1.l0 l0Var = this.f312099h;
            if (l0Var == null || (jVar = this.f312095d) == null || (viewGroup = this.f312098g) == null) {
                return;
            }
            l0Var.b(viewGroup, jVar);
            return;
        }
        this.f312099h.c(this.f312098g, this.f312095d);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseCodeView", "updateCodeView from refreshReason = %s", java.lang.Integer.valueOf(i17));
        java.lang.String h17 = h(eVar);
        this.f312100i = h17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "updateCodeView getCode is empty! cannot show code view");
            return;
        }
        int i18 = this.f312095d.i0().f385190p;
        int i19 = 1;
        if (i18 == 0) {
            android.view.ViewGroup viewGroup2 = this.f312098g;
            java.lang.String str = this.f312100i;
            android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.c0u);
            textView.setText(lu1.g0.a(4, str, true));
            textView.setOnLongClickListener(this.f312102k);
            java.lang.String str2 = this.f312095d.s0().f388555p;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                textView.setTextColor(lu1.a0.d(str2));
            }
            if (str.length() <= 12) {
                textView.setTextSize(1, 33.0f);
                return;
            }
            if (str.length() > 12 && str.length() <= 16) {
                textView.setTextSize(1, 30.0f);
                return;
            }
            if (str.length() > 16 && str.length() <= 20) {
                textView.setTextSize(1, 24.0f);
                return;
            }
            if (str.length() > 20 && str.length() <= 40) {
                textView.setTextSize(1, 18.0f);
                return;
            } else {
                if (str.length() > 40) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (i18 == 1) {
            android.view.ViewGroup viewGroup3 = this.f312098g;
            java.lang.String str3 = this.f312100i;
            try {
                android.widget.ImageView imageView = (android.widget.ImageView) viewGroup3.findViewById(com.tencent.mm.R.id.f483777c06);
                lu1.a0.F(this.f312097f);
                if (str3 != null && str3.length() > 0) {
                    this.f312097f = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(this.f312093b, str3, 5, 0);
                }
                android.graphics.Bitmap bitmap = this.f312097f;
                if (imageView != null && bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                }
                imageView.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
                this.f312094c.f95440d = this.f312097f;
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardBaseCodeView", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        if (i18 != 2) {
            return;
        }
        android.view.ViewGroup viewGroup4 = this.f312098g;
        java.lang.String str4 = this.f312100i;
        try {
            android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup4.findViewById(com.tencent.mm.R.id.c0m);
            lu1.a0.F(this.f312096e);
            tt1.j jVar3 = this.f312095d;
            if (jVar3 != null && jVar3.s0() != null) {
                i19 = this.f312095d.s0().f388569y0;
            }
            android.graphics.Bitmap Bi = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(this.f312093b, str4, 12, i19);
            this.f312096e = Bi;
            if (imageView2 != null && Bi != null) {
                imageView2.setImageBitmap(Bi);
            }
            imageView2.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
            com.tencent.mm.plugin.card.ui.x3 x3Var = this.f312094c;
            x3Var.f95439c = this.f312096e;
            db5.d5 d5Var = x3Var.f95442f;
            if (d5Var == null || !d5Var.isShowing()) {
                return;
            }
            x3Var.f95444h.setImageBitmap(x3Var.f95439c);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardBaseCodeView", e18, "", new java.lang.Object[0]);
        }
    }
}
