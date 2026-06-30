package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public abstract class t2 {
    public static void a(java.util.LinkedList linkedList) {
        boolean i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustAdFirstBossCommentPosition", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        try {
            com.tencent.mars.xlog.Log.i("SnsCommentUtil", "adjustAdFirstBossCommentPosition, size=" + linkedList.size());
            int i18 = 0;
            while (true) {
                if (i18 >= linkedList.size()) {
                    break;
                }
                r45.e86 e86Var = (r45.e86) linkedList.get(i18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdBossFirstComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                if (e86Var == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdBossFirstComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                    i17 = false;
                } else {
                    i17 = i(e86Var.f373139t, 32);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdBossFirstComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                }
                if (!i17) {
                    i18++;
                } else if (i18 != 0) {
                    com.tencent.mars.xlog.Log.i("SnsCommentUtil", "adjustAdFirstBossCommentPosition, swap pos=" + i18);
                    linkedList.remove(i18);
                    linkedList.add(0, e86Var);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 157);
                } else {
                    com.tencent.mars.xlog.Log.i("SnsCommentUtil", "adjustAdFirstBossCommentPosition, normal pos=" + i18);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 156);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsCommentUtil", "adjustAdFirstBossCommentPosition, exp=" + e17.toString());
            ca4.q.c("adjustAdFirstBossCommentPosition", e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustAdFirstBossCommentPosition", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
    }

    public static java.lang.Boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentImageFlowUIEnabled", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_comment_image_flow_ui_enabled, false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentImageFlowUIEnabled", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return valueOf;
    }

    public static java.lang.CharSequence c(android.text.SpannableStringBuilder spannableStringBuilder) {
        android.text.SpannableStringBuilder spannableStringBuilder2;
        com.tencent.mm.pluginsdk.ui.span.z0[] z0VarArr;
        java.lang.String e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compressLinkContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        if (spannableStringBuilder instanceof mm0.d) {
            mm0.d dVar = new mm0.d(spannableStringBuilder);
            dVar.f328577d = ((mm0.d) spannableStringBuilder).f328577d;
            spannableStringBuilder2 = dVar;
        } else {
            spannableStringBuilder2 = new android.text.SpannableStringBuilder(spannableStringBuilder);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.J0(spannableStringBuilder) && (z0VarArr = (com.tencent.mm.pluginsdk.ui.span.z0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), com.tencent.mm.pluginsdk.ui.span.z0.class)) != null && z0VarArr.length > 0) {
            for (com.tencent.mm.pluginsdk.ui.span.z0 z0Var : z0VarArr) {
                if (z0Var.getType() == 1 && (e17 = z0Var.getHrefInfo().e()) != null && e17.length() > com.tencent.mm.plugin.sns.model.j4.f() && spannableStringBuilder2.toString().contains(e17)) {
                    java.lang.String str = e17.substring(0, com.tencent.mm.plugin.sns.model.j4.f()) + "...";
                    android.text.SpannableString spannableString = new android.text.SpannableString(str);
                    spannableString.setSpan(new com.tencent.mm.pluginsdk.ui.span.z0(2, z0Var.getHrefInfo()), 0, str.length(), 33);
                    int indexOf = spannableStringBuilder2.toString().indexOf(e17);
                    spannableStringBuilder2.replace(indexOf, e17.length() + indexOf, (java.lang.CharSequence) spannableString);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compressLinkContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return spannableStringBuilder2;
    }

    public static java.lang.String d(com.tencent.mm.plugin.sns.storage.ADXml aDXml, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        if (aDXml != null) {
            if (aDXml.usePreferedInfo) {
                str = aDXml.preferNickName;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(aDXml.nickname)) {
                str = aDXml.nickname;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return str;
    }

    public static java.lang.String e(r45.e86 e86Var) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.storage.k4) com.tencent.mm.plugin.sns.model.l4.pj()).f0(e86Var.f373126d);
        if (f07 != null) {
            str = f07.g2();
        } else {
            java.lang.String str2 = e86Var.f373127e;
            str = str2 != null ? str2 : e86Var.f373126d;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return str;
    }

    public static java.lang.CharSequence f(android.content.Context context, r45.e86 e86Var, com.tencent.mm.plugin.sns.ui.q1 q1Var, int i17, java.lang.String str, int i18, boolean z17, boolean z18, final com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        java.lang.String str2;
        boolean z19;
        com.tencent.mm.storage.z3 z3Var;
        int i19;
        boolean z27;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String g27;
        int length;
        boolean z28;
        java.lang.String str5;
        java.lang.String str6;
        int i27;
        boolean z29;
        java.lang.String str7;
        int i28;
        java.lang.String str8;
        int i29;
        java.lang.String str9;
        int i37;
        int i38;
        java.lang.String str10;
        com.tencent.mm.plugin.sns.ui.q1 q1Var2;
        int i39;
        int i47;
        int i48;
        int i49;
        com.tencent.mm.pluginsdk.ui.span.d1 d1Var;
        int i57;
        int i58;
        byte[] d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        java.lang.String e17 = e(e86Var);
        if (k(snsInfo, e86Var.f373126d)) {
            str2 = d(snsInfo.getAdXml(), java.lang.String.valueOf(e17));
            z19 = true;
        } else {
            str2 = e17;
            z19 = false;
        }
        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.storage.k4) com.tencent.mm.plugin.sns.model.l4.pj()).f0(e86Var.f373134o);
        int i59 = i17 == 21 ? 3 : 2;
        java.lang.String str11 = e86Var.f373130h;
        java.lang.String str12 = str11 == null ? "" : str11;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            z3Var = null;
        } else {
            gm0.j1.i();
            z3Var = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(str);
        }
        if (i18 == 1) {
            i19 = i59;
            if (j62.e.g().a("clicfg_text_status_icon_scene_sns_like_and", "1", false, false).equals("1")) {
                if (((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(e86Var.f373126d)) {
                    str3 = ((java.lang.Object) str2) + " ";
                    z27 = true;
                }
            }
            str3 = str2;
            z27 = false;
        } else {
            i19 = i59;
            z27 = false;
            str3 = "";
        }
        java.lang.String str13 = str2;
        if (!i(e86Var.f373139t, 1) || !android.text.TextUtils.isEmpty(e86Var.f373134o)) {
            if (i(e86Var.f373139t, 8)) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str14 = e86Var.f373134o;
                ((sg3.a) v0Var).getClass();
                g27 = c01.a2.e(str14);
                if (!com.tencent.mm.sdk.platformtools.t8.J0(str3)) {
                    str3 = ((java.lang.Object) str3) + ": ";
                }
                java.lang.String str15 = ((java.lang.Object) str3) + context.getString(com.tencent.mm.R.string.j9c);
                length = str15.length();
                str5 = "" + ((java.lang.Object) (((java.lang.Object) str15) + g27)) + " ";
                z28 = false;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(e86Var.f373134o)) {
                if (!com.tencent.mm.sdk.platformtools.t8.J0(str3)) {
                    str3 = ((java.lang.Object) str3) + ": ";
                }
                str4 = "" + ((java.lang.Object) str3);
                str8 = str4;
                str7 = null;
                str6 = null;
                i28 = 0;
                i27 = 0;
                z29 = false;
            } else {
                g27 = f07 == null ? e86Var.f373134o : f07.g2();
                if (snsInfo != null && snsInfo.isAd() && e86Var.f373134o.equals(snsInfo.getUserName())) {
                    g27 = d(snsInfo.getAdXml(), g27);
                }
                java.lang.String str16 = ((java.lang.Object) str3) + context.getString(com.tencent.mm.R.string.f493233je0);
                length = str16.length();
                if (bi4.v1.h()) {
                    if (((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(e86Var.f373134o)) {
                        g27 = g27 + " ";
                        z28 = true;
                        str5 = "" + ((java.lang.Object) (((java.lang.Object) str16) + g27)) + ": ";
                    }
                }
                z28 = false;
                str5 = "" + ((java.lang.Object) (((java.lang.Object) str16) + g27)) + ": ";
            }
            str6 = g27;
            i27 = length;
            z29 = z28;
            str7 = null;
            i28 = 0;
            str8 = str5;
        } else if (z3Var != null) {
            java.lang.String g28 = android.text.TextUtils.isEmpty(z3Var.g2()) ? str : z3Var.g2();
            if (snsInfo != null && snsInfo.isAd()) {
                g28 = d(snsInfo.getAdXml(), g28);
            }
            java.lang.String str17 = ((java.lang.Object) str3) + context.getString(com.tencent.mm.R.string.j9c);
            int length2 = str17.length();
            str5 = "" + ((java.lang.Object) (((java.lang.Object) str17) + g28)) + ": ";
            str7 = g28;
            i28 = length2;
            str6 = null;
            i27 = 0;
            z29 = false;
            str8 = str5;
        } else {
            com.tencent.mars.xlog.Log.w("SnsCommentUtil", "feedContact null by feedOwnUserName %s", str);
            str4 = "";
            str8 = str4;
            str7 = null;
            str6 = null;
            i28 = 0;
            i27 = 0;
            z29 = false;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_wxa_short_link_launch_scene", "TIME_LINE");
        bundle.putInt("ShareScene", ca4.z0.n0(e86Var) ? 5 : 4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(snsInfo.getUserName());
        sb6.append("#");
        java.lang.String str18 = str8;
        sb6.append(ca4.z0.t0(snsInfo.field_snsId));
        sb6.append("#");
        sb6.append(e86Var.f373126d);
        sb6.append("#");
        sb6.append(e86Var.f373132m);
        bundle.putString("ShareSceneId", sb6.toString());
        bundle.putLong("CreateTime", e86Var.f373131i);
        bundle.putInt("TimelineEnterSource", i18 == 2 ? 3 : 1);
        bundle.putInt("SnsContentType", snsInfo.field_type);
        boolean i66 = i(e86Var.f373139t, 32);
        if (i66) {
            bundle.putBoolean("CheckDialog", false);
            r45.cu5 cu5Var = e86Var.f373142w;
            if (cu5Var != null && (d17 = x51.j1.d(cu5Var)) != null) {
                com.tencent.mars.xlog.Log.i("SnsCommentUtil", "put extrainfo , buf length = " + d17.length);
                bundle.putByteArray("adExtInfo", d17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemCommentSpanGenerate", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        kotlin.jvm.internal.o.g(context, "context");
        r45.ek6 ek6Var = new r45.ek6();
        ek6Var.f373585e = ca4.z0.n0(e86Var) ? 5 : 4;
        ek6Var.f373586f = snsInfo.getUserName() + '#' + ca4.z0.t0(snsInfo.field_snsId) + '#' + e86Var.f373126d + '#' + e86Var.f373132m;
        ek6Var.f373587g = (long) e86Var.f373131i;
        ek6Var.f373588h = i18 == 2 ? 3 : 1;
        ek6Var.f373589i = snsInfo.field_type;
        ek6Var.f373590m = snsInfo.localid;
        o04.n Bi = ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Bi(context, 1);
        if (Bi != null) {
            ((o04.g) Bi).b("Comment_" + e86Var.hashCode(), ek6Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsTagSearchSpanClickReportFlow", "onItemCommentSpanGenerate Comment_" + e86Var.hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemCommentSpanGenerate", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float f17 = 15;
        int b17 = i65.a.b(context, (int) (i65.a.q(context) * f17));
        ((ke0.e) xVar).getClass();
        int i67 = i19;
        java.lang.CharSequence k17 = com.tencent.mm.pluginsdk.ui.span.c0.k(context, true, str18, b17, 2, bundle, null, -1, true);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        java.lang.CharSequence f18 = ga4.m.f(snsInfo.field_snsId, com.tencent.mm.pluginsdk.ui.span.c0.k(context, true, str12, i65.a.b(context, (int) (f17 * i65.a.q(context))), 2, bundle, null, 5, !i66), e86Var.f373132m, 2);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(k17);
        java.lang.String str19 = "" + snsInfo.field_snsId;
        if (snsInfo.isFireworkCheerAd() && z19) {
            java.lang.String str20 = context.getString(com.tencent.mm.R.string.j9c) + context.getString(com.tencent.mm.R.string.m29);
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(str20);
            i29 = i67;
            com.tencent.mm.pluginsdk.ui.span.d1 d1Var2 = new com.tencent.mm.pluginsdk.ui.span.d1((android.app.Activity) context, str, new com.tencent.mm.plugin.sns.ui.widget.u2(context, snsInfo), i29);
            java.lang.Boolean bool = (java.lang.Boolean) k84.e4.f305021d.b(a84.d0.c(snsInfo));
            if (bool == null || !bool.booleanValue()) {
                i58 = 1;
            } else {
                int b18 = k84.d4.V.b(snsInfo);
                d1Var2.setColor(b18, 0);
                str19 = str19 + "_" + b18;
                i58 = 0;
            }
            com.tencent.mars.xlog.Log.i("SnsCommentUtil", "fireworkCheerInfo comment refresh " + snsInfo.getLikeFlag());
            spannableStringBuilder2.setSpan(d1Var2, i58, str20.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) spannableStringBuilder2);
            str9 = str19;
            i37 = 1;
        } else {
            i29 = i67;
            str9 = str19;
            i37 = 0;
        }
        spannableStringBuilder.append(f18);
        int i68 = i17 == 21 ? 3 : 2;
        mm0.d dVar = new mm0.d(spannableStringBuilder);
        bi4.c cVar = bi4.c.SNS_COMMENT;
        if (i18 == 1) {
            if (k(snsInfo, e86Var.f373126d)) {
                str10 = "";
                q1Var2 = q1Var;
                dVar.setSpan(new com.tencent.mm.pluginsdk.ui.span.d1((android.app.Activity) context, new ca4.h(snsInfo.isAd(), e86Var.f373126d, snsInfo.getLocalid(), 0, i(e86Var.f373139t, 32) ? 27 : 2), q1Var2, i68), 0, str13.length(), 33);
            } else {
                str10 = "";
                q1Var2 = q1Var;
                dVar.setSpan(new com.tencent.mm.pluginsdk.ui.span.d1((android.app.Activity) context, e86Var.f373126d, q1Var2, i68), 0, str13.length(), 33);
            }
            if (z27) {
                android.text.style.ReplacementSpan Zi = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Zi(null, e86Var.f373126d, cVar, i65.a.b(context, (int) (i65.a.q(context) * f17)));
                if (Zi != null) {
                    i38 = 1;
                    dVar.setSpan(Zi, str13.length(), str13.length() + 1, 17);
                }
            }
            i38 = 1;
        } else {
            i38 = 1;
            str10 = "";
            q1Var2 = q1Var;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            int i69 = i37;
            i39 = i38;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                i47 = i69;
            } else {
                com.tencent.mm.pluginsdk.ui.span.d1 d1Var3 = (snsInfo.isAd() && e86Var.f373134o.equals(snsInfo.getUserName())) ? new com.tencent.mm.pluginsdk.ui.span.d1((android.app.Activity) context, new ca4.h(snsInfo.isAd(), e86Var.f373134o, snsInfo.getLocalid(), 0, 2), q1Var2, i29) : new com.tencent.mm.pluginsdk.ui.span.d1((android.app.Activity) context, e86Var.f373134o, q1Var2, i29);
                java.lang.Boolean bool2 = (java.lang.Boolean) k84.e4.f305021d.b(a84.d0.c(snsInfo));
                if ((i(e86Var.f373139t, 8) || i(e86Var.f373139t, i39)) && snsInfo.isFireworkCheerAd() && bool2 != null && bool2.booleanValue()) {
                    int b19 = k84.d4.V.b(snsInfo);
                    d1Var3.setColor(b19, 0);
                    i48 = i27 > 0 ? i27 - 1 : i27;
                    str9 = str9 + "_" + b19;
                    i47 = i39;
                } else {
                    i47 = i69;
                    i48 = i27;
                }
                dVar.setSpan(d1Var3, i48, i27 + str6.length(), 33);
                if (z29) {
                    android.text.style.ReplacementSpan Zi2 = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Zi(null, e86Var.f373134o, cVar, i65.a.b(context, (int) (i65.a.q(context) * f17)));
                    if (Zi2 != null) {
                        dVar.setSpan(Zi2, (i27 + str6.length()) - i39, i27 + str6.length(), 17);
                    }
                }
            }
        } else {
            if (snsInfo.isAd() && str.equals(snsInfo.getUserName())) {
                i49 = i37;
                i39 = i38;
                d1Var = new com.tencent.mm.pluginsdk.ui.span.d1((android.app.Activity) context, new ca4.h(snsInfo.isAd(), str, snsInfo.getLocalid(), 0, 2), q1Var2, i29);
            } else {
                i49 = i37;
                i39 = i38;
                d1Var = new com.tencent.mm.pluginsdk.ui.span.d1((android.app.Activity) context, str, q1Var2, i29);
            }
            java.lang.Boolean bool3 = (java.lang.Boolean) k84.e4.f305021d.b(a84.d0.c(snsInfo));
            if ((i(e86Var.f373139t, 8) || i(e86Var.f373139t, i39)) && snsInfo.isFireworkCheerAd() && bool3 != null && bool3.booleanValue()) {
                int b27 = k84.d4.V.b(snsInfo);
                d1Var.setColor(b27, 0);
                i57 = i28 > 0 ? i28 - 1 : i28;
                str9 = str9 + "_" + b27;
                i47 = i39;
            } else {
                i47 = i49;
                i57 = i28;
            }
            dVar.setSpan(d1Var, i57, i28 + str7.length(), 33);
        }
        if (i47 != 0) {
            dVar.f328577d = str10 + str9;
        }
        com.tencent.mm.plugin.sns.ui.widget.q2.l(context, snsInfo, e86Var, dVar, b().booleanValue(), i18, new com.tencent.mm.plugin.sns.ui.widget.m() { // from class: com.tencent.mm.plugin.sns.ui.widget.t2$$a
            @Override // com.tencent.mm.plugin.sns.ui.widget.m
            public final void a(r45.e86 e86Var2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$getCommentSpan$0", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                com.tencent.mm.plugin.sns.ui.widget.j3 j3Var = com.tencent.mm.plugin.sns.ui.widget.j3.f171174a;
                java.lang.String feedId = ca4.z0.t0(com.tencent.mm.plugin.sns.storage.SnsInfo.this.field_snsId);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markCommentContentClk", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
                kotlin.jvm.internal.o.g(feedId, "feedId");
                if (e86Var2 != null) {
                    ot5.g.c("MicroMsg.SnsSessionCmtReportManager", "markCommentEmoClk: " + feedId + ", " + e86Var2.f373132m);
                    com.tencent.mm.plugin.sns.ui.widget.g1 b28 = j3Var.b(feedId, java.lang.String.valueOf(e86Var2.f373132m), e86Var2.f373144y, e86Var2.f373130h);
                    if (e86Var2.f373144y == 1) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClkEmoCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                        int i76 = b28.f171139f;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClkEmoCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClkEmoCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                        b28.f171139f = i76 + 1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClkEmoCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClkPicCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                        int i77 = b28.f171140g;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClkPicCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClkPicCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                        b28.f171140g = i77 + 1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClkPicCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markCommentContentClk", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$getCommentSpan$0", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
            }
        });
        com.tencent.mm.plugin.sns.ui.widget.j3 j3Var = com.tencent.mm.plugin.sns.ui.widget.j3.f171174a;
        java.lang.String feedId = ca4.z0.t0(snsInfo.field_snsId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markCommentExp", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        ot5.g.c("MicroMsg.SnsSessionCmtReportManager", "markCommentExp: " + feedId + ", " + e86Var.f373132m);
        com.tencent.mm.plugin.sns.ui.widget.g1 b28 = j3Var.b(feedId, java.lang.String.valueOf(e86Var.f373132m), e86Var.f373144y, e86Var.f373130h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        int i76 = b28.f171136c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExpCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        b28.f171136c = i76 + i39;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExpCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markCommentExp", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(r45.k76 r8, r45.k76 r9) {
        /*
            java.lang.String r0 = "getMsgRelevanceType"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "isMessageRelatedToMe"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            r3 = 1
            r4 = 0
            if (r8 == 0) goto L30
            int r5 = r8.f378462h
            java.lang.String r6 = "isMentionedMySelf"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
            r7 = 4
            if (r5 != r7) goto L1e
            r5 = r3
            goto L1f
        L1e:
            r5 = r4
        L1f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L30
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L3d
        L30:
            if (r9 == 0) goto L3f
            java.lang.String r9 = r9.f378458d
            boolean r9 = l(r9)
            if (r9 == 0) goto L3f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L3d:
            r4 = r3
            goto L52
        L3f:
            if (r8 == 0) goto L4f
            int r8 = r8.f378472u
            r9 = 131072(0x20000, float:1.83671E-40)
            boolean r8 = i(r8, r9)
            if (r8 == 0) goto L4f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L3d
        L4f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L52:
            if (r4 == 0) goto L58
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L58:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r8 = 2
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.t2.g(r45.k76, r45.k76):int");
    }

    public static java.lang.Boolean h(com.tencent.mm.plugin.sns.storage.ADXml aDXml, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        if (aDXml != null) {
            if (aDXml.usePreferedInfo) {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                return bool;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(aDXml.nickname)) {
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                return bool2;
            }
        }
        java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return bool3;
    }

    public static boolean i(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasCommentFlag", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        boolean z17 = (i17 & i18) == i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasCommentFlag", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r8.remove(r4);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 158);
        com.tencent.mars.xlog.Log.i("SnsCommentUtil", "hideAdFirstBossComment, del comment, idx=" + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(java.util.LinkedList r8) {
        /*
            java.lang.String r0 = "SnsCommentUtil"
            java.lang.String r1 = "hideAdFirstBossComment, size="
            java.lang.String r2 = "hideAdFirstBossComment"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6d
            r4.<init>(r1)     // Catch: java.lang.Exception -> L6d
            int r1 = r8.size()     // Catch: java.lang.Exception -> L6d
            r4.append(r1)     // Catch: java.lang.Exception -> L6d
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L6d
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L6d
            r1 = 0
            r4 = r1
        L22:
            int r5 = r8.size()     // Catch: java.lang.Exception -> L6d
            if (r4 >= r5) goto L87
            java.lang.Object r5 = r8.get(r4)     // Catch: java.lang.Exception -> L6d
            r45.e86 r5 = (r45.e86) r5     // Catch: java.lang.Exception -> L6d
            java.lang.String r6 = "isAdBossFirstComment"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)     // Catch: java.lang.Exception -> L6d
            if (r5 != 0) goto L3b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)     // Catch: java.lang.Exception -> L6d
            r5 = r1
            goto L46
        L3b:
            int r5 = r5.f373139t     // Catch: java.lang.Exception -> L6d
            r7 = 32
            boolean r5 = i(r5, r7)     // Catch: java.lang.Exception -> L6d
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)     // Catch: java.lang.Exception -> L6d
        L46:
            if (r5 == 0) goto L6a
            r8.remove(r4)     // Catch: java.lang.Exception -> L6d
            com.tencent.mm.plugin.report.service.g0 r8 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Exception -> L6d
            r1 = 1612(0x64c, float:2.259E-42)
            r5 = 158(0x9e, float:2.21E-43)
            r8.A(r1, r5)     // Catch: java.lang.Exception -> L6d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6d
            r8.<init>()     // Catch: java.lang.Exception -> L6d
            java.lang.String r1 = "hideAdFirstBossComment, del comment, idx="
            r8.append(r1)     // Catch: java.lang.Exception -> L6d
            r8.append(r4)     // Catch: java.lang.Exception -> L6d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L6d
            com.tencent.mars.xlog.Log.i(r0, r8)     // Catch: java.lang.Exception -> L6d
            goto L87
        L6a:
            int r4 = r4 + 1
            goto L22
        L6d:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "hideAdFirstBossComment, exp="
            r1.<init>(r4)
            java.lang.String r4 = r8.toString()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.e(r0, r1)
            ca4.q.c(r2, r8)
        L87:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.t2.j(java.util.LinkedList):void");
    }

    public static boolean k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdBossComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        boolean z17 = snsInfo != null && snsInfo.isAd() && str != null && str.equals(snsInfo.getUserName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdBossComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return z17;
    }

    public static boolean l(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCurUserName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        if (str == null || str.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCurUserName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        com.tencent.mars.xlog.Log.i("SnsCommentUtil", "isCurUserName currentUserName: " + r17 + " fromUsrName: " + str);
        boolean equals = str.equals(r17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCurUserName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return equals;
    }

    public static boolean m(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDeletedComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        boolean z17 = e86Var != null && e86Var.f373138s > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDeletedComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return z17;
    }

    public static synchronized void n(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo, java.util.LinkedList linkedList) {
        synchronized (com.tencent.mm.plugin.sns.ui.widget.t2.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preHandleAdComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
            if (linkedList != null && linkedList.size() != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preHandleAdComment, snsId=");
                sb6.append(adSnsInfo == null ? "" : ca4.z0.t0(adSnsInfo.field_snsId));
                com.tencent.mars.xlog.Log.i("SnsCommentUtil", sb6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHideAdFirstBossComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpEnableHideAdFirstComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                boolean z17 = true;
                boolean z18 = ca4.m0.u0(e42.c0.clicfg_ad_enable_hide_first_boss_comment, 1) == 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpEnableHideAdFirstComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                boolean z19 = z18 && adSnsInfo != null && adSnsInfo.getAdXml().dynamicCommonConfig.f359958b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHideAdFirstBossComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                if (z19) {
                    j(linkedList);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preHandleAdComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                    return;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpEnableAdjustPosition", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                if (ca4.m0.u0(e42.c0.clicfg_ad_enable_adjust_first_boss_comment_pos, 1) != 1) {
                    z17 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpEnableAdjustPosition", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                if (z17) {
                    a(linkedList);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preHandleAdComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                return;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preHandleAdComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        }
    }

    public static boolean o(android.widget.ImageView imageView, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("trySetAdBossCommentAvater", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        boolean z17 = false;
        if (snsInfo != null && k(snsInfo, str) && (adXml = snsInfo.getAdXml()) != null && adXml.usePreferedInfo && !android.text.TextUtils.isEmpty(adXml.preferAvatar)) {
            java.lang.String str2 = adXml.preferAvatar;
            imageView.setTag(com.tencent.mm.R.id.nae, str2);
            com.tencent.mars.xlog.Log.i("SnsCommentUtil", "trySetAdBossCommentAvater, isSet=true");
            java.lang.String l17 = za4.t0.l("adId", str2);
            if (com.tencent.mm.vfs.w6.j(l17)) {
                if (n74.a2.d()) {
                    n74.a2.c(imageView, l17, 1);
                } else {
                    try {
                        android.graphics.Bitmap b17 = i64.m1.f289238c.b(l17);
                        if (b17 != null) {
                            imageView.setImageBitmap(b17);
                            com.tencent.mars.xlog.Log.i("SnsCommentUtil", "trySetAdBossCommentAvater use local cache, url=" + str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("SnsCommentUtil", "trySetAdBossCommentAvater decode exp=" + th6.toString());
                    }
                }
            } else if (n74.a2.d()) {
                com.tencent.mars.xlog.Log.i("SnsCommentUtil", "detail: download use avatar with cdn, but the statement should not reach!");
                n74.a2.a(imageView, str2, 1);
            } else {
                za4.t0.a(str2, false, 41, 0, new com.tencent.mm.plugin.sns.ui.widget.v2(str2, imageView));
            }
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("trySetAdBossCommentAvater", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return z17;
    }
}
