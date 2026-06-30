package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class h3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.mm.plugin.remittance.ui.l2 f157733t = new com.tencent.mm.plugin.remittance.ui.l2(null);

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.Map f157734u = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f157735d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f157736e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.ui.j2 f157737f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.ui.k2 f157738g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.ui.m2 f157739h;

    /* renamed from: i, reason: collision with root package name */
    public int f157740i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f157741m;

    /* renamed from: n, reason: collision with root package name */
    public int f157742n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f157743o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f157744p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f157745q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.model.g1 f157746r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f157747s;

    public h3(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f157735d = context;
        this.f157741m = "";
        this.f157743o = "";
    }

    public static final void x(com.tencent.mm.plugin.remittance.ui.h3 h3Var, int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        h3Var.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "clickid is null ignore set");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "set click to " + i17 + " , " + str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str3 = java.lang.String.valueOf(i17);
        } else {
            str3 = i17 + '_' + str;
        }
        f157734u.put(str3, str2);
    }

    public final void B(com.tencent.mm.plugin.remittance.ui.n2 viewHolder, com.tencent.mm.plugin.remittance.model.z0 accountChannelInfo) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(accountChannelInfo, "accountChannelInfo");
        com.tencent.mm.plugin.remittance.ui.l2 l2Var = f157733t;
        int b17 = l2Var.b(accountChannelInfo.f157069a, accountChannelInfo.f157088t);
        com.tencent.mm.plugin.remittance.ui.a f17 = l2Var.f(this.f157741m, accountChannelInfo.f157088t);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "[checkShowFirstLogo]，name: " + accountChannelInfo.f157070b + " chooseCount: " + b17 + ", bindSerialResult：" + f17);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = viewHolder.f157833i;
        if (b17 < 1 && accountChannelInfo.f157071c != null) {
            int i17 = this.f157740i;
            int i18 = accountChannelInfo.f157069a;
            if (i17 != i18 || (f17 != com.tencent.mm.plugin.remittance.ui.a.f157618d && f17 != com.tencent.mm.plugin.remittance.ui.a.f157619e)) {
                java.lang.String str3 = accountChannelInfo.f157088t;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    str = java.lang.String.valueOf(i18);
                } else {
                    str = i18 + '_' + str3;
                }
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("remittance_recv_account_first_icon_time_setting");
                kotlin.jvm.internal.o.f(M, "getMMKV(...)");
                long j17 = M.getLong(str, 0L);
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getRemittanceRecvAccountFirstIconTimeSetting: " + j17 + " key: " + str);
                long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "checkShowFirstLogo，time check：" + j17 + (char) 12289 + currentTimeMillis);
                if (j17 > 0 && currentTimeMillis > 604800000) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "overtime，not show");
                    cdnImageView.setVisibility(8);
                    return;
                }
                if (j17 <= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "first show，set time");
                    int i19 = accountChannelInfo.f157069a;
                    java.lang.String str4 = accountChannelInfo.f157088t;
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                        str2 = java.lang.String.valueOf(i19);
                    } else {
                        str2 = i19 + '_' + str4;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "setRemittanceRecvAccountFirstIconTimeSetting: " + str2 + " firstShowTime: " + currentTimeMillis2);
                    com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("remittance_recv_account_first_icon_time_setting");
                    kotlin.jvm.internal.o.f(M2, "getMMKV(...)");
                    M2.putLong(str2, currentTimeMillis2);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "viewHolder.itemNameIcon.visibility = VISIBLE name: " + accountChannelInfo.f157070b);
                cdnImageView.setVisibility(0);
                com.tencent.mm.plugin.wallet_core.utils.z1.g(viewHolder.f157833i, accountChannelInfo.f157071c, -1, 0, 0, true, i65.a.q(this.f157735d));
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "viewHolder.itemNameIcon.visibility = GONE name: " + accountChannelInfo.f157070b);
        cdnImageView.setVisibility(8);
    }

    public final int E(com.tencent.mm.plugin.remittance.model.z0 z0Var, long j17) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.remittance.model.d1 d1Var = z0Var.f157087s;
        if (((d1Var == null || (arrayList = d1Var.f156808d) == null) ? 0 : arrayList.size()) <= 1) {
            return 0;
        }
        java.util.Iterator it = z0Var.f157087s.f156808d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            int i18 = i17 + 1;
            if (((com.tencent.mm.plugin.remittance.model.c1) it.next()).f156800a == j17) {
                return i17;
            }
            i17 = i18;
        }
        return 0;
    }

    public final android.graphics.drawable.Drawable I(float f17, float f18, long j17, long j18) {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor((int) j18);
        gradientDrawable.setCornerRadii(new float[]{f17, f17, f17, f17, f18, f18, f18, f18});
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor((int) j17);
        gradientDrawable2.setCornerRadii(new float[]{f17, f17, f17, f17, f18, f18, f18, f18});
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public final com.tencent.mm.plugin.remittance.model.z0 J(int i17) {
        com.tencent.mm.plugin.remittance.model.g1 g1Var = this.f157746r;
        if (g1Var != null) {
            kotlin.jvm.internal.o.d(g1Var);
            if (g1Var.D != null) {
                com.tencent.mm.plugin.remittance.model.g1 g1Var2 = this.f157746r;
                kotlin.jvm.internal.o.d(g1Var2);
                java.util.Iterator it = g1Var2.D.f157051e.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    com.tencent.mm.plugin.remittance.model.a1 a1Var = (com.tencent.mm.plugin.remittance.model.a1) it.next();
                    if (a1Var != null && !com.tencent.mm.sdk.platformtools.t8.L0(a1Var.f156786a)) {
                        java.util.Iterator it6 = a1Var.f156786a.iterator();
                        int i19 = 0;
                        while (it6.hasNext()) {
                            int i27 = i19 + 1;
                            java.lang.Integer num = (java.lang.Integer) it6.next();
                            if (i17 == i18) {
                                java.util.ArrayList arrayList = a1Var.f156787b;
                                com.tencent.mm.plugin.remittance.model.w1 w1Var = arrayList != null ? (com.tencent.mm.plugin.remittance.model.w1) kz5.n0.a0(arrayList, i19) : null;
                                kotlin.jvm.internal.o.d(num);
                                int intValue = num.intValue();
                                java.lang.String str = w1Var != null ? w1Var.f157056b : null;
                                com.tencent.mm.plugin.remittance.model.g1 g1Var3 = this.f157746r;
                                if (g1Var3 == null || g1Var3.D == null) {
                                    return null;
                                }
                                com.tencent.mm.plugin.remittance.model.g1 g1Var4 = this.f157746r;
                                kotlin.jvm.internal.o.d(g1Var4);
                                java.util.Iterator it7 = g1Var4.D.f157050d.iterator();
                                while (it7.hasNext()) {
                                    com.tencent.mm.plugin.remittance.model.z0 z0Var = (com.tencent.mm.plugin.remittance.model.z0) it7.next();
                                    com.tencent.mm.plugin.remittance.ui.a f17 = f157733t.f(str, z0Var.f157088t);
                                    if (z0Var.f157069a == intValue && (f17 == com.tencent.mm.plugin.remittance.ui.a.f157618d || f17 == com.tencent.mm.plugin.remittance.ui.a.f157619e)) {
                                        return z0Var;
                                    }
                                }
                                return null;
                            }
                            i18++;
                            i19 = i27;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // androidx.recyclerview.widget.f2
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(com.tencent.mm.plugin.remittance.ui.n2 viewHolder, int i17) {
        android.view.View view;
        com.tencent.mm.plugin.remittance.model.z0 z0Var;
        java.lang.String recv_channel_logo;
        android.view.View view2;
        ?? r102;
        java.lang.String str;
        java.lang.String str2;
        long j17;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.tencent.mm.plugin.remittance.model.x0 x0Var;
        r45.rl6 rl6Var;
        com.tencent.mm.plugin.remittance.model.z0 z0Var2;
        long j18;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        java.util.List list = this.f157736e;
        if (list == null || i17 < 0 || i17 >= ((java.util.ArrayList) list).size()) {
            return;
        }
        boolean P = P();
        int i18 = 0;
        android.content.Context context = this.f157735d;
        android.view.View view3 = viewHolder.f157828d;
        if (P) {
            com.tencent.mm.plugin.remittance.model.z0 J2 = J(i17);
            if (J2 == null) {
                return;
            }
            r45.cg0 cg0Var = J2.f157085q;
            long v17 = cg0Var != null ? com.tencent.mm.wallet_core.ui.r1.v(cg0Var) : context.getResources().getColor(com.tencent.mm.R.color.f478490b);
            long color = context.getResources().getColor(com.tencent.mm.R.color.f478762gi);
            int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
            android.view.ViewGroup.LayoutParams layoutParams = viewHolder.f157842u.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, com.tencent.mm.R.id.llh);
            layoutParams2.rightMargin = 0;
            layoutParams2.leftMargin = i65.a.b(context, 48);
            com.tencent.mm.plugin.remittance.model.g1 g1Var = this.f157746r;
            kotlin.jvm.internal.o.d(g1Var);
            java.util.Iterator it = g1Var.D.f157051e.iterator();
            char c17 = 6;
            while (it.hasNext()) {
                com.tencent.mm.plugin.remittance.model.a1 a1Var = (com.tencent.mm.plugin.remittance.model.a1) it.next();
                if (a1Var == null || com.tencent.mm.sdk.platformtools.t8.L0(a1Var.f156786a)) {
                    j18 = color;
                } else {
                    java.util.Iterator it6 = a1Var.f156786a.iterator();
                    int i19 = 0;
                    while (it6.hasNext()) {
                        int i27 = i19 + 1;
                        long j19 = color;
                        if (a1Var.f156786a.size() == 1) {
                            if (i17 == i19 + i18) {
                                c17 = 5;
                            }
                        } else if (i17 == i18) {
                            c17 = 3;
                        } else if (i17 == (a1Var.f156786a.size() - 1) + i18) {
                            c17 = 4;
                        }
                        i19 = i27;
                        color = j19;
                    }
                    j18 = color;
                    i18 += a1Var.f156786a.size();
                }
                color = j18;
            }
            long j27 = color;
            if (c17 == 3) {
                view = view3;
                z0Var2 = J2;
                if (i17 != 0) {
                    com.tencent.mm.ui.kk.f(view, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8));
                }
                view.setBackground(I(b17, 0.0f, v17, j27));
                android.view.View view4 = viewHolder.f157842u;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (c17 == 4) {
                view = view3;
                z0Var2 = J2;
                view.setBackground(I(0.0f, b17, v17, j27));
                android.view.View view5 = viewHolder.f157842u;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (c17 == 5) {
                view = view3;
                z0Var2 = J2;
                if (i17 != 0) {
                    com.tencent.mm.ui.kk.f(view, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8));
                }
                float f17 = b17;
                view.setBackground(I(f17, f17, v17, j27));
                android.view.View view6 = viewHolder.f157842u;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (c17 != 6) {
                view = view3;
                z0Var2 = J2;
            } else {
                view = view3;
                z0Var2 = J2;
                view.setBackground(I(0.0f, 0.0f, v17, j27));
                android.view.View view7 = viewHolder.f157842u;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
            viewHolder.f157829e.setPadding(b18, b18, b18, b18);
            z0Var = z0Var2;
        } else {
            view = view3;
            java.util.List list2 = this.f157736e;
            kotlin.jvm.internal.o.d(list2);
            z0Var = (com.tencent.mm.plugin.remittance.model.z0) ((java.util.ArrayList) list2).get(i17);
            java.util.List list3 = this.f157736e;
            kotlin.jvm.internal.o.d(list3);
            if (i17 == ((java.util.ArrayList) list3).size() - 1) {
                android.view.View view8 = viewHolder.f157842u;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view9 = viewHolder.f157842u;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View view10 = viewHolder.f157828d;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view10, arrayList9.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view10.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view10, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemInfo name：");
        sb6.append(z0Var.f157070b);
        sb6.append("， type: ");
        sb6.append(z0Var.f157069a);
        sb6.append(", bindSerial: ");
        sb6.append(z0Var.f157088t);
        sb6.append(",  state：");
        sb6.append(z0Var.f157074f);
        sb6.append(", chooseSetting：");
        com.tencent.mm.plugin.remittance.ui.l2 l2Var = f157733t;
        sb6.append(l2Var.b(z0Var.f157069a, z0Var.f157088t));
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", sb6.toString());
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = viewHolder.f157830f;
        cdnImageView.setRoundCorner(true);
        cdnImageView.setRoundCornerRate(0.5f);
        if (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f157073e)) {
            recv_channel_logo = z0Var.f157072d;
            kotlin.jvm.internal.o.f(recv_channel_logo, "recv_channel_logo");
        } else {
            recv_channel_logo = z0Var.f157073e;
            kotlin.jvm.internal.o.f(recv_channel_logo, "recv_channel_logo_darkmode");
        }
        int b19 = i65.a.b(context, 24);
        cdnImageView.setUseSdcardCache(true);
        cdnImageView.b(recv_channel_logo, b19, b19, -1);
        java.lang.String str3 = z0Var.f157070b;
        android.widget.TextView textView = viewHolder.f157832h;
        textView.setText(str3);
        android.widget.TextView textView2 = viewHolder.f157835n;
        textView2.setVisibility(8);
        viewHolder.f157836o.setVisibility(8);
        if (z0Var.f157079k != null) {
            if (!y(z0Var.f157069a, z0Var.f157088t) || (x0Var = z0Var.f157079k) == null || (rl6Var = x0Var.f157062c) == null) {
                com.tencent.mm.plugin.remittance.model.x0 x0Var2 = z0Var.f157079k;
                M(viewHolder, z0Var, x0Var2.f157060a, x0Var2.f157061b);
            } else {
                M(viewHolder, z0Var, rl6Var, x0Var.f157063d);
            }
        }
        if (P()) {
            com.tencent.mm.plugin.remittance.model.d1 d1Var = z0Var.f157087s;
            java.lang.String str4 = "TRANS_SELECTED_SHOP_";
            if (((d1Var == null || (arrayList2 = d1Var.f156808d) == null) ? 0 : arrayList2.size()) > 0) {
                com.tencent.mm.plugin.remittance.model.d1 d1Var2 = z0Var.f157087s;
                long j28 = d1Var2.f156806b;
                java.util.Iterator it7 = d1Var2.f156808d.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        java.lang.String str5 = str4;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f157088t)) {
                            str = str5;
                            str2 = str + z0Var.f157069a;
                        } else {
                            str = str5;
                            str2 = str + z0Var.f157069a + '_' + z0Var.f157088t;
                        }
                        view2 = view;
                        long j29 = l2Var.a().getLong(str2, 0L);
                        if (j29 != 0) {
                            java.util.Iterator it8 = z0Var.f157087s.f156808d.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getDefaultSelectedSubChannelId: cache id is unavailable, return first id, id=" + ((com.tencent.mm.plugin.remittance.model.c1) z0Var.f157087s.f156808d.get(0)).f156800a);
                                    j17 = ((com.tencent.mm.plugin.remittance.model.c1) z0Var.f157087s.f156808d.get(0)).f156800a;
                                    break;
                                }
                                if (((com.tencent.mm.plugin.remittance.model.c1) it8.next()).f156800a == j29) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getDefaultSelectedSubChannelId: cache id is available, return=" + j29);
                                    j17 = j29;
                                    break;
                                }
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getDefaultSelectedSubChannelId: cache id is 0L, return first id, id=" + ((com.tencent.mm.plugin.remittance.model.c1) z0Var.f157087s.f156808d.get(0)).f156800a);
                            j17 = ((com.tencent.mm.plugin.remittance.model.c1) z0Var.f157087s.f156808d.get(0)).f156800a;
                        }
                    } else {
                        java.lang.String str6 = str4;
                        if (((com.tencent.mm.plugin.remittance.model.c1) it7.next()).f156800a == j28) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getDefaultSelectedSubChannelId: default id from server is available return=" + j28);
                            j17 = j28;
                            str = str6;
                            view2 = view;
                            break;
                        }
                        str4 = str6;
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getDefaultSelectedSubChannelId: sub channel list is empty");
                str = "TRANS_SELECTED_SHOP_";
                view2 = view;
                j17 = 0;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f157088t)) {
                l2Var.a().putLong(str + z0Var.f157069a, j17);
            } else {
                l2Var.a().putLong(str + z0Var.f157069a + '_' + z0Var.f157088t, j17);
            }
            com.tencent.mm.plugin.remittance.ui.m2 m2Var = this.f157739h;
            if (m2Var != null) {
                int i28 = z0Var.f157069a;
                java.lang.String str7 = z0Var.f157088t;
                int i29 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.f157336u2;
                com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = ((com.tencent.mm.plugin.remittance.ui.t5) m2Var).f157954a;
                ((java.util.HashMap) remittanceDetailUI.Z1).put(remittanceDetailUI.h7(i28, str7), java.lang.Long.valueOf(j17));
            }
            if (z0Var.f157074f == 1) {
                com.tencent.mm.plugin.remittance.model.d1 d1Var3 = z0Var.f157087s;
                if (((d1Var3 == null || (arrayList = d1Var3.f156808d) == null) ? 0 : arrayList.size()) > 1 && j17 != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "showing sub channel, type: " + z0Var.f157069a + ", defaultSubChannelId: " + j17);
                    if (!this.f157745q) {
                        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj("wxalite5902f97ca32a59d74355fc2e32843e79@pay", new com.tencent.mm.plugin.remittance.ui.y2(this));
                    }
                    int E = E(z0Var, j17);
                    android.widget.LinearLayout linearLayout = viewHolder.f157839r;
                    linearLayout.setVisibility(0);
                    O(viewHolder, z0Var.f157087s.f156805a + ((com.tencent.mm.plugin.remittance.model.c1) z0Var.f157087s.f156808d.get(E)).f156801b);
                    linearLayout.setOnClickListener(new com.tencent.mm.plugin.remittance.ui.t2(z0Var, this, viewHolder));
                }
            }
        } else {
            view2 = view;
        }
        android.widget.TextView textView3 = viewHolder.f157834m;
        textView3.setVisibility(8);
        if (z0Var.f157080l != null) {
            textView3.setVisibility(0);
            r45.xt5 xt5Var = new r45.xt5();
            r45.rl6 rl6Var2 = z0Var.f157080l;
            xt5Var.f390401e = rl6Var2;
            if (rl6Var2.f384987d.size() > 0) {
                r45.hl6 hl6Var = (r45.hl6) z0Var.f157080l.f384987d.get(0);
                xt5Var.f390403g = hl6Var.f376280p;
                if (hl6Var.f376279o != null) {
                    r45.t35 t35Var = new r45.t35();
                    t35Var.f386094d = 1.0f;
                    t35Var.f386096f = 4.0f;
                    t35Var.f386095e = 1.0f;
                    t35Var.f386097g = 4.0f;
                    xt5Var.f390402f = t35Var;
                    xt5Var.f390405i = hl6Var.f376279o;
                } else {
                    r45.cg0 cg0Var2 = new r45.cg0();
                    cg0Var2.f371538d = 0L;
                    cg0Var2.f371539e = 0L;
                    xt5Var.f390405i = cg0Var2;
                }
            }
            com.tencent.mm.plugin.wallet_core.utils.z1.i(textView3, xt5Var);
        }
        l2Var.e(1, z0Var.f157069a, z0Var.f157088t);
        int i37 = z0Var.f157074f;
        android.widget.LinearLayout linearLayout2 = viewHolder.f157831g;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = viewHolder.f157837p;
        android.widget.TextView textView4 = viewHolder.f157838q;
        if (i37 == 1) {
            android.view.View view11 = view2;
            cdnImageView.setAlpha(1.0f);
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
            textView4.setVisibility(8);
            com.tencent.mm.plugin.remittance.ui.a f18 = l2Var.f(this.f157741m, z0Var.f157088t);
            if (z0Var.f157069a == this.f157740i && (f18 == com.tencent.mm.plugin.remittance.ui.a.f157618d || f18 == com.tencent.mm.plugin.remittance.ui.a.f157619e)) {
                weImageView.setVisibility(0);
                weImageView.post(new com.tencent.mm.plugin.remittance.ui.u2(this, viewHolder, viewHolder));
            } else {
                weImageView.setVisibility(8);
                Q(linearLayout2, 0);
            }
            B(viewHolder, z0Var);
            if (!P()) {
                view11.setBackgroundResource(com.tencent.mm.R.drawable.b_s);
            }
            view11.setOnClickListener(new com.tencent.mm.plugin.remittance.ui.v2(this, z0Var));
            return;
        }
        if (i37 != 2) {
            android.view.View view12 = viewHolder.f157828d;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view12, arrayList10.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "unknow type");
            return;
        }
        if (z0Var.f157086r != null) {
            cdnImageView.setAlpha(1.0f);
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        } else {
            cdnImageView.setAlpha(0.3f);
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
        java.lang.String str8 = z0Var.f157077i.f156811a;
        if (str8 == null || str8.length() == 0) {
            r102 = 0;
        } else {
            textView4.setVisibility(0);
            weImageView.setVisibility(8);
            if (textView2.getVisibility() == 0) {
                textView4.setVisibility(8);
            }
            android.graphics.drawable.Drawable drawable = com.tencent.mm.ui.bk.C() ? context.getDrawable(com.tencent.mm.R.drawable.cdx) : context.getDrawable(com.tencent.mm.R.drawable.cdw);
            int q17 = (int) (i65.a.q(context) * 16);
            if (drawable != null) {
                drawable.setBounds(0, 0, com.tencent.mm.ui.zk.a(context, q17), com.tencent.mm.ui.zk.a(context, q17));
            }
            com.tencent.mm.plugin.remittance.ui.k kVar = new com.tencent.mm.plugin.remittance.ui.k(drawable);
            com.tencent.mm.wallet_core.ui.a0 a0Var = new com.tencent.mm.wallet_core.ui.a0(context.getResources().getColor(com.tencent.mm.R.color.FG_2), context.getResources().getColor(com.tencent.mm.R.color.a9e), new com.tencent.mm.plugin.remittance.ui.x2(this, z0Var));
            a0Var.f214107e = false;
            textView4.setClickable(true);
            textView4.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(context));
            java.lang.String str9 = z0Var.f157077i.f156811a + ' ';
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str9);
            spannableStringBuilder.setSpan(kVar, str9.length() - 1, str9.length(), 17);
            r102 = 0;
            spannableStringBuilder.setSpan(a0Var, 0, str9.length(), 18);
            textView4.setText(spannableStringBuilder);
            textView4.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
        android.view.View view13 = view2;
        view13.setOnClickListener(null);
        view13.setClickable(r102);
        boolean P2 = P();
        android.widget.Button button = viewHolder.f157843v;
        if (!P2) {
            view13.setBackgroundResource(com.tencent.mm.R.color.a9e);
            button.setVisibility(8);
            return;
        }
        r45.gq gqVar = z0Var.f157086r;
        if (gqVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "float_button is null");
            button.setVisibility(8);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "show float_button");
        button.setVisibility(r102);
        android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams3).rightMargin = i65.a.b(context, 68);
        button.setText(gqVar.f375466h);
        if (gqVar.f375472q != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "float_button text_color is " + gqVar.f375472q);
            button.setTextColor((int) com.tencent.mm.wallet_core.ui.r1.v(gqVar.f375472q));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "float_button text_color is null, use FG-2");
        }
        r45.cg0 cg0Var3 = gqVar.f375473r;
        long v18 = cg0Var3 != null ? com.tencent.mm.wallet_core.ui.r1.v(cg0Var3) : context.getResources().getColor(com.tencent.mm.R.color.f478491c);
        long color2 = context.getResources().getColor(com.tencent.mm.R.color.f478762gi);
        float b27 = i65.a.b(context, 6);
        button.setBackground(I(b27, b27, v18, color2));
        button.setOnClickListener(new com.tencent.mm.plugin.remittance.ui.w2(this, gqVar));
    }

    public final void L(com.tencent.mm.plugin.remittance.model.z0 accountChannelInfo) {
        kotlin.jvm.internal.o.g(accountChannelInfo, "accountChannelInfo");
        this.f157740i = accountChannelInfo.f157069a;
        java.lang.String bind_serial = accountChannelInfo.f157088t;
        kotlin.jvm.internal.o.f(bind_serial, "bind_serial");
        this.f157741m = bind_serial;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WX_PAY_REMITTANCE_RECV_ACCOUNT_LAST_CHOICE_INT_SYNC, java.lang.Integer.valueOf(accountChannelInfo.f157069a));
        java.lang.String str = accountChannelInfo.f157088t;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WX_PAY_REMITTANCE_RECV_ACCOUNT_LAST_CHOICE_BIND_SERIAL_STRING_SYNC;
        if (str == null) {
            str = "";
        }
        c17.x(u3Var, str);
    }

    public final void M(com.tencent.mm.plugin.remittance.ui.n2 n2Var, com.tencent.mm.plugin.remittance.model.z0 z0Var, r45.rl6 rl6Var, r45.gq gqVar) {
        r45.bz3 bz3Var;
        if (rl6Var != null) {
            n2Var.f157835n.setVisibility(0);
            com.tencent.mm.plugin.wallet_core.utils.z1.k(n2Var.f157835n, rl6Var, new com.tencent.mm.plugin.remittance.ui.a3(this, z0Var), java.lang.Boolean.TRUE);
        }
        if (gqVar == null || gqVar.f375464f != 0 || (bz3Var = gqVar.f375465g) == null) {
            return;
        }
        java.lang.String str = bz3Var.f371172d;
        if (com.tencent.mm.ui.bk.C()) {
            str = gqVar.f375465g.f371177i;
        }
        if (str != null) {
            n2Var.f157836o.setCallback(new com.tencent.mm.plugin.remittance.ui.e3(rl6Var, n2Var, gqVar, this, z0Var));
            n2Var.f157836o.setUrl(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(com.tencent.mm.plugin.remittance.model.w0 r18) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.remittance.ui.h3.N(com.tencent.mm.plugin.remittance.model.w0):void");
    }

    public final void O(com.tencent.mm.plugin.remittance.ui.n2 n2Var, java.lang.String str) {
        int textSize = (int) n2Var.f157840s.getTextSize();
        android.graphics.drawable.Drawable drawable = n2Var.f157841t.getDrawable();
        if (drawable == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "Drawable is null, cannot set bounds");
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(90.0f, drawable.getIntrinsicWidth() / 2.0f, drawable.getIntrinsicHeight() / 2.0f);
        android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(bitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "setSubChannelSelectTextView", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;Ljava/lang/String;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "setSubChannelSelectTextView", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;Ljava/lang/String;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.widget.TextView textView = n2Var.f157840s;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(textView.getResources(), createBitmap);
        bitmapDrawable.setBounds(0, 0, ((int) (textSize * (createBitmap.getWidth() / createBitmap.getHeight()))) / 2, textSize / 2);
        android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(bitmapDrawable, 2);
        android.text.SpannableString spannableString = new android.text.SpannableString(str + "  ");
        spannableString.setSpan(imageSpan, spannableString.length() - 1, spannableString.length(), 17);
        textView.setText(spannableString);
    }

    public final boolean P() {
        com.tencent.mm.plugin.remittance.model.w0 w0Var;
        com.tencent.mm.plugin.remittance.model.g1 g1Var = this.f157746r;
        if (g1Var == null || (w0Var = g1Var.D) == null) {
            return false;
        }
        return !com.tencent.mm.sdk.platformtools.t8.L0(w0Var.f157051e);
    }

    public final void Q(android.widget.LinearLayout linearLayout, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.rightMargin = i17;
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setLayoutParams(layoutParams2);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f157736e;
        kotlin.jvm.internal.o.d(list);
        return list.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489395ce4, viewGroup, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.remittance.ui.n2(inflate);
    }

    public final boolean y(int i17, java.lang.String str) {
        java.lang.String valueOf = com.tencent.mm.sdk.platformtools.t8.K0(str) ? java.lang.String.valueOf(i17) : i17 + '_' + str;
        java.util.Map map = f157734u;
        if (map != null && (!map.isEmpty())) {
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                if (kotlin.jvm.internal.o.b(str2, valueOf)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", valueOf + " is clicked");
                    return true;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", valueOf + " is not clicked");
        return false;
    }

    public final void z(com.tencent.mm.plugin.remittance.model.z0 accountChannelInfo, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(accountChannelInfo, "accountChannelInfo");
        com.tencent.mm.plugin.remittance.ui.l2 l2Var = f157733t;
        int b17 = l2Var.b(accountChannelInfo.f157069a, accountChannelInfo.f157088t);
        if (z17 && b17 < accountChannelInfo.f157084p) {
            if (accountChannelInfo.f157083o != null) {
                l2Var.e(6, accountChannelInfo.f157069a, accountChannelInfo.f157088t);
                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                create.putBinary("route_info", accountChannelInfo.f157083o.initialProtobufBytes());
                h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
                if (qVar != null) {
                    qVar.startUseCase("commonRoute", create, new com.tencent.mm.plugin.remittance.ui.o2(accountChannelInfo));
                }
            } else {
                java.lang.String str2 = accountChannelInfo.f157076h;
                if (!(str2 == null || str2.length() == 0)) {
                    com.tencent.mm.wallet_core.ui.r1.y0(this.f157735d, accountChannelInfo.f157076h, new com.tencent.mm.plugin.remittance.ui.p2(accountChannelInfo));
                }
            }
        }
        int i17 = accountChannelInfo.f157069a;
        java.lang.String str3 = accountChannelInfo.f157088t;
        int i18 = b17 + 1;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str = java.lang.String.valueOf(i17);
        } else {
            str = i17 + '_' + str3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "setRemittanceRecvAccountChooseSetting: " + str + " choosCount: " + i18);
        l2Var.a().putInt(str, i18);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        com.tencent.mm.plugin.remittance.model.z0 z0Var;
        com.tencent.mm.plugin.remittance.ui.n2 viewHolder = (com.tencent.mm.plugin.remittance.ui.n2) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(viewHolder, i17);
            return;
        }
        java.util.List list = this.f157736e;
        if (list == null || i17 < 0 || i17 >= ((java.util.ArrayList) list).size()) {
            return;
        }
        if (P()) {
            z0Var = J(i17);
            if (z0Var == null) {
                return;
            }
        } else {
            java.util.List list2 = this.f157736e;
            kotlin.jvm.internal.o.d(list2);
            z0Var = (com.tencent.mm.plugin.remittance.model.z0) ((java.util.ArrayList) list2).get(i17);
        }
        if (z0Var.f157074f == 1) {
            com.tencent.mm.plugin.remittance.ui.a f17 = f157733t.f(this.f157741m, z0Var.f157088t);
            int i18 = z0Var.f157069a;
            int i19 = this.f157740i;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = viewHolder.f157837p;
            if (i18 == i19 && (f17 == com.tencent.mm.plugin.remittance.ui.a.f157618d || f17 == com.tencent.mm.plugin.remittance.ui.a.f157619e)) {
                weImageView.setVisibility(0);
                weImageView.post(new com.tencent.mm.plugin.remittance.ui.q2(this, viewHolder));
            } else {
                weImageView.setVisibility(8);
                Q(viewHolder.f157831g, 0);
            }
        }
        if (z0Var.f157079k != null && y(z0Var.f157069a, z0Var.f157088t) && z0Var.f157079k.f157062c != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "used data, channel type is " + z0Var.f157069a);
            com.tencent.mm.plugin.remittance.model.x0 x0Var = z0Var.f157079k;
            M(viewHolder, z0Var, x0Var.f157062c, x0Var.f157063d);
        }
        B(viewHolder, z0Var);
    }
}
