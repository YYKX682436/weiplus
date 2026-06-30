package j44;

/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f297683a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f297684b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f297685c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.progress.RoundProgressBtn f297686d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f297687e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton f297688f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f297689g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f297690h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f297691i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f297692j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f297693k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f297694l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f297695m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f297696n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f297697o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton f297698p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton f297699q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f297700r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f297701s;

    /* renamed from: t, reason: collision with root package name */
    public h44.b f297702t;

    /* renamed from: u, reason: collision with root package name */
    public j44.a f297703u;

    /* renamed from: v, reason: collision with root package name */
    public ca4.d f297704v;

    /* renamed from: w, reason: collision with root package name */
    public long f297705w;

    /* renamed from: x, reason: collision with root package name */
    public int f297706x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f297707y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f297708z;

    public j(android.content.Context context) {
        this.f297683a = context;
    }

    public static /* synthetic */ void p(j44.j jVar, java.lang.Integer num, java.lang.Integer num2, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshBtnUI$default", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshBtnUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshBtnUI$default", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            throw unsupportedOperationException;
        }
        if ((i17 & 2) != 0) {
            num2 = null;
        }
        jVar.o(num, num2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshBtnUI$default", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
    }

    public final void a(android.text.SpannableStringBuilder spannableStringBuilder, android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendDivider", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        yd4.d dVar = new yd4.d(drawable, 2);
        spannableStringBuilder.append("  ");
        spannableStringBuilder.append("@");
        spannableStringBuilder.setSpan(dVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append("  ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendDivider", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
    }

    public final void b(int i17, int i18) {
        java.lang.Integer e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdHalfScreenDownloadReport", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        h44.b bVar = this.f297702t;
        if (bVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdHalfScreenDownloadReport", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            return;
        }
        i44.a aVar = new i44.a();
        java.lang.String g17 = bVar != null ? bVar.g() : null;
        h44.b bVar2 = this.f297702t;
        java.lang.String i19 = bVar2 != null ? bVar2.i() : null;
        h44.b bVar3 = this.f297702t;
        int intValue = (bVar3 == null || (e17 = bVar3.e()) == null) ? 0 : e17.intValue();
        h44.b bVar4 = this.f297702t;
        aVar.c(g17, i19, intValue, bVar4 != null ? bVar4.a() : null, 0, i17, i18);
        a84.t0.a(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdHalfScreenDownloadReport", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
    }

    public abstract int c();

    public abstract int d();

    public final ca4.d e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        ca4.d dVar = this.f297704v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        return dVar;
    }

    public final h44.b f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAdDownloadParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        h44.b bVar = this.f297702t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAdDownloadParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        return bVar;
    }

    public final android.view.View g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContentView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        android.view.View view = this.f297700r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContentView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        return view;
    }

    public final android.content.Context h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContext", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContext", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        return this.f297683a;
    }

    public final android.view.View i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDeleteApkDialogView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        android.view.View view = this.f297701s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDeleteApkDialogView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        return view;
    }

    public final j44.a j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMHalfScreenBtnClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        j44.a aVar = this.f297703u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMHalfScreenBtnClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        return aVar;
    }

    public abstract java.lang.String k();

    public abstract void l();

    public final void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        android.content.Context context = this.f297683a;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(d(), (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(c(), (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        this.f297684b = (com.tencent.mm.ui.widget.MMRoundCornerImageView) inflate.findViewById(com.tencent.mm.R.id.f483228a15);
        this.f297685c = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) inflate.findViewById(com.tencent.mm.R.id.a1o);
        this.f297686d = (com.tencent.mm.ui.widget.progress.RoundProgressBtn) inflate.findViewById(com.tencent.mm.R.id.f486714m83);
        this.f297687e = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.q9d);
        this.f297688f = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton) inflate.findViewById(com.tencent.mm.R.id.d2z);
        this.f297689g = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) inflate.findViewById(com.tencent.mm.R.id.cwr);
        this.f297708z = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) inflate.findViewById(com.tencent.mm.R.id.f483234em1);
        this.f297707y = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) inflate.findViewById(com.tencent.mm.R.id.a8o);
        this.f297690h = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) inflate.findViewById(com.tencent.mm.R.id.qw7);
        this.f297691i = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) inflate.findViewById(com.tencent.mm.R.id.f483082w3);
        this.f297692j = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) inflate.findViewById(com.tencent.mm.R.id.f483076vx);
        this.f297693k = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) inflate.findViewById(com.tencent.mm.R.id.a0x);
        this.f297694l = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) inflate.findViewById(com.tencent.mm.R.id.b5n);
        this.f297695m = (com.tencent.mm.ui.widget.MMRoundCornerImageView) inflate2.findViewById(com.tencent.mm.R.id.f483229a16);
        this.f297696n = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) inflate2.findViewById(com.tencent.mm.R.id.ctj);
        this.f297697o = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) inflate2.findViewById(com.tencent.mm.R.id.q4d);
        this.f297698p = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton) inflate2.findViewById(com.tencent.mm.R.id.q_c);
        this.f297699q = (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton) inflate2.findViewById(com.tencent.mm.R.id.ct6);
        this.f297700r = inflate;
        this.f297701s = inflate2;
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton adAppCompatButton = this.f297688f;
        if (adAppCompatButton != null) {
            adAppCompatButton.setOnClickListener(new j44.b(this));
        }
        com.tencent.mm.ui.widget.progress.RoundProgressBtn roundProgressBtn = this.f297686d;
        if (roundProgressBtn != null) {
            roundProgressBtn.setOnClickListener(new j44.c(this));
        }
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = this.f297694l;
        if (adAppCompatTextView != null) {
            adAppCompatTextView.setOnClickListener(new j44.d(this));
        }
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView2 = this.f297691i;
        if (adAppCompatTextView2 != null) {
            adAppCompatTextView2.setOnClickListener(new j44.e(this));
        }
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView3 = this.f297692j;
        if (adAppCompatTextView3 != null) {
            adAppCompatTextView3.setOnClickListener(new j44.f(this));
        }
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView4 = this.f297693k;
        if (adAppCompatTextView4 != null) {
            adAppCompatTextView4.setOnClickListener(new j44.g(this));
        }
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton adAppCompatButton2 = this.f297698p;
        if (adAppCompatButton2 != null) {
            adAppCompatButton2.setOnClickListener(new j44.h(this));
        }
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton adAppCompatButton3 = this.f297699q;
        if (adAppCompatButton3 != null) {
            adAppCompatButton3.setOnClickListener(new j44.i(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
    }

    public void n(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openUrl", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e(k(), "openUrl but url is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openUrl", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            return;
        }
        l();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(this.f297683a, "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openUrl", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
    }

    public final void o(java.lang.Integer num, java.lang.Integer num2) {
        java.lang.String str;
        k44.f c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshBtnUI", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        this.f297706x = num != null ? num.intValue() : 0;
        if (num != null && num.intValue() == 1) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f297687e;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            com.tencent.mm.ui.widget.progress.RoundProgressBtn roundProgressBtn = this.f297686d;
            if (roundProgressBtn != null) {
                roundProgressBtn.setHasPause(true);
            }
            r(8);
        } else {
            android.content.Context context = this.f297683a;
            if (num != null && num.intValue() == 3) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f297687e;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(8);
                }
                com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton adAppCompatButton = this.f297688f;
                if (adAppCompatButton != null) {
                    adAppCompatButton.setText(context != null ? context.getString(com.tencent.mm.R.string.f493166j63) : null);
                }
                r(0);
            } else if (num != null && num.intValue() == 2) {
                if (num2 != null) {
                    int intValue = num2.intValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
                    com.tencent.mm.ui.widget.progress.RoundProgressBtn roundProgressBtn2 = this.f297686d;
                    if (roundProgressBtn2 != null) {
                        roundProgressBtn2.setProgress(intValue);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f297687e;
                if (weImageView3 != null) {
                    weImageView3.setVisibility(0);
                }
                com.tencent.mm.ui.widget.progress.RoundProgressBtn roundProgressBtn3 = this.f297686d;
                if (roundProgressBtn3 != null) {
                    roundProgressBtn3.setHasPause(false);
                }
                r(8);
            } else {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f297687e;
                if (weImageView4 != null) {
                    weImageView4.setVisibility(8);
                }
                h44.b bVar = this.f297702t;
                if (bVar == null || (c17 = bVar.c()) == null) {
                    str = null;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.DownloadHalfScreenInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.DownloadHalfScreenInfo");
                    str = c17.f304072b;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = context != null ? context.getString(com.tencent.mm.R.string.j68) : null;
                }
                com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton adAppCompatButton2 = this.f297688f;
                if (adAppCompatButton2 != null) {
                    adAppCompatButton2.setText(str);
                }
                r(0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setApkCancelDownloadBtnUI", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = this.f297694l;
            if (adAppCompatTextView != null) {
                adAppCompatTextView.setVisibility(0);
            }
        } else {
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView2 = this.f297694l;
            if (adAppCompatTextView2 != null) {
                adAppCompatTextView2.setVisibility(4);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setApkCancelDownloadBtnUI", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshBtnUI", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x031a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j44.j.q():void");
    }

    public void r(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnOrProgressBarVisible", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        if (i17 == 0) {
            com.tencent.mm.ui.widget.progress.RoundProgressBtn roundProgressBtn = this.f297686d;
            if (roundProgressBtn != null) {
                roundProgressBtn.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton adAppCompatButton = this.f297688f;
            if (adAppCompatButton != null) {
                adAppCompatButton.setVisibility(0);
            }
        } else {
            com.tencent.mm.ui.widget.progress.RoundProgressBtn roundProgressBtn2 = this.f297686d;
            if (roundProgressBtn2 != null) {
                roundProgressBtn2.setVisibility(0);
            }
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton adAppCompatButton2 = this.f297688f;
            if (adAppCompatButton2 != null) {
                adAppCompatButton2.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnOrProgressBarVisible", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
    }

    public abstract void s(int i17, int i18);

    public abstract void t(android.view.View view);
}
