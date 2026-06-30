package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class eo extends com.tencent.mm.ui.component.UIComponent implements js4.p {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f134282d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f134283e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f134284f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f134285g;

    /* renamed from: h, reason: collision with root package name */
    public r45.j71 f134286h;

    /* renamed from: i, reason: collision with root package name */
    public r45.e8 f134287i;

    /* renamed from: m, reason: collision with root package name */
    public int f134288m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134285g = new java.util.ArrayList();
        this.f134286h = new r45.j71();
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar, java.lang.String str) {
        eoVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("allow_mix_content_mode", false);
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
        j45.l.j(eoVar.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public static final void P6(com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar, com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar) {
        java.lang.String str;
        r45.gs2 gs2Var;
        eoVar.getClass();
        r45.v11 v11Var = (r45.v11) rnVar.f135810d.getCustom(9);
        if (v11Var == null || (gs2Var = (r45.gs2) v11Var.getCustom(5)) == null || (str = gs2Var.getString(7)) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "#openRealNameNewAuth, verifyUrl:".concat(str));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("open_custom_style_url", true);
        intent.putExtra("forceHideShare", true);
        intent.putExtra("show_native_web_view", true);
        intent.putExtra("rawUrl", str);
        intent.putExtra("screen_orientation", 1);
        j45.l.n(eoVar.getContext(), "webview", ".ui.tools.WebViewUI", intent, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ALWAYS_RETURN_TRY_AGAIN);
    }

    public static final void Q6(com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar, com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar) {
        eoVar.getClass();
        r45.v11 v11Var = (r45.v11) rnVar.f135810d.getCustom(9);
        if (v11Var != null) {
            kotlinx.coroutines.l.d(eoVar.getMainScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.zn(eoVar, v11Var, null), 3, null);
        }
    }

    public static final boolean R6(com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar, com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar) {
        java.lang.String str;
        r45.gs2 gs2Var;
        r45.gs2 gs2Var2;
        r45.gs2 gs2Var3;
        eoVar.getClass();
        r45.v11 v11Var = (r45.v11) rnVar.f135810d.getCustom(9);
        boolean z17 = (v11Var == null || (gs2Var3 = (r45.gs2) v11Var.getCustom(5)) == null) ? false : gs2Var3.getBoolean(5);
        r45.mw1 mw1Var = rnVar.f135810d;
        r45.v11 v11Var2 = (r45.v11) mw1Var.getCustom(9);
        int integer = (v11Var2 == null || (gs2Var2 = (r45.gs2) v11Var2.getCustom(5)) == null) ? 0 : gs2Var2.getInteger(6);
        r45.v11 v11Var3 = (r45.v11) mw1Var.getCustom(9);
        if (v11Var3 == null || (gs2Var = (r45.gs2) v11Var3.getCustom(5)) == null || (str = gs2Var.getString(7)) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "#shouldOpenRealNameNewAuth, hasRealnameAuth:" + z17 + ", authType:" + integer + ", verifyUrl:" + str);
        return !z17 && integer == 1 && str.length() > 0;
    }

    public static final boolean S6(com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar, com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar) {
        r45.gs2 gs2Var;
        eoVar.getClass();
        r45.v11 v11Var = (r45.v11) rnVar.f135810d.getCustom(9);
        return (v11Var == null || (gs2Var = (r45.gs2) v11Var.getCustom(5)) == null || gs2Var.getInteger(6) != 2 || gs2Var.getInteger(8) == 1) ? false : true;
    }

    public static final void T6(com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar, long j17, android.view.View view, android.widget.TextView textView, com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar) {
        java.math.BigDecimal bigDecimal;
        java.lang.String obj;
        eoVar.getClass();
        if (j17 <= 0) {
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "showPendingBalance", "(JLandroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "showPendingBalance", "(JLandroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "showPendingBalance", "(JLandroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "showPendingBalance", "(JLandroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        zl2.q4 q4Var = zl2.q4.f473933a;
        java.lang.String u17 = pm0.v.u(j17);
        java.math.RoundingMode roundingMode = java.math.RoundingMode.HALF_UP;
        try {
            if (com.tencent.mm.sdk.platformtools.t8.F(u17, 0.0d) == 0.0d) {
                obj = "0";
            } else {
                int length = u17.length() - 1;
                int i17 = 0;
                boolean z17 = false;
                while (i17 <= length) {
                    boolean z18 = kotlin.jvm.internal.o.i(u17.charAt(!z17 ? i17 : length), 32) <= 0;
                    if (z17) {
                        if (!z18) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z18) {
                        i17++;
                    } else {
                        z17 = true;
                    }
                }
                obj = u17.subSequence(i17, length + 1).toString();
            }
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(obj);
            int i18 = 2;
            int i19 = 0;
            boolean z19 = false;
            while (i19 <= i18) {
                boolean z27 = kotlin.jvm.internal.o.i("100".charAt(!z19 ? i19 : i18), 32) <= 0;
                if (z19) {
                    if (!z27) {
                        break;
                    } else {
                        i18--;
                    }
                } else if (z27) {
                    i19++;
                } else {
                    z19 = true;
                }
            }
            bigDecimal = bigDecimal2.divide(new java.math.BigDecimal("100".subSequence(i19, i18 + 1).toString()), 2, roundingMode);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderUtil2", e17, "", new java.lang.Object[0]);
            bigDecimal = new java.math.BigDecimal(0);
        }
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{bigDecimal != null ? java.lang.Double.valueOf(bigDecimal.doubleValue()) : null}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        if (textView != null) {
            textView.setText(view.getContext().getResources().getString(com.tencent.mm.R.string.e3y, format));
        }
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.Cdo(eoVar, rnVar));
        }
    }

    public final void U6() {
        int i17;
        android.content.res.Resources resources;
        int i18;
        ae2.in.f3688a.l();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483065vo);
        if (findViewById == null) {
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483064vn);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483066vp);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483063vm);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f483062vl);
        r45.e8 e8Var = this.f134287i;
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
                            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "has clicked lastId:" + v17);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        i17 = 0;
                        if (r17 > 0 && e17 - r17 > e8Var.getInteger(1)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "out of active_time, lastId:" + v17 + ", current:" + e17 + ", lastFetchTime:" + r17 + ", " + e8Var.getInteger(1));
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                    }
                    if (e8Var.getInteger(5) == 2) {
                        if (weImageView != null) {
                            weImageView.s(com.tencent.mm.R.raw.icons_outlined_error, com.tencent.mm.R.color.f478532ac);
                        }
                        if (com.tencent.mm.ui.bk.C()) {
                            resources = getContext().getResources();
                            i18 = com.tencent.mm.R.drawable.cnv;
                        } else {
                            resources = getContext().getResources();
                            i18 = com.tencent.mm.R.drawable.cnu;
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
                            weImageView.s(com.tencent.mm.R.raw.live_announce_icon, com.tencent.mm.R.color.f478553an);
                        }
                        findViewById.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.ajt));
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
                    yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList3.get(i17)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (textView != null) {
                        java.lang.String string = e8Var.getString(i17);
                        if (string == null) {
                            string = "";
                        }
                        textView.setText(string);
                    }
                    boolean z17 = e8Var.getBoolean(3);
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.ao(finderJumpInfo, findViewById, z17, this));
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
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "jumpInfo or id is empty");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void V6(r45.j71 j71Var) {
        int i17;
        r45.kj5 kj5Var;
        this.f134286h = j71Var;
        java.util.LinkedList list = j71Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getItems(...)");
        java.util.ArrayList<r45.mw1> arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if ((((r45.mw1) next).getInteger(0) == 4 ? 1 : 0) != 0) {
                arrayList.add(next);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "refreshData size:" + arrayList.size());
        java.util.ArrayList arrayList2 = this.f134285g;
        arrayList2.clear();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (r45.mw1 mw1Var : arrayList) {
            kotlin.jvm.internal.o.d(mw1Var);
            com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar = new com.tencent.mm.plugin.finder.viewmodel.component.rn(mw1Var);
            r45.v11 v11Var = (r45.v11) rnVar.f135810d.getCustom(9);
            if (v11Var != null) {
                rnVar.f135811e = java.lang.Long.valueOf(v11Var.getLong(i17));
                r45.gs2 gs2Var = (r45.gs2) v11Var.getCustom(5);
                if (gs2Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "has_realname_auth:" + gs2Var.getBoolean(5) + " appid:" + gs2Var.getString(i17) + ", category_id:" + gs2Var.getList(1));
                    kj5Var = new r45.kj5();
                    kj5Var.f378761d = gs2Var.getString(i17);
                    kj5Var.f378762e = gs2Var.getList(1);
                    kj5Var.f378763f = gs2Var.getInteger(2);
                    kj5Var.f378764g = gs2Var.getString(3);
                    kj5Var.f378765h = gs2Var.getString(4);
                    kj5Var.f378766i = ((gs2Var.getInteger(6) == 2 || !gs2Var.getBoolean(5)) && !(gs2Var.getInteger(6) == 2 && gs2Var.getInteger(8) == 1)) ? 1 : 2;
                } else {
                    kj5Var = null;
                }
                rnVar.f135813g = kj5Var;
                rnVar.f135812f = null;
                rnVar.f135814h = v11Var.getString(1);
                rnVar.f135815i = java.lang.Long.valueOf(v11Var.getLong(2));
                rnVar.f135816m = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) v11Var.getCustom(3);
                rnVar.f135817n = v11Var.getInteger(4);
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "encashScene:" + rnVar.f135817n + ", encashInterceptJumpInfo, " + rnVar.a());
            }
            arrayList3.add(rnVar);
            i17 = 0;
        }
        arrayList2.addAll(arrayList3);
    }

    public final void W6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "refreshEncashInfo");
        db2.x0 x0Var = new db2.x0(xy2.c.e(getContext()));
        az2.j.u(x0Var, getContext(), null, 0L, 6, null);
        x0Var.l().K(new com.tencent.mm.plugin.finder.viewmodel.component.co(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.asy;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.Map map;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "onActivityResult requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 40002) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (i18 != -1 || bundleExtra == null || (map = (java.util.Map) bundleExtra.getSerializable("next_params")) == null) {
                return;
            }
            java.lang.String str = (java.lang.String) map.get("next_step");
            java.lang.String str2 = (java.lang.String) map.get("result");
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "onActivityResult nextStep:" + str + ", resultMap:" + str2);
            if (!r26.i0.p("realname_verify", str, true) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            java.lang.String string = jSONObject.getString("code");
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", "onActivityResult nextStep:" + str + ", code:" + string + ", msg:" + jSONObject.getString("msg"));
            kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.yn(this, string, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.eo.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        W6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134285g = new java.util.ArrayList();
        this.f134286h = new r45.j71();
    }
}
