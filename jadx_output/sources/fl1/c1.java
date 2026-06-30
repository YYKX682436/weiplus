package fl1;

/* loaded from: classes7.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f263729a;

    /* renamed from: e, reason: collision with root package name */
    public int f263733e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f263734f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f263735g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f263736h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f263737i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f263738j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.RatingBar f263739k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f263740l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f263741m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f263742n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.i f263743o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f263730b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f263731c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f263732d = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f263744p = false;

    public c1(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        fa1.s sVar = (fa1.s) c0Var.z1(fa1.s.class);
        if (sVar != null) {
            this.f263743o = ((fa1.a) sVar).L;
        }
    }

    public void a() {
        android.app.Dialog dialog = this.f263737i;
        if (dialog != null) {
            dialog.dismiss();
            this.f263737i = null;
        }
    }

    public final android.app.Dialog b(android.content.Context context, boolean z17) {
        sp.b bVar = new sp.b(context, com.tencent.mm.R.style.f493924q);
        bVar.setCancelable(true);
        bVar.setCanceledOnTouchOutside(z17);
        android.view.Window window = bVar.getWindow();
        if (window != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 81;
            attributes.height = -2;
            attributes.width = -1;
            window.setAttributes(attributes);
            window.setWindowAnimations(com.tencent.mm.R.style.f493923p);
        }
        return bVar;
    }

    public final void c(int i17, int i18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f263734f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "operateReport, no app id");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "operateReport, appId:%s, eventId:%s, session:%s, score:%s, scene:%s, result:%s, path:%s", this.f263734f, java.lang.Integer.valueOf(i17), this.f263735g, java.lang.Integer.valueOf(this.f263731c), java.lang.Integer.valueOf(this.f263733e), java.lang.Integer.valueOf(i18), this.f263736h);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16176, this.f263734f, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), java.lang.Integer.valueOf(this.f263731c), this.f263735g, this.f263736h, java.lang.Integer.valueOf(this.f263733e), java.lang.Integer.valueOf(i18));
        }
    }

    public final boolean d(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.appbrand.report.i iVar = this.f263743o;
        if (iVar == null) {
            return false;
        }
        r45.bg7 bg7Var = iVar.f87866f;
        if (bg7Var == null || (linkedList = bg7Var.f370752f) == null || linkedList.size() < 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game evaluate dialog: no config");
            return false;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(1237L, 0L, 1L, false);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.appbrand.m6.b(o6Var.f74803n).f85721n);
        this.f263732d = currentTimeMillis;
        if (currentTimeMillis >= bg7Var.f370754h * 1000) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game evaluate dialog: time limit");
        g0Var.idkeyStat(1237L, 1L, 1L, false);
        return false;
    }

    public final boolean e(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        com.tencent.mm.plugin.appbrand.report.i iVar = this.f263743o;
        if (iVar == null) {
            return false;
        }
        r45.dg7 dg7Var = iVar.f87867g;
        if (dg7Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game review dialog: no config");
            return false;
        }
        ch1.b.f41276a.a(o6Var.u0().f77278d, o6Var.u0().L, o6Var.u0().M, 0L, 3L, dg7Var.f372460n);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.appbrand.m6.b(o6Var.f74803n).f85721n);
        this.f263732d = currentTimeMillis;
        if (currentTimeMillis >= dg7Var.f372459m * 1000) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game review dialog: time limit");
        return false;
    }

    public final void f(com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.Runnable runnable) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.appbrand.report.i iVar = this.f263743o;
        r45.bg7 bg7Var = iVar.f87866f;
        android.app.Dialog dialog = null;
        if (bg7Var == null || (linkedList = bg7Var.f370752f) == null || linkedList.size() < 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game evaluate dialog: no config");
        } else {
            iVar.f87866f = null;
            android.app.Dialog b17 = b(o6Var.r0(), false);
            this.f263737i = b17;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(b17.getContext()).inflate(com.tencent.mm.R.layout.f488030ev, (android.view.ViewGroup) null, false);
            this.f263737i.setContentView(linearLayout);
            android.graphics.Point h17 = com.tencent.mm.ui.bk.h(this.f263737i.getContext());
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(java.lang.Math.min(h17.x, h17.y), linearLayout.getLayoutParams().height);
            layoutParams.gravity = 1;
            linearLayout.setLayoutParams(layoutParams);
            android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.obc);
            textView.setText(bg7Var.f370755i);
            android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.di6);
            textView2.setText(bg7Var.f370751e);
            android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.f484239di3);
            fl1.b1 b1Var = new fl1.b1(this, textView, textView2, imageView, linearLayout, o6Var, runnable, bg7Var);
            ((com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandGameEvaluateOptionView) linearLayout.findViewById(com.tencent.mm.R.id.kjw)).a(0, bg7Var, b1Var);
            ((com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandGameEvaluateOptionView) linearLayout.findViewById(com.tencent.mm.R.id.kjx)).a(1, bg7Var, b1Var);
            ((com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandGameEvaluateOptionView) linearLayout.findViewById(com.tencent.mm.R.id.kjy)).a(2, bg7Var, b1Var);
            this.f263737i.setOnCancelListener(new fl1.e0(this, o6Var, bg7Var, runnable));
            imageView.setOnClickListener(new fl1.f0(this, o6Var, bg7Var, runnable));
            dialog = this.f263737i;
        }
        this.f263737i = dialog;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1237L, 4L, 1L, false);
        android.app.Dialog dialog2 = this.f263737i;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    public final void g(com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.Runnable runnable) {
        com.tencent.mm.plugin.appbrand.report.i iVar = this.f263743o;
        r45.dg7 dg7Var = iVar.f87867g;
        android.app.Dialog dialog = null;
        if (dg7Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game review dialog: no config");
        } else {
            ch1.a aVar = ch1.b.f41276a;
            aVar.a(o6Var.u0().f77278d, o6Var.u0().L, o6Var.u0().M, 1L, 1L, dg7Var.f372460n);
            iVar.f87867g = null;
            android.app.Dialog b17 = b(o6Var.r0(), false);
            this.f263737i = b17;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(b17.getContext()).inflate(com.tencent.mm.R.layout.b_b, (android.view.ViewGroup) null, false);
            this.f263737i.setContentView(linearLayout);
            int b18 = i65.a.b(this.f263737i.getContext(), 414);
            android.graphics.Point h17 = com.tencent.mm.ui.bk.h(this.f263737i.getContext());
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(java.lang.Math.min(h17.x, h17.y), b18);
            layoutParams.gravity = 1;
            linearLayout.setLayoutParams(layoutParams);
            o11.f fVar = new o11.f();
            fVar.f342078b = true;
            fVar.f342077a = true;
            n11.a.b().h(dg7Var.f372453d, (android.widget.ImageView) this.f263737i.findViewById(com.tencent.mm.R.id.rrm), fVar.a());
            ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.s_0)).setText(dg7Var.f372454e);
            ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.s9z)).setText(dg7Var.f372455f);
            ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.s9y)).setText(dg7Var.f372456g);
            aVar.a(o6Var.u0().f77278d, o6Var.u0().L, o6Var.u0().M, 3L, 1L, dg7Var.f372460n);
            ((android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.f483475re1)).setOnClickListener(new fl1.g0(this, o6Var, dg7Var, runnable));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(dg7Var.f372457h)) {
                aVar.a(o6Var.u0().f77278d, o6Var.u0().L, o6Var.u0().M, 2L, 1L, dg7Var.f372460n);
                android.widget.Button button = (android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.f483476re2);
                button.setText(dg7Var.f372457h);
                button.setVisibility(0);
                button.setOnClickListener(new fl1.i0(this, o6Var, dg7Var, runnable));
            }
            dialog = this.f263737i;
        }
        this.f263737i = dialog;
        if (dialog != null) {
            dialog.show();
        }
    }

    public final boolean h(com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.Runnable runnable) {
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject;
        if (o6Var == null || o6Var.E0() == null || o6Var.r0() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "invalid close state");
            return false;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = o6Var.E0();
        if (!E0.f77338l1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "can not show evaluate dialog");
            return false;
        }
        long j17 = com.tencent.mm.plugin.appbrand.m6.b(o6Var.f74803n).f85721n;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "app time lastResumeTime:%s, closeTime:%s, leastTime:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(E0.f77340x1));
        if ((currentTimeMillis - j17) / 1000 < E0.f77340x1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "time not enough to show evaluate dialog");
            return false;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
        java.lang.String str = u07.f47278x;
        this.f263729a = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "username is null, can not show evaluate dialog");
            return false;
        }
        android.app.Activity r07 = o6Var.r0();
        java.lang.String str2 = u07.f77278d;
        java.lang.String str3 = u07.f77279e;
        boolean z17 = E0.f77339p1;
        android.app.Dialog b17 = b(r07, true);
        this.f263737i = b17;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(b17.getContext()).inflate(com.tencent.mm.R.layout.f488025eq, (android.view.ViewGroup) null, false);
        this.f263737i.setContentView(linearLayout);
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(this.f263737i.getContext());
        int min = java.lang.Math.min(h17.x, h17.y);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(min, -2);
        layoutParams.gravity = 1;
        linearLayout.setLayoutParams(layoutParams);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "createEvaluateDialog, dialog width:%d", java.lang.Integer.valueOf(min));
        this.f263740l = (android.widget.TextView) this.f263737i.findViewById(com.tencent.mm.R.id.di7);
        this.f263741m = (android.widget.LinearLayout) this.f263737i.findViewById(com.tencent.mm.R.id.di8);
        this.f263742n = (android.widget.LinearLayout) this.f263737i.findViewById(com.tencent.mm.R.id.f484241di5);
        android.widget.TextView textView = (android.widget.TextView) this.f263737i.findViewById(com.tencent.mm.R.id.f484240di4);
        if (z17) {
            textView.setVisibility(0);
            textView.setOnClickListener(new fl1.v0(this, r07, str2, str3));
        } else {
            textView.setVisibility(8);
            textView.setOnClickListener(null);
        }
        ((android.widget.TextView) this.f263737i.findViewById(com.tencent.mm.R.id.dia)).setOnClickListener(new fl1.w0(this, r07));
        android.widget.RatingBar ratingBar = (android.widget.RatingBar) this.f263737i.findViewById(com.tencent.mm.R.id.di9);
        this.f263739k = ratingBar;
        ratingBar.setOnRatingBarChangeListener(new fl1.x0(this));
        this.f263738j = (android.widget.TextView) this.f263737i.findViewById(com.tencent.mm.R.id.di6);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            this.f263738j.setVisibility(8);
        } else {
            this.f263738j.setVisibility(0);
            this.f263738j.setText(r07.getString(com.tencent.mm.R.string.f490118lf, str3));
        }
        ((android.widget.ImageView) this.f263737i.findViewById(com.tencent.mm.R.id.f484239di3)).setOnClickListener(new fl1.y0(this));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) linearLayout.getParent();
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new fl1.z0(this));
            linearLayout.setOnClickListener(new fl1.a1(this));
        }
        android.app.Dialog dialog = this.f263737i;
        this.f263737i = dialog;
        dialog.setOnCancelListener(new fl1.p0(this));
        this.f263737i.setOnDismissListener(new fl1.u0(this, runnable));
        this.f263730b = false;
        E0.f77338l1 = false;
        java.lang.String str4 = o6Var.f74803n;
        this.f263734f = str4;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "saveEvaluateReport, no app id");
        } else {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08 = o6Var.u0();
            this.f263735g = "";
            if (u08 != null) {
                this.f263735g = u08.f47276v;
            }
            this.f263733e = 1000;
            if (u08 != null && (appBrandStatObject = u08.f47269b2) != null) {
                this.f263733e = appBrandStatObject.f87790f;
            }
            this.f263736h = "";
            if (o6Var.C0() != null && o6Var.C0().V0() != null) {
                this.f263736h = o6Var.C0().V0().X1();
            }
        }
        c(1, 1);
        android.app.Dialog dialog2 = this.f263737i;
        if (dialog2 != null) {
            dialog2.show();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.tencent.mm.plugin.appbrand.o6 r20, boolean r21, r45.l25 r22, r45.bg7 r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fl1.c1.i(com.tencent.mm.plugin.appbrand.o6, boolean, r45.l25, r45.bg7):void");
    }

    public final void j(r45.et6 et6Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2521;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/updateevaluate";
        lVar.f70664a = et6Var;
        lVar.f70665b = new r45.ft6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new fl1.k0(this));
    }

    public final void k(int i17) {
        int i18 = com.tencent.mm.R.string.f490124ll;
        if (i17 != 1) {
            if (i17 == 2) {
                i18 = com.tencent.mm.R.string.f490126ln;
            } else if (i17 == 3) {
                i18 = com.tencent.mm.R.string.f490125lm;
            } else if (i17 == 4) {
                i18 = com.tencent.mm.R.string.f490123lk;
            } else if (i17 == 5) {
                i18 = com.tencent.mm.R.string.f490122lj;
            }
        }
        this.f263740l.setText(i18);
    }
}
