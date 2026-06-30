package com.tencent.mm.plugin.wallet_core.ui.cashier;

/* loaded from: classes9.dex */
public class WcPayCashierDialog extends com.tencent.mm.ui.widget.dialog.k2 implements androidx.lifecycle.x {
    public com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout A;
    public com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout B;
    public com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout C;
    public com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout D;
    public com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog E;
    public et4.i F;
    public com.tencent.mm.plugin.wallet_core.ui.m4 G;
    public final android.content.Context H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f180199J;
    public int K;
    public com.tencent.mm.pluginsdk.wallet.PayInfo L;
    public com.tencent.mm.plugin.wallet_core.model.Orders M;
    public com.tencent.mm.plugin.wallet_core.model.FavorPayInfo N;
    public com.tencent.mm.plugin.wallet_core.model.Bankcard P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public com.tencent.mm.plugin.wallet_core.utils.m T;
    public boolean U;
    public java.lang.String V;
    public java.lang.String W;
    public java.lang.String X;
    public boolean Y;
    public boolean Z;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f180200d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f180201e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f180202f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f180203g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f180204h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f180205i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f180206m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f180207n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f180208o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f180209p;

    /* renamed from: p0, reason: collision with root package name */
    public et4.g0 f180210p0;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f180211q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f180212r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f180213s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f180214t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f180215u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f180216v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.Button f180217w;

    /* renamed from: x, reason: collision with root package name */
    public com.tenpay.android.wechat.MyKeyboardWindow f180218x;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.List f180219x0;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f180220y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f180221z;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f180198y0 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 30);

    /* renamed from: l1, reason: collision with root package name */
    public static final int f180195l1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40);

    /* renamed from: p1, reason: collision with root package name */
    public static final int f180196p1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40);

    /* renamed from: x1, reason: collision with root package name */
    public static final int f180197x1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 24);

    public WcPayCashierDialog(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        this.I = 0;
        this.f180199J = 0;
        this.K = 0;
        this.L = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        this.M = new com.tencent.mm.plugin.wallet_core.model.Orders();
        this.Q = false;
        this.S = true;
        this.f180219x0 = new java.util.ArrayList();
        this.H = context;
        o();
    }

    public static void c(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "trigger switch mVerifyWay: %s", java.lang.Integer.valueOf(wcPayCashierDialog.I));
        int i17 = wcPayCashierDialog.I;
        if (i17 == 0) {
            int i18 = wcPayCashierDialog.f180199J;
            if (i18 == 1) {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = wcPayCashierDialog.L;
                com.tencent.mm.wallet_core.model.a2.a(payInfo != null ? payInfo.f192109e : 0, payInfo == null ? "" : payInfo.f192114m, 21, "");
                wcPayCashierDialog.E();
                return;
            } else {
                if (i18 == 2) {
                    wcPayCashierDialog.D();
                    return;
                }
                return;
            }
        }
        if (i17 == 1) {
            wcPayCashierDialog.F(false);
            wcPayCashierDialog.f180203g.setText(com.tencent.mm.R.string.klv);
            com.tencent.mm.wallet_core.ui.r1.q0(29, 1);
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = wcPayCashierDialog.L;
            com.tencent.mm.wallet_core.model.a2.a(payInfo2 != null ? payInfo2.f192109e : 0, payInfo2 == null ? "" : payInfo2.f192114m, 19, "");
            return;
        }
        if (i17 == 2) {
            wcPayCashierDialog.F(false);
            wcPayCashierDialog.f180203g.setText(com.tencent.mm.R.string.kln);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15817, 4);
        }
    }

    public static void e(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog, java.lang.String str, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo, com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo) {
        et4.g0 g0Var;
        if (!wcPayCashierDialog.Y && wcPayCashierDialog.R && wcPayCashierDialog.P == null) {
            dp.a.makeText(wcPayCashierDialog.getContext(), com.tencent.mm.R.string.l3v, 1).show();
            return;
        }
        if (!wcPayCashierDialog.Z && (g0Var = wcPayCashierDialog.f180210p0) != null) {
            g0Var.b(str, payInfo, favorPayInfo, wcPayCashierDialog.P);
        }
        wcPayCashierDialog.dismiss();
    }

    public final void A() {
        if (!this.R) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "can not change pay way");
            this.B.setVisibility(8);
            return;
        }
        this.B.setVisibility(0);
        this.B.f180191d.setText(com.tencent.mm.R.string.l3x);
        this.B.f180192e.setVisibility(0);
        this.B.f180194g.setVisibility(0);
        this.B.a();
        this.B.setOnClickListener(new et4.s(this));
        this.B.f180192e.setImageBitmap(null);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.P;
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = this.B.f180192e;
        if (bankcard == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WcPayCashierDialog", "setBankcardText bankcard == null");
        } else if (bankcard.v0()) {
            cdnImageView.setImageResource(com.tencent.mm.R.drawable.ch9);
        } else if (bankcard.D0()) {
            this.T.f(bankcard, cdnImageView);
        } else if (bankcard.A0()) {
            cdnImageView.setImageDrawable(m95.a.e(getContext().getResources(), com.tencent.mm.R.raw.honey_pay_bank_logo, 0.0f));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard.f179570i3)) {
                cdnImageView.setUseSdcardCache(true);
                cdnImageView.setImgSavedPath(dt4.b.f243228a);
                cdnImageView.b(bankcard.f179570i3, 0, 0, com.tencent.mm.R.raw.honey_pay_bank_logo);
            }
        } else {
            this.T.e(getContext(), bankcard, cdnImageView);
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = this.P;
        java.lang.CharSequence charSequence = bankcard2 == null ? "" : bankcard2.field_desc;
        if (bankcard2 != null && bankcard2.A0()) {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            charSequence = com.tencent.mm.pluginsdk.ui.span.c0.i(this.H, charSequence);
        }
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout = this.B;
        wcPayCashierDetailItemLayout.f180193f.setText(charSequence);
        wcPayCashierDetailItemLayout.post(new et4.k(wcPayCashierDetailItemLayout));
    }

    public final void B(int i17) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f180209p.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f180211q.getLayoutParams();
        if (i17 == 0) {
            int i18 = f180197x1;
            layoutParams.topMargin = i18;
            layoutParams2.topMargin = i18;
        } else {
            layoutParams.topMargin = f180195l1;
            layoutParams2.topMargin = f180196p1;
        }
        this.f180209p.setLayoutParams(layoutParams);
        this.f180211q.setLayoutParams(layoutParams2);
        this.f180213s.setVisibility(i17);
    }

    public final void C() {
        if (this.f180220y.isShown()) {
            return;
        }
        this.f180220y.setVisibility(0);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477876e0);
        loadAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
        loadAnimation.setDuration(180L);
        this.f180220y.startAnimation(loadAnimation);
    }

    public final void D() {
        this.I = 2;
        this.L.f192125x = 1;
        this.f180209p.setVisibility(8);
        this.f180211q.setVisibility(0);
        this.f180208o.a();
        k();
        this.f180202f.setVisibility(8);
        this.f180203g.setText(com.tencent.mm.R.string.kwy);
    }

    public final void E() {
        this.I = 1;
        this.L.f192125x = 1;
        this.f180209p.setVisibility(8);
        this.f180211q.setVisibility(0);
        this.f180208o.a();
        k();
        this.f180202f.setVisibility(8);
        this.f180203g.setText(com.tencent.mm.R.string.kwy);
    }

    public final void F(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "switch to pwd: %s", java.lang.Boolean.valueOf(z17));
        this.I = 0;
        this.L.f192125x = 0;
        this.f180209p.setVisibility(0);
        this.f180211q.setVisibility(8);
        this.f180208o.a();
        C();
        this.f180202f.setVisibility(0);
        if (z17) {
            this.f180203g.setVisibility(8);
        } else {
            this.f180203g.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog.G():void");
    }

    public final void f() {
        if (this.f180207n.getChildCount() == 0 && this.B.getVisibility() == 8) {
            android.view.View view = this.f180221z;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierDialog", "adjustDetailDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierDialog", "adjustDetailDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f180221z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierDialog", "adjustDetailDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierDialog", "adjustDetailDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.widget.TextView r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog.h(android.widget.TextView):void");
    }

    public final void i(boolean z17, int i17, boolean z18, com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo) {
        java.lang.String str;
        java.util.List list;
        vr4.j0 j0Var;
        vr4.a aVar;
        vr4.v0 v0Var;
        java.lang.String string;
        vr4.j0 j0Var2;
        vr4.a aVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "go to bankcard dialog");
        et4.i iVar = this.F;
        if (iVar != null) {
            iVar.dismiss();
        }
        hide();
        this.f180208o.a();
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.L;
        int i18 = 0;
        com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 11, "");
        et4.i iVar2 = new et4.i(this.H);
        this.F = iVar2;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.L;
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.M;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.P;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = bankcard == null ? "" : bankcard.field_desc;
        objArr[1] = java.lang.Boolean.valueOf(z17);
        objArr[2] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierBankcardDialog", "set view data: %s, %s, %s", objArr);
        iVar2.f256622m = payInfo2;
        iVar2.f256623n = orders;
        iVar2.f256624o = favorPayInfo;
        iVar2.f256625p = bankcard;
        iVar2.f256626q = orders.f179679i;
        iVar2.f256627r = z17;
        iVar2.f256628s = i17;
        if (z17) {
            iVar2.f256629t = false;
        }
        java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Bankcard> a17 = payInfo2.f192109e == 8 ? at4.l1.a(true) : at4.l1.a(false);
        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo2 = iVar2.f256624o;
        if (favorPayInfo2 != null) {
            if ((favorPayInfo2.f179668e != 0) && iVar2.f256627r) {
                java.lang.String str2 = favorPayInfo2.f179669f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i19 = 0; i19 < a17.size(); i19++) {
                    com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) a17.get(i19);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        if (!bankcard2.field_bankcardType.equalsIgnoreCase("CFT")) {
                            arrayList.add(bankcard2);
                        }
                    } else if (bankcard2.field_bankcardType.equals(str2)) {
                        arrayList.add(bankcard2);
                    }
                }
                a17 = arrayList;
            }
        }
        for (com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 : a17) {
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout wcPayCashierBankcardItemLayout = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout(iVar2.getContext());
            ((java.util.ArrayList) iVar2.f256620h).add(wcPayCashierBankcardItemLayout);
            iVar2.f256618f.addView(wcPayCashierBankcardItemLayout);
            if (bankcard3.v0()) {
                com.tencent.mm.plugin.wallet_core.utils.m mVar = iVar2.f256630u;
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = wcPayCashierBankcardItemLayout.f180183d;
                mVar.getClass();
                if (cdnImageView != null) {
                    cdnImageView.setTag(com.tencent.mm.R.id.pbo, null);
                    cdnImageView.setImageResource(com.tencent.mm.R.drawable.ch9);
                }
            } else if (bankcard3.D0()) {
                iVar2.f256630u.f(bankcard3, wcPayCashierBankcardItemLayout.f180183d);
            } else if (bankcard3.A0()) {
                wcPayCashierBankcardItemLayout.f180183d.setImageDrawable(m95.a.e(iVar2.getContext().getResources(), com.tencent.mm.R.raw.honey_pay_bank_logo, 0.0f));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard3.f179570i3)) {
                    wcPayCashierBankcardItemLayout.f180183d.setUseSdcardCache(true);
                    wcPayCashierBankcardItemLayout.f180183d.setImgSavedPath(dt4.b.f243228a);
                    wcPayCashierBankcardItemLayout.f180183d.b(bankcard3.f179570i3, i18, i18, com.tencent.mm.R.raw.honey_pay_bank_logo);
                }
            } else {
                iVar2.f256630u.e(iVar2.getContext(), bankcard3, wcPayCashierBankcardItemLayout.f180183d);
            }
            if (bankcard3.v0()) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard4 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13999h;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard4.P2)) {
                    wcPayCashierBankcardItemLayout.f180184e.setText(bankcard4.P2);
                } else if (bankcard4.O2 >= 0.0d) {
                    android.widget.TextView textView = wcPayCashierBankcardItemLayout.f180184e;
                    android.content.Context context = iVar2.getContext();
                    iVar2.getContext();
                    textView.setText(context.getString(c01.z1.I() ? com.tencent.mm.R.string.kjr : com.tencent.mm.R.string.kjq, com.tencent.mm.wallet_core.ui.r1.m(bankcard4.O2)));
                } else {
                    wcPayCashierBankcardItemLayout.f180184e.setText("");
                }
            } else if (bankcard3.D0()) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard5 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14004m;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard5.P2)) {
                    wcPayCashierBankcardItemLayout.f180184e.setText(bankcard5.P2);
                } else if (bankcard5.O2 >= 0.0d) {
                    wcPayCashierBankcardItemLayout.f180184e.setText(iVar2.getContext().getString(com.tencent.mm.R.string.kow, com.tencent.mm.wallet_core.ui.r1.m(bankcard5.O2)));
                } else {
                    wcPayCashierBankcardItemLayout.f180184e.setText("");
                }
            } else if (bankcard3.A0()) {
                android.widget.TextView textView2 = wcPayCashierBankcardItemLayout.f180184e;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = iVar2.getContext();
                java.lang.String str3 = bankcard3.field_desc;
                float textSize = wcPayCashierBankcardItemLayout.f180184e.getTextSize();
                ((ke0.e) xVar).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str3, textSize));
            } else {
                wcPayCashierBankcardItemLayout.f180184e.setText(bankcard3.field_desc);
            }
            switch (bankcard3.t0(iVar2.f256626q, iVar2.f256623n)) {
                case 1:
                    string = iVar2.getContext().getString(com.tencent.mm.R.string.f493592kv4);
                    break;
                case 2:
                    string = iVar2.getContext().getString(com.tencent.mm.R.string.kv_);
                    break;
                case 3:
                    string = iVar2.getContext().getString(com.tencent.mm.R.string.kve);
                    break;
                case 4:
                    string = iVar2.getContext().getString(com.tencent.mm.R.string.kv6);
                    break;
                case 5:
                    string = iVar2.getContext().getString(com.tencent.mm.R.string.f493590kv2);
                    break;
                case 6:
                    string = iVar2.getContext().getString(com.tencent.mm.R.string.kv8);
                    break;
                case 7:
                    string = iVar2.getContext().getString(com.tencent.mm.R.string.kvc);
                    break;
                case 8:
                    string = bankcard3.field_forbidWord;
                    break;
                default:
                    if (com.tencent.mm.sdk.platformtools.t8.K0(bankcard3.field_tips)) {
                        string = "";
                        break;
                    } else {
                        string = bankcard3.field_tips;
                        break;
                    }
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard3.field_forbid_title) && !com.tencent.mm.sdk.platformtools.t8.K0(bankcard3.field_forbid_url)) {
                spannableStringBuilder.append((java.lang.CharSequence) "  ");
                spannableStringBuilder.append((java.lang.CharSequence) bankcard3.field_forbid_title);
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iVar2.getContext().getResources().getColor(com.tencent.mm.R.color.a_t)), string.length() + 2, spannableStringBuilder.length(), 34);
                wcPayCashierBankcardItemLayout.f180185f.setOnClickListener(new et4.e(iVar2, bankcard3));
            }
            if (!com.tencent.mm.sdk.platformtools.t8.J0(spannableStringBuilder)) {
                wcPayCashierBankcardItemLayout.f180185f.setVisibility(0);
                wcPayCashierBankcardItemLayout.f180185f.setText(spannableStringBuilder);
            }
            if (iVar2.f256629t && com.tencent.mm.sdk.platformtools.t8.J0(spannableStringBuilder)) {
                java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList<>();
                com.tencent.mm.plugin.wallet_core.model.Orders orders2 = iVar2.f256623n;
                if (orders2 != null && (j0Var2 = orders2.N) != null && (aVar2 = j0Var2.f439767u) != null) {
                    java.util.Iterator it = aVar2.f439673d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            vr4.c cVar = (vr4.c) it.next();
                            if (cVar.f439705d.equals(bankcard3.field_bindSerial)) {
                                java.util.Iterator it6 = cVar.f439706e.iterator();
                                while (it6.hasNext()) {
                                    linkedList.add(((vr4.d) it6.next()).f439707d);
                                }
                            }
                        }
                    }
                }
                if (linkedList.size() > 0) {
                    wcPayCashierBankcardItemLayout.f180187h.setVisibility(0);
                    wcPayCashierBankcardItemLayout.f180185f.setVisibility(8);
                    wcPayCashierBankcardItemLayout.f180187h.setWording(linkedList);
                }
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard6 = iVar2.f256625p;
            if (bankcard6 != null && bankcard3.field_bindSerial.equals(bankcard6.field_bindSerial)) {
                wcPayCashierBankcardItemLayout.f180186g.setChecked(true);
            }
            if (bankcard3.t0(iVar2.f256626q, iVar2.f256623n) != 0) {
                wcPayCashierBankcardItemLayout.f180186g.setChecked(false);
                wcPayCashierBankcardItemLayout.f180184e.setTextColor(iVar2.getContext().getResources().getColor(com.tencent.mm.R.color.t_));
                wcPayCashierBankcardItemLayout.setEnabled(false);
            } else {
                wcPayCashierBankcardItemLayout.f180184e.setTextColor(iVar2.getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
                wcPayCashierBankcardItemLayout.setEnabled(true);
            }
            wcPayCashierBankcardItemLayout.setOnClickListener(new et4.f(iVar2, bankcard3));
            i18 = 0;
        }
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout wcPayCashierBankcardItemLayout2 = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout(iVar2.getContext());
        wcPayCashierBankcardItemLayout2.f180183d.setVisibility(4);
        wcPayCashierBankcardItemLayout2.f180184e.setText(com.tencent.mm.R.string.f493589kv1);
        wcPayCashierBankcardItemLayout2.f180184e.setTextColor(iVar2.getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo));
        wcPayCashierBankcardItemLayout2.f180186g.setVisibility(8);
        java.util.LinkedList<java.lang.String> linkedList2 = new java.util.LinkedList<>();
        com.tencent.mm.plugin.wallet_core.model.Orders orders3 = iVar2.f256623n;
        if (orders3 != null && (j0Var = orders3.N) != null && (aVar = j0Var.f439767u) != null && (v0Var = aVar.f439674e) != null) {
            java.util.Iterator it7 = v0Var.f439808d.iterator();
            while (it7.hasNext()) {
                linkedList2.add(((vr4.w0) it7.next()).f439809d);
            }
        }
        if (iVar2.f256629t && linkedList2.size() > 0) {
            wcPayCashierBankcardItemLayout2.f180187h.setVisibility(0);
            wcPayCashierBankcardItemLayout2.f180185f.setVisibility(8);
            wcPayCashierBankcardItemLayout2.f180187h.setWording(linkedList2);
        }
        wcPayCashierBankcardItemLayout2.setOnClickListener(new et4.g(iVar2));
        iVar2.f256618f.addView(wcPayCashierBankcardItemLayout2);
        com.tencent.mm.plugin.wallet_core.model.Orders orders4 = iVar2.f256623n;
        if (orders4 == null || (list = orders4.M) == null || ((java.util.ArrayList) list).size() <= 0) {
            str = "";
        } else {
            android.content.Context context3 = iVar2.getContext();
            com.tencent.mm.plugin.wallet_core.model.Orders orders5 = iVar2.f256623n;
            str = context3.getString(com.tencent.mm.R.string.kjs, com.tencent.mm.wallet_core.ui.r1.n(orders5.f179678h, orders5.f179681m), ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) iVar2.f256623n.M).get(0)).f179707h);
        }
        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo3 = iVar2.f256624o;
        if (favorPayInfo3 != null && !com.tencent.mm.sdk.platformtools.t8.K0(favorPayInfo3.f179671h)) {
            iVar2.f256619g.setVisibility(0);
            iVar2.f256619g.setText(iVar2.f256624o.f179671h);
            iVar2.f256624o.f179671h = "";
        } else if (iVar2.f256628s != 0) {
            iVar2.f256619g.setVisibility(0);
            iVar2.f256619g.setText(str);
        } else {
            iVar2.f256619g.setVisibility(8);
        }
        ((java.util.ArrayList) this.f180219x0).add(this.F.f256632w);
        et4.i iVar3 = this.F;
        iVar3.f256631v = new et4.w(this, favorPayInfo, z18);
        iVar3.show();
    }

    public final void k() {
        if (this.f180220y.isShown()) {
            this.f180220y.setVisibility(8);
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477877e1);
            loadAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
            loadAnimation.setDuration(180L);
            this.f180220y.startAnimation(loadAnimation);
        }
    }

    public final void o() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f489638d91, null);
        this.f180200d = viewGroup;
        this.f180201e = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.pov);
        this.f180202f = (android.widget.TextView) this.f180200d.findViewById(com.tencent.mm.R.id.poz);
        this.f180203g = (android.widget.TextView) this.f180200d.findViewById(com.tencent.mm.R.id.pp_);
        this.f180204h = (android.widget.TextView) this.f180200d.findViewById(com.tencent.mm.R.id.f487753pp4);
        this.f180205i = (android.view.ViewGroup) this.f180200d.findViewById(com.tencent.mm.R.id.pp6);
        this.f180216v = (android.widget.TextView) this.f180200d.findViewById(com.tencent.mm.R.id.pou);
        this.f180206m = (com.tencent.mm.wallet_core.ui.WalletTextView) this.f180200d.findViewById(com.tencent.mm.R.id.f487754pp5);
        this.f180207n = (android.view.ViewGroup) this.f180200d.findViewById(com.tencent.mm.R.id.poy);
        this.f180208o = (com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) this.f180200d.findViewById(com.tencent.mm.R.id.pp8);
        this.f180209p = (android.view.ViewGroup) this.f180200d.findViewById(com.tencent.mm.R.id.pp9);
        this.B = (com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout) this.f180200d.findViewById(com.tencent.mm.R.id.pp7);
        this.f180211q = (android.widget.Button) this.f180200d.findViewById(com.tencent.mm.R.id.pow);
        this.f180212r = (android.widget.TextView) this.f180200d.findViewById(com.tencent.mm.R.id.f487749pp0);
        this.f180213s = (android.view.ViewGroup) this.f180200d.findViewById(com.tencent.mm.R.id.pot);
        this.f180214t = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.f180200d.findViewById(com.tencent.mm.R.id.f487752pp3);
        this.f180215u = (android.widget.TextView) this.f180200d.findViewById(com.tencent.mm.R.id.f487751pp2);
        this.f180217w = (android.widget.Button) this.f180200d.findViewById(com.tencent.mm.R.id.f487750pp1);
        this.f180218x = (com.tenpay.android.wechat.MyKeyboardWindow) this.f180200d.findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.f180220y = (android.view.ViewGroup) this.f180200d.findViewById(com.tencent.mm.R.id.o1v);
        this.f180221z = this.f180200d.findViewById(com.tencent.mm.R.id.pox);
        com.tencent.mm.ui.bk.r0(this.f180202f.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(this.f180203g.getPaint(), 0.8f);
        android.widget.ImageView imageView = this.f180201e;
        int i17 = f180198y0;
        com.tencent.mm.sdk.platformtools.t8.q(imageView, i17, i17, i17, i17);
        this.f180201e.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.actionbar_icon_dark_close, getContext().getResources().getColor(com.tencent.mm.R.color.f478718f9)));
        this.f180201e.setOnClickListener(new et4.z(this));
        qp5.p.b(this.f180208o);
        this.f180208o.setOnInputValidListener(new et4.a0(this));
        android.widget.EditText editText = (android.widget.EditText) this.f180200d.findViewById(com.tencent.mm.R.id.pbn);
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        this.f180218x.setInputEditText(editText);
        com.tencent.mm.wallet_core.e eVar = new com.tencent.mm.wallet_core.e(true);
        this.f180218x.setSecureAccessibility(eVar);
        editText.setAccessibilityDelegate(eVar);
        com.tencent.mm.wallet_core.ui.r1.N(this.f180208o, this.f180218x);
        editText.setOnClickListener(new et4.b0(this));
        this.f180200d.findViewById(com.tencent.mm.R.id.tenpay_push_down).setOnClickListener(new et4.c0(this));
        this.f180211q.setOnClickListener(new et4.d0(this));
        this.f180203g.setOnClickListener(new et4.e0(this));
        com.tencent.mm.wallet_core.e eVar2 = new com.tencent.mm.wallet_core.e();
        eVar2.setViewType(com.tencent.kinda.gen.TraitsType.BUTTON);
        this.f180203g.setAccessibilityDelegate(eVar2);
        this.f180201e.setAccessibilityDelegate(eVar2);
        this.f180208o.setImportantForAccessibility(1);
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = this.f180208o;
        android.content.Context context = this.H;
        editHintPasswdView.setContentDescription(context.getString(com.tencent.mm.R.string.l3p, "0"));
        this.f180208o.getEditText().setImportantForAccessibility(2);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        setOnCancelListener(new et4.x(this));
        setOnDismissListener(new et4.y(this));
        ((com.tencent.mm.ui.MMActivity) context).mo133getLifecycle().a(this);
        this.T = new com.tencent.mm.plugin.wallet_core.utils.m();
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onActivityPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "activity paused, release and dismiss");
        this.f180208o.a();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f180200d);
        android.view.Window window = getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        window.addFlags(67108864);
        if (com.tencent.mm.wallet_core.ui.r1.P()) {
            window.addFlags(8192);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        if (this.I == 0) {
            android.widget.TextView textView = this.f180202f;
            if (textView != null) {
                textView.post(new et4.f0(this));
                return;
            }
            return;
        }
        android.widget.Button button = this.f180211q;
        if (button != null) {
            button.post(new et4.l(this));
        }
    }

    public final void p() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.V)) {
            this.f180216v.setVisibility(8);
        } else {
            this.f180216v.setText(this.V);
            this.f180216v.setVisibility(0);
        }
    }

    public final void r() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard;
        vr4.l0 l0Var;
        vr4.l0 l0Var2;
        com.tencent.mm.plugin.wallet_core.ui.g0 a17 = com.tencent.mm.plugin.wallet_core.ui.h0.INSTANCE.a(this.M);
        if (a17 != null) {
            if (this.N == null || (bankcard = this.P) == null) {
                vr4.j0 j0Var = this.M.N;
                if (j0Var != null) {
                    this.N = a17.g(a17.a(j0Var.f439756g));
                    return;
                }
                return;
            }
            boolean equalsIgnoreCase = bankcard.field_bankcardType.equalsIgnoreCase("CFT");
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "selectedFavorCompId %s isFilterNotSupportCft %s", this.N.f179667d, java.lang.Boolean.valueOf(equalsIgnoreCase));
            java.lang.String c17 = a17.c(this.N.f179667d, equalsIgnoreCase);
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "nonBankSelectedFaovrCompId %s", c17);
            java.util.Map d17 = a17.d(c17, true);
            java.util.Map b17 = a17.b(c17, true);
            com.tencent.mm.plugin.wallet_core.ui.f0 f0Var = (com.tencent.mm.plugin.wallet_core.ui.f0) ((java.util.HashMap) d17).get(this.P.field_bindSerial);
            com.tencent.mm.plugin.wallet_core.ui.f0 f0Var2 = (com.tencent.mm.plugin.wallet_core.ui.f0) ((java.util.HashMap) b17).get(this.P.field_bankcardType);
            vr4.l0 e17 = a17.e(c17, equalsIgnoreCase);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = e17 == null ? "" : e17.f439773d;
            objArr[1] = f0Var == null ? "" : f0Var.toString();
            objArr[2] = f0Var2 != null ? f0Var2.toString() : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "defaultComposeInfo %s wrapperSerial %s wrapper %s", objArr);
            if (f0Var != null && (l0Var2 = f0Var.f180259a) != null && !com.tencent.mm.sdk.platformtools.t8.K0(l0Var2.f439773d)) {
                this.N.f179667d = f0Var.f180259a.f439773d;
                return;
            }
            if (f0Var2 != null && (l0Var = f0Var2.f180259a) != null && !com.tencent.mm.sdk.platformtools.t8.K0(l0Var.f439773d)) {
                this.N.f179667d = f0Var2.f180259a.f439773d;
            } else if (e17 != null) {
                this.N.f179667d = e17.f439773d;
            } else {
                this.N.f179667d = c17;
            }
        }
    }

    public final void s() {
        java.lang.String string;
        com.tencent.mm.plugin.wallet_core.model.Orders orders;
        java.util.List list;
        int i17;
        java.lang.String str;
        if (this.Y) {
            string = this.W;
        } else {
            android.os.Bundle bundle = this.L.f192122u;
            java.lang.String str2 = "";
            string = bundle == null ? "" : bundle.getString("extinfo_key_19", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.L;
                int i18 = payInfo.f192109e;
                if (i18 == 32 || i18 == 33) {
                    java.lang.String string2 = payInfo.f192122u.getString("extinfo_key_5", "");
                    java.lang.String string3 = this.L.f192122u.getString("extinfo_key_1", "");
                    java.lang.String string4 = getContext().getString(com.tencent.mm.R.string.kwu);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                        string2 = string4;
                        str = "";
                    } else {
                        str = string2;
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WcPayCashierDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                    } else {
                        com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(string3);
                        if (q17 != null) {
                            java.lang.String g27 = q17.g2();
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(com.tencent.mm.wallet_core.ui.r1.H(g27));
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L.Q)) {
                                str2 = "(" + this.L.Q + ")";
                            }
                            sb6.append(str2);
                            objArr[0] = sb6.toString();
                            str = com.tencent.mm.sdk.platformtools.t8.z1(string2, objArr);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WcPayCashierDialog", "can not found contact for user::" + string3 + "");
                        }
                    }
                    string = str;
                } else {
                    if (i18 == 31) {
                        java.lang.String string5 = payInfo.f192122u.getString("extinfo_key_1", "");
                        if (com.tencent.mm.sdk.platformtools.t8.K0(string5)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WcPayCashierDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                        } else {
                            com.tencent.mm.storage.z3 q18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(string5);
                            if (q18 != null) {
                                java.lang.String f27 = q18.f2();
                                android.content.Context context = getContext();
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                sb7.append(f27);
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L.Q)) {
                                    str2 = "(" + this.L.Q + ")";
                                }
                                sb7.append(str2);
                                objArr2[0] = sb7.toString();
                                str2 = context.getString(com.tencent.mm.R.string.kwu, objArr2);
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.WcPayCashierDialog", "can not found contact for user::" + string5 + "");
                            }
                        }
                    } else if (i18 == 42) {
                        java.lang.String string6 = payInfo.f192122u.getString("extinfo_key_1", "");
                        if (com.tencent.mm.sdk.platformtools.t8.K0(string6)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WcPayCashierDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                        } else {
                            gm0.j1.i();
                            com.tencent.mm.storage.z3 q19 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(string6);
                            if (q19 != null) {
                                java.lang.String f28 = q19.f2();
                                android.content.Context context2 = getContext();
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                sb8.append(f28);
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L.Q)) {
                                    str2 = "(" + this.L.Q + ")";
                                }
                                sb8.append(str2);
                                objArr3[0] = sb8.toString();
                                str2 = context2.getString(com.tencent.mm.R.string.kwo, objArr3);
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.WcPayCashierDialog", "can not found contact for user::" + string6 + "");
                            }
                        }
                    } else if (i18 == 48) {
                        string = getContext().getString(com.tencent.mm.R.string.hox);
                    } else if (i18 == 49) {
                        java.lang.String string7 = payInfo.f192122u.getString("extinfo_key_1", "");
                        if (com.tencent.mm.sdk.platformtools.t8.K0(string7)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WcPayCashierDialog", "userName is null, scene is %s", java.lang.Integer.valueOf(this.L.f192109e));
                        } else {
                            str2 = getContext().getString(com.tencent.mm.R.string.kwu, string7);
                        }
                    } else if (i18 == 56) {
                        java.lang.String string8 = payInfo.f192122u.getString("extinfo_key_12", "");
                        if (com.tencent.mm.sdk.platformtools.t8.K0(string8)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WcPayCashierDialog", "title is null, scene is %s", java.lang.Integer.valueOf(this.L.f192109e));
                        } else {
                            str2 = string8;
                        }
                    } else if (i18 == 45 || i18 == 52) {
                        string = getContext().getString(com.tencent.mm.R.string.f493565kr1);
                    } else if (i18 == 11) {
                        string = getContext().getString(com.tencent.mm.R.string.kfp);
                    }
                    string = str2;
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string) || (orders = this.M) == null || (list = orders.M) == null) {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("orders null?:");
                sb9.append(this.M == null);
                com.tencent.mars.xlog.Log.w("MicroMsg.WcPayCashierDialog", sb9.toString());
            } else {
                com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = (com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) list).get(0);
                if (commodity != null) {
                    string = commodity.f179706g;
                    com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.L;
                    if (payInfo2 == null || ((i17 = payInfo2.f192109e) != 31 && i17 != 32 && i17 != 33)) {
                        r7 = false;
                    }
                    if (r7) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                            string = string + "\n";
                        }
                        string = string + commodity.f179707h;
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        string = commodity.f179707h;
                    }
                }
            }
        }
        this.f180204h.setText(string);
        t();
        this.f180205i.setContentDescription(this.f180204h.getText().toString() + "," + this.f180206m.a().toString());
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog
    public void show() {
        super.show();
    }

    public final void t() {
        java.lang.String str;
        if (this.Y) {
            str = this.X;
        } else {
            com.tencent.mm.plugin.wallet_core.ui.g0 a17 = com.tencent.mm.plugin.wallet_core.ui.h0.INSTANCE.a(this.M);
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.M;
            java.lang.String n17 = com.tencent.mm.wallet_core.ui.r1.n(orders.f179678h, orders.f179681m);
            this.U = false;
            if (a17 != null) {
                vr4.l0 f17 = a17.f(this.N.f179667d);
                java.util.List i17 = a17.i();
                if (f17 != null && f17.f439779m > 0.0d) {
                    this.U = true;
                    str = com.tencent.mm.wallet_core.ui.r1.n(f17.f439778i, this.M.f179681m);
                } else if (f17 == null || ((java.util.LinkedList) i17).size() <= 0) {
                    com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.M;
                    str = com.tencent.mm.wallet_core.ui.r1.n(orders2.f179678h, orders2.f179681m);
                } else {
                    str = com.tencent.mm.wallet_core.ui.r1.n(f17.f439778i, this.M.f179681m);
                }
            } else {
                str = n17;
            }
        }
        this.f180206m.setText(str);
    }

    public final void u() {
        G();
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "use touch pay: %s", java.lang.Integer.valueOf(this.M.I));
        int i17 = this.I;
        boolean z17 = true;
        if (i17 != 0) {
            if (i17 == 1) {
                E();
                return;
            } else {
                if (i17 == 2) {
                    D();
                    return;
                }
                return;
            }
        }
        if (this.f180199J > 0) {
            z17 = false;
        } else {
            int i18 = this.K;
            if (i18 == 1) {
                this.f180212r.setVisibility(8);
            } else if (i18 == 3) {
                this.f180212r.setText(com.tencent.mm.R.string.klu);
                this.f180212r.setVisibility(0);
            } else {
                if (this.L.E == 100102) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_LAST_IS_SEVERE_ERROR_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                    mz2.a aVar = (mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class));
                    aVar.e(false);
                    aVar.d(false);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_IN_TRANSPARENT_NEW_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
                    this.f180212r.setText(com.tencent.mm.R.string.klx);
                } else {
                    this.f180212r.setText(com.tencent.mm.R.string.klu);
                }
                this.f180212r.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479548aa5));
                this.f180212r.setVisibility(0);
            }
        }
        F(z17);
    }

    public final void w(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.xj6 xj6Var = (r45.xj6) it.next();
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout(getContext());
            wcPayCashierDetailItemLayout.f180192e.setVisibility(8);
            java.util.LinkedList linkedList = xj6Var.f390167e;
            if (linkedList != null && linkedList.size() > 0) {
                com.tencent.mm.plugin.wallet_core.utils.z1.j(wcPayCashierDetailItemLayout.f180191d, (r45.rl6) xj6Var.f390167e.get(0));
            }
            java.util.LinkedList linkedList2 = xj6Var.f390168f;
            if (linkedList2 == null || linkedList2.size() <= 0) {
                wcPayCashierDetailItemLayout.f180193f.setVisibility(8);
                wcPayCashierDetailItemLayout.f180191d.setMaxWidth(Integer.MAX_VALUE);
            } else {
                com.tencent.mm.plugin.wallet_core.utils.z1.j(wcPayCashierDetailItemLayout.f180193f, (r45.rl6) linkedList2.get(0));
            }
            if (xj6Var.f390169g != null) {
                com.tencent.mm.plugin.wallet_core.utils.z1.g(wcPayCashierDetailItemLayout.f180194g, xj6Var.f390169g, com.tencent.mm.R.raw.arrow_right, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16), true, 1.0f);
                wcPayCashierDetailItemLayout.f180194g.setVisibility(0);
            } else {
                wcPayCashierDetailItemLayout.f180194g.setVisibility(8);
            }
            wcPayCashierDetailItemLayout.a();
            if (xj6Var.f390173n != null) {
                wcPayCashierDetailItemLayout.setOnClickListener(new et4.o(this, xj6Var));
            }
            this.f180207n.addView(wcPayCashierDetailItemLayout);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r0 != null && ((java.util.HashMap) r0).size() > 0) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            r3 = this;
            com.tencent.mm.plugin.wallet_core.ui.h0 r0 = com.tencent.mm.plugin.wallet_core.ui.h0.INSTANCE
            com.tencent.mm.plugin.wallet_core.model.Orders r1 = r3.M
            com.tencent.mm.plugin.wallet_core.ui.g0 r0 = r0.a(r1)
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r1 = r3.N
            if (r1 == 0) goto L7c
            r1 = 0
            if (r0 == 0) goto L21
            java.util.Map r0 = r0.f180280b
            if (r0 == 0) goto L1d
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 != 0) goto L21
            goto L7c
        L21:
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.C
            if (r0 != 0) goto L74
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout
            android.content.Context r2 = r3.getContext()
            r0.<init>(r2)
            r3.C = r0
            android.view.ViewGroup r2 = r3.f180207n
            r2.addView(r0)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.C
            android.widget.TextView r0 = r0.f180191d
            r2 = 2131780262(0x7f1062a6, float:1.9192104E38)
            r0.setText(r2)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.C
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = r0.f180192e
            r2 = 8
            r0.setVisibility(r2)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.C
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = r0.f180194g
            r0.setVisibility(r1)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.C
            android.widget.TextView r0 = r0.f180193f
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131100030(0x7f06017e, float:1.781243E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.C
            r0.a()
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.C
            et4.r r1 = new et4.r
            r1.<init>(r3)
            r0.setOnClickListener(r1)
        L74:
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.C
            android.widget.TextView r0 = r0.f180193f
            r3.h(r0)
            return
        L7c:
            android.view.ViewGroup r0 = r3.f180207n
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r1 = r3.C
            r0.removeView(r1)
            r0 = 0
            r3.C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog.x():void");
    }

    public final void z() {
        java.lang.String str;
        if (!this.U) {
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout = this.A;
            if (wcPayCashierDetailItemLayout != null) {
                this.f180207n.removeView(wcPayCashierDetailItemLayout);
                this.A = null;
                return;
            }
            return;
        }
        if (this.A == null) {
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout2 = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout(getContext());
            this.A = wcPayCashierDetailItemLayout2;
            this.f180207n.addView(wcPayCashierDetailItemLayout2, 0);
            this.A.f180191d.setText(com.tencent.mm.R.string.l3w);
            this.A.f180192e.setVisibility(8);
            this.A.f180194g.setVisibility(8);
            this.A.a();
            try {
                this.A.f180193f.setTypeface(android.graphics.Typeface.createFromAsset(getContext().getAssets(), com.tencent.mm.wallet_core.ui.r1.E(7)));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WcPayCashierDialog", "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
            this.A.f180193f.getPaint().setFlags(16);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.M.f179698y0) || com.tencent.mm.sdk.platformtools.t8.K0(this.M.f179686p1)) {
            str = "";
        } else {
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.M;
            str = java.lang.String.format("%s%s", orders.f179686p1, orders.f179698y0);
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.M;
        java.lang.String n17 = com.tencent.mm.wallet_core.ui.r1.n(orders2.f179678h, orders2.f179681m);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            n17 = java.lang.String.format("%s(%s)", n17, str);
        }
        this.A.f180193f.setText(n17);
    }

    public WcPayCashierDialog(android.content.Context context, int i17) {
        super(context, com.tencent.mm.R.style.f494791wd);
        this.I = 0;
        this.f180199J = 0;
        this.K = 0;
        this.L = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        this.M = new com.tencent.mm.plugin.wallet_core.model.Orders();
        this.Q = false;
        this.S = true;
        this.f180219x0 = new java.util.ArrayList();
        this.H = context;
        o();
    }
}
