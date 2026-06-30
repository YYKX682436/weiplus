package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public class ScanCodeSheetItemLogic implements androidx.lifecycle.x, kd0.p2 {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f158647d;

    /* renamed from: g, reason: collision with root package name */
    public final kd0.n2 f158650g;

    /* renamed from: h, reason: collision with root package name */
    public kd0.o2 f158651h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.y f158652i;

    /* renamed from: n, reason: collision with root package name */
    public int f158654n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f158655o;

    /* renamed from: e, reason: collision with root package name */
    public r45.aq3 f158648e = null;

    /* renamed from: f, reason: collision with root package name */
    public final r45.aq3 f158649f = new r45.aq3();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f158653m = new java.util.HashMap();

    public ScanCodeSheetItemLogic(android.content.Context context) {
        new androidx.lifecycle.j0();
        this.f158655o = false;
        this.f158647d = context;
    }

    public static void a(com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic, r45.aq3 aq3Var) {
        scanCodeSheetItemLogic.getClass();
        if (aq3Var != null && !android.text.TextUtils.isEmpty(aq3Var.f370205n)) {
            try {
                java.lang.String optString = new org.json.JSONObject(aq3Var.f370205n).optString(dm.i4.COL_USERNAME);
                if (android.text.TextUtils.isEmpty(optString) || !com.tencent.mm.storage.z3.z3(optString)) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeSheetItemLogic", "try preloadWxaAttrs username:%s, scene:%d", optString, java.lang.Integer.valueOf(scanCodeSheetItemLogic.f158654n));
                com.tencent.mm.plugin.scanner.EventScanCodeSheetPreloadWxaAttrs eventScanCodeSheetPreloadWxaAttrs = new com.tencent.mm.plugin.scanner.EventScanCodeSheetPreloadWxaAttrs();
                eventScanCodeSheetPreloadWxaAttrs.f158615g = optString;
                eventScanCodeSheetPreloadWxaAttrs.e();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public android.view.View b(android.view.View.OnClickListener onClickListener, int i17, java.lang.String str, int i18) {
        this.f158654n = i18;
        com.tencent.mm.plugin.scanner.g1 g1Var = new com.tencent.mm.plugin.scanner.g1(this, i18, onClickListener);
        return this.f158648e == null ? f(g1Var, i17, str) : g(g1Var);
    }

    public android.view.View c(android.view.View.OnClickListener onClickListener, java.util.List list, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, int i17) {
        this.f158654n = i17;
        com.tencent.mm.plugin.scanner.h1 h1Var = new com.tencent.mm.plugin.scanner.h1(this, i17, onClickListener);
        if (this.f158648e != null) {
            return g(h1Var);
        }
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanCodeSheetItemLogic", "createQRCodeMenuItemDefault return null,  list is null or empty");
            return null;
        }
        if (imageQBarDataBean != null) {
            return f(h1Var, imageQBarDataBean.f158620e, imageQBarDataBean.f158619d);
        }
        if (list.size() == 1) {
            com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean2 = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) list.get(0);
            return f(h1Var, imageQBarDataBean2.f158620e, imageQBarDataBean2.f158619d);
        }
        java.lang.String m17 = m(list);
        dl5.a aVar = new dl5.a(this.f158647d);
        aVar.setOnClickListener(h1Var);
        aVar.setTitle(m17);
        return aVar;
    }

    public void d(int i17, java.lang.String str, com.tencent.mm.ui.widget.dialog.k0 k0Var, db5.g4 g4Var, int i18) {
        r45.aq3 aq3Var = this.f158648e;
        boolean z17 = false;
        if (aq3Var == null || !(com.tencent.mm.sdk.platformtools.t8.D0(aq3Var.f370199e, str) || this.f158648e == this.f158649f)) {
            if (!com.tencent.mm.plugin.scanner.z0.e(i17, str)) {
                g4Var.g(i18, l(i17, str), com.tencent.mm.R.raw.icons_outlined_qr_code);
                return;
            }
            db5.h4 h4Var = new db5.h4(g4Var.f228346f, i18, 0);
            h4Var.f228365f = true;
            ((java.util.ArrayList) g4Var.f228344d).add(h4Var);
            return;
        }
        r45.aq3 aq3Var2 = this.f158648e;
        if (aq3Var2 != null && (aq3Var2.f370206o & 1) != 0) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanCodeSheetItemLogic", "qrcode banned: %s, remove menu: %d", str, java.lang.Integer.valueOf(i18));
            g4Var.removeItem(i18);
            return;
        }
        if (aq3Var2.f370198d != 0 || com.tencent.mm.sdk.platformtools.t8.K0(aq3Var2.f370203i)) {
            if (com.tencent.mm.plugin.scanner.z0.d(i17, str) || com.tencent.mm.plugin.scanner.z0.h(i17, str) || com.tencent.mm.plugin.scanner.z0.l(i17, str) || com.tencent.mm.plugin.scanner.z0.n(i17, str)) {
                g4Var.h(i18, this.f158647d.getString(com.tencent.mm.R.string.i_2), com.tencent.mm.R.raw.icons_outlined_qr_code, this.f158647d.getResources().getColor(com.tencent.mm.R.color.FG_0));
                return;
            }
            if (com.tencent.mm.plugin.scanner.z0.o(i17, str)) {
                g4Var.h(i18, this.f158647d.getString(com.tencent.mm.R.string.i_4), com.tencent.mm.R.raw.icons_outlined_qr_code, this.f158647d.getResources().getColor(com.tencent.mm.R.color.FG_0));
                return;
            }
            if (com.tencent.mm.plugin.scanner.z0.k(i17, str)) {
                g4Var.h(i18, this.f158647d.getString(com.tencent.mm.R.string.i_1), com.tencent.mm.R.raw.icons_outlined_wechatpay, this.f158647d.getResources().getColor(com.tencent.mm.R.color.FG_0));
                return;
            }
            if (com.tencent.mm.plugin.scanner.z0.m(i17, str)) {
                g4Var.h(i18, this.f158647d.getString(com.tencent.mm.R.string.i_3), com.tencent.mm.R.raw.icons_outlined_pay_reward_code, this.f158647d.getResources().getColor(com.tencent.mm.R.color.FG_0));
                return;
            }
            java.lang.CharSequence string = this.f158647d.getString(com.tencent.mm.R.string.i_2);
            if (!com.tencent.mm.plugin.scanner.j1.b(i17)) {
                string = this.f158647d.getString(com.tencent.mm.R.string.i_0);
            }
            g4Var.h(i18, string, com.tencent.mm.R.raw.icons_outlined_qr_code, this.f158647d.getResources().getColor(com.tencent.mm.R.color.FG_0));
            return;
        }
        r45.aq3 aq3Var3 = this.f158648e;
        java.lang.String str2 = aq3Var3.f370203i;
        com.tencent.mm.plugin.scanner.f1 f1Var = new com.tencent.mm.plugin.scanner.f1(this, i18);
        k0Var.F = f1Var;
        k0Var.E = f1Var;
        int i19 = aq3Var3.f370201g;
        if (i19 == 4) {
            g4Var.q(i18, str2, this.f158647d.getString(com.tencent.mm.R.string.i8p), 0, 0);
            return;
        }
        if (i19 == 3) {
            g4Var.q(i18, str2, this.f158647d.getString(com.tencent.mm.R.string.f492921i93), 0, 0);
            return;
        }
        if (i19 == 11) {
            if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
                g4Var.q(i18, str2, this.f158647d.getString(com.tencent.mm.R.string.pbr), 0, 0);
                return;
            } else {
                k0Var.F = null;
                g4Var.h(i18, this.f158647d.getString(com.tencent.mm.R.string.i_2), com.tencent.mm.R.raw.icons_outlined_qr_code, this.f158647d.getResources().getColor(com.tencent.mm.R.color.FG_0));
                return;
            }
        }
        if (i19 == 1) {
            g4Var.q(i18, str2, this.f158647d.getString(com.tencent.mm.R.string.f492925ia1), 0, 0);
            return;
        }
        if (i19 == 2) {
            g4Var.q(i18, str2, this.f158647d.getString(com.tencent.mm.R.string.i9u), 0, this.f158647d.getResources().getColor(com.tencent.mm.R.color.FG_0));
            return;
        }
        if (i19 != 7) {
            if (i19 == 6) {
                g4Var.q(i18, com.tencent.mm.sdk.platformtools.t8.z1(this.f158647d.getString(com.tencent.mm.R.string.f492924ia0), this.f158648e.f370203i), this.f158647d.getString(com.tencent.mm.R.string.i_z), 0, this.f158647d.getResources().getColor(com.tencent.mm.R.color.FG_0));
                return;
            } else if (i19 == 5) {
                g4Var.q(i18, com.tencent.mm.sdk.platformtools.t8.z1(this.f158647d.getString(com.tencent.mm.R.string.iap), this.f158648e.f370203i), this.f158647d.getString(com.tencent.mm.R.string.iao), 0, this.f158647d.getResources().getColor(com.tencent.mm.R.color.FG_0));
                return;
            } else {
                if (i19 == 9) {
                    g4Var.q(i18, str2, this.f158647d.getString(com.tencent.mm.R.string.i9i), 0, 0);
                    return;
                }
                return;
            }
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String str3 = str2 + " ";
        spannableStringBuilder.append((java.lang.CharSequence) str3);
        java.lang.String str4 = "@" + this.f158648e.f370205n;
        spannableStringBuilder.append((java.lang.CharSequence) str4);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.f158647d.getResources().getColor(com.tencent.mm.R.color.f478526a7)), str3.length(), str3.length() + str4.length(), 33);
        g4Var.q(i18, spannableStringBuilder, this.f158647d.getString(com.tencent.mm.R.string.ib7), 0, 0);
    }

    public void e(java.util.ArrayList arrayList, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, com.tencent.mm.ui.widget.dialog.k0 k0Var, db5.g4 g4Var, int i17) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() <= 1) {
            d(((com.tencent.mm.plugin.scanner.ImageQBarDataBean) arrayList.get(0)).f158620e, ((com.tencent.mm.plugin.scanner.ImageQBarDataBean) arrayList.get(0)).f158619d, k0Var, g4Var, i17);
        } else if (imageQBarDataBean != null) {
            d(imageQBarDataBean.f158620e, imageQBarDataBean.f158619d, k0Var, g4Var, i17);
        } else {
            g4Var.g(i17, m(arrayList), com.tencent.mm.R.raw.icons_outlined_qr_code);
        }
    }

    public final android.view.View f(android.view.View.OnClickListener onClickListener, int i17, java.lang.String str) {
        com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation viewTitleWithAnimation = new com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation(this.f158647d);
        viewTitleWithAnimation.f211539h.clearAnimation();
        viewTitleWithAnimation.f211535d.setVisibility(8);
        viewTitleWithAnimation.f211538g.setVisibility(8);
        viewTitleWithAnimation.f211536e.setVisibility(8);
        viewTitleWithAnimation.f211539h.setVisibility(0);
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        viewTitleWithAnimation.f211539h.startAnimation(rotateAnimation);
        viewTitleWithAnimation.setOnClickListener(onClickListener);
        if (com.tencent.mm.plugin.scanner.z0.o(i17, str)) {
            viewTitleWithAnimation.getIconImageView().setImageResource(com.tencent.mm.R.raw.actionsheet_default_appbrand_icon);
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9l));
        } else if (com.tencent.mm.plugin.scanner.z0.d(i17, str)) {
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9m));
            viewTitleWithAnimation.getIconImageView().setImageDrawable(null);
            viewTitleWithAnimation.getIconImageView().setImageResource(com.tencent.mm.R.drawable.f482078ay3);
        } else if (com.tencent.mm.plugin.scanner.z0.l(i17, str)) {
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9q));
            viewTitleWithAnimation.getIconImageView().setImageDrawable(null);
            viewTitleWithAnimation.getIconImageView().setImageResource(com.tencent.mm.R.color.BW_BG_95);
        } else if (com.tencent.mm.plugin.scanner.z0.h(i17, str)) {
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9o));
            viewTitleWithAnimation.getIconImageView().setImageDrawable(null);
            viewTitleWithAnimation.getIconImageView().setImageResource(com.tencent.mm.R.raw.default_chatroom);
        } else if (com.tencent.mm.plugin.scanner.z0.n(i17, str)) {
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9s));
            viewTitleWithAnimation.getIconImageView().setImageDrawable(null);
            viewTitleWithAnimation.getIconImageView().setImageResource(com.tencent.mm.R.color.BW_BG_95);
        } else if (com.tencent.mm.plugin.scanner.z0.k(i17, str)) {
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9p));
            android.widget.ImageView iconImageView = viewTitleWithAnimation.getIconImageView();
            android.content.Context context = this.f158647d;
            iconImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_wallet, context.getResources().getColor(com.tencent.mm.R.color.Brand_100)));
        } else if (com.tencent.mm.plugin.scanner.z0.m(i17, str)) {
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9r));
            android.widget.ImageView iconImageView2 = viewTitleWithAnimation.getIconImageView();
            android.content.Context context2 = this.f158647d;
            iconImageView2.setImageDrawable(com.tencent.mm.ui.uk.e(context2, com.tencent.mm.R.raw.icon_scan_code_reward, context2.getResources().getColor(com.tencent.mm.R.color.f478554ao)));
        } else {
            if (!com.tencent.mm.plugin.scanner.z0.g(i17, str)) {
                java.lang.String string = this.f158647d.getString(com.tencent.mm.R.string.f492929ia5);
                if (!com.tencent.mm.plugin.scanner.j1.b(i17)) {
                    string = this.f158647d.getString(com.tencent.mm.R.string.f492928ia4);
                }
                dl5.a aVar = new dl5.a(this.f158647d);
                aVar.setOnClickListener(onClickListener);
                aVar.setTitle(string);
                return aVar;
            }
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9n));
            viewTitleWithAnimation.getIconImageView().setImageDrawable(null);
            viewTitleWithAnimation.getIconImageView().setImageResource(com.tencent.mm.R.drawable.f482078ay3);
        }
        return viewTitleWithAnimation;
    }

    public final android.view.View g(android.view.View.OnClickListener onClickListener) {
        r45.aq3 aq3Var = this.f158648e;
        if ((aq3Var == null || (aq3Var.f370206o & 1) == 0) ? false : true) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanCodeSheetItemLogic", "qrcode banned, remove menu");
            return null;
        }
        if (aq3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanCodeSheetItemLogic", "qrcode mCodeInfoRespItem is null, remove menu");
            return null;
        }
        com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation viewTitleWithAnimation = new com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation(this.f158647d);
        viewTitleWithAnimation.f211539h.clearAnimation();
        viewTitleWithAnimation.f211539h.setVisibility(8);
        viewTitleWithAnimation.f211535d.setVisibility(0);
        viewTitleWithAnimation.f211536e.setVisibility(0);
        viewTitleWithAnimation.f211538g.setVisibility(0);
        r45.aq3 aq3Var2 = this.f158648e;
        if (aq3Var2.f370198d != 0 || com.tencent.mm.sdk.platformtools.t8.K0(aq3Var2.f370203i)) {
            viewTitleWithAnimation.f211541m.setVisibility(4);
            viewTitleWithAnimation.f211540i.setVisibility(0);
            viewTitleWithAnimation.setOnClickListener(onClickListener);
            return viewTitleWithAnimation;
        }
        viewTitleWithAnimation.setTitle(this.f158648e.f370203i);
        viewTitleWithAnimation.setOnClickListener(onClickListener);
        o11.f fVar = new o11.f();
        fVar.f342079c = true;
        viewTitleWithAnimation.getIconImageView().setBackground(null);
        viewTitleWithAnimation.getIconImageView().setImageDrawable(null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeSheetItemLogic", "mCodeInfoRespItem.UrlType: " + this.f158648e.f370201g);
        int i17 = this.f158648e.f370201g;
        if (i17 == 4) {
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9l));
            fVar.f342091o = com.tencent.mm.R.raw.actionsheet_default_appbrand_icon;
            fVar.f342096t = true;
            n11.a.b().h(this.f158648e.f370204m, viewTitleWithAnimation.getIconImageView(), fVar.a());
        } else if (i17 == 3) {
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9m));
            fVar.f342091o = com.tencent.mm.R.drawable.f482078ay3;
            fVar.f342096t = true;
            n11.a.b().h(this.f158648e.f370204m, viewTitleWithAnimation.getIconImageView(), fVar.a());
        } else if (i17 == 11) {
            if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
                viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.pbq));
                fVar.f342091o = com.tencent.mm.R.drawable.f482078ay3;
                fVar.f342096t = true;
                n11.a.b().h(this.f158648e.f370204m, viewTitleWithAnimation.getIconImageView(), fVar.a());
            } else {
                viewTitleWithAnimation.f211541m.setVisibility(4);
                viewTitleWithAnimation.f211540i.setVisibility(0);
            }
        } else if (i17 == 1) {
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9q));
            fVar.f342091o = com.tencent.mm.R.color.BW_BG_95;
            n11.a.b().h(this.f158648e.f370204m, viewTitleWithAnimation.getIconImageView(), fVar.a());
        } else if (i17 == 2) {
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9o));
            viewTitleWithAnimation.getIconImageView().setImageResource(com.tencent.mm.R.raw.default_chatroom);
        } else if (i17 == 7) {
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9s));
            viewTitleWithAnimation.getIconImageView().setImageDrawable(null);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f158648e.f370205n)) {
                viewTitleWithAnimation.setCompanyText(com.tencent.mm.sdk.platformtools.t8.z1("@%s", this.f158648e.f370205n));
            }
            fVar.f342091o = com.tencent.mm.R.color.BW_BG_95;
            n11.a.b().h(this.f158648e.f370204m, viewTitleWithAnimation.getIconImageView(), fVar.a());
        } else if (i17 == 6) {
            viewTitleWithAnimation.setTitle(com.tencent.mm.sdk.platformtools.t8.z1(this.f158647d.getString(com.tencent.mm.R.string.f492924ia0), this.f158648e.f370203i));
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9p));
            android.widget.ImageView iconImageView = viewTitleWithAnimation.getIconImageView();
            android.content.Context context = this.f158647d;
            iconImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_wallet, context.getResources().getColor(com.tencent.mm.R.color.f478502m)));
        } else if (i17 == 5) {
            viewTitleWithAnimation.setTitle(com.tencent.mm.sdk.platformtools.t8.z1(this.f158647d.getString(com.tencent.mm.R.string.iap), this.f158648e.f370203i));
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9r));
            android.widget.ImageView iconImageView2 = viewTitleWithAnimation.getIconImageView();
            android.content.Context context2 = this.f158647d;
            iconImageView2.setImageDrawable(com.tencent.mm.ui.uk.e(context2, com.tencent.mm.R.raw.icon_scan_code_reward, context2.getResources().getColor(com.tencent.mm.R.color.f478554ao)));
        } else if (i17 == 9) {
            viewTitleWithAnimation.setSubTitle(this.f158647d.getString(com.tencent.mm.R.string.i9n));
            fVar.f342091o = com.tencent.mm.R.drawable.f482078ay3;
            fVar.f342096t = true;
            n11.a.b().h(this.f158648e.f370204m, viewTitleWithAnimation.getIconImageView(), fVar.a());
        } else {
            viewTitleWithAnimation.f211541m.setVisibility(4);
            viewTitleWithAnimation.f211540i.setVisibility(0);
        }
        return viewTitleWithAnimation;
    }

    public void h(int i17, java.lang.String str) {
        i(i17, new kd0.f2(str));
    }

    public void i(int i17, kd0.f2 f2Var) {
        this.f158648e = null;
        java.lang.String trim = f2Var.f306634a.trim();
        f2Var.f306634a = trim;
        if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            return;
        }
        if (this.f158652i == null) {
            this.f158652i = new com.tencent.mm.plugin.scanner.y();
        }
        if (com.tencent.mm.plugin.scanner.z0.e(i17, trim)) {
            this.f158652i.a(i17, f2Var).a(new com.tencent.mm.plugin.scanner.c1(this, trim));
        }
    }

    public void j(int i17, kd0.f2 f2Var, long j17) {
        this.f158655o = true;
        this.f158648e = null;
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.ScanCodeSheetItemLogic");
        java.lang.String str = f2Var.f306634a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (this.f158652i == null) {
            this.f158652i = new com.tencent.mm.plugin.scanner.y();
        }
        if (com.tencent.mm.plugin.scanner.z0.e(i17, str)) {
            if (j17 > 0) {
                ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.ScanCodeSheetItemLogic");
                ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.plugin.scanner.e1(this, str), j17, "MicroMsg.ScanCodeSheetItemLogic");
            }
            this.f158652i.a(i17, f2Var).a(new com.tencent.mm.plugin.scanner.b1(this, str));
        }
    }

    public void k(int i17, kd0.f2 f2Var, kd0.n2 n2Var) {
        this.f158648e = null;
        java.lang.String str = f2Var.f306634a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (this.f158652i == null) {
            this.f158652i = new com.tencent.mm.plugin.scanner.y();
        }
        if (com.tencent.mm.plugin.scanner.z0.e(i17, str)) {
            this.f158652i.a(i17, f2Var).a(new com.tencent.mm.plugin.scanner.a1(this, str, n2Var));
        }
    }

    public java.lang.String l(int i17, java.lang.String str) {
        return !com.tencent.mm.plugin.scanner.j1.b(i17) ? this.f158647d.getString(com.tencent.mm.R.string.i_0) : this.f158647d.getString(com.tencent.mm.R.string.i_2);
    }

    public java.lang.String m(java.util.List list) {
        boolean z17;
        boolean z18 = false;
        int i17 = 0;
        boolean z19 = false;
        boolean z27 = false;
        boolean z28 = false;
        while (true) {
            z17 = true;
            if (i17 >= list.size()) {
                break;
            }
            java.lang.String str = ((com.tencent.mm.plugin.scanner.ImageQBarDataBean) list.get(i17)).f158619d;
            int i18 = ((com.tencent.mm.plugin.scanner.ImageQBarDataBean) list.get(i17)).f158620e;
            if (com.tencent.mm.plugin.scanner.z0.o(i18, str)) {
                z28 = true;
            } else if (com.tencent.mm.plugin.scanner.j1.b(i18)) {
                z19 = true;
            } else {
                z27 = true;
            }
            i17++;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("识别图中");
        if (z19) {
            sb6.append("二维码");
            z18 = true;
        }
        if (z27) {
            if (z18) {
                sb6.append(" / ");
            }
            sb6.append("条码");
        } else {
            z17 = z18;
        }
        if (z28) {
            if (z17) {
                sb6.append(" / ");
            }
            sb6.append("小程序码");
        }
        return sb6.toString();
    }

    public void n() {
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.ScanCodeSheetItemLogic");
        this.f158648e = null;
        this.f158655o = false;
    }

    public void o(int i17, byte[] bArr) {
        r45.aq3 aq3Var = new r45.aq3();
        if (i17 != 0 || com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            aq3Var.f370198d = -1;
        } else {
            try {
                aq3Var.parseFrom(bArr);
                if (com.tencent.mm.sdk.platformtools.t8.K0(aq3Var.f370204m) && com.tencent.mm.sdk.platformtools.t8.K0(aq3Var.f370203i)) {
                    aq3Var.f370198d = -1;
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanCodeSheetItemLogic", "parse exception: s%", e17.getMessage());
                aq3Var.f370198d = -1;
            }
        }
        this.f158648e = aq3Var;
        kd0.n2 n2Var = this.f158650g;
        if (n2Var != null) {
            n2Var.a();
        }
    }

    public ScanCodeSheetItemLogic(android.content.Context context, kd0.n2 n2Var) {
        new androidx.lifecycle.j0();
        this.f158655o = false;
        this.f158647d = context;
        this.f158650g = n2Var;
    }

    public ScanCodeSheetItemLogic(android.content.Context context, kd0.o2 o2Var) {
        new androidx.lifecycle.j0();
        this.f158655o = false;
        this.f158647d = context;
        this.f158651h = o2Var;
    }

    public ScanCodeSheetItemLogic(android.content.Context context, kd0.o2 o2Var, androidx.lifecycle.y yVar) {
        new androidx.lifecycle.j0();
        this.f158655o = false;
        this.f158647d = context;
        this.f158651h = o2Var;
        yVar.mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic.1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public void onDestroyed() {
                com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic.this.f158651h = null;
            }
        });
    }
}
