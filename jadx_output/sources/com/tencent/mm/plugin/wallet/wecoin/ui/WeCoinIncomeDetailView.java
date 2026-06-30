package com.tencent.mm.plugin.wallet.wecoin.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public class WeCoinIncomeDetailView extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int E = 0;
    public android.widget.TextView A;
    public android.view.View B;
    public android.widget.TextView C;
    public r45.e8 D;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f179164d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f179165e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f179166f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f179167g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f179168h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f179169i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f179170m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView f179171n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ProgressBar f179172o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f179173p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f179174q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f179175r;

    /* renamed from: s, reason: collision with root package name */
    public ms4.t f179176s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f179177t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f179178u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f179179v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f179180w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f179181x;

    /* renamed from: y, reason: collision with root package name */
    public int f179182y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f179183z;

    public static final void T6(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView, long j17, android.view.View view, android.widget.TextView textView) {
        weCoinIncomeDetailView.getClass();
        java.lang.String o17 = com.tencent.mm.wallet_core.ui.r1.o(com.tencent.mm.wallet_core.ui.r1.i(pm0.v.u(j17), "100", 2, java.math.RoundingMode.HALF_UP).doubleValue());
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "showPendingBalance", "(JLandroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "showPendingBalance", "(JLandroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (textView != null) {
            textView.setText(weCoinIncomeDetailView.getResources().getString(com.tencent.mm.R.string.kf_, o17));
        }
        if (view != null) {
            view.setOnClickListener(new ns4.h2(weCoinIncomeDetailView));
        }
    }

    public static final void U6(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView) {
        ms4.t tVar = weCoinIncomeDetailView.f179176s;
        if (tVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        r45.kj5 kj5Var = (r45.kj5) tVar.f331113h.getValue();
        ms4.t tVar2 = weCoinIncomeDetailView.f179176s;
        if (tVar2 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        java.lang.Long l17 = (java.lang.Long) tVar2.f331111f.getValue();
        if (l17 == null) {
            l17 = 0L;
        }
        long longValue = l17.longValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateClickButtonEvent balance:");
        sb6.append(longValue);
        sb6.append(", mViewModel.useNewStyle:");
        ms4.t tVar3 = weCoinIncomeDetailView.f179176s;
        if (tVar3 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        sb6.append(tVar3.f331118p);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailView", sb6.toString());
        ms4.t tVar4 = weCoinIncomeDetailView.f179176s;
        if (tVar4 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        if (tVar4.f331118p) {
            android.widget.Button button = weCoinIncomeDetailView.f179175r;
            if (button == null) {
                kotlin.jvm.internal.o.o("mCloseBtn");
                throw null;
            }
            button.setVisibility(8);
            if (longValue > 0) {
                android.widget.Button button2 = weCoinIncomeDetailView.f179174q;
                if (button2 == null) {
                    kotlin.jvm.internal.o.o("mFetchBtn");
                    throw null;
                }
                button2.setVisibility(0);
            } else {
                android.widget.Button button3 = weCoinIncomeDetailView.f179174q;
                if (button3 == null) {
                    kotlin.jvm.internal.o.o("mFetchBtn");
                    throw null;
                }
                button3.setVisibility(8);
            }
        } else if (longValue == 0 && tVar4.f331124v) {
            android.widget.Button button4 = weCoinIncomeDetailView.f179175r;
            if (button4 == null) {
                kotlin.jvm.internal.o.o("mCloseBtn");
                throw null;
            }
            button4.setVisibility(0);
            android.widget.Button button5 = weCoinIncomeDetailView.f179174q;
            if (button5 == null) {
                kotlin.jvm.internal.o.o("mFetchBtn");
                throw null;
            }
            button5.setVisibility(8);
            android.widget.Button button6 = weCoinIncomeDetailView.f179175r;
            if (button6 == null) {
                kotlin.jvm.internal.o.o("mCloseBtn");
                throw null;
            }
            button6.setOnClickListener(new ns4.i2(weCoinIncomeDetailView));
        } else {
            android.widget.Button button7 = weCoinIncomeDetailView.f179175r;
            if (button7 == null) {
                kotlin.jvm.internal.o.o("mCloseBtn");
                throw null;
            }
            button7.setVisibility(8);
            android.widget.Button button8 = weCoinIncomeDetailView.f179174q;
            if (button8 == null) {
                kotlin.jvm.internal.o.o("mFetchBtn");
                throw null;
            }
            button8.setVisibility(0);
        }
        java.util.Objects.toString(kj5Var);
        android.widget.Button button9 = weCoinIncomeDetailView.f179174q;
        if (button9 == null) {
            kotlin.jvm.internal.o.o("mFetchBtn");
            throw null;
        }
        button9.setEnabled(false);
        android.widget.Button button10 = weCoinIncomeDetailView.f179174q;
        if (button10 == null) {
            kotlin.jvm.internal.o.o("mFetchBtn");
            throw null;
        }
        button10.setTextColor(weCoinIncomeDetailView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
        if (longValue <= 0) {
            return;
        }
        android.widget.Button button11 = weCoinIncomeDetailView.f179174q;
        if (button11 == null) {
            kotlin.jvm.internal.o.o("mFetchBtn");
            throw null;
        }
        button11.setEnabled(true);
        android.widget.Button button12 = weCoinIncomeDetailView.f179174q;
        if (button12 == null) {
            kotlin.jvm.internal.o.o("mFetchBtn");
            throw null;
        }
        button12.setTextColor(weCoinIncomeDetailView.getContext().getResources().getColor(com.tencent.mm.R.color.Link_100));
        android.widget.Button button13 = weCoinIncomeDetailView.f179174q;
        if (button13 != null) {
            button13.setOnClickListener(new ns4.k2(weCoinIncomeDetailView, kj5Var));
        } else {
            kotlin.jvm.internal.o.o("mFetchBtn");
            throw null;
        }
    }

    public final void V6() {
        ms4.t tVar = this.f179176s;
        if (tVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        r45.v11 v11Var = tVar.f331122t;
        java.util.LinkedList list = v11Var != null ? v11Var.getList(6) : null;
        if (list == null || list.isEmpty()) {
            ms4.t tVar2 = this.f179176s;
            if (tVar2 != null) {
                W6(tVar2.f331120r, null, 0, null, null);
                return;
            } else {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), 1, true);
        k0Var.q(getContext().getString(com.tencent.mm.R.string.lpl), 17);
        k0Var.f211872n = new ns4.y1(list, this);
        k0Var.f211881s = new ns4.z1(list, this);
        k0Var.v();
    }

    public final void W6(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.lang.Long l17, int i17, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click encash, jumpInfo:");
        sb6.append(finderJumpInfo != null ? ms4.t.f331108x.a(finderJumpInfo) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailView", sb6.toString());
        if (finderJumpInfo != null) {
            if (this.f179176s == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailViewModel", "jumpEncashInterceptor");
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, this, p0Var, 0, null, 8, null);
            return;
        }
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView.class);
        if (l17 == null) {
            ms4.t tVar = this.f179176s;
            if (tVar == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            l17 = (java.lang.Long) tVar.f331111f.getValue();
        }
        if (l17 != null) {
            intent.putExtra("wecoin_income_balance", l17.longValue());
        }
        ms4.t tVar2 = this.f179176s;
        if (tVar2 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        intent.putExtra("wecoin_enter_encash_business_kv_data", tVar2.f331123u);
        ms4.t tVar3 = this.f179176s;
        if (tVar3 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        intent.putExtra("WECOIN_BUSINESS_ID", tVar3.f331109d);
        ms4.t tVar4 = this.f179176s;
        if (tVar4 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        intent.putExtra("WECOIN_ENCASH_SCENE", tVar4.f331121s);
        intent.putExtra("WECOIN_ENCASH_BIZ_TYPE", i17);
        intent.putExtra("WECOIN_ENCASH_BIZ_ACCT_ID", str);
        intent.putExtra("WECOIN_ENCASH_KEYBOARD_TIPS", str2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "gotoIncomeBalanceView", "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "gotoIncomeBalanceView", "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void X6() {
        int i17;
        android.content.res.Resources resources;
        int i18;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483065vo);
        if (findViewById == null) {
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483064vn);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483066vp);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483063vm);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f483062vl);
        r45.e8 e8Var = this.D;
        if (e8Var != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = e8Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) e8Var.getCustom(2) : null;
            if (finderJumpInfo != null) {
                java.lang.String jump_id = finderJumpInfo.getJump_id();
                if (!(jump_id == null || jump_id.length() == 0)) {
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_INCOME_ANNOUNCEMENT_ID_STRING_SYNC;
                    java.lang.String v17 = c17.v(u3Var, "");
                    com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_INCOME_ANNOUNCEMENT_FETCH_TIME_INT_SYNC;
                    int r17 = c18.r(u3Var2, 0);
                    com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_INCOME_ANNOUNCEMENT_CLICK_BOOLEAN_SYNC;
                    boolean o17 = c19.o(u3Var3, false);
                    int e17 = c01.id.e();
                    if (!kotlin.jvm.internal.o.b(v17, finderJumpInfo.getJump_id())) {
                        i17 = 0;
                        com.tencent.mm.storage.n3 c27 = gm0.j1.u().c();
                        java.lang.String jump_id2 = finderJumpInfo.getJump_id();
                        if (jump_id2 == null) {
                            jump_id2 = "";
                        }
                        c27.x(u3Var, jump_id2);
                        gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(e17));
                        gm0.j1.u().c().x(u3Var3, java.lang.Boolean.FALSE);
                    } else {
                        if (o17) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailView", "has clicked lastId:" + v17);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        i17 = 0;
                        if (r17 > 0 && e17 - r17 > e8Var.getInteger(1)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailView", "out of active_time, lastId:" + v17 + ", current:" + e17 + ", lastFetchTime:" + r17 + ", " + e8Var.getInteger(1));
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                    }
                    if (e8Var.getInteger(5) == 2) {
                        if (weImageView != null) {
                            weImageView.s(com.tencent.mm.R.raw.icons_outlined_error, com.tencent.mm.R.color.f478532ac);
                        }
                        if (com.tencent.mm.ui.bk.C()) {
                            resources = getContext().getResources();
                            i18 = com.tencent.mm.R.drawable.cnt;
                        } else {
                            resources = getContext().getResources();
                            i18 = com.tencent.mm.R.drawable.cns;
                        }
                        findViewById.setBackground(resources.getDrawable(i18));
                        if (textView != null) {
                            textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
                        }
                        if (weImageView2 != null) {
                            weImageView2.s(com.tencent.mm.R.raw.icons_outlined_arrow, com.tencent.mm.R.color.FG_1);
                        }
                    } else {
                        if (weImageView != null) {
                            weImageView.s(com.tencent.mm.R.raw.announce_icon, com.tencent.mm.R.color.f478553an);
                        }
                        findViewById.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.ahg));
                        if (textView != null) {
                            textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
                        }
                        if (weImageView2 != null) {
                            weImageView2.s(com.tencent.mm.R.raw.icons_outlined_arrow, com.tencent.mm.R.color.f478553an);
                        }
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList3.get(i17)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (textView != null) {
                        java.lang.String string = e8Var.getString(i17);
                        if (string == null) {
                            string = "";
                        }
                        textView.setText(string);
                    }
                    boolean z17 = e8Var.getBoolean(3);
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new ns4.f2(finderJumpInfo, findViewById, z17, this));
                    }
                    if (z17) {
                        if (weImageView != null) {
                            weImageView.setVisibility(i17);
                        }
                        if (weImageView2 == null) {
                            return;
                        }
                        weImageView2.setVisibility(i17);
                        return;
                    }
                    if (e8Var.getInteger(5) == 2) {
                        if (weImageView != null) {
                            weImageView.setVisibility(i17);
                        }
                        if (weImageView2 == null) {
                            return;
                        }
                        weImageView2.setVisibility(8);
                        return;
                    }
                    if (weImageView != null) {
                        weImageView.setVisibility(8);
                    }
                    if (weImageView2 != null) {
                        weImageView2.setVisibility(8);
                    }
                    if (textView == null) {
                        return;
                    }
                    textView.setGravity(17);
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailView", "jumpInfo or id is empty");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void Y6(long j17) {
        android.view.View view = this.f179166f;
        if (view == null) {
            kotlin.jvm.internal.o.o("normalModeMoneyLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "showMoney", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "showMoney", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String o17 = com.tencent.mm.wallet_core.ui.r1.o(com.tencent.mm.wallet_core.ui.r1.i("" + j17, "100", 2, java.math.RoundingMode.HALF_UP).doubleValue());
        com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f179171n;
        if (wcPayMoneyLoadingView != null) {
            wcPayMoneyLoadingView.e(o17, false);
        } else {
            kotlin.jvm.internal.o.o("mBalanceView");
            throw null;
        }
    }

    public final void Z6(java.lang.Long l17) {
        if (l17 != null) {
            long longValue = l17.longValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateIncomeBalanceView balance:");
            sb6.append(l17);
            sb6.append(", mViewModel.useNewStyle:");
            ms4.t tVar = this.f179176s;
            if (tVar == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            sb6.append(tVar.f331118p);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailView", sb6.toString());
            ms4.t tVar2 = this.f179176s;
            if (tVar2 == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            if (tVar2.f331118p) {
                android.view.View view = this.f179164d;
                if (view == null) {
                    kotlin.jvm.internal.o.o("normalModeTitleLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f179165e;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("normalModeContentLayout");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = this.f179169i;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("cocertActivateModeLayout");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView = this.f179167g;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("normalModeTips");
                    throw null;
                }
                textView.setVisibility(8);
                if (longValue > 0) {
                    Y6(longValue);
                    return;
                }
                android.view.View view4 = this.f179166f;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("normalModeMoneyLayout");
                    throw null;
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = this.f179164d;
                if (view5 == null) {
                    kotlin.jvm.internal.o.o("normalModeTitleLayout");
                    throw null;
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (longValue == 0) {
                if (tVar2 == null) {
                    kotlin.jvm.internal.o.o("mViewModel");
                    throw null;
                }
                if (tVar2.f331124v) {
                    android.view.View view6 = this.f179164d;
                    if (view6 == null) {
                        kotlin.jvm.internal.o.o("normalModeTitleLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view7 = this.f179165e;
                    if (view7 == null) {
                        kotlin.jvm.internal.o.o("normalModeContentLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView textView2 = this.f179167g;
                    if (textView2 == null) {
                        kotlin.jvm.internal.o.o("normalModeTips");
                        throw null;
                    }
                    textView2.setVisibility(8);
                    android.view.View view8 = this.f179169i;
                    if (view8 == null) {
                        kotlin.jvm.internal.o.o("cocertActivateModeLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView textView3 = this.f179170m;
                    if (textView3 == null) {
                        kotlin.jvm.internal.o.o("cocertActivateModeTips");
                        throw null;
                    }
                    textView3.setVisibility(0);
                    android.widget.TextView textView4 = this.f179170m;
                    if (textView4 == null) {
                        kotlin.jvm.internal.o.o("cocertActivateModeTips");
                        throw null;
                    }
                    ms4.t tVar3 = this.f179176s;
                    if (tVar3 != null) {
                        textView4.setText(tVar3.f331125w);
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("mViewModel");
                        throw null;
                    }
                }
            }
            android.view.View view9 = this.f179164d;
            if (view9 == null) {
                kotlin.jvm.internal.o.o("normalModeTitleLayout");
                throw null;
            }
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view10 = this.f179165e;
            if (view10 == null) {
                kotlin.jvm.internal.o.o("normalModeContentLayout");
                throw null;
            }
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView5 = this.f179167g;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("normalModeTips");
                throw null;
            }
            textView5.setVisibility(0);
            android.view.View view11 = this.f179169i;
            if (view11 == null) {
                kotlin.jvm.internal.o.o("cocertActivateModeLayout");
                throw null;
            }
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView6 = this.f179170m;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("cocertActivateModeTips");
                throw null;
            }
            textView6.setVisibility(8);
            ms4.t tVar4 = this.f179176s;
            if (tVar4 == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            java.lang.String str = tVar4.f331125w;
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                android.widget.TextView textView7 = this.f179167g;
                if (textView7 == null) {
                    kotlin.jvm.internal.o.o("normalModeTips");
                    throw null;
                }
                textView7.setText(getString(com.tencent.mm.R.string.f493488kf3, str));
            }
            Y6(longValue);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487950cd;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        r45.e92 e92Var;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.String str;
        java.lang.String str2;
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        setMMTitle("");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kde);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f179164d = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.kdb);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f179165e = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.qdb);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f179166f = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.kdd);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f179167g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.qd9);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f179168h = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f483775c04);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f179169i = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.f483776c05);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f179170m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.f487641pa4);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f179171n = (com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.pcr);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f179172o = (android.widget.ProgressBar) findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.pkc);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f179173p = (android.widget.LinearLayout) findViewById10;
        this.f179178u = findViewById(com.tencent.mm.R.id.ac_);
        this.f179179v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iem);
        this.f179180w = findViewById(com.tencent.mm.R.id.f482468fc);
        com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f179171n;
        if (wcPayMoneyLoadingView == null) {
            kotlin.jvm.internal.o.o("mBalanceView");
            throw null;
        }
        android.widget.ProgressBar progressBar = this.f179172o;
        if (progressBar == null) {
            kotlin.jvm.internal.o.o("mMoneyLoadingPb");
            throw null;
        }
        wcPayMoneyLoadingView.setLoadingPb(progressBar);
        com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView2 = this.f179171n;
        if (wcPayMoneyLoadingView2 == null) {
            kotlin.jvm.internal.o.o("mBalanceView");
            throw null;
        }
        wcPayMoneyLoadingView2.setPrefixSymbol(getString(com.tencent.mm.R.string.kyi));
        androidx.lifecycle.o mo133getLifecycle = mo133getLifecycle();
        com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView3 = this.f179171n;
        if (wcPayMoneyLoadingView3 == null) {
            kotlin.jvm.internal.o.o("mBalanceView");
            throw null;
        }
        mo133getLifecycle.a(wcPayMoneyLoadingView3);
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.f487638pa1);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f179174q = (android.widget.Button) findViewById11;
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.f487637pa0);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f179175r = (android.widget.Button) findViewById12;
        this.f179181x = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.dh9);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.pkf)).setOnClickListener(new ns4.a2(this));
        this.f179183z = findViewById(com.tencent.mm.R.id.oah);
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qd_);
        this.B = findViewById(com.tencent.mm.R.id.f486293kt5);
        this.C = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kt6);
        setBackBtn(new ns4.b2(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        Z6(0L);
        android.view.View view = this.f179178u;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "initLiveTaskEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "initLiveTaskEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (((s40.w0) i95.n0.c(s40.w0.class)) != null) {
            ya2.g gVar = ya2.h.f460484a;
            e92Var = new r45.e92();
            e92Var.set(2, java.lang.Boolean.valueOf(pm0.v.z((int) gVar.e().field_liveSwitchFlag, 512)));
            r45.m36 m36Var = gVar.e().field_settlementInfo;
            if (m36Var == null || (str = m36Var.getString(0)) == null) {
                str = "";
            }
            e92Var.set(0, str);
            r45.m36 m36Var2 = gVar.e().field_settlementInfo;
            if (m36Var2 == null || (str2 = m36Var2.getString(1)) == null) {
                str2 = "";
            }
            e92Var.set(1, str2);
        } else {
            e92Var = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("settlementEnable:");
        sb6.append(e92Var != null ? java.lang.Boolean.valueOf(e92Var.getBoolean(2)) : null);
        sb6.append(", url:");
        sb6.append(e92Var != null ? e92Var.getString(1) : null);
        sb6.append(", tip:");
        sb6.append(e92Var != null ? e92Var.getString(0) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailView", sb6.toString());
        if (!(e92Var != null && e92Var.getBoolean(2))) {
            android.view.View view2 = this.f179180w;
            java.lang.Object layoutParams = view2 != null ? view2.getLayoutParams() : null;
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.tencent.mm.ui.zk.a(getContext(), 64);
            }
            android.widget.TextView textView = this.f179179v;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(e92Var.getString(0))) {
            android.view.View view3 = this.f179180w;
            java.lang.Object layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
            marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.tencent.mm.ui.zk.a(getContext(), 64);
            }
            android.widget.TextView textView2 = this.f179179v;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            android.widget.TextView textView3 = this.f179179v;
            if (textView3 == null) {
                return;
            }
            textView3.setText("");
            return;
        }
        android.view.View view4 = this.f179180w;
        java.lang.Object layoutParams3 = view4 != null ? view4.getLayoutParams() : null;
        marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = com.tencent.mm.ui.zk.a(getContext(), 48);
        }
        android.widget.TextView textView4 = this.f179179v;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        android.widget.TextView textView5 = this.f179179v;
        if (textView5 == null) {
            return;
        }
        textView5.setText(e92Var.getString(0));
    }

    public void onActivityResult(int i17, int i18, android.content.Intent intent, android.app.ComponentCaller caller) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(caller, "caller");
        super.onActivityResult(i17, i18, intent, caller);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailView", "onActivityResult requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 40002) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (i18 != -1 || bundleExtra == null || (map = (java.util.Map) bundleExtra.getSerializable("next_params")) == null) {
                return;
            }
            java.lang.String str = (java.lang.String) map.get("next_step");
            java.lang.String str2 = (java.lang.String) map.get("result");
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailView", "onActivityResult nextStep:" + str + ", resultMap:" + str2);
            if (!r26.i0.p("realname_verify", str, true) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            java.lang.String string = jSONObject.getString("code");
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailView", "onActivityResult nextStep:" + str + ", code:" + string + ", msg:" + jSONObject.getString("msg"));
            kotlinx.coroutines.l.d(v65.m.b(this), null, null, new ns4.d2(this, string, null), 3, null);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ms4.t tVar = this.f179176s;
        if (tVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        tVar.R6(10);
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0166 A[SYNTHETIC] */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ms4.t tVar = this.f179176s;
        if (tVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        tVar.Q6("", 9, 1, 0, "");
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        ms4.q qVar = new ms4.q(tVar, this);
        ((c61.l7) b6Var).getClass();
        db2.x0 x0Var = new db2.x0(xy2.c.e(this));
        az2.j.u(x0Var, this, null, 0L, 6, null);
        pm0.v.T(x0Var.l(), new c61.z5(qVar)).f(this);
    }
}
