package sg3;

@j95.b
/* loaded from: classes4.dex */
public class r extends jm0.o {

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f407989m = null;

    /* renamed from: n, reason: collision with root package name */
    public ab0.x f407990n;

    public static java.lang.String aj() {
        if (!com.tencent.mm.vfs.w6.j("wcf://selectrecord/")) {
            com.tencent.mm.vfs.w6.u("wcf://selectrecord/");
        }
        return "wcf://selectrecord/";
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
    }

    @Override // jm0.o
    public void Ni(android.content.Context context) {
        ((ku5.t0) ku5.t0.f312615d).k(new sg3.m(this), 60000L);
    }

    public final java.lang.CharSequence Zi(java.util.ArrayList arrayList) {
        java.lang.CharSequence spannableString = new android.text.SpannableString("");
        if (arrayList == null) {
            return spannableString;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            spannableString = android.text.TextUtils.concat(spannableString, (java.lang.CharSequence) it.next());
        }
        return spannableString;
    }

    public final java.lang.String bj(java.lang.String str, java.lang.String str2) {
        return "FirstSwitchContactTips_" + str + "_" + str2 + "_" + ((java.lang.String) gm0.j1.u().c().l(2, ""));
    }

    public final java.lang.String cj(java.lang.String str, java.lang.String str2) {
        return "switch_contact_prefs_" + str + "_" + str2 + "_" + ((java.lang.String) gm0.j1.u().c().l(2, ""));
    }

    public final java.lang.CharSequence fj(java.lang.CharSequence charSequence) {
        return (charSequence == null || charSequence.length() == 0) ? new android.text.SpannableString("") : charSequence;
    }

    public void hj(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        java.util.Iterator it;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6 = str;
        try {
            java.lang.String string = bundle.getString("local_session");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (string == null) {
                string = "";
            }
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            java.lang.String str7 = (java.lang.String) map.get(str6 + ".window_template.$type");
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.sysmsgtemplate.content_template.succeed_scene"), 0);
            if ("tmpl_type_succeed_contact_window".equals(str7)) {
                java.lang.String str8 = (java.lang.String) map.get(str6 + ".window_template.template");
                java.lang.String str9 = (java.lang.String) map.get(str6 + ".window_template.tp_username");
                java.lang.String str10 = (java.lang.String) map.get(str6 + ".window_template.headimgurl");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str10)) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    if (com.tencent.mm.modelavatar.d1.Ni().n0(str9) == null) {
                        com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
                        r0Var.f70529a = str9;
                        r0Var.f70532d = str10;
                        r0Var.f70530b = 3;
                        r0Var.f70534f = 0;
                        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                        com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
                    }
                }
                java.lang.String str11 = "switch_contact_prefs";
                if (z17 && com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_contact_prefs", 0).getBoolean(cj(str9, str2), false)) {
                    mj(str9);
                    return;
                }
                java.lang.String str12 = (java.lang.String) map.get(str6 + ".window_template.ticket");
                java.lang.String str13 = (java.lang.String) map.get(str6 + ".window_template.antispam_ticket");
                java.lang.String str14 = (java.lang.String) map.get(str6 + ".window_template.title");
                java.lang.String str15 = (java.lang.String) map.get(str6 + ".window_template.cancel_wording");
                java.lang.String str16 = (java.lang.String) map.get(str6 + ".window_template.confirm_wording");
                java.util.ArrayList a17 = ih3.p.a(str8);
                if (a17 == null || a17.size() <= 0) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = a17.iterator();
                java.lang.String str17 = "";
                java.lang.String str18 = str17;
                while (true) {
                    str3 = str11;
                    if (!it6.hasNext()) {
                        break;
                    }
                    ih3.o oVar = (ih3.o) it6.next();
                    if (oVar != null && (str4 = oVar.f291597b) != null) {
                        int i17 = oVar.f291596a;
                        if (i17 == 0) {
                            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                            it = it6;
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            ((ke0.e) xVar).getClass();
                            arrayList.add(new android.text.SpannableString(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str4)));
                        } else {
                            it = it6;
                            if (i17 == 1) {
                                int i18 = 0;
                                while (true) {
                                    java.lang.String str19 = str6 + ".window_template.link_list.link";
                                    if (i18 != 0) {
                                        str19 = str19 + i18;
                                    }
                                    if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(str19))) {
                                        break;
                                    }
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    sb6.append(str19);
                                    java.lang.String str20 = str16;
                                    sb6.append(".$name");
                                    java.lang.String str21 = (java.lang.String) map.get(sb6.toString());
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                    sb7.append(str19);
                                    java.lang.String str22 = str15;
                                    sb7.append(".$type");
                                    java.lang.String str23 = (java.lang.String) map.get(sb7.toString());
                                    java.lang.String str24 = str4;
                                    java.lang.String str25 = str14;
                                    if (str4.equals(str21) && "link_plain".equals(str23)) {
                                        arrayList.add(fj((java.lang.CharSequence) map.get(str19 + ".plain")));
                                    }
                                    if ("company".equals(str21) && "link_userdescid".equals(str23)) {
                                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                        sb8.append(str19);
                                        str5 = str13;
                                        sb8.append(".userdesc");
                                        str18 = fj((java.lang.CharSequence) map.get(sb8.toString())).toString();
                                    } else {
                                        str5 = str13;
                                    }
                                    if ("nickname".equals(str21) && "link_plain".equals(str23)) {
                                        str17 = fj((java.lang.CharSequence) map.get(str19 + ".plain")).toString();
                                    }
                                    i18++;
                                    str6 = str;
                                    str4 = str24;
                                    str16 = str20;
                                    str15 = str22;
                                    str14 = str25;
                                    str13 = str5;
                                }
                            } else {
                                str6 = str;
                                str11 = str3;
                                it6 = it;
                                str16 = str16;
                                str15 = str15;
                                str14 = str14;
                                str13 = str13;
                            }
                        }
                        str6 = str;
                        str11 = str3;
                        it6 = it;
                        str16 = str16;
                        str15 = str15;
                        str14 = str14;
                        str13 = str13;
                    }
                    it = it6;
                    str6 = str;
                    str11 = str3;
                    it6 = it;
                    str16 = str16;
                    str15 = str15;
                    str14 = str14;
                    str13 = str13;
                }
                java.lang.String str26 = str13;
                java.lang.String str27 = str14;
                java.lang.String str28 = str15;
                java.lang.String str29 = str16;
                if (!z17) {
                    if (com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(str3, 0).getBoolean(bj(str9, str2), true)) {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(str3, 0).edit().putBoolean(bj(str9, str2), false).commit();
                        com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct();
                        openIMSucceedContactLogStruct.p(string);
                        openIMSucceedContactLogStruct.q(str2);
                        openIMSucceedContactLogStruct.f59797f = 1L;
                        openIMSucceedContactLogStruct.f59798g = 1L;
                        openIMSucceedContactLogStruct.f59799h = 1L;
                        openIMSucceedContactLogStruct.k();
                        ij((android.content.Context) weakReference.get(), string, Zi(arrayList).toString(), str9, str12, str26, str17, str18, str2, str27, str28, str29);
                        return;
                    }
                    return;
                }
                if (D1 == 1) {
                    com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct2 = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct();
                    openIMSucceedContactLogStruct2.p(string);
                    openIMSucceedContactLogStruct2.q(str2);
                    openIMSucceedContactLogStruct2.f59797f = 1L;
                    openIMSucceedContactLogStruct2.f59798g = 1L;
                    openIMSucceedContactLogStruct2.f59799h = 3L;
                    openIMSucceedContactLogStruct2.k();
                } else if (D1 == 0) {
                    com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct3 = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct();
                    openIMSucceedContactLogStruct3.p(string);
                    openIMSucceedContactLogStruct3.q(str2);
                    openIMSucceedContactLogStruct3.f59797f = 1L;
                    openIMSucceedContactLogStruct3.f59798g = 1L;
                    openIMSucceedContactLogStruct3.f59799h = 2L;
                    openIMSucceedContactLogStruct3.k();
                }
                ij((android.content.Context) weakReference.get(), string, Zi(arrayList).toString(), str9, str12, str26, str17, str18, str2, str27, str28, str29);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void ij(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        com.tencent.mm.plugin.messenger.SwitchContactDialogCustomView switchContactDialogCustomView = new com.tencent.mm.plugin.messenger.SwitchContactDialogCustomView(context, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
            switchContactDialogCustomView.setTilte(context.getString(com.tencent.mm.R.string.hfi));
        } else {
            switchContactDialogCustomView.setTilte(str9);
        }
        switchContactDialogCustomView.setContent(str2);
        switchContactDialogCustomView.setDesc(str6);
        switchContactDialogCustomView.setSubDesc("@" + str7);
        switchContactDialogCustomView.setPhoto(str3);
        switchContactDialogCustomView.setOnPhotoOnClick(new sg3.n(this, str3, str5, context));
        java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(str10) ? context.getString(com.tencent.mm.R.string.hff) : str10;
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.t8.K0(str11) ? context.getString(com.tencent.mm.R.string.hfh) : str11;
        u1Var.d(switchContactDialogCustomView);
        u1Var.n(string2);
        u1Var.j(string);
        u1Var.c(new sg3.o(this, str, str8), new sg3.q(this, str3, str, str8, str4, context));
        u1Var.q(false);
    }

    public void mj(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginMessenger", "startChattingUI userName: " + str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("Chat_Mode", 1);
        j45.l.u(com.tencent.mm.sdk.platformtools.x2.f193071a, ".ui.chatting.ChattingUI", intent, null);
    }
}
