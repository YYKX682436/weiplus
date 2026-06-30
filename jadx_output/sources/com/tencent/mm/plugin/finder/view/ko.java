package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class ko {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.ko f132520a = new com.tencent.mm.plugin.finder.view.ko();

    /* renamed from: b, reason: collision with root package name */
    public static int f132521b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static int f132522c = 1;

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01b2, code lost:
    
        if (r58 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01b7, code lost:
    
        if (r56 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x01ae, code lost:
    
        if (r9 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x01b9, code lost:
    
        r59 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x047b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0610  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.tencent.mm.plugin.finder.view.ko r76, android.view.View r77, android.os.Bundle r78, boolean r79, yz5.l r80) {
        /*
            Method dump skipped, instructions count: 1963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.ko.a(com.tencent.mm.plugin.finder.view.ko, android.view.View, android.os.Bundle, boolean, yz5.l):void");
    }

    public void b(zy2.dc contact, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(intent, "intent");
        ya2.b2 b2Var = (ya2.b2) contact;
        intent.putExtra("Username", b2Var.D0());
        intent.putExtra("Avatar", b2Var.getAvatarUrl());
        intent.putExtra("Nickname", b2Var.z0());
        r45.hz0 hz0Var = b2Var.field_extInfo;
        intent.putExtra("Sex", hz0Var != null ? hz0Var.getInteger(3) : 0);
        intent.putExtra("contactId", b2Var.systemRowid);
        r45.hz0 hz0Var2 = b2Var.field_extInfo;
        java.lang.String string = hz0Var2 != null ? hz0Var2.getString(1) : null;
        if (string == null) {
            string = "";
        }
        intent.putExtra("Province", string);
        r45.hz0 hz0Var3 = b2Var.field_extInfo;
        java.lang.String string2 = hz0Var3 != null ? hz0Var3.getString(2) : null;
        if (string2 == null) {
            string2 = "";
        }
        intent.putExtra("City", string2);
        r45.hz0 hz0Var4 = b2Var.field_extInfo;
        if (hz0Var4 == null) {
            hz0Var4 = new r45.hz0();
        }
        java.lang.String string3 = hz0Var4.getString(0);
        intent.putExtra("Country", string3 != null ? string3 : "");
        intent.putExtra("Signature", b2Var.A0());
    }

    public final int c(int i17) {
        switch (i17) {
            case 0:
            default:
                return 0;
            case 1:
                return 7;
            case 2:
                return 4;
            case 3:
                return 3;
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
            case 10:
            case 11:
            case 12:
                return 11;
            case 13:
            case 14:
            case 15:
                return 12;
            case 21:
                return 14;
        }
    }

    public final void d(android.content.Context context, int i17, boolean z17, long j17) {
        r45.qt2 qt2Var;
        java.lang.String Ri;
        java.lang.String str;
        java.lang.String string;
        if (context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) {
            androidx.appcompat.app.AppCompatActivity activity = (androidx.appcompat.app.AppCompatActivity) context;
            kotlin.jvm.internal.o.g(activity, "activity");
            qt2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        } else {
            qt2Var = null;
        }
        com.tencent.mm.autogen.mmdata.rpt.finder_page_exposeStruct finder_page_exposestruct = new com.tencent.mm.autogen.mmdata.rpt.finder_page_exposeStruct();
        if (qt2Var == null || (Ri = qt2Var.getString(0)) == null) {
            Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        }
        finder_page_exposestruct.f63106d = finder_page_exposestruct.b("sessionid", Ri, true);
        java.lang.String str2 = "";
        if (qt2Var == null || (str = qt2Var.getString(1)) == null) {
            str = "";
        }
        finder_page_exposestruct.f63107e = finder_page_exposestruct.b("findercontextid", str, true);
        if (qt2Var != null && (string = qt2Var.getString(2)) != null) {
            str2 = string;
        }
        finder_page_exposestruct.f63113k = finder_page_exposestruct.b("clicktabcontextid", str2, true);
        finder_page_exposestruct.f63114l = finder_page_exposestruct.b("ref_commentscene", java.lang.String.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0), true);
        finder_page_exposestruct.f63108f = finder_page_exposestruct.b("commentscene", "97", true);
        finder_page_exposestruct.f63112j = finder_page_exposestruct.b("udf_kv", "{\"scene\":" + i17 + '}', true);
        finder_page_exposestruct.f63109g = !z17 ? 1 : 0;
        finder_page_exposestruct.f63110h = finder_page_exposestruct.b("event_time", java.lang.String.valueOf(c01.id.c()), true);
        finder_page_exposestruct.f63115m = j17;
        finder_page_exposestruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finder_page_exposestruct);
    }

    public final void e(java.lang.String field_username, android.os.Bundle bundle) {
        if (field_username == null || field_username.length() == 0) {
            com.tencent.mars.xlog.Log.e("Finder.FinderWxProfileHelper", "[saveMsgStrangerContact] msgUsername is null");
            return;
        }
        ya2.b2 b2Var = new ya2.b2();
        java.lang.String string = bundle.getString("Username", "");
        kotlin.jvm.internal.o.f(string, "getString(...)");
        b2Var.field_username = string;
        java.lang.String string2 = bundle.getString("Nickname", "");
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        b2Var.field_nickname = string2;
        int i17 = bundle.getInt("Sex", 0);
        r45.hz0 hz0Var = b2Var.field_extInfo;
        if (hz0Var == null) {
            hz0Var = new r45.hz0();
        }
        hz0Var.set(3, java.lang.Integer.valueOf(i17));
        b2Var.field_extInfo = hz0Var;
        java.lang.String string3 = bundle.getString("Signature", "");
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        b2Var.field_signature = string3;
        java.lang.String string4 = bundle.getString("Province", "");
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        r45.hz0 hz0Var2 = b2Var.field_extInfo;
        if (hz0Var2 == null) {
            hz0Var2 = new r45.hz0();
        }
        hz0Var2.set(1, string4);
        b2Var.field_extInfo = hz0Var2;
        java.lang.String string5 = bundle.getString("City", "");
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        r45.hz0 hz0Var3 = b2Var.field_extInfo;
        if (hz0Var3 == null) {
            hz0Var3 = new r45.hz0();
        }
        hz0Var3.set(2, string5);
        b2Var.field_extInfo = hz0Var3;
        java.lang.String string6 = bundle.getString("Avatar", "");
        kotlin.jvm.internal.o.f(string6, "getString(...)");
        b2Var.field_avatarUrl = string6;
        java.lang.String string7 = bundle.getString("Country", "");
        kotlin.jvm.internal.o.f(string7, "getString(...)");
        r45.hz0 hz0Var4 = b2Var.field_extInfo;
        if (hz0Var4 == null) {
            hz0Var4 = new r45.hz0();
        }
        hz0Var4.set(0, string7);
        b2Var.field_extInfo = hz0Var4;
        kotlin.jvm.internal.o.g(field_username, "field_username");
        b2Var.field_username = field_username;
        boolean z17 = b2Var.getAvatarUrl().length() == 0;
        if (z17) {
            com.tencent.mars.xlog.Log.w("Finder.FinderWxProfileHelper", "nickname=" + b2Var.w0() + " avatarUrl is null. username=" + b2Var.D0());
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).ik().J0(b2Var, !z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0921  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.finder.view.e3 f(android.content.Context r54, android.content.Intent r55, int r56, yz5.l r57) {
        /*
            Method dump skipped, instructions count: 2431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.ko.f(android.content.Context, android.content.Intent, int, yz5.l):com.tencent.mm.plugin.finder.view.e3");
    }

    public void g(android.content.Context context, android.content.Intent intent, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        f(context, intent, i17, new com.tencent.mm.plugin.finder.view.mn(context));
    }

    public final void h(android.view.View view) {
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.szm);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.qht);
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.car);
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.cfi);
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.f483871sy0);
        if (!(findViewById2 != null && findViewById2.getVisibility() == 0)) {
            if (!(findViewById3 != null && findViewById3.getVisibility() == 0)) {
                if (!(findViewById4 != null && findViewById4.getVisibility() == 0)) {
                    if (!(findViewById5 != null && findViewById5.getVisibility() == 0)) {
                        if (findViewById == null) {
                            return;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateLines", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateLines", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                }
            }
        }
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateLines", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateLines", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.view.View r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.ko.i(android.view.View, android.os.Bundle):void");
    }

    public final void j(android.view.View view, android.os.Bundle bundle) {
        r45.nw6 nw6Var;
        com.tencent.mm.plugin.finder.view.ko koVar;
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        char c17;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Integer num;
        int i18;
        int i19;
        com.tencent.mm.plugin.finder.view.FinderHalfContactItem finderHalfContactItem;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        r45.u13 u13Var;
        java.util.LinkedList list;
        r45.so2 so2Var;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.caq);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f485925jk2);
        com.tencent.mm.plugin.finder.view.FinderHalfContactFinderItem finderHalfContactFinderItem = (com.tencent.mm.plugin.finder.view.FinderHalfContactFinderItem) view.findViewById(com.tencent.mm.R.id.car);
        com.tencent.mm.plugin.finder.view.FinderHalfContactItem finderHalfContactItem2 = (com.tencent.mm.plugin.finder.view.FinderHalfContactItem) view.findViewById(com.tencent.mm.R.id.cfi);
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.szg);
        android.content.Context context = view.getContext();
        java.lang.String string = context.getString(com.tencent.mm.R.string.f8e);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        finderHalfContactFinderItem.setTitle(string);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.f19);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        finderHalfContactItem2.setTitle(string2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String string3 = bundle != null ? bundle.getString("UserPreviewInfo", "") : null;
        if (string3 == null) {
            string3 = "";
        }
        if (string3.length() > 0) {
            r45.nw6 nw6Var2 = new r45.nw6();
            byte[] c18 = ot5.e.c(string3);
            if (c18 != null) {
                try {
                    nw6Var2.parseFrom(c18);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
                nw6Var = nw6Var2;
            }
            nw6Var2 = null;
            nw6Var = nw6Var2;
        } else {
            nw6Var = null;
        }
        java.lang.String string4 = bundle != null ? bundle.getString("V5UserName", "") : null;
        java.lang.String str8 = string4 == null ? "" : string4;
        java.lang.String string5 = bundle != null ? bundle.getString("Nickname", "") : null;
        java.lang.String str9 = string5 == null ? "" : string5;
        if (bundle != null) {
            i17 = bundle.getInt("FromScene_WXPROFILE", 0);
            koVar = this;
        } else {
            koVar = this;
            i17 = 0;
        }
        int c19 = koVar.c(i17);
        int i27 = bundle != null ? bundle.getInt("key_entrance_type", -1) : -1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (nw6Var == null || (so2Var = (r45.so2) nw6Var.getCustom(8)) == null || (str = so2Var.getString(3)) == null) {
            str = "";
        }
        if (nw6Var == null || (u13Var = (r45.u13) nw6Var.getCustom(5)) == null || (list = u13Var.getList(0)) == null) {
            str2 = str9;
            str3 = "";
        } else {
            str2 = str9;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (java.util.Iterator it = list.iterator(); it.hasNext(); it = it) {
                arrayList2.add(java.lang.String.valueOf(((r45.a04) it.next()).getInteger(0)));
            }
            str3 = kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null);
        }
        jz5.l[] lVarArr = new jz5.l[9];
        if (V6 != null) {
            str4 = str8;
            str5 = V6.getString(0);
        } else {
            str4 = str8;
            str5 = null;
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", str5);
        if (V6 != null) {
            c17 = 1;
            str6 = V6.getString(1);
        } else {
            c17 = 1;
            str6 = null;
        }
        lVarArr[c17] = new jz5.l("finder_context_id", str6);
        lVarArr[2] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr[3] = new jz5.l("half_screen_source", java.lang.Integer.valueOf(i17));
        if (nw6Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) nw6Var.getCustom(0)) == null || (str7 = finderContact2.getUsername()) == null) {
            str7 = "";
        }
        lVarArr[4] = new jz5.l("author_finder_username", str7);
        lVarArr[5] = new jz5.l("poiid", str);
        lVarArr[6] = new jz5.l("module_report", str3);
        lVarArr[7] = new jz5.l("auth_type", java.lang.Integer.valueOf((nw6Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) nw6Var.getCustom(0)) == null || (authInfo = finderContact.getAuthInfo()) == null) ? 0 : authInfo.getAuthIconType()));
        lVarArr[8] = new jz5.l("comment_scene", 97);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, "wx_personal_card_half_screen");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 32, 25496);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view, k17);
        if (nw6Var != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mlu);
            if (textView != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(textView, "wx_personal_card_letter_cell");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(textView, 40, 25496);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(textView, k17);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            int i28 = i27;
            int i29 = i17;
            java.lang.String str10 = str2;
            java.lang.String str11 = str4;
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = "";
            if (((com.tencent.mm.protocal.protobuf.FinderContact) nw6Var.getCustom(0)) == null) {
                finderHalfContactFinderItem.setVisibility(8);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                num = 0;
                i19 = 3;
                i18 = 1;
            } else {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(finderHalfContactFinderItem, "wx_personal_card_finder_cell");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(finderHalfContactFinderItem, 40, 25496);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(finderHalfContactFinderItem, k17);
                finderHalfContactFinderItem.setVisibility(0);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                num = 0;
                arrayList5.add(null);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i18 = 1;
                if (nw6Var.getInteger(1) == 0) {
                    finderHalfContactFinderItem.b(nw6Var);
                } else {
                    finderHalfContactFinderItem.b(null);
                }
                com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) nw6Var.getCustom(0);
                java.lang.String username = finderContact3 != null ? finderContact3.getUsername() : null;
                if (username == null) {
                    username = "";
                }
                h0Var.f310123d = username;
                i19 = 3;
            }
            if (nw6Var.getInteger(i19) == i18) {
                finderHalfContactItem = finderHalfContactItem2;
                finderHalfContactItem.setVisibility(0);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(num);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (finderHalfContactFinderItem.getVisibility() == 0) {
                    finderHalfContactItem.f131125f = null;
                    finderHalfContactItem.b();
                } else {
                    r45.qw6 qw6Var = new r45.qw6();
                    java.util.LinkedList list2 = qw6Var.getList(i18);
                    r45.d71 d71Var = (r45.d71) nw6Var.getCustom(4);
                    java.util.List list3 = d71Var != null ? d71Var.getList(i18) : null;
                    if (list3 == null) {
                        list3 = kz5.p0.f313996d;
                    }
                    list2.addAll(list3);
                    finderHalfContactItem.f131125f = qw6Var;
                    finderHalfContactItem.b();
                }
            } else {
                finderHalfContactItem = finderHalfContactItem2;
                finderHalfContactItem.setVisibility(8);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById3, arrayList7.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            finderHalfContactFinderItem.setOnClickListener(new com.tencent.mm.plugin.finder.view.ho(h0Var, i28, i29, nw6Var, c19, context));
            finderHalfContactItem.setOnClickListener(new com.tencent.mm.plugin.finder.view.io(str11, context, str10));
        }
    }

    public final void k(android.view.View view, android.os.Bundle bundle, yz5.l lVar) {
        int i17;
        int i18;
        java.lang.String str;
        int i19;
        java.lang.CharSequence charSequence;
        cq.k1.a();
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.k1().r()).booleanValue()) {
            com.tencent.mm.plugin.finder.view.FinderHalfContactHeartLikePermissionItem finderHalfContactHeartLikePermissionItem = (com.tencent.mm.plugin.finder.view.FinderHalfContactHeartLikePermissionItem) view.findViewById(com.tencent.mm.R.id.f483871sy0);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.u2_);
            java.lang.Boolean valueOf = bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("showLikePrivacy", false)) : null;
            java.lang.Boolean valueOf2 = bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("IsSelf", false)) : null;
            long j17 = bundle != null ? bundle.getLong("FeedId", 0L) : 0L;
            java.lang.String string = bundle != null ? bundle.getString("WxUserName", "") : null;
            int i27 = bundle != null ? bundle.getInt("isShieldHisLike", 0) : 0;
            int i28 = bundle != null ? bundle.getInt("isShieldMyLike", 0) : 0;
            if (finderHalfContactHeartLikePermissionItem != null) {
                jz5.l[] lVarArr = new jz5.l[2];
                lVarArr[0] = new jz5.l("thx_to_uin", string == null ? "" : string);
                lVarArr[1] = new jz5.l("feed_id", pm0.v.u(j17));
                i17 = i28;
                i18 = i27;
                str = "";
                hc2.v0.e(finderHalfContactHeartLikePermissionItem, "friend_like_privilege_entry_button", 40, 0, false, false, kz5.c1.k(lVarArr), null, 92, null);
            } else {
                i17 = i28;
                i18 = i27;
                str = "";
            }
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (kotlin.jvm.internal.o.b(valueOf2, bool) || (((i19 = i18) == 0 && i17 == 0) || !kotlin.jvm.internal.o.b(valueOf, bool))) {
                if (finderHalfContactHeartLikePermissionItem != null) {
                    finderHalfContactHeartLikePermissionItem.setVisibility(8);
                }
                if (findViewById == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderHeartLikePermission", "(Landroid/view/View;Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderHeartLikePermission", "(Landroid/view/View;Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (finderHalfContactHeartLikePermissionItem != null) {
                finderHalfContactHeartLikePermissionItem.setVisibility(0);
            }
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderHeartLikePermission", "(Landroid/view/View;Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi", "updateWxProfileFinderHeartLikePermission", "(Landroid/view/View;Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.String str2 = str;
            java.lang.String string2 = bundle.getString("Username", str2);
            java.lang.String str3 = string2 == null ? str2 : string2;
            java.lang.String string3 = bundle.getString("SessionId", str2);
            int i29 = bundle.getInt("isNotRec", 0);
            int i37 = bundle.getInt("isBlackList", 0);
            int i38 = bundle.getInt("FromScene_WXPROFILE", 0);
            if (finderHalfContactHeartLikePermissionItem != null) {
                boolean z17 = i19 == 1;
                boolean z18 = i17 == 1;
                android.widget.TextView textView = finderHalfContactHeartLikePermissionItem.f131122f;
                if (textView != null) {
                    if (z17 && z18) {
                        java.lang.String string4 = finderHalfContactHeartLikePermissionItem.getContext().getString(com.tencent.mm.R.string.f492911og5);
                        kotlin.jvm.internal.o.f(string4, "getString(...)");
                        int K = r26.n0.K(string4, '#', 0, false, 6, null);
                        charSequence = finderHalfContactHeartLikePermissionItem.c(finderHalfContactHeartLikePermissionItem.c(string4, K), r26.n0.K(string4, '#', K + 1, false, 4, null));
                    } else if (z17) {
                        java.lang.String string5 = finderHalfContactHeartLikePermissionItem.getContext().getString(com.tencent.mm.R.string.og7);
                        kotlin.jvm.internal.o.f(string5, "getString(...)");
                        charSequence = finderHalfContactHeartLikePermissionItem.b(string5);
                    } else if (z18) {
                        java.lang.String string6 = finderHalfContactHeartLikePermissionItem.getContext().getString(com.tencent.mm.R.string.ogb);
                        kotlin.jvm.internal.o.f(string6, "getString(...)");
                        charSequence = finderHalfContactHeartLikePermissionItem.b(string6);
                    } else {
                        charSequence = str2;
                    }
                    textView.setText(charSequence);
                }
            }
            if (finderHalfContactHeartLikePermissionItem != null) {
                finderHalfContactHeartLikePermissionItem.setOnClickListener(new com.tencent.mm.plugin.finder.view.jo(str3, string, i19, i17, i38, string3, i29, i37, lVar));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.ko.l(android.view.View, android.os.Bundle):void");
    }
}
