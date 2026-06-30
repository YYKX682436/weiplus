package pk2;

/* loaded from: classes3.dex */
public final class q3 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356188i;

    /* renamed from: j, reason: collision with root package name */
    public zy2.gc f356189j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356188i = n() ? "anchorlive.more.morefunction.recommend" : "startlive.more.recommend";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356188i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        java.lang.Object m521constructorimpl;
        r45.t62 t62Var;
        java.lang.String str;
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        android.view.View findViewById;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f131959f;
        if (!n()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", "1");
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 32L, jSONObject.toString(), null, 4, null);
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.qod);
        findViewById2.setOnClickListener(new pk2.f3(bottomSheet));
        findViewById2.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493308jp2));
        if (n() && (findViewById = view.findViewById(com.tencent.mm.R.id.qoe)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h(gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_RECOMMEND_CONFIG_STRING_SYNC, ""));
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            r45.t62 t62Var2 = new r45.t62();
            t62Var2.parseFrom(h17);
            m521constructorimpl = kotlin.Result.m521constructorimpl(t62Var2);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("AnchorRecommendOption", m524exceptionOrNullimpl, "addItem: parse pb error", new java.lang.Object[0]);
            m521constructorimpl = null;
        }
        r45.t62 t62Var3 = (r45.t62) m521constructorimpl;
        if (t62Var3 != null) {
            t62Var = new r45.t62();
            t62Var.set(0, java.lang.Integer.valueOf(t62Var3.getInteger(0)));
            t62Var.set(1, java.lang.Boolean.valueOf(t62Var3.getBoolean(1)));
            t62Var.getList(2).addAll(t62Var3.getList(2));
            t62Var.getList(4).addAll(t62Var3.getList(4));
            t62Var.set(5, java.lang.Integer.valueOf(t62Var3.getInteger(5)));
        } else {
            t62Var = new r45.t62();
        }
        r45.t62 t62Var4 = t62Var;
        if (t62Var3 != null) {
            boolean z17 = t62Var3.getInteger(0) == 0;
            com.tencent.mm.plugin.finder.view.LoadingSwitchBtn g17 = o9Var.g(view, com.tencent.mm.R.id.qqe, z17);
            g17.setEnabled(!n());
            java.lang.String obj = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487461qr2)).getText().toString();
            android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.qlh);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            v(obj, findViewById3, g17);
            x(view, t62Var4, t62Var3);
            boolean z18 = z17;
            str = "findViewById(...)";
            g17.setSwitchListener(new pk2.g3(this, z18, view, t62Var4, t62Var3));
            if (!n()) {
                view.findViewById(com.tencent.mm.R.id.qoe).setOnClickListener(new pk2.k3(t62Var3, g17, this, o9Var, bottomSheet));
            }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) t62Var3.getCustom(3);
            jz5.f0 f0Var3 = jz5.f0.f302826a;
            if (finderJumpInfo != null) {
                w(view, t62Var3);
                if (!n()) {
                    android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.f486567qo5);
                    if (findViewById4 != null) {
                        findViewById4.setOnClickListener(new pk2.l3(t62Var3, this, view, t62Var4, t62Var3));
                    }
                    android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.qo_);
                    if (findViewById5 != null) {
                        findViewById5.setOnClickListener(new pk2.m3(t62Var3, this, view, t62Var4, t62Var3));
                    }
                    android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.qo7);
                    if (findViewById6 != null) {
                        findViewById6.setOnClickListener(new pk2.p3(t62Var3, finderJumpInfo, o9Var, this, view, t62Var4));
                    }
                }
                f0Var2 = f0Var3;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("AnchorRecommendOption", "lite app jump info is null");
                android.view.View findViewById7 = view.findViewById(com.tencent.mm.R.id.qob);
                if (findViewById7 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById7, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById7.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById8 = view.findViewById(com.tencent.mm.R.id.f486562qo0);
                if (findViewById8 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById8, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById8.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById8, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            f0Var = f0Var3;
        } else {
            str = "findViewById(...)";
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("AnchorRecommendOption", "config pb is null");
            android.view.View findViewById9 = view.findViewById(com.tencent.mm.R.id.qob);
            if (findViewById9 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById9, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById9.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById9, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById10 = view.findViewById(com.tencent.mm.R.id.f486562qo0);
            if (findViewById10 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById10, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById10.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById10, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.view.LoadingSwitchBtn g18 = o9Var.g(view, com.tencent.mm.R.id.qqe, true);
            java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487461qr2)).getText().toString();
            android.view.View findViewById11 = view.findViewById(com.tencent.mm.R.id.qlh);
            kotlin.jvm.internal.o.f(findViewById11, str);
            v(obj2, findViewById11, g18);
        }
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.qoc);
    }

    public final void w(android.view.View view, r45.t62 t62Var) {
        android.view.View view2;
        int i17;
        java.lang.String string;
        int i18;
        int i19;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.qob);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f486562qo0);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.f486566qo4);
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.qo9);
        if (n()) {
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf(0.3f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (findViewById4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(java.lang.Float.valueOf(0.3f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                findViewById4 = findViewById4;
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        } else {
            if (findViewById3 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById3.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (findViewById4 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById4.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
                findViewById4 = findViewById4;
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        if (!t62Var.getBoolean(1)) {
            if (findViewById3 == null) {
                i18 = 4;
            } else {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                i18 = 4;
                yj0.a.d(findViewById3, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById4 == null) {
                i19 = com.tencent.mm.R.id.qo7;
            } else {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                arrayList8.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList8);
                java.lang.Object[] array = arrayList8.toArray();
                i19 = com.tencent.mm.R.id.qo7;
                android.view.View view3 = findViewById4;
                yj0.a.d(findViewById4, array, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById5 = view.findViewById(i19);
            if (findViewById5 == null) {
                return;
            }
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(findViewById5, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = findViewById4;
        if (findViewById3 == null) {
            view2 = view4;
        } else {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
            arrayList10.add(4);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(findViewById3, arrayList10.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2 = view4;
        }
        if (view2 == null) {
            i17 = 4;
        } else {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal11 = zj0.c.f473285a;
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view2, arrayList11.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            android.view.View view5 = view2;
            i17 = 4;
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.qo7);
        if (findViewById6 != null) {
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal12 = zj0.c.f473285a;
            arrayList12.add(0);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(findViewById6, arrayList12.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "refreshCityRangeUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486563qo1);
        if (textView != null) {
            kotlin.jvm.internal.o.f(t62Var.getList(i17), "getTranslate_recommend_city_list(...)");
            if (!r4.isEmpty()) {
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.util.LinkedList list = t62Var.getList(i17);
                kotlin.jvm.internal.o.f(list, "getTranslate_recommend_city_list(...)");
                int integer = t62Var.getInteger(5);
                if (list.isEmpty()) {
                    string = context.getResources().getString(com.tencent.mm.R.string.f491794lv0);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                } else {
                    java.lang.String g07 = kz5.n0.g0(list, "、", null, null, 0, null, null, 62, null);
                    if (integer <= 0) {
                        integer = list.size();
                    }
                    string = context.getResources().getString(com.tencent.mm.R.string.luz, g07, java.lang.Integer.valueOf(integer));
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                }
            } else {
                string = view.getContext().getResources().getString(com.tencent.mm.R.string.f491794lv0);
            }
            textView.setText(string);
            android.content.res.Resources resources = view.getContext().getResources();
            java.util.LinkedList list2 = t62Var.getList(4);
            kotlin.jvm.internal.o.f(list2, "getTranslate_recommend_city_list(...)");
            textView.setTextColor(resources.getColor((!(list2.isEmpty() ^ true) || n()) ? com.tencent.mm.R.color.FG_2 : com.tencent.mm.R.color.f478502m));
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486564qo2);
        if (textView2 != null) {
            textView2.setTextColor(view.getContext().getResources().getColor(!n() ? com.tencent.mm.R.color.Link_100 : com.tencent.mm.R.color.FG_0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if ((!r13.isEmpty()) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(android.view.View r11, r45.t62 r12, r45.t62 r13) {
        /*
            r10 = this;
            boolean r12 = r10.n()
            r0 = 0
            r1 = 2131318206(0x7f0955be, float:1.8254943E38)
            if (r12 == 0) goto L56
            android.view.View r11 = r11.findViewById(r1)
            if (r11 != 0) goto L11
            goto L55
        L11:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.ThreadLocal r13 = zj0.c.f473285a
            r13 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.add(r13)
            java.util.Collections.reverse(r12)
            java.lang.Object[] r3 = r12.toArray()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption"
            java.lang.String r5 = "refreshDoneBtn"
            java.lang.String r6 = "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r11
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r12 = r12.get(r0)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.setVisibility(r12)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption"
            java.lang.String r4 = "refreshDoneBtn"
            java.lang.String r5 = "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;Lcom/tencent/mm/protocal/protobuf/FinderLiveRecommendConfig;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r11
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
        L55:
            return
        L56:
            android.view.View r11 = r11.findViewById(r1)
            if (r11 != 0) goto L5d
            goto L82
        L5d:
            r12 = 1
            boolean r1 = r13.getBoolean(r12)
            if (r1 == 0) goto L7e
            r1 = 3
            com.tencent.mm.protobuf.f r1 = r13.getCustom(r1)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r1
            if (r1 == 0) goto L7e
            r1 = 2
            java.util.LinkedList r13 = r13.getList(r1)
            java.lang.String r1 = "getRecommend_city_list(...)"
            kotlin.jvm.internal.o.f(r13, r1)
            boolean r13 = r13.isEmpty()
            r13 = r13 ^ r12
            if (r13 == 0) goto L7f
        L7e:
            r0 = r12
        L7f:
            r11.setEnabled(r0)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.q3.x(android.view.View, r45.t62, r45.t62):void");
    }
}
