package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f129494a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.base.preference.r f129495b;

    /* renamed from: c, reason: collision with root package name */
    public r45.zq2 f129496c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f129497d;

    /* renamed from: e, reason: collision with root package name */
    public az2.f f129498e;

    /* renamed from: f, reason: collision with root package name */
    public r45.d1 f129499f;

    /* renamed from: g, reason: collision with root package name */
    public final zy2.gc f129500g;

    /* renamed from: h, reason: collision with root package name */
    public final zy2.gc f129501h;

    /* renamed from: i, reason: collision with root package name */
    public final zy2.gc f129502i;

    /* renamed from: j, reason: collision with root package name */
    public final zy2.gc f129503j;

    public m2(android.app.Activity context, com.tencent.mm.ui.base.preference.r preferenceScreen) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(preferenceScreen, "preferenceScreen");
        this.f129494a = context;
        this.f129495b = preferenceScreen;
        this.f129497d = "";
        this.f129500g = new com.tencent.mm.plugin.finder.ui.k2(this);
        this.f129501h = new com.tencent.mm.plugin.finder.ui.l2(this);
        this.f129502i = new com.tencent.mm.plugin.finder.ui.j2(this);
        this.f129503j = new com.tencent.mm.plugin.finder.ui.i2(this);
    }

    public final java.lang.String a(java.lang.Integer num) {
        android.app.Activity activity = this.f129494a;
        if (num != null && num.intValue() == 3) {
            java.lang.String string = activity.getString(com.tencent.mm.R.string.mhs);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            java.lang.String string2 = activity.getString(com.tencent.mm.R.string.lth);
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        if (hc2.s.b()) {
            java.lang.String string3 = activity.getString(com.tencent.mm.R.string.ltk);
            kotlin.jvm.internal.o.d(string3);
            return string3;
        }
        java.lang.String string4 = activity.getString(com.tencent.mm.R.string.ltj);
        kotlin.jvm.internal.o.d(string4);
        return string4;
    }

    public final void b() {
        boolean g17 = hc2.s.g();
        com.tencent.mm.ui.base.preference.r rVar = this.f129495b;
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) rVar).h("checkbox_preference_send_comment_and_bullet");
        com.tencent.mm.plugin.finder.widget.pref.FinderInteractPreference finderInteractPreference = h17 instanceof com.tencent.mm.plugin.finder.widget.pref.FinderInteractPreference ? (com.tencent.mm.plugin.finder.widget.pref.FinderInteractPreference) h17 : null;
        if (finderInteractPreference != null) {
            m92.b j37 = g92.a.j3(g92.b.f269769e, this.f129497d, false, 2, null);
            g(g17, j37 != null ? java.lang.Integer.valueOf(j37.u0().getInteger(48)) : null, finderInteractPreference);
        }
        com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) rVar).h("checkbox_preference_say_hi");
        com.tencent.mm.plugin.finder.widget.pref.FinderInteractPreference finderInteractPreference2 = h18 instanceof com.tencent.mm.plugin.finder.widget.pref.FinderInteractPreference ? (com.tencent.mm.plugin.finder.widget.pref.FinderInteractPreference) h18 : null;
        if (finderInteractPreference2 != null) {
            m92.b j38 = g92.a.j3(g92.b.f269769e, this.f129497d, false, 2, null);
            g(g17, j38 != null ? java.lang.Integer.valueOf(j38.u0().getInteger(49)) : null, finderInteractPreference2);
        }
    }

    public final void c() {
        android.app.Activity activity = this.f129494a;
        android.content.Intent intent = activity.getIntent();
        java.lang.String stringExtra = intent.getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f129497d = stringExtra;
        if (stringExtra.length() == 0) {
            this.f129497d = xy2.c.e(activity);
        }
        r45.zq2 zq2Var = new r45.zq2();
        byte[] byteArrayExtra = intent.getByteArrayExtra("privacy_settings");
        if (byteArrayExtra != null) {
            try {
                zq2Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            this.f129496c = zq2Var;
            com.tencent.mm.ui.base.preference.r rVar = this.f129495b;
            ((com.tencent.mm.ui.base.preference.h0) rVar).m("settings_show_my_finder", true);
            ((com.tencent.mm.ui.base.preference.h0) rVar).m("checkbox_preference_one", true);
            ((com.tencent.mm.ui.base.preference.h0) rVar).m("settings_recommend_info", true);
        }
        zq2Var = null;
        this.f129496c = zq2Var;
        com.tencent.mm.ui.base.preference.r rVar2 = this.f129495b;
        ((com.tencent.mm.ui.base.preference.h0) rVar2).m("settings_show_my_finder", true);
        ((com.tencent.mm.ui.base.preference.h0) rVar2).m("checkbox_preference_one", true);
        ((com.tencent.mm.ui.base.preference.h0) rVar2).m("settings_recommend_info", true);
    }

    public final void d(int i17, int i18, android.content.Intent intent) {
        int i19;
        if (intent == null || i18 != -1) {
            return;
        }
        if (i17 != 10) {
            if (i17 != 11) {
                return;
            }
            int intExtra = intent.getIntExtra("key_output_interact", 2);
            int intExtra2 = intent.getIntExtra("key_interact_scene", 0);
            f();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0.f280090e.s(intExtra, intExtra2, this.f129503j, this.f129497d);
            return;
        }
        int intExtra3 = intent.getIntExtra("Ktag_range_index", 0);
        r45.pk2 pk2Var = new r45.pk2();
        if (intExtra3 == 0) {
            pk2Var.set(0, 0);
            i19 = 2;
        } else if (intExtra3 != 1) {
            if (intExtra3 == 3) {
                boolean booleanExtra = intent.getBooleanExtra("Kexclude_all_friends", false);
                java.lang.String stringExtra = intent.getStringExtra("Kother_user_name_list");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (booleanExtra) {
                    pk2Var.set(0, 1);
                } else {
                    pk2Var.set(0, 2);
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
                if (stringArrayListExtra != null) {
                    linkedList.addAll(stringArrayListExtra);
                }
                pk2Var.set(1, linkedList);
                if (stringExtra.length() > 0) {
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    kz5.h0.w(linkedList2, new r26.t(",").g(stringExtra, 0).toArray(new java.lang.String[0]));
                    pk2Var.set(2, linkedList2);
                }
            } else if (intExtra3 == 6) {
                pk2Var.set(0, 3);
                i19 = 4;
            }
            i19 = 3;
        } else {
            pk2Var.set(0, 0);
            i19 = 1;
        }
        if (pk2Var.getInteger(0) == 2 && pk2Var.getList(1).isEmpty() && pk2Var.getList(2).isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderSettingPrivacyUI", "setNotRecommendInfo:no label");
            return;
        }
        boolean b17 = hc2.s.b();
        m92.b j37 = g92.a.j3(g92.b.f269769e, this.f129497d, false, 2, null);
        r45.pk2 pk2Var2 = j37 != null ? (r45.pk2) j37.u0().getCustom(38) : null;
        boolean z17 = (!(i19 == 1 && b17) && (i19 != 2 || b17)) || !(pk2Var2 == null || pk2Var2.getInteger(0) == 0);
        if (i19 == 3 && !b17 && pk2Var2 != null && pk2Var2.getInteger(0) == pk2Var.getInteger(0) && pk2Var2.getList(1).size() == pk2Var.getList(1).size()) {
            java.util.LinkedList list = pk2Var2.getList(1);
            java.util.LinkedList list2 = pk2Var.getList(1);
            kotlin.jvm.internal.o.f(list2, "getLabel_id(...)");
            if (list.containsAll(list2) && pk2Var2.getList(2).size() == pk2Var.getList(2).size()) {
                java.util.LinkedList list3 = pk2Var2.getList(2);
                java.util.LinkedList list4 = pk2Var.getList(2);
                kotlin.jvm.internal.o.f(list4, "getUsername(...)");
                if (list3.containsAll(list4)) {
                    z17 = false;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderSettingPrivacyUI", "setNotRecommendInfo:type %d labelSize %d nameSize %d switch %d oldPrivate %b", java.lang.Integer.valueOf(pk2Var.getInteger(0)), java.lang.Integer.valueOf(pk2Var.getList(1).size()), java.lang.Integer.valueOf(pk2Var.getList(2).size()), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(b17));
        if (z17) {
            f();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0 s0Var = hb2.s0.f280090e;
            zy2.gc gcVar = this.f129502i;
            java.lang.String str = this.f129497d;
            s0Var.getClass();
            r45.ri2 ri2Var = new r45.ri2();
            ri2Var.set(15, java.lang.Integer.valueOf(i19));
            ri2Var.set(25, pk2Var);
            if (str != null) {
                hb2.w0.a(s0Var, str, ri2Var, gcVar, false, false, null, 56, null);
            }
        }
    }

    public final boolean e(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        int i17;
        android.content.Intent intent;
        r45.pk2 pk2Var;
        boolean N;
        kotlin.jvm.internal.o.d(preference);
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("Finder.FinderSettingPrivacyUI", "click " + str);
        if (str == null) {
            return true;
        }
        int hashCode = str.hashCode();
        com.tencent.mm.ui.base.preference.r rVar2 = this.f129495b;
        android.app.Activity context = this.f129494a;
        switch (hashCode) {
            case -2022995907:
                if (!str.equals("checkbox_preference_say_hi")) {
                    return true;
                }
                android.content.Intent intent2 = new android.content.Intent();
                m92.b j37 = g92.a.j3(g92.b.f269769e, this.f129497d, false, 2, null);
                intent2.putExtra("key_input_interact", j37 != null ? java.lang.Integer.valueOf(j37.u0().getInteger(49)) : null);
                intent2.setClass(context, com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI28.class);
                android.app.Activity activity = this.f129494a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(11);
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCommonSetting", "handleInteractSayHi", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return true;
            case -1266260301:
                if (!str.equals("settings_protect")) {
                    return true;
                }
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).sk(context, null);
                return true;
            case -954553875:
                if (!str.equals("settings_recommend_info")) {
                    return true;
                }
                android.content.Intent className = new android.content.Intent().setClassName(context, "com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI26");
                kotlin.jvm.internal.o.f(className, "setClassName(...)");
                m92.b j38 = g92.a.j3(g92.b.f269769e, this.f129497d, false, 2, null);
                if (j38 == null || (pk2Var = (r45.pk2) j38.u0().getCustom(38)) == null) {
                    i17 = 0;
                    intent = null;
                } else {
                    java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
                    java.util.LinkedList list = pk2Var.getList(1);
                    if (list != null) {
                        arrayList2.addAll(list);
                    }
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(pk2Var.getList(2), ",");
                    int integer = pk2Var.getInteger(0);
                    if (integer == 1) {
                        className.putExtra("Kexclude_all_friends", true);
                    } else if (integer != 2) {
                        i17 = integer != 3 ? hc2.s.b() ? 1 : 0 : 6;
                        className.putStringArrayListExtra("label_id", arrayList2);
                        intent = className.putExtra("Kother_user_name_list", c17);
                    }
                    i17 = 3;
                    className.putStringArrayListExtra("label_id", arrayList2);
                    intent = className.putExtra("Kother_user_name_list", c17);
                }
                if (intent == null && hc2.s.b()) {
                    i17 = 1;
                }
                className.putExtra("KLabel_range_index", i17);
                className.putExtra("Kis_from_finder", true);
                className.putExtra("k_show_private", true);
                className.putExtra("k_show_include", false);
                className.putExtra("k_sns_label_ui_style", 0);
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                className.putExtra("key_to_comment_scene", com.tencent.mm.plugin.appbrand.jsapi.pe.CTRL_INDEX);
                className.putExtra("key_click_tab_context_id", nyVar != null ? nyVar.f135386r : null);
                className.putExtra("key_context_id", nyVar != null ? nyVar.f135382p : null);
                android.app.Activity activity2 = this.f129494a;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(10);
                arrayList3.add(className);
                java.util.Collections.reverse(arrayList3);
                yj0.a.k(activity2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCommonSetting", "handleSetNotRecommendInfo", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[4];
                lVarArr[0] = new jz5.l("view_id", "watch_account_content_setting");
                lVarArr[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
                lVarArr[2] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
                lVarArr[3] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
                ((cy1.a) rVar3).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
                return true;
            case -415165035:
                if (!str.equals("account_management")) {
                    return true;
                }
                android.content.Intent intent3 = new android.content.Intent();
                i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c18, this.f129494a, 10L, 1L, false, 0, 0, null, 120, null);
                r45.d1 d1Var = this.f129499f;
                if (d1Var == null) {
                    return true;
                }
                com.tencent.mm.plugin.finder.feed.ui.f fVar = com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent.f109198g;
                intent3.putExtra("ACCOUNT_EXTRA_CONFIG", d1Var.toByteArray());
                intent3.putExtra("ACCOUNT_USERNAME", this.f129497d);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Ai(context, intent3);
                return true;
            case 197211010:
                if (!str.equals("settings_personal_info_export")) {
                    return true;
                }
                android.content.Intent intent4 = new android.content.Intent();
                r45.zq2 zq2Var = this.f129496c;
                intent4.putExtra("rawUrl", zq2Var != null ? zq2Var.getString(0) : null);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent4, null);
                return true;
            case 541151233:
                if (!str.equals("settings_blacklist")) {
                    return true;
                }
                i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                kotlin.jvm.internal.o.g(context, "context");
                android.content.Intent intent5 = new android.content.Intent();
                intent5.setClass(context, com.tencent.mm.plugin.finder.ui.FinderBlackListUI.class);
                xy2.c.c(context, intent5);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent5);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(context, arrayList4.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterBlackListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterBlackListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case 604599027:
                if (!str.equals("settings_show_my_finder")) {
                    return true;
                }
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WXPROFILE_ENTRY_EDU_INT_SYNC, 1);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WXPROFILE_ENTRY_EDU2_INT_SYNC, 1);
                i95.m c27 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c27, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c27, this.f129494a, 12L, 1L, false, 0, 0, null, 120, null);
                com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) rVar2).h("settings_show_my_finder");
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
                if (checkBoxPreference == null) {
                    return true;
                }
                boolean N2 = checkBoxPreference.N();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                kotlin.jvm.internal.o.g(context, "context");
                m92.b j39 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
                if (N2 == (((j39 != null ? j39.field_extFlag : 0) & 262144) != 0)) {
                    return true;
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderSettingPrivacyUI", "change isShowAtWxProfile, now:" + N2);
                f();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.s0.f280090e.u(N2, this.f129500g, this.f129497d);
                return true;
            case 622179821:
                if (!str.equals("settings_message_mute")) {
                    return true;
                }
                com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) rVar2).h("settings_message_mute");
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = h18 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h18 : null;
                if (checkBoxPreference2 == null) {
                    return true;
                }
                boolean N3 = checkBoxPreference2.N();
                g92.b bVar = g92.b.f269769e;
                m92.b j310 = g92.a.j3(bVar, this.f129497d, false, 2, null);
                int i18 = j310 != null ? j310.field_extFlag : 0;
                int i19 = N3 ? i18 | 64 : i18 & (-65);
                m92.c cVar = new m92.c(this.f129497d);
                cVar.field_extFlag = i19;
                bVar.C(cVar, m92.j.f324997o);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.k kVar = hb2.k.f280062e;
                kVar.getClass();
                r45.ii2 ii2Var = new r45.ii2();
                ii2Var.set(0, java.lang.Integer.valueOf(N3 ? 1 : 0));
                hb2.w0.m(kVar, ii2Var, null, false, false, null, null, 60, null);
                return true;
            case 938882809:
                if (!str.equals("checkbox_preference_send_comment_and_bullet")) {
                    return true;
                }
                android.content.Intent intent6 = new android.content.Intent();
                m92.b j311 = g92.a.j3(g92.b.f269769e, this.f129497d, false, 2, null);
                intent6.putExtra("key_input_interact", j311 != null ? java.lang.Integer.valueOf(j311.u0().getInteger(48)) : null);
                intent6.setClass(context, com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI29.class);
                android.app.Activity activity3 = this.f129494a;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(11);
                arrayList5.add(intent6);
                java.util.Collections.reverse(arrayList5);
                yj0.a.k(activity3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCommonSetting", "handleInteractSendCommentAndBullet", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return true;
            case 1478826890:
                if (!str.equals("settings_not_recommend_friends")) {
                    return true;
                }
                com.tencent.mm.ui.base.preference.Preference h19 = ((com.tencent.mm.ui.base.preference.h0) rVar2).h("settings_not_recommend_friends");
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = h19 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h19 : null;
                if (checkBoxPreference3 == null) {
                    return true;
                }
                boolean N4 = checkBoxPreference3.N();
                g92.b bVar2 = g92.b.f269769e;
                m92.b j312 = g92.a.j3(bVar2, this.f129497d, false, 2, null);
                int i27 = j312 != null ? j312.field_extFlag : 0;
                int i28 = N4 ? i27 | 1073741824 : i27 & (-1073741825);
                m92.c cVar2 = new m92.c(this.f129497d);
                cVar2.field_extFlag = i28;
                bVar2.C(cVar2, m92.j.f324997o);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.t tVar = hb2.t.f280092e;
                tVar.getClass();
                r45.ai2 ai2Var = new r45.ai2();
                ai2Var.set(0, java.lang.Integer.valueOf(N4 ? 1 : 0));
                hb2.w0.m(tVar, ai2Var, null, false, false, null, null, 60, null);
                return true;
            case 1483581694:
                if (!str.equals("checkbox_preference_one")) {
                    return true;
                }
                com.tencent.mm.ui.base.preference.Preference h27 = ((com.tencent.mm.ui.base.preference.h0) rVar2).h("checkbox_preference_one");
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference4 = h27 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h27 : null;
                if (checkBoxPreference4 == null || (N = checkBoxPreference4.N()) == hc2.s.b()) {
                    return true;
                }
                f();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.s0 s0Var = hb2.s0.f280090e;
                int i29 = N ? 1 : 2;
                zy2.gc gcVar = this.f129501h;
                s0Var.getClass();
                r45.ri2 ri2Var = new r45.ri2();
                ri2Var.set(15, java.lang.Integer.valueOf(i29));
                hb2.w0.m(s0Var, ri2Var, gcVar, false, false, null, null, 60, null);
                return true;
            case 1532430696:
                if (!str.equals("settings_data_permission")) {
                    return true;
                }
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).getClass();
                kotlin.jvm.internal.o.g(context, "context");
                android.content.Intent intent7 = new android.content.Intent();
                intent7.addFlags(67108864);
                intent7.setClass(context, com.tencent.mm.plugin.finder.ui.FinderSettingDataPermissionUI.class);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(intent7);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(context, arrayList6.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSettingDataPermissionUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList6.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSettingDataPermissionUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            default:
                return true;
        }
    }

    public final void f() {
        az2.f fVar = this.f129498e;
        if (fVar != null) {
            fVar.b();
        }
        az2.c cVar = az2.f.f16125d;
        android.app.Activity activity = this.f129494a;
        az2.f a17 = az2.c.a(cVar, activity, activity.getString(com.tencent.mm.R.string.f490604zq), 0L, null, 8, null);
        this.f129498e = a17;
        a17.a();
    }

    public final void g(boolean z17, java.lang.Integer num, com.tencent.mm.plugin.finder.widget.pref.FinderInteractPreference finderInteractPreference) {
        java.lang.String string;
        android.app.Activity activity = this.f129494a;
        if (z17) {
            finderInteractPreference.H(activity.getString(com.tencent.mm.R.string.ltc));
            finderInteractPreference.L = activity.getColor(com.tencent.mm.R.color.f478895k4);
            finderInteractPreference.f197788y = activity.getResources().getColor(com.tencent.mm.R.color.f478895k4, null);
            finderInteractPreference.w(false);
            return;
        }
        if (num != null && num.intValue() == 2) {
            string = activity.getString(com.tencent.mm.R.string.lta);
            kotlin.jvm.internal.o.d(string);
        } else if (num != null && num.intValue() == 3) {
            string = activity.getString(com.tencent.mm.R.string.ltb);
            kotlin.jvm.internal.o.d(string);
        } else if (num != null && num.intValue() == 1) {
            string = activity.getString(com.tencent.mm.R.string.ltc);
            kotlin.jvm.internal.o.d(string);
        } else {
            string = activity.getString(com.tencent.mm.R.string.f490386tj);
            kotlin.jvm.internal.o.d(string);
        }
        finderInteractPreference.H(string);
        finderInteractPreference.L = activity.getColor(com.tencent.mm.R.color.abw);
        finderInteractPreference.f197788y = activity.getResources().getColor(com.tencent.mm.R.color.abw, null);
        finderInteractPreference.w(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.m2.h():void");
    }
}
