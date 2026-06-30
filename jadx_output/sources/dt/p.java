package dt;

/* loaded from: classes15.dex */
public class p extends com.tencent.mm.sdk.event.n {
    public p() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        int i17;
        java.lang.Object obj;
        com.tencent.mm.autogen.events.ExtCallBizEvent extCallBizEvent = (com.tencent.mm.autogen.events.ExtCallBizEvent) iEvent;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        if (extCallBizEvent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:event is null.");
            return false;
        }
        am.x7 x7Var = extCallBizEvent.f54189g;
        if (x7Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:event.data is null.");
            return false;
        }
        int i18 = x7Var.f8362a;
        if (i18 == 27) {
            java.lang.String[] strArr = x7Var.f8366e;
            if (strArr == null || strArr.length < 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent selectionArgs error.");
            } else {
                java.lang.String str2 = strArr[0];
                java.lang.String str3 = strArr[1];
                str = "";
                if (strArr.length >= 3) {
                    java.lang.String str4 = strArr[2];
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    str = str4 != null ? str4 : "";
                    try {
                        str = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
                    } catch (java.io.UnsupportedEncodingException unused) {
                    }
                }
                if (str2 == null || str3 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent wrong args, %s, %s", str2, str3);
                } else {
                    java.lang.String[] strArr2 = x7Var.f8366e;
                    if (strArr2.length >= 4) {
                        java.lang.String str5 = strArr2[3];
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                            i17 = com.tencent.mm.sdk.platformtools.t8.P(str5, 0);
                            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "ExtCallBizEvent jump biz tempSession");
                            java.lang.String format = java.lang.String.format("weixin://dl/business/tempsession/?username=%s&appid=%s&sessionFrom=%s&showtype=%s&scene=%s", str3, str2, str, java.lang.Integer.valueOf(i17), 0);
                            android.content.Intent intent = new android.content.Intent(x7Var.f8364c, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity.class);
                            intent.addFlags(268435456);
                            intent.setData(android.net.Uri.parse(format));
                            intent.putExtra("translate_link_scene", 1);
                            android.content.Context context = x7Var.f8364c;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(intent);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerProfile", "callbackOfExtCallBizEvent", "(Lcom/tencent/mm/autogen/events/ExtCallBizEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            context.startActivity((android.content.Intent) arrayList.get(0));
                            yj0.a.f(context, "com/tencent/mm/app/WorkerProfile", "callbackOfExtCallBizEvent", "(Lcom/tencent/mm/autogen/events/ExtCallBizEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    }
                    i17 = 0;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "ExtCallBizEvent jump biz tempSession");
                    java.lang.String format2 = java.lang.String.format("weixin://dl/business/tempsession/?username=%s&appid=%s&sessionFrom=%s&showtype=%s&scene=%s", str3, str2, str, java.lang.Integer.valueOf(i17), 0);
                    android.content.Intent intent2 = new android.content.Intent(x7Var.f8364c, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity.class);
                    intent2.addFlags(268435456);
                    intent2.setData(android.net.Uri.parse(format2));
                    intent2.putExtra("translate_link_scene", 1);
                    android.content.Context context2 = x7Var.f8364c;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/app/WorkerProfile", "callbackOfExtCallBizEvent", "(Lcom/tencent/mm/autogen/events/ExtCallBizEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context2, "com/tencent/mm/app/WorkerProfile", "callbackOfExtCallBizEvent", "(Lcom/tencent/mm/autogen/events/ExtCallBizEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        } else if (i18 != 28) {
            android.content.Context context3 = x7Var.f8364c;
            java.lang.String[] strArr3 = x7Var.f8366e;
            java.lang.String[] strArr4 = x7Var.f8365d;
            int i19 = x7Var.f8363b;
            if (context3 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:context is null.");
                context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            if (strArr3 == null || strArr3.length < 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:args error.");
                return false;
            }
            for (java.lang.String str6 : strArr3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "arg : %s", str6);
            }
            java.lang.String str7 = strArr3[0];
            java.lang.String str8 = strArr3[1];
            java.lang.String str9 = strArr3.length > 2 ? strArr3[2] : null;
            int P = strArr3.length > 3 ? com.tencent.mm.sdk.platformtools.t8.P(strArr3[3], 0) : 0;
            int P2 = strArr3.length > 4 ? com.tencent.mm.sdk.platformtools.t8.P(strArr3[4], 0) : 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:source(%d)", java.lang.Integer.valueOf(i19));
            if (i19 == 1) {
                obj = null;
                if (strArr4 == null || strArr4.length == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:packageNames is null or nil.");
                    return false;
                }
            } else {
                if (i19 != 2) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:source is out of range.");
                    return false;
                }
                obj = null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:fromURL(%s) is null or nil.", null);
                    return false;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener: appId(%s), toUserName(%s), extInfo(%s), fromURL(%s)", str7, str8, str9, obj);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str7) || com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "appId or toUsername is null or nil.");
                return false;
            }
            int i27 = P == 1 ? 8 : P == 0 ? 7 : 0;
            android.content.Intent intent3 = new android.content.Intent(context3, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
            intent3.putExtra("key_command_id", i27);
            intent3.putExtra("appId", str7);
            intent3.putExtra("toUserName", str8);
            intent3.putExtra("extInfo", str9);
            intent3.putExtra(ya.b.SOURCE, i19);
            intent3.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, P);
            intent3.putExtra("jump_profile_type", P2);
            intent3.addFlags(268435456).addFlags(67108864);
            if (strArr4 != null && strArr4.length > 0) {
                java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
                for (java.lang.String str10 : strArr4) {
                    arrayList3.add(str10);
                }
                intent3.putStringArrayListExtra("androidPackNameList", arrayList3);
            }
            com.tencent.mm.plugin.base.stub.e0.t(intent3, context3);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "ExtCallBizEvent open exdevice rank list.");
            android.content.Context context4 = x7Var.f8364c;
            android.content.Intent intent4 = new android.content.Intent(context4, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
            intent4.addFlags(268435456);
            intent4.putExtra("key_command_id", 11);
            com.tencent.mm.plugin.base.stub.e0.t(intent4, context4);
        }
        return true;
    }
}
