package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ld extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f147136d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f147137e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f147138f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f147139g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f147140h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f147141i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f147142m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f147143n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final void O6(com.tencent.mm.plugin.luckymoney.ui.ld ldVar, r45.wd3 wd3Var) {
        ldVar.getClass();
        r45.p90 p90Var = wd3Var.f389076d;
        if (p90Var == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(p90Var.f382870g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] reddot version is null, return");
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        r45.lm5 g76 = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.g7() : null;
        if (g76 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] local reddot is null, save reddot info");
            ldVar.V6(wd3Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] version, local: " + g76.f379623e + "、svr:" + p90Var.f382870g);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(g76.f379623e) && g76.f379622d == 2 && p90Var.f382871h == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] old data is update_value、new data is new_value ： update old data to not show");
            g76.f379625g = false;
            g76.f379628m = false;
            ldVar.R6(g76);
            com.tencent.mm.plugin.luckymoney.model.m5.a(g76.f379623e);
            androidx.appcompat.app.AppCompatActivity activity2 = ldVar.getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
            if (luckyMoneyNewPrepareUI2 != null) {
                luckyMoneyNewPrepareUI2.f146252g2 = false;
            }
            ldVar.a7();
            return;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_PREPARE_UI_ENVELOPE_ENTRANCE_CLICKED_LAST_TIME_LONG_SYNC, 0L);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) m17).longValue();
        long h17 = com.tencent.mm.plugin.luckymoney.model.m5.h();
        boolean z17 = longValue > 0 && h17 - longValue < 43200000;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] inSaveProtectTimeExternal: " + z17 + "， curTime：" + h17 + " , lastClickEntranceTime: " + longValue);
        if (p90Var.f382867d && z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] inSaveProtectTimeExternal, ignore");
            return;
        }
        long h18 = com.tencent.mm.plugin.luckymoney.model.m5.h() / 1000;
        java.lang.Boolean c17 = com.tencent.mm.plugin.luckymoney.model.m5.c(p90Var.f382870g);
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(g76.f379623e) && r26.i0.q(g76.f379623e, p90Var.f382870g, false, 2, null) && h18 > g76.f379627i;
        if (p90Var.f382867d) {
            kotlin.jvm.internal.o.d(c17);
            if (c17.booleanValue() || z18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] ReDot is expired or clicked. Don't show Red Dot");
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(g76.f379623e) || !r26.i0.q(g76.f379623e, p90Var.f382870g, false, 2, null)) {
            if (com.tencent.mm.plugin.luckymoney.model.m5.c(p90Var.f382870g).booleanValue()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] version exist, ignore save svr reddot info, version is " + p90Var.f382870g);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] version not exists, new reddot version is " + p90Var.f382870g + ", is_show is " + p90Var.f382867d);
                ldVar.V6(wd3Var);
                return;
            }
        }
        if (c17.booleanValue() || h18 >= g76.f379627i) {
            if (p90Var.f382867d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] do nothing ");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] update local reddot is_show to false ");
            g76.f379625g = false;
            g76.f379628m = false;
            ldVar.R6(g76);
            androidx.appcompat.app.AppCompatActivity activity3 = ldVar.getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI3 = activity3 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity3 : null;
            if (luckyMoneyNewPrepareUI3 != null) {
                luckyMoneyNewPrepareUI3.f146252g2 = false;
            }
            ldVar.a7();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] update local reddot.is_show to: " + p90Var.f382867d);
        boolean z19 = p90Var.f382867d;
        g76.f379625g = z19;
        g76.f379628m = z19;
        ldVar.R6(g76);
        if (!p90Var.f382867d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] refresh local reddot show flag to false");
            androidx.appcompat.app.AppCompatActivity activity4 = ldVar.getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI4 = activity4 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity4 : null;
            if (luckyMoneyNewPrepareUI4 != null) {
                luckyMoneyNewPrepareUI4.f146252g2 = false;
            }
        }
        ldVar.a7();
    }

    public final void P6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        boolean j76 = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.j7() : false;
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
        boolean z17 = luckyMoneyNewPrepareUI2 != null ? luckyMoneyNewPrepareUI2.f146256i2 : false;
        if (!j76 || z17) {
            android.widget.TextView textView = this.f147143n;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = this.f147143n;
        if (textView2 != null) {
            textView2.setTextColor(android.graphics.Color.parseColor("#806B48"));
        }
        android.widget.TextView textView3 = this.f147143n;
        if (textView3 == null) {
            return;
        }
        textView3.setVisibility(0);
    }

    public final void Q6(android.widget.TextView textView, int i17) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        boolean z17 = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.f146256i2 : false;
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
        boolean j76 = luckyMoneyNewPrepareUI2 != null ? luckyMoneyNewPrepareUI2.j7() : false;
        if (!j76) {
            if (textView != null) {
                textView.setTextColor(getActivity().getResources().getColor(com.tencent.mm.R.color.FG_1));
            }
            if (textView != null) {
                textView.setTextSize(1, 14.0f);
            }
            if (textView != null) {
                textView.setMaxLines(1);
            }
            if (textView != null) {
                textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            }
            com.tencent.mm.ui.bk.t0(textView != null ? textView.getPaint() : null);
        } else if (z17) {
            if (textView != null) {
                textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.adg));
            }
            if (textView != null) {
                textView.setTextSize(0, i65.a.a(getContext(), 14.0f) * i65.a.m(getContext()));
            }
            if (textView != null) {
                textView.setMaxLines(1);
            }
            if (textView != null) {
                textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            }
            if (textView != null) {
                textView.setLineSpacing(0.0f, 0.9f);
            }
            com.tencent.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        } else {
            if (textView != null) {
                textView.setTextColor(android.graphics.Color.parseColor("#806B48"));
            }
            if (textView != null) {
                textView.setTextSize(1, 14.0f);
            }
            if (textView != null) {
                textView.setMaxLines(1);
            }
            if (textView != null) {
                textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            }
            com.tencent.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.luckymoney.ui.qd qdVar = (com.tencent.mm.plugin.luckymoney.ui.qd) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.luckymoney.ui.qd.class);
        qdVar.getClass();
        if (textView != null) {
            textView.post(new com.tencent.mm.plugin.luckymoney.ui.nd(textView, qdVar, i17, j76));
        }
    }

    public final void R6(r45.lm5 lm5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[updateSelectSkinEntryRedDotLocalData]");
        if (lm5Var == null) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        if (luckyMoneyNewPrepareUI != null) {
            luckyMoneyNewPrepareUI.f146250f2 = lm5Var;
        }
        com.tencent.mm.plugin.luckymoney.model.m5.e(lm5Var);
    }

    public final android.widget.LinearLayout S6() {
        return (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485758iy5);
    }

    public final java.lang.String T6() {
        java.lang.Object obj;
        if (!X6()) {
            return "";
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        com.tencent.mm.plugin.newtips.model.p Di = rn3.i.Di();
        android.util.Pair c17 = Di != null ? Di.c(new vn3.c(57)) : null;
        if ((c17 != null ? (com.tencent.mm.plugin.newtips.model.r) c17.first : null) != com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE || (obj = c17.second) == null) {
            return "";
        }
        r45.pm6 pm6Var = (r45.pm6) obj;
        if (com.tencent.mm.sdk.platformtools.t8.K0(pm6Var != null ? pm6Var.f383187e : null)) {
            return "";
        }
        r45.pm6 pm6Var2 = (r45.pm6) c17.second;
        if (pm6Var2 != null) {
            return pm6Var2.f383187e;
        }
        return null;
    }

    public final boolean U6() {
        android.widget.TextView textView;
        android.widget.LinearLayout linearLayout = this.f147136d;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            return true;
        }
        android.widget.LinearLayout linearLayout2 = this.f147140h;
        if (linearLayout2 != null && linearLayout2.getVisibility() == 0) {
            return true;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        return luckyMoneyNewPrepareUI != null && (textView = luckyMoneyNewPrepareUI.G) != null && textView.getVisibility() == 0;
    }

    public final void V6(r45.wd3 wd3Var) {
        r45.p90 p90Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[saveSelectSkinEntryRedDotLocalDataAndRefresh]");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        r45.lm5 lm5Var = null;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        if (luckyMoneyNewPrepareUI != null) {
            if (wd3Var != null && (p90Var = wd3Var.f389076d) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[doSaveLocalRedDotInfo] data source, is_show : " + java.lang.Boolean.valueOf(p90Var.f382867d) + "， type：" + java.lang.Integer.valueOf(p90Var.f382871h) + " , version: " + p90Var.f382870g + " , expired_time: " + java.lang.Integer.valueOf(p90Var.f382872i) + ' ');
                r45.lm5 n17 = com.tencent.mm.plugin.luckymoney.model.m5.n();
                if (n17 != null && n17.f379622d == 2 && p90Var.f382871h == 2) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[doModifySelectSkinEntryLocalRedDotInfo] old and new data is update_value, add old version to hasClickRedDotVersionList");
                    com.tencent.mm.plugin.luckymoney.model.m5.a(n17.f379623e);
                    n17.f379625g = false;
                    n17.f379628m = false;
                    com.tencent.mm.plugin.luckymoney.model.m5.e(n17);
                }
                lm5Var = new r45.lm5();
                boolean z17 = p90Var.f382867d;
                lm5Var.f379625g = z17;
                lm5Var.f379628m = z17;
                lm5Var.f379622d = p90Var.f382871h;
                java.lang.String str = p90Var.f382869f;
                if (str == null) {
                    str = "";
                }
                lm5Var.f379631p = str;
                java.lang.String str2 = p90Var.f382870g;
                if (str2 == null) {
                    str2 = "";
                }
                lm5Var.f379623e = str2;
                java.lang.String str3 = p90Var.f382873m;
                lm5Var.f379636u = str3 != null ? str3 : "";
                lm5Var.f379626h = 0L;
                lm5Var.f379629n = 0L;
                int i17 = p90Var.f382872i;
                long h17 = i17 > 0 ? i17 : (com.tencent.mm.plugin.luckymoney.model.m5.h() / 1000) + 604800;
                lm5Var.f379627i = h17;
                lm5Var.f379630o = h17;
                java.util.LinkedList wordings = p90Var.f382868e;
                if (wordings != null) {
                    kotlin.jvm.internal.o.f(wordings, "wordings");
                    if (!wordings.isEmpty()) {
                        java.util.Iterator it = wordings.iterator();
                        while (it.hasNext()) {
                            r45.fm5 fm5Var = (r45.fm5) it.next();
                            if (fm5Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(fm5Var.f374452d) && !com.tencent.mm.sdk.platformtools.t8.K0(fm5Var.f374453e)) {
                                if (kotlin.jvm.internal.o.b(fm5Var.f374452d, "zh_CN")) {
                                    lm5Var.f379632q = fm5Var.f374453e;
                                } else if (kotlin.jvm.internal.o.b(fm5Var.f374452d, "zh_HK")) {
                                    lm5Var.f379633r = fm5Var.f374453e;
                                } else if (kotlin.jvm.internal.o.b(fm5Var.f374452d, "zh_TW")) {
                                    lm5Var.f379634s = fm5Var.f374453e;
                                } else if (kotlin.jvm.internal.o.b(fm5Var.f374452d, "en")) {
                                    lm5Var.f379635t = fm5Var.f374453e;
                                }
                            }
                        }
                    }
                }
                com.tencent.mm.plugin.luckymoney.model.m5.e(lm5Var);
            }
            luckyMoneyNewPrepareUI.f146250f2 = lm5Var;
        }
        a7();
    }

    public final void W6(boolean z17) {
        android.widget.RelativeLayout relativeLayout;
        if (z17) {
            android.widget.LinearLayout S6 = S6();
            if (S6 != null) {
                android.view.ViewParent parent = S6.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(S6);
                }
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(11);
                layoutParams.addRule(15);
                layoutParams.rightMargin = i65.a.b(getContext(), 16);
                S6.setLayoutParams(layoutParams);
                S6.setOrientation(0);
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
                if (luckyMoneyNewPrepareUI == null || (relativeLayout = luckyMoneyNewPrepareUI.f146291z) == null) {
                    return;
                }
                relativeLayout.addView(S6);
                return;
            }
            return;
        }
        android.widget.LinearLayout S62 = S6();
        if (S62 != null) {
            android.view.ViewParent parent2 = S62.getParent();
            android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(S62);
            }
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = i65.a.b(getContext(), 4);
            layoutParams2.gravity = 16;
            S62.setLayoutParams(layoutParams2);
            S62.setOrientation(0);
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((com.tencent.mm.plugin.luckymoney.ui.qd) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.luckymoney.ui.qd.class)).findViewById(com.tencent.mm.R.id.f485774j12);
            if (linearLayout != null) {
                linearLayout.addView(S62);
            }
        }
    }

    public final boolean X6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) {
        }
        boolean Ui = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ui();
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[shouldShowPersonalRedDot] " + Ui);
        return Ui;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r2.f379625g != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        if (r2.f379625g != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y6() {
        /*
            r9 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r9.getActivity()
            boolean r1 = r0 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI
            r2 = 0
            if (r1 == 0) goto Lc
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI r0 = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            boolean r0 = r9.X6()
            r1 = 0
            java.lang.String r3 = "MicroMsg.NewPrepareUIRedDotUIC"
            if (r0 == 0) goto L1c
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] shouldShowPersonalRedDot, return false"
            com.tencent.mars.xlog.Log.e(r3, r0)
            return r1
        L1c:
            long r4 = com.tencent.mm.plugin.luckymoney.model.m5.h()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            androidx.appcompat.app.AppCompatActivity r0 = r9.getActivity()
            boolean r6 = r0 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI
            if (r6 == 0) goto L2e
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI r0 = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            if (r0 == 0) goto L35
            r45.lm5 r2 = r0.g7()
        L35:
            if (r2 != 0) goto L3d
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] redDotData == null"
            com.tencent.mars.xlog.Log.e(r3, r0)
            return r1
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "[shouldShowSelectSkinEntryPlazaNewRedDot] version： "
            r0.<init>(r6)
            java.lang.String r6 = r2.f379623e
            r0.append(r6)
            java.lang.String r6 = ", type："
            r0.append(r6)
            int r6 = r2.f379622d
            r0.append(r6)
            java.lang.String r6 = " , is_show："
            r0.append(r6)
            boolean r6 = r2.f379625g
            r0.append(r6)
            java.lang.String r6 = " , currentTime："
            r0.append(r6)
            r0.append(r4)
            java.lang.String r6 = ",  invalidateTimes："
            r0.append(r6)
            long r6 = r2.f379627i
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r0)
            int r0 = r2.f379622d
            r6 = 1
            if (r0 == r6) goto L8f
            r7 = 2
            if (r0 == r7) goto L84
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] unknown type"
            com.tencent.mars.xlog.Log.e(r3, r0)
            goto Lbf
        L84:
            long r7 = r2.f379627i
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto Lbf
            boolean r0 = r2.f379625g
            if (r0 == 0) goto Lbf
            goto Lbe
        L8f:
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r7 = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_CLICKEDSKIN_INT_SYNC
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.m(r7, r8)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.o.e(r0, r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r6) goto Lb4
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] user has clicked select skin entry, ignore show reddot"
            com.tencent.mars.xlog.Log.e(r3, r0)
            return r1
        Lb4:
            long r7 = r2.f379627i
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto Lbf
            boolean r0 = r2.f379625g
            if (r0 == 0) goto Lbf
        Lbe:
            r1 = r6
        Lbf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[shouldShowSelectSkinEntryPlazaNewRedDot] shouldShow："
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.ld.Y6():boolean");
    }

    public final boolean Z6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) {
        }
        if (X6()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[shouldShowSelectSkinNormalRedDot] shouldShowPersonalRedDot, return false");
            return false;
        }
        if (Y6()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[shouldShowSelectSkinNormalRedDot] shouldShowSelectSkinEntryPlazaNewRedDot, return false");
            return false;
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        return bk0.a.g().f(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC, com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_HOME_STRING_SYNC);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7() {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.ld.a7():void");
    }
}
