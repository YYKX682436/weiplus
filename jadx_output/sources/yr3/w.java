package yr3;

/* loaded from: classes11.dex */
public final class w {

    /* renamed from: a */
    public static final yr3.w f465059a = new yr3.w();

    /* renamed from: b */
    public static java.lang.ref.WeakReference f465060b;

    public static final void a(yr3.w wVar, android.content.Context context, r45.s5 s5Var, r45.o5 o5Var, wr3.n0 n0Var, int i17, sr3.a aVar) {
        wVar.getClass();
        com.tencent.mars.xlog.Log.i("FeatureMsgUtil", "item click jump to creator");
        ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Ni(new yr3.p(aVar, s5Var, o5Var, n0Var, i17, context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a0  */
    /* JADX WARN: Type inference failed for: r4v13, types: [android.content.Intent] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(yr3.w r36, android.content.Context r37, r45.s5 r38, r45.o5 r39, r45.l5 r40, int r41, wr3.n0 r42, boolean r43, int r44, boolean r45, java.lang.String r46, long r47, sr3.a r49) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr3.w.b(yr3.w, android.content.Context, r45.s5, r45.o5, r45.l5, int, wr3.n0, boolean, int, boolean, java.lang.String, long, sr3.a):void");
    }

    public static final void c(yr3.w wVar, android.content.Context context, r45.s5 s5Var, r45.o5 o5Var, wr3.n0 n0Var, int i17, java.lang.String str, sr3.a aVar) {
        r45.y5 y5Var;
        r45.y5 y5Var2;
        r45.p5 p5Var;
        r45.l5 l5Var;
        wVar.getClass();
        com.tencent.mars.xlog.Log.i("FeatureMsgUtil", "item click jump to tmp link");
        com.tencent.mm.plugin.profile.ui.tab.s sVar = (com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class);
        int i18 = (s5Var == null || (p5Var = s5Var.f385514i) == null || (l5Var = p5Var.f382753d) == null) ? 0 : l5Var.f379138d;
        int i19 = o5Var.f381916g;
        yr3.q qVar = new yr3.q(str, o5Var, context);
        sVar.getClass();
        sVar.Ai().e(i18, i19, new com.tencent.mm.plugin.profile.ui.tab.m(qVar));
        gr3.b bVar = gr3.b.f274847a;
        java.lang.Long valueOf = (s5Var == null || (y5Var2 = s5Var.f385509d) == null) ? null : java.lang.Long.valueOf(y5Var2.f390790d);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(o5Var.f381916g);
        long a17 = bVar.a(n0Var);
        sr3.a aVar2 = sr3.a.f411829e;
        bVar.b(valueOf, valueOf2, 106L, a17, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, i17, (r29 & 128) != 0 ? 0 : aVar == aVar2 ? 0 : 5, (r29 & 256) != 0 ? 0 : 0);
        bVar.b((s5Var == null || (y5Var = s5Var.f385509d) == null) ? null : java.lang.Long.valueOf(y5Var.f390790d), java.lang.Long.valueOf(o5Var.f381916g), 102L, bVar.a(n0Var), (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, i17, (r29 & 128) != 0 ? 0 : aVar == aVar2 ? 0 : 5, (r29 & 256) != 0 ? 0 : 0);
    }

    public final o11.g d() {
        o11.f fVar = new o11.f();
        fVar.f342093q = com.tencent.mm.R.drawable.f481001hk;
        fVar.f342091o = com.tencent.mm.R.drawable.f481001hk;
        fVar.f342077a = true;
        fVar.f342078b = true;
        fVar.f342079c = true;
        return fVar.a();
    }

    public final java.lang.String e(int i17, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (i17 > 1000000) {
            return "";
        }
        if (i17 < 60) {
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.ngh);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            return format;
        }
        if (i17 < 3600) {
            java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.ngg);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 60)}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            return format2;
        }
        int i18 = i17 / 3600;
        int i19 = (i17 % 3600) / 60;
        if (i19 == 0) {
            java.lang.String string3 = context.getResources().getString(com.tencent.mm.R.string.nge);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String format3 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i18)}, 1));
            kotlin.jvm.internal.o.f(format3, "format(...)");
            return format3;
        }
        java.lang.String string4 = context.getResources().getString(com.tencent.mm.R.string.ngf);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        java.lang.String format4 = java.lang.String.format(string4, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)}, 2));
        kotlin.jvm.internal.o.f(format4, "format(...)");
        return format4;
    }

    public final void f(wr3.n0 itemStatus, int i17, int i18, java.lang.Integer num) {
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher;
        r45.gl glVar;
        r45.gl glVar2;
        r45.gl glVar3;
        r45.gl glVar4;
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher2;
        kotlin.jvm.internal.o.g(itemStatus, "itemStatus");
        int ordinal = itemStatus.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).wi(i17);
                java.lang.ref.WeakReference weakReference = f465060b;
                if (weakReference == null || (bizProfileDataFetcher2 = (com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher) weakReference.get()) == null) {
                    return;
                }
                bizProfileDataFetcher2.j();
                return;
            }
            if (ordinal != 4) {
                com.tencent.mars.xlog.Log.w("FeatureMsgUtil", "handleDeleteAfterMatch: unknown itemStatus " + itemStatus);
                return;
            }
        }
        java.lang.ref.WeakReference weakReference2 = f465060b;
        if (weakReference2 != null && (bizProfileDataFetcher = (com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher) weakReference2.get()) != null) {
            if (i17 == 0 || i18 == -1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BizProfileDataFetcher", "updateBizProfileInfo " + i17 + ", " + i18);
            } else {
                r45.wl c17 = bizProfileDataFetcher.c((r45.wl) bizProfileDataFetcher.f154282m.getValue());
                if (c17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BizProfileDataFetcher", "updateBizProfileMsgWithDeleteData: profileInit is null");
                } else {
                    r45.tj6 tj6Var = c17.D;
                    boolean k17 = com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher.k(bizProfileDataFetcher, i17, i18, (tj6Var == null || (glVar4 = tj6Var.f386509e) == null) ? null : glVar4.f375323d, "PicTab.MsgList");
                    r45.tj6 tj6Var2 = c17.D;
                    if (com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher.k(bizProfileDataFetcher, i17, i18, (tj6Var2 == null || (glVar3 = tj6Var2.f386509e) == null) ? null : glVar3.f375327h, "PicTab.MsgList.FeaturedList")) {
                        k17 = true;
                    }
                    r45.tj6 tj6Var3 = c17.C;
                    if (com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher.k(bizProfileDataFetcher, i17, i18, (tj6Var3 == null || (glVar2 = tj6Var3.f386509e) == null) ? null : glVar2.f375323d, "AppmsgTab.MsgList")) {
                        k17 = true;
                    }
                    r45.tj6 tj6Var4 = c17.E;
                    if (com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher.k(bizProfileDataFetcher, i17, i18, (tj6Var4 == null || (glVar = tj6Var4.f386509e) == null) ? null : glVar.f375323d, "AudioTab.MsgList")) {
                        k17 = true;
                    }
                    r45.gl glVar5 = c17.f389235f;
                    if (com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher.k(bizProfileDataFetcher, i17, i18, glVar5 != null ? glVar5.f375323d : null, "MsgList")) {
                        k17 = true;
                    }
                    r45.gl glVar6 = c17.f389235f;
                    if (com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher.k(bizProfileDataFetcher, i17, i18, glVar6 != null ? glVar6.f375327h : null, "MsgList.FeaturedList")) {
                        k17 = true;
                    }
                    if (k17) {
                        try {
                            qr3.c0.c(c17);
                            com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileDataFetcher", "updateBizProfileMsgWithDeleteData: saved profileInit after deleting msg " + i17);
                        } catch (java.io.IOException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BizProfileDataFetcher", "updateBizProfileMsgWithDeleteData: failed to save profileInit: " + e17, e17);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileDataFetcher", "updateBizProfileMsgWithDeleteData: no changes found for msg " + i17);
                    }
                    bizProfileDataFetcher.f154289t.setValue(new vr3.f(i17, i18));
                }
            }
        }
        if (num != null && num.intValue() == 1) {
            ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).wi(i17);
        }
    }

    public final void g(android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.dy9);
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.rki);
        if (i17 == 0) {
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 != 1) {
            if (findViewById != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (findViewById != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById2 == null) {
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.content.Context r27, wr3.i r28, r45.s5 r29, android.view.View r30, android.view.View r31, android.view.View r32, android.widget.TextView r33, android.view.View r34, yz5.l r35) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr3.w.h(android.content.Context, wr3.i, r45.s5, android.view.View, android.view.View, android.view.View, android.widget.TextView, android.view.View, yz5.l):void");
    }

    public final void i(android.content.Context mContext, android.widget.TextView timeStampTv, android.widget.ImageView failedIconTv, r45.s5 bizMessage, wr3.n0 itemStatus, android.view.View headerArea) {
        java.lang.String format;
        java.util.LinkedList linkedList;
        r45.o5 o5Var;
        java.util.LinkedList linkedList2;
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(timeStampTv, "timeStampTv");
        kotlin.jvm.internal.o.g(failedIconTv, "failedIconTv");
        kotlin.jvm.internal.o.g(bizMessage, "bizMessage");
        kotlin.jvm.internal.o.g(itemStatus, "itemStatus");
        kotlin.jvm.internal.o.g(headerArea, "headerArea");
        int i17 = bizMessage.f385516n;
        yr3.o0[] o0VarArr = yr3.o0.f464965d;
        if (i17 != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(headerArea, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initHeaderTimeStamp", "(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/ImageView;Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            headerArea.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(headerArea, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initHeaderTimeStamp", "(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/ImageView;Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(headerArea, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initHeaderTimeStamp", "(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/ImageView;Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            headerArea.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(headerArea, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initHeaderTimeStamp", "(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/ImageView;Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String str = "";
        if (bizMessage.f385516n == 2) {
            com.tencent.mars.xlog.Log.i("FeatureMsgUtil", "author featured tips displayed");
            tr3.b bVar = new tr3.b();
            bVar.f421430a = 1902;
            bVar.f421431b = true;
            r45.p5 p5Var = bizMessage.f385514i;
            if (((p5Var == null || (linkedList2 = p5Var.f382754e) == null) ? -1 : linkedList2.size()) > 0) {
                r45.p5 p5Var2 = bizMessage.f385514i;
                java.lang.String str2 = (p5Var2 == null || (linkedList = p5Var2.f382754e) == null || (o5Var = (r45.o5) linkedList.get(0)) == null) ? null : o5Var.f381917h;
                if (str2 != null) {
                    str = str2;
                }
            }
            bVar.f421432c = str;
            tr3.a aVar = tr3.a.f421426a;
            java.util.Map map = tr3.a.f421428c;
            ((java.util.HashMap) map).remove(1901);
            if (((java.util.HashMap) map).containsKey(1903)) {
                return;
            }
            aVar.a(bVar);
            return;
        }
        timeStampTv.setTextColor(mContext.getResources().getColor(com.tencent.mm.R.color.FG_2));
        if (itemStatus == wr3.n0.f448844h) {
            failedIconTv.setVisibility(8);
            timeStampTv.setText(mContext.getResources().getString(com.tencent.mm.R.string.nat));
            return;
        }
        if (itemStatus == wr3.n0.f448843g) {
            failedIconTv.setVisibility(0);
            timeStampTv.setText(mContext.getResources().getString(com.tencent.mm.R.string.nas));
            return;
        }
        failedIconTv.setVisibility(8);
        yr3.n0 n0Var = yr3.n0.f464954a;
        long j17 = bizMessage.f385509d.f390792f * 1000;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        if (j17 >= 3600000) {
            java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            gregorianCalendar3.setTimeInMillis(j17);
            long timeInMillis = j17 - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis <= 0 || timeInMillis > 86400000) {
                long j18 = timeInMillis + 86400000;
                if (j18 <= 0 || j18 > 86400000) {
                    long j19 = timeInMillis + 604800000;
                    if (j19 <= 0 || j19 > 604800000) {
                        boolean j27 = com.tencent.mm.sdk.platformtools.m2.j();
                        if (gregorianCalendar2.get(1) == gregorianCalendar3.get(1)) {
                            if (j27) {
                                format = k35.m1.d(mContext.getString(com.tencent.mm.R.string.f492135fc2), j17 / 1000);
                                kotlin.jvm.internal.o.d(format);
                            } else {
                                format = java.lang.String.format("%s %d", java.util.Arrays.copyOf(new java.lang.Object[]{n0Var.a(gregorianCalendar3.get(2)), java.lang.Integer.valueOf(gregorianCalendar3.get(5))}, 2));
                                kotlin.jvm.internal.o.f(format, "format(...)");
                            }
                        } else if (j27) {
                            format = k35.m1.d(mContext.getString(com.tencent.mm.R.string.fcl), j17 / 1000);
                            kotlin.jvm.internal.o.d(format);
                        } else {
                            format = java.lang.String.format("%s %d, %d", java.util.Arrays.copyOf(new java.lang.Object[]{n0Var.a(gregorianCalendar3.get(2)), java.lang.Integer.valueOf(gregorianCalendar3.get(5)), java.lang.Integer.valueOf(gregorianCalendar3.get(1))}, 3));
                            kotlin.jvm.internal.o.f(format, "format(...)");
                        }
                        str = format;
                    } else {
                        int i18 = gregorianCalendar3.get(7) - 1;
                        int i19 = (i18 != 0 ? i18 : 7) - 1;
                        str = mContext.getString(i19 != 0 ? i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? i19 != 5 ? com.tencent.mm.R.string.jya : com.tencent.mm.R.string.jy9 : com.tencent.mm.R.string.jxz : com.tencent.mm.R.string.jyb : com.tencent.mm.R.string.jye : com.tencent.mm.R.string.jyd : com.tencent.mm.R.string.jy6);
                        kotlin.jvm.internal.o.f(str, "getString(...)");
                    }
                } else {
                    str = mContext.getString(com.tencent.mm.R.string.fdi);
                    kotlin.jvm.internal.o.f(str, "getString(...)");
                }
            } else {
                str = mContext.getString(com.tencent.mm.R.string.fd_);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
        }
        timeStampTv.setText(str);
    }

    public final void j(android.content.Context mContext, wr3.i adapter, android.view.View itemView, r45.s5 s5Var, r45.o5 detail, r45.l5 base, int i17, wr3.n0 itemStatus, boolean z17, int i18, sr3.a accountType, boolean z18) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(detail, "detail");
        kotlin.jvm.internal.o.g(base, "base");
        kotlin.jvm.internal.o.g(itemStatus, "itemStatus");
        kotlin.jvm.internal.o.g(accountType, "accountType");
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.f94451a.e(detail.f381917h, detail.f381923p);
        itemView.setOnClickListener(new yr3.s(detail, itemStatus, mContext, s5Var, base, i17, z17, i18, adapter, accountType));
        itemView.setTag(new yr3.f(s5Var, detail, itemStatus, accountType, z18));
        itemView.setOnLongClickListener(adapter.I(mContext));
    }

    public final void l(r45.s5 bizMessage, java.lang.String userName) {
        r45.p5 p5Var;
        java.util.LinkedList linkedList;
        java.lang.String str;
        kotlin.jvm.internal.o.g(bizMessage, "bizMessage");
        kotlin.jvm.internal.o.g(userName, "userName");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(16)) {
            zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
            java.util.LinkedList<r45.o5> DetailInfo = bizMessage.f385514i.f382754e;
            kotlin.jvm.internal.o.f(DetailInfo, "DetailInfo");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(DetailInfo, 10));
            for (r45.o5 o5Var : DetailInfo) {
                arrayList.add(kz5.c0.i(o5Var.f381917h, java.lang.String.valueOf(o5Var.f381923p), userName));
            }
            ((yq1.z) a0Var).v(arrayList, 126);
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_biz_brand_cover_image_preload_enable_android, false) || (p5Var = bizMessage.f385514i) == null || (linkedList = p5Var.f382754e) == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                java.lang.String str2 = null;
                if (!it.hasNext()) {
                    break;
                }
                r45.n5 n5Var = ((r45.o5) it.next()).f381935x1;
                if (n5Var != null && (str = n5Var.f381079d) != null) {
                    if (str.length() > 0) {
                        str2 = str;
                    }
                }
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            if (!(!arrayList2.isEmpty())) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                com.tencent.mars.xlog.Log.i("FeatureMsgUtil", "preloadPics size=" + arrayList2.size());
                if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_biz_timeline_enable_pic_preload_android, false)) {
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2.f94203a.c(arrayList2, 126);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2110L, 1L, 1L, false);
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94249a.d(arrayList2, 2);
                }
            }
        }
    }
}
