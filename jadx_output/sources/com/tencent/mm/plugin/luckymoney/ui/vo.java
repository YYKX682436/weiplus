package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class vo extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f147586d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f147587e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f147588f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f147589g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f147590h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f147591i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f147592m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f147593n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final void O6(com.tencent.mm.plugin.luckymoney.ui.vo voVar, r45.wd3 wd3Var) {
        voVar.getClass();
        r45.p90 p90Var = wd3Var.f389076d;
        if (p90Var == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(p90Var.f382870g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] reddot version is null, return");
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = voVar.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
        r45.lm5 h76 = ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity).h7();
        if (h76 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] local reddot is null, save reddot info");
            voVar.T6(wd3Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] version, local: " + h76.f379623e + "、svr:" + p90Var.f382870g);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(h76.f379623e) && h76.f379622d == 2 && p90Var.f382871h == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] old data is update_value、new data is new_value ： update old data to not show");
            h76.f379625g = false;
            h76.f379628m = false;
            voVar.R6(h76);
            com.tencent.mm.plugin.luckymoney.model.m5.a(h76.f379623e);
            androidx.appcompat.app.AppCompatActivity activity2 = voVar.getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity2).f146558l2 = false;
            voVar.X6();
            return;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_PREPARE_UI_ENVELOPE_ENTRANCE_CLICKED_LAST_TIME_LONG_SYNC, 0L);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) m17).longValue();
        long h17 = com.tencent.mm.plugin.luckymoney.model.m5.h();
        boolean z17 = longValue > 0 && h17 - longValue < 43200000;
        com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] inSaveProtectTimeExternal: " + z17 + "， curTime：" + h17 + " , lastClickEntranceTime: " + longValue);
        if (p90Var.f382867d && z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] inSaveProtectTimeExternal, ignore");
            return;
        }
        long h18 = com.tencent.mm.plugin.luckymoney.model.m5.h() / 1000;
        java.lang.Boolean c17 = com.tencent.mm.plugin.luckymoney.model.m5.c(p90Var.f382870g);
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(h76.f379623e) && r26.i0.q(h76.f379623e, p90Var.f382870g, false, 2, null) && h18 > h76.f379627i;
        if (p90Var.f382867d) {
            kotlin.jvm.internal.o.d(c17);
            if (c17.booleanValue() || z18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] ReDot is expired or clicked. Don't show Red Dot");
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(h76.f379623e) || !r26.i0.q(h76.f379623e, p90Var.f382870g, false, 2, null)) {
            if (com.tencent.mm.plugin.luckymoney.model.m5.c(p90Var.f382870g).booleanValue()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] version exist, ignore save svr reddot info, version is " + p90Var.f382870g);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] version not exists, new reddot version is " + p90Var.f382870g + ", is_show is " + p90Var.f382867d);
                voVar.T6(wd3Var);
                return;
            }
        }
        if (c17.booleanValue() || h18 >= h76.f379627i) {
            if (p90Var.f382867d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] do nothing ");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] update local reddot is_show to false ");
            h76.f379625g = false;
            h76.f379628m = false;
            voVar.R6(h76);
            androidx.appcompat.app.AppCompatActivity activity3 = voVar.getActivity();
            kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity3).f146558l2 = false;
            voVar.X6();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] update local reddot.is_show to: " + p90Var.f382867d);
        boolean z19 = p90Var.f382867d;
        h76.f379625g = z19;
        h76.f379628m = z19;
        voVar.R6(h76);
        if (!p90Var.f382867d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] refresh local reddot show flag to false");
            androidx.appcompat.app.AppCompatActivity activity4 = voVar.getActivity();
            kotlin.jvm.internal.o.e(activity4, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity4).f146558l2 = false;
        }
        voVar.X6();
    }

    public final void P6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity : null;
        if (luckyMoneyPrepareUI != null ? luckyMoneyPrepareUI.f146560m2 : false) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[doNormalTextStyle] mSourceDisableStatus is true， set gone");
            android.widget.TextView textView = this.f147593n;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity2 : null;
        if (!(luckyMoneyPrepareUI2 != null ? luckyMoneyPrepareUI2.k7() : false)) {
            android.widget.TextView textView2 = this.f147593n;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        android.widget.TextView textView3 = this.f147593n;
        if (textView3 != null) {
            textView3.setTextColor(android.graphics.Color.parseColor("#806B48"));
        }
        android.widget.TextView textView4 = this.f147593n;
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(0);
    }

    public final void Q6(android.widget.TextView textView) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity : null;
        if (luckyMoneyPrepareUI != null ? luckyMoneyPrepareUI.k7() : false) {
            if (textView != null) {
                textView.setTextColor(android.graphics.Color.parseColor("#806B48"));
            }
            com.tencent.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        } else {
            if (textView != null) {
                textView.setTextColor(getActivity().getResources().getColor(com.tencent.mm.R.color.FG_1));
            }
            com.tencent.mm.ui.bk.t0(textView != null ? textView.getPaint() : null);
        }
    }

    public final void R6(r45.lm5 lm5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[updateSelectSkinEntryRedDotLocalData]");
        if (lm5Var == null) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
        ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity).f146556k2 = lm5Var;
        com.tencent.mm.plugin.luckymoney.model.m5.e(lm5Var);
    }

    public final java.lang.String S6() {
        java.lang.Object obj;
        if (!U6()) {
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

    public final void T6(r45.wd3 wd3Var) {
        r45.p90 p90Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[saveSelectSkinEntryRedDotLocalDataAndRefresh]");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity;
        r45.lm5 lm5Var = null;
        if (wd3Var != null && (p90Var = wd3Var.f389076d) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[doSaveLocalRedDotInfo] data source, is_show : " + java.lang.Boolean.valueOf(p90Var.f382867d) + "， type：" + java.lang.Integer.valueOf(p90Var.f382871h) + " , version: " + p90Var.f382870g + " , expired_time: " + java.lang.Integer.valueOf(p90Var.f382872i) + ' ');
            r45.lm5 n17 = com.tencent.mm.plugin.luckymoney.model.m5.n();
            if (n17 != null && n17.f379622d == 2 && p90Var.f382871h == 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[doModifySelectSkinEntryLocalRedDotInfo] old and new data is update_value, add old version to hasClickRedDotVersionList");
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
        luckyMoneyPrepareUI.f146556k2 = lm5Var;
        X6();
    }

    public final boolean U6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity : null;
        if (luckyMoneyPrepareUI != null ? luckyMoneyPrepareUI.f146560m2 : false) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[shouldShowPersonalRedDot] mSourceDisableStatus is true, return false");
            return false;
        }
        boolean Ui = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ui();
        com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[shouldShowPersonalRedDot] " + Ui);
        return Ui;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r0.f379625g != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        if (r0.f379625g != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean V6() {
        /*
            r9 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r9.getActivity()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI"
            kotlin.jvm.internal.o.e(r0, r1)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) r0
            boolean r0 = r0.f146560m2
            java.lang.String r2 = "MicroMsg.RedDotUIC-PrepareUI"
            r3 = 0
            if (r0 == 0) goto L18
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] mSourceDisableStatus is true, return false"
            com.tencent.mars.xlog.Log.e(r2, r0)
            return r3
        L18:
            boolean r0 = r9.U6()
            if (r0 == 0) goto L24
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] shouldShowPersonalRedDot, return false"
            com.tencent.mars.xlog.Log.e(r2, r0)
            return r3
        L24:
            long r4 = com.tencent.mm.plugin.luckymoney.model.m5.h()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            androidx.appcompat.app.AppCompatActivity r0 = r9.getActivity()
            kotlin.jvm.internal.o.e(r0, r1)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) r0
            r45.lm5 r0 = r0.h7()
            if (r0 != 0) goto L40
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] redDotData == null"
            com.tencent.mars.xlog.Log.e(r2, r0)
            return r3
        L40:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "[shouldShowSelectSkinEntryPlazaNewRedDot] version： "
            r1.<init>(r6)
            java.lang.String r6 = r0.f379623e
            r1.append(r6)
            java.lang.String r6 = ", type："
            r1.append(r6)
            int r6 = r0.f379622d
            r1.append(r6)
            java.lang.String r6 = " , is_show："
            r1.append(r6)
            boolean r6 = r0.f379625g
            r1.append(r6)
            java.lang.String r6 = " , currentTime："
            r1.append(r6)
            r1.append(r4)
            java.lang.String r6 = ",  invalidateTimes："
            r1.append(r6)
            long r6 = r0.f379627i
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r2, r1)
            int r1 = r0.f379622d
            r6 = 1
            if (r1 == r6) goto L93
            r7 = 2
            if (r1 == r7) goto L87
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] unknown type"
            com.tencent.mars.xlog.Log.e(r2, r0)
            goto Lc3
        L87:
            long r7 = r0.f379627i
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto Lc3
            boolean r0 = r0.f379625g
            if (r0 == 0) goto Lc3
        L91:
            r3 = r6
            goto Lc3
        L93:
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r7 = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_CLICKEDSKIN_INT_SYNC
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.m(r7, r8)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.o.e(r1, r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r6) goto Lb8
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] user has clicked select skin entry, ignore show reddot"
            com.tencent.mars.xlog.Log.e(r2, r0)
            return r3
        Lb8:
            long r7 = r0.f379627i
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto Lc3
            boolean r0 = r0.f379625g
            if (r0 == 0) goto Lc3
            goto L91
        Lc3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[shouldShowSelectSkinEntryPlazaNewRedDot] shouldShow："
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.vo.V6():boolean");
    }

    public final boolean W6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
        if (((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity).f146560m2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[shouldShowSelectSkinNormalRedDot] mSourceDisableStatus is true, return false");
            return false;
        }
        if (U6()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[shouldShowSelectSkinNormalRedDot] shouldShowPersonalRedDot, return false");
            return false;
        }
        if (V6()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[shouldShowSelectSkinNormalRedDot] shouldShowSelectSkinEntryPlazaNewRedDot, return false");
            return false;
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        return bk0.a.g().f(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC, com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_HOME_STRING_SYNC);
    }

    public final void X6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity : null;
        android.widget.TextView textView = luckyMoneyPrepareUI != null ? luckyMoneyPrepareUI.L : null;
        if (U6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[updateSelectSkinEntryRedDotStyle] show personal reddot");
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = this.f147593n;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout = this.f147586d;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout2 = this.f147590h;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            java.lang.String S6 = S6();
            if (S6 == null || S6.length() == 0) {
                android.widget.TextView textView3 = this.f147591i;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else {
                android.widget.TextView textView4 = this.f147591i;
                if (textView4 != null) {
                    textView4.setText(S6);
                }
                android.widget.TextView textView5 = this.f147591i;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
                Q6(this.f147591i);
            }
            android.widget.TextView textView6 = this.f147592m;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
        } else if (V6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[updateSelectSkinEntryRedDotStyle] show plaza new reddot");
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView7 = this.f147593n;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout3 = this.f147586d;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout4 = this.f147590h;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            r45.lm5 h76 = ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity2).h7();
            if (h76 == null || com.tencent.mm.sdk.platformtools.t8.K0(h76.f379631p)) {
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = this.f147587e;
                if (cdnImageView != null) {
                    cdnImageView.setVisibility(8);
                }
            } else {
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView2 = this.f147587e;
                if (cdnImageView2 != null) {
                    cdnImageView2.setVisibility(0);
                }
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView3 = this.f147587e;
                if (cdnImageView3 != null) {
                    cdnImageView3.setUrl(h76.f379631p);
                }
            }
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity3).k7();
            androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
            kotlin.jvm.internal.o.e(activity4, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            java.lang.String g17 = com.tencent.mm.plugin.luckymoney.model.m5.g(((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity4).h7());
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                android.widget.TextView textView8 = this.f147588f;
                if (textView8 != null) {
                    textView8.setVisibility(8);
                }
            } else {
                android.widget.TextView textView9 = this.f147588f;
                if (textView9 != null) {
                    textView9.setVisibility(0);
                }
                android.widget.TextView textView10 = this.f147588f;
                if (textView10 != null) {
                    textView10.setText(g17);
                }
                Q6(this.f147588f);
            }
            android.widget.TextView textView11 = this.f147589g;
            if (textView11 != null) {
                textView11.setVisibility(0);
            }
            androidx.appcompat.app.AppCompatActivity activity5 = getActivity();
            kotlin.jvm.internal.o.e(activity5, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            if (!((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity5).f146558l2) {
                androidx.appcompat.app.AppCompatActivity activity6 = getActivity();
                kotlin.jvm.internal.o.e(activity6, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
                ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity6).f146558l2 = true;
            }
        } else if (W6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[updateSelectSkinEntryRedDotStyle] show normal reddot");
            if (textView != null) {
                textView.setVisibility(0);
            }
            P6();
            android.widget.LinearLayout linearLayout5 = this.f147586d;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout6 = this.f147590h;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(8);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[updateSelectSkinEntryRedDotStyle] dont show any reddot");
            if (textView != null) {
                textView.setVisibility(8);
            }
            P6();
            android.widget.LinearLayout linearLayout7 = this.f147586d;
            if (linearLayout7 != null) {
                linearLayout7.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout8 = this.f147590h;
            if (linearLayout8 != null) {
                linearLayout8.setVisibility(8);
            }
        }
        androidx.appcompat.app.AppCompatActivity activity7 = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = activity7 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity7 : null;
        boolean k76 = luckyMoneyPrepareUI2 != null ? luckyMoneyPrepareUI2.k7() : false;
        androidx.appcompat.app.AppCompatActivity activity8 = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI3 = activity8 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity8 : null;
        android.widget.LinearLayout linearLayout9 = luckyMoneyPrepareUI3 != null ? luckyMoneyPrepareUI3.f146562n2 : null;
        if (k76) {
            if (linearLayout9 != null) {
                linearLayout9.setBackgroundResource(com.tencent.mm.R.color.aby);
            }
        } else if (linearLayout9 != null) {
            linearLayout9.setBackgroundResource(com.tencent.mm.R.color.a9e);
        }
        float b17 = i65.a.b(getContext(), 8);
        if (linearLayout9 != null) {
            linearLayout9.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (linearLayout9 == null) {
            return;
        }
        linearLayout9.setClipToOutline(true);
    }
}
