package dk5;

/* loaded from: classes9.dex */
public class z4 implements dk5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f235017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235018b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f235019c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f235020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f235021e;

    public z4(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, int i17, java.util.LinkedList linkedList) {
        this.f235021e = sendAppMessageWrapperUI;
        this.f235017a = wXMediaMessage;
        this.f235018b = str;
        this.f235019c = i17;
        this.f235020d = linkedList;
    }

    public void b(int i17, java.lang.Object obj) {
        k91.v5 v5Var;
        java.util.Iterator it;
        com.tencent.mm.pluginsdk.model.app.m mVar;
        com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject wXMiniProgramObject;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage;
        java.lang.String str;
        char c17;
        java.lang.String b17;
        java.util.LinkedList linkedList;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        java.lang.String str2 = this.f235018b;
        int i18 = this.f235019c;
        int i19 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f235021e;
        sendAppMessageWrapperUI.getClass();
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2 = this.f235017a;
        if (wXMediaMessage2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendAppMessageWrapperUI", "dealSendWXMediaMessageCallBack error, WXMediaMessage == null");
            sendAppMessageWrapperUI.finish();
            return;
        }
        java.util.LinkedList linkedList2 = this.f235020d;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendAppMessageWrapperUI", "dealSendWXMediaMessageCallBack error, toUserList is isEmpty, status:%d, text:%s", java.lang.Integer.valueOf(i17), str2);
            sendAppMessageWrapperUI.finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "dealSendWXMediaMessageCallBack  status:%d, type:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(wXMediaMessage2.getType()));
        int type = wXMediaMessage2.getType();
        int i27 = 1;
        if (type == 2) {
            if (i17 == 1) {
                com.tencent.mm.pluginsdk.ui.tools.h7.c(sendAppMessageWrapperUI.f211031t, sendAppMessageWrapperUI.f211019e, wXMediaMessage2, linkedList2);
                return;
            }
            if (i17 == 2) {
                sendAppMessageWrapperUI.b7(str2, linkedList2, i18);
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                sendAppMessageWrapperUI.setResult(0);
                sendAppMessageWrapperUI.b7(str2, linkedList2, i18);
                return;
            }
        }
        if (type == 5) {
            if (i17 == 1) {
                com.tencent.mm.pluginsdk.ui.tools.h7.c(sendAppMessageWrapperUI.f211031t, sendAppMessageWrapperUI.f211019e, wXMediaMessage2, linkedList2);
                return;
            }
            if (i17 == 2) {
                sendAppMessageWrapperUI.b7(str2, linkedList2, i18);
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.C0(obj, "cb_msg_is_null") && !com.tencent.mm.sdk.platformtools.t8.C0(obj, "cb_key_user_list_is_empty")) {
                    sendAppMessageWrapperUI.finish();
                }
                sendAppMessageWrapperUI.b7(str2, linkedList2, i18);
                return;
            }
        }
        if (type == 8) {
            if (i17 != 1) {
                if (i17 == 2) {
                    sendAppMessageWrapperUI.b7(str2, linkedList2, i18);
                    return;
                } else {
                    if (i17 != 3) {
                        return;
                    }
                    sendAppMessageWrapperUI.finish();
                    return;
                }
            }
            if (obj instanceof java.lang.Integer) {
                int intValue = ((java.lang.Integer) obj).intValue();
                if (intValue > com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitSendThirdPartyAppMsgEmotionBufSize"), 524288)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "third party shared emoji can't bigger 512 KB");
                }
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                com.tencent.mm.pluginsdk.model.app.m mVar2 = sendAppMessageWrapperUI.f211019e;
                g0Var.d(13461, mVar2.field_appId, mVar2.field_appName, java.lang.Integer.valueOf(intValue));
                return;
            }
            return;
        }
        if (type != 36) {
            if (type == 38) {
                if (i17 == 1) {
                    com.tencent.mm.pluginsdk.ui.tools.h7.c(sendAppMessageWrapperUI.f211031t, sendAppMessageWrapperUI.f211019e, wXMediaMessage2, linkedList2);
                    return;
                }
                if (i17 == 2) {
                    if (obj instanceof com.tencent.mm.pluginsdk.model.c3) {
                        linkedList = linkedList2;
                        sendAppMessageWrapperUI.f211024m = db5.e1.Q(sendAppMessageWrapperUI, sendAppMessageWrapperUI.getString(com.tencent.mm.R.string.f490573yv), sendAppMessageWrapperUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new dk5.d5(sendAppMessageWrapperUI, obj));
                    } else {
                        linkedList = linkedList2;
                    }
                    sendAppMessageWrapperUI.b7(str2, linkedList, i18);
                    return;
                }
                if (i17 == 3) {
                    sendAppMessageWrapperUI.b7(str2, linkedList2, i18);
                    return;
                } else {
                    if (i17 == 6 && (u3Var = sendAppMessageWrapperUI.f211024m) != null) {
                        u3Var.dismiss();
                        sendAppMessageWrapperUI.f211024m = null;
                        return;
                    }
                    return;
                }
            }
            if (type == 76) {
                if (i17 == 1) {
                    sendAppMessageWrapperUI.f211024m = com.tencent.mm.ui.widget.dialog.u3.f(sendAppMessageWrapperUI, sendAppMessageWrapperUI.getString(com.tencent.mm.R.string.ggc), true, 0, null);
                    return;
                }
                if (i17 != 2) {
                    if (i17 == 3) {
                        if (com.tencent.mm.sdk.platformtools.t8.C0(obj, "cb_msg_is_null") || com.tencent.mm.sdk.platformtools.t8.C0(obj, "cb_key_user_list_is_empty")) {
                            return;
                        }
                        sendAppMessageWrapperUI.finish();
                        return;
                    }
                    if (i17 == 5) {
                        com.tencent.mm.pluginsdk.model.app.m5.c(sendAppMessageWrapperUI, com.tencent.mm.pluginsdk.model.app.m5.a(sendAppMessageWrapperUI.getIntent().getExtras(), -1), true, false);
                        sendAppMessageWrapperUI.finish();
                        return;
                    } else if (i17 != 6) {
                        return;
                    }
                }
                sendAppMessageWrapperUI.runOnUiThread(new dk5.e5(sendAppMessageWrapperUI, str2, linkedList2, i18));
                return;
            }
            if (type == 45) {
                if (i17 == 1) {
                    com.tencent.mm.pluginsdk.ui.tools.h7.c(sendAppMessageWrapperUI.f211031t, sendAppMessageWrapperUI.f211019e, wXMediaMessage2, linkedList2);
                    return;
                }
                if (i17 == 2) {
                    sendAppMessageWrapperUI.b7(str2, linkedList2, i18);
                    return;
                } else {
                    if (i17 != 3) {
                        return;
                    }
                    sendAppMessageWrapperUI.setResult(0);
                    sendAppMessageWrapperUI.finish();
                    sendAppMessageWrapperUI.b7(str2, linkedList2, i18);
                    return;
                }
            }
            if (type != 46 && type != 48) {
                if (type == 49) {
                    sendAppMessageWrapperUI.Z6(i17, obj, wXMediaMessage2, str2, i18, linkedList2);
                    return;
                }
                if (i17 == 1) {
                    com.tencent.mm.pluginsdk.ui.tools.h7.c(sendAppMessageWrapperUI.f211031t, sendAppMessageWrapperUI.f211019e, wXMediaMessage2, linkedList2);
                    return;
                }
                if (i17 == 2) {
                    sendAppMessageWrapperUI.b7(str2, linkedList2, i18);
                    return;
                } else {
                    if (i17 != 3) {
                        return;
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.C0(obj, "cb_msg_is_null") && !com.tencent.mm.sdk.platformtools.t8.C0(obj, "cb_key_user_list_is_empty")) {
                        sendAppMessageWrapperUI.finish();
                    }
                    sendAppMessageWrapperUI.b7(str2, linkedList2, i18);
                    return;
                }
            }
        }
        if (i17 == 2 || i17 == 3) {
            sendAppMessageWrapperUI.b7(str2, linkedList2, i18);
            return;
        }
        if (i17 != 4) {
            if (i17 == 5) {
                sendAppMessageWrapperUI.setResult(-1);
                sendAppMessageWrapperUI.finish();
                com.tencent.mm.pluginsdk.model.app.m5.c(sendAppMessageWrapperUI, com.tencent.mm.pluginsdk.model.app.m5.a(sendAppMessageWrapperUI.getIntent().getExtras(), -1), true, false);
                return;
            }
            if (i17 == 6 && obj != null && (obj instanceof java.lang.String) && (wXMediaMessage2.mediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject)) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it6.next();
                    boolean endsWith = str3.endsWith("chatroom");
                    com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject wXMiniProgramObject2 = (com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) wXMediaMessage2.mediaObject;
                    java.lang.String str4 = wXMiniProgramObject2.webpageUrl;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str4 == null) {
                        str4 = "";
                    }
                    java.lang.String a17 = fp.s0.a(str4);
                    java.lang.String str5 = wXMediaMessage2.title;
                    if (str5 == null) {
                        str5 = "";
                    }
                    java.lang.String a18 = fp.s0.a(str5);
                    java.lang.String str6 = wXMediaMessage2.description;
                    if (str6 == null) {
                        str6 = "";
                    }
                    java.lang.String a19 = fp.s0.a(str6);
                    java.lang.String str7 = wXMiniProgramObject2.path;
                    if (str7 == null) {
                        str7 = "";
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14127, sendAppMessageWrapperUI.f211019e.field_appId, wXMiniProgramObject2.userName, fp.s0.a(str7), a18, a19, "", a17, 0, java.lang.Integer.valueOf(i27), 0, java.lang.Integer.valueOf(endsWith ? 1 : 0), str3, java.lang.Integer.valueOf(i27), obj, "");
                    wXMediaMessage2 = wXMediaMessage2;
                    sendAppMessageWrapperUI = sendAppMessageWrapperUI;
                    i27 = 1;
                }
                return;
            }
            return;
        }
        if (obj instanceof k91.v5) {
            int i28 = sendAppMessageWrapperUI.f211031t;
            com.tencent.mm.pluginsdk.model.app.m mVar3 = sendAppMessageWrapperUI.f211019e;
            k91.v5 v5Var2 = (k91.v5) obj;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage3 = wXMediaMessage2;
            com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject wXMiniProgramObject3 = (com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) wXMediaMessage3.mediaObject;
            java.lang.String str8 = com.tencent.mapsdk.internal.rv.f51270c;
            java.util.Iterator it7 = linkedList2.iterator();
            while (it7.hasNext()) {
                java.lang.String str9 = (java.lang.String) it7.next();
                java.lang.String str10 = mVar3.field_appId;
                java.lang.String str11 = mVar3.field_appName;
                boolean k17 = mVar3.k();
                int type2 = wXMediaMessage3.getType();
                boolean R4 = com.tencent.mm.storage.z3.R4(str9);
                try {
                    java.lang.String str12 = wXMiniProgramObject3.webpageUrl;
                    if (str12 == null) {
                        str12 = "";
                    }
                    b17 = fp.s0.b(str12, str8);
                    it = it7;
                } catch (java.io.UnsupportedEncodingException unused) {
                    v5Var = v5Var2;
                    it = it7;
                }
                try {
                    java.lang.String str13 = wXMediaMessage3.title;
                    if (str13 == null) {
                        str13 = "";
                    }
                    java.lang.String b18 = fp.s0.b(str13, str8);
                    mVar = mVar3;
                    try {
                        java.lang.String str14 = wXMediaMessage3.description;
                        if (str14 == null) {
                            str14 = "";
                        }
                        java.lang.String b19 = fp.s0.b(str14, str8);
                        wXMediaMessage = wXMediaMessage3;
                        try {
                            java.lang.String str15 = v5Var2.field_appId;
                            v5Var = v5Var2;
                            try {
                                java.lang.String str16 = wXMiniProgramObject3.path;
                                if (str16 == null) {
                                    str16 = "";
                                }
                                java.lang.String b27 = fp.s0.b(str16, str8);
                                str = str8;
                                try {
                                    int i29 = wXMiniProgramObject3.miniprogramType;
                                    wXMiniProgramObject = wXMiniProgramObject3;
                                    try {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareReport", i28 + "," + str10 + "," + str11 + "," + (k17 ? 1 : 0) + "," + type2 + "," + (R4 ? 1 : 0) + ",1," + str9 + "," + b18 + "," + b19 + "," + b17 + "," + str15 + "," + b27 + "," + i29);
                                        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                        java.lang.Object[] objArr = new java.lang.Object[15];
                                        objArr[0] = java.lang.Integer.valueOf(i28);
                                        objArr[1] = str10;
                                        objArr[2] = str11;
                                        objArr[3] = java.lang.Integer.valueOf(k17 ? 1 : 0);
                                        java.lang.Integer valueOf = java.lang.Integer.valueOf(type2);
                                        c17 = 4;
                                        try {
                                            objArr[4] = valueOf;
                                            try {
                                                objArr[5] = java.lang.Integer.valueOf(R4 ? 1 : 0);
                                                try {
                                                    objArr[6] = 1;
                                                    objArr[7] = str9;
                                                    try {
                                                        objArr[8] = b18;
                                                        objArr[9] = b19;
                                                        objArr[10] = b17;
                                                        objArr[11] = str15;
                                                        objArr[12] = b27;
                                                        objArr[13] = java.lang.Integer.valueOf(i29);
                                                        objArr[14] = "";
                                                        g0Var2.d(16492, objArr);
                                                    } catch (java.io.UnsupportedEncodingException unused2) {
                                                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                        it7 = it;
                                                        v5Var2 = v5Var;
                                                        mVar3 = mVar;
                                                        wXMediaMessage3 = wXMediaMessage;
                                                        str8 = str;
                                                        wXMiniProgramObject3 = wXMiniProgramObject;
                                                    }
                                                } catch (java.io.UnsupportedEncodingException unused3) {
                                                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                    it7 = it;
                                                    v5Var2 = v5Var;
                                                    mVar3 = mVar;
                                                    wXMediaMessage3 = wXMediaMessage;
                                                    str8 = str;
                                                    wXMiniProgramObject3 = wXMiniProgramObject;
                                                }
                                            } catch (java.io.UnsupportedEncodingException unused4) {
                                            }
                                        } catch (java.io.UnsupportedEncodingException unused5) {
                                            com.tencent.mars.xlog.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                            it7 = it;
                                            v5Var2 = v5Var;
                                            mVar3 = mVar;
                                            wXMediaMessage3 = wXMediaMessage;
                                            str8 = str;
                                            wXMiniProgramObject3 = wXMiniProgramObject;
                                        }
                                    } catch (java.io.UnsupportedEncodingException unused6) {
                                        c17 = 4;
                                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                        it7 = it;
                                        v5Var2 = v5Var;
                                        mVar3 = mVar;
                                        wXMediaMessage3 = wXMediaMessage;
                                        str8 = str;
                                        wXMiniProgramObject3 = wXMiniProgramObject;
                                    }
                                } catch (java.io.UnsupportedEncodingException unused7) {
                                    wXMiniProgramObject = wXMiniProgramObject3;
                                }
                            } catch (java.io.UnsupportedEncodingException unused8) {
                                wXMiniProgramObject = wXMiniProgramObject3;
                                str = str8;
                                c17 = 4;
                                com.tencent.mars.xlog.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                it7 = it;
                                v5Var2 = v5Var;
                                mVar3 = mVar;
                                wXMediaMessage3 = wXMediaMessage;
                                str8 = str;
                                wXMiniProgramObject3 = wXMiniProgramObject;
                            }
                        } catch (java.io.UnsupportedEncodingException unused9) {
                            v5Var = v5Var2;
                        }
                    } catch (java.io.UnsupportedEncodingException unused10) {
                        v5Var = v5Var2;
                        wXMiniProgramObject = wXMiniProgramObject3;
                        wXMediaMessage = wXMediaMessage3;
                        str = str8;
                        c17 = 4;
                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                        it7 = it;
                        v5Var2 = v5Var;
                        mVar3 = mVar;
                        wXMediaMessage3 = wXMediaMessage;
                        str8 = str;
                        wXMiniProgramObject3 = wXMiniProgramObject;
                    }
                } catch (java.io.UnsupportedEncodingException unused11) {
                    v5Var = v5Var2;
                    mVar = mVar3;
                    wXMiniProgramObject = wXMiniProgramObject3;
                    wXMediaMessage = wXMediaMessage3;
                    str = str8;
                    c17 = 4;
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                    it7 = it;
                    v5Var2 = v5Var;
                    mVar3 = mVar;
                    wXMediaMessage3 = wXMediaMessage;
                    str8 = str;
                    wXMiniProgramObject3 = wXMiniProgramObject;
                }
                it7 = it;
                v5Var2 = v5Var;
                mVar3 = mVar;
                wXMediaMessage3 = wXMediaMessage;
                str8 = str;
                wXMiniProgramObject3 = wXMiniProgramObject;
            }
        }
    }
}
