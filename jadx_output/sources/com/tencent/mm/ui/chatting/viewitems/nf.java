package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class nf {
    public static void a(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.lf lfVar, ot0.a aVar, tt0.e eVar) {
        if (eVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(eVar.field_content)) {
            lfVar.f204472k.setVisibility(0);
            lfVar.f204472k.setText(eVar.field_content);
            lfVar.f204472k.setTextColor(com.tencent.mm.sdk.platformtools.t8.f(eVar.field_contentColor, dVar.g().getResources().getColor(com.tencent.mm.R.color.a0c)));
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f348350f)) {
                lfVar.f204472k.setVisibility(8);
                return;
            }
            lfVar.f204472k.setVisibility(0);
            lfVar.f204472k.setText(aVar.f348350f);
            lfVar.f204472k.setTextColor(com.tencent.mm.sdk.platformtools.t8.f(aVar.f348351g, dVar.g().getResources().getColor(com.tencent.mm.R.color.a0c)));
        }
    }

    public static void b(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.lf lfVar, ot0.a aVar, ot0.q qVar, tt0.e eVar) {
        if (eVar == null || eVar.field_msgType != 0) {
            lfVar.f204480s.setVisibility(8);
            return;
        }
        int i17 = eVar.field_btnState;
        if (i17 == 0) {
            lfVar.f204480s.setVisibility(8);
            return;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                lfVar.f204480s.setVisibility(0);
                lfVar.f204480s.setText(aVar.f348354j);
                return;
            }
            return;
        }
        if (eVar.field_msgState == 1) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f348355k)) {
                lfVar.f204480s.setVisibility(8);
                return;
            } else {
                lfVar.f204480s.setVisibility(0);
                lfVar.f204480s.setText(aVar.f348355k);
                return;
            }
        }
        if (android.text.TextUtils.isEmpty(aVar.f348352h) || android.text.TextUtils.isEmpty(aVar.f348353i)) {
            lfVar.f204480s.setVisibility(8);
            return;
        }
        lfVar.f204480s.setVisibility(0);
        java.lang.String replace = aVar.f348352h.replace("$button$", aVar.f348353i);
        android.text.SpannableString spannableString = new android.text.SpannableString(replace);
        com.tencent.mm.ui.chatting.viewitems.cf cfVar = new com.tencent.mm.ui.chatting.viewitems.cf(1, null, qVar, aVar, lfVar, aVar.f348354j, dVar);
        int indexOf = replace.indexOf(aVar.f348353i);
        int length = aVar.f348353i.length() + indexOf;
        if (indexOf <= 0 || length <= 0 || indexOf >= length) {
            lfVar.f204480s.setVisibility(8);
            return;
        }
        spannableString.setSpan(cfVar, indexOf, length, 17);
        lfVar.f204480s.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        lfVar.f204480s.setText(spannableString);
    }

    public static void c(com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent, ot0.q qVar) {
        ot0.a aVar;
        java.lang.String str;
        if (startAppBrandUIFromOuterEvent == null || qVar == null || (aVar = (ot0.a) qVar.y(ot0.a.class)) == null) {
            return;
        }
        boolean z17 = aVar.f348367w;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("isPrivateMessage", z17);
            str = jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeAppPrivateMessageNativeExtraData", e17, "", new java.lang.Object[0]);
            str = "{}";
        }
        startAppBrandUIFromOuterEvent.f54857g.G = str;
    }

    public static void d(yb5.d dVar, ot0.q qVar) {
        tt0.e Ai = ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Ai(qVar.f348693o2);
        if (Ai == null || Ai.field_msgType == 0) {
            cm.c1 c1Var = cm.c1.DEFAULT;
            cm.d1 d1Var = cm.d1.DEFAULT;
            if (Ai != null) {
                int i17 = Ai.field_msgState;
                if (i17 == 1) {
                    c1Var = cm.c1.DONE;
                } else if (i17 == 0) {
                    c1Var = cm.c1.DOING;
                }
                int i18 = Ai.field_btnState;
                if (i18 == 2) {
                    d1Var = cm.d1.SUBSCRIBE;
                } else if (i18 == 0 || i18 == 1) {
                    d1Var = cm.d1.NOTSUBSCRIBE;
                }
            }
            ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
            int i19 = aVar != null ? aVar.f348348d : 0;
            com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct wxaUpdatableMsgReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct();
            wxaUpdatableMsgReportStruct.f63050d = wxaUpdatableMsgReportStruct.b("AppId", qVar.f348677k2, true);
            wxaUpdatableMsgReportStruct.f63051e = wxaUpdatableMsgReportStruct.b("PageId", qVar.f348669i2, true);
            wxaUpdatableMsgReportStruct.f63053g = wxaUpdatableMsgReportStruct.b("ShareTicket", qVar.f348693o2, true);
            wxaUpdatableMsgReportStruct.f63054h = wxaUpdatableMsgReportStruct.b("ChattingId", dVar.x(), true);
            wxaUpdatableMsgReportStruct.f63055i = dVar.D() ? cm.b1.YES : cm.b1.NO;
            wxaUpdatableMsgReportStruct.f63056j = cm.a1.CLICKAPPMSG;
            wxaUpdatableMsgReportStruct.f63057k = 0L;
            wxaUpdatableMsgReportStruct.f63058l = wxaUpdatableMsgReportStruct.b("SceneNote", "", true);
            wxaUpdatableMsgReportStruct.f63061o = cm.z0.a(i19 + 1000);
            wxaUpdatableMsgReportStruct.f63052f = wxaUpdatableMsgReportStruct.i();
            wxaUpdatableMsgReportStruct.f63059m = c1Var;
            wxaUpdatableMsgReportStruct.f63060n = d1Var;
            wxaUpdatableMsgReportStruct.k();
        }
    }
}
