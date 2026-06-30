package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public abstract class h7 extends com.tencent.mm.pluginsdk.ui.tools.a {
    public static void c(int i17, com.tencent.mm.pluginsdk.model.app.m mVar, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.util.LinkedList linkedList) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.pluginsdk.model.app.m mVar2 = mVar;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2 = wXMediaMessage;
        java.lang.String str3 = com.tencent.mapsdk.internal.rv.f51270c;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str4 = (java.lang.String) it.next();
            java.lang.String str5 = mVar2.field_appId;
            java.lang.String str6 = mVar2.field_appName;
            boolean k17 = mVar.k();
            int type = wXMediaMessage.getType();
            boolean R4 = com.tencent.mm.storage.z3.R4(str4);
            try {
                java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.a.b(wXMediaMessage);
                if (b17 == null) {
                    b17 = "";
                }
                java.lang.String b18 = fp.s0.b(b17, str3);
                java.lang.String a17 = com.tencent.mm.pluginsdk.ui.tools.a.a(wXMediaMessage);
                if (a17 == null) {
                    a17 = "";
                }
                java.lang.String b19 = fp.s0.b(a17, str3);
                java.lang.String str7 = wXMediaMessage2.title;
                if (str7 == null) {
                    str7 = "";
                }
                java.lang.String b27 = fp.s0.b(str7, str3);
                java.lang.String str8 = wXMediaMessage2.description;
                if (str8 == null) {
                    str8 = "";
                }
                java.lang.String b28 = fp.s0.b(str8, str3);
                str = str3;
                if (wXMediaMessage.getType() == 1) {
                    try {
                        str2 = ((com.tencent.mm.opensdk.modelmsg.WXTextObject) wXMediaMessage2.mediaObject).text;
                    } catch (java.io.UnsupportedEncodingException unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                        mVar2 = mVar;
                        wXMediaMessage2 = wXMediaMessage;
                        str3 = str;
                    }
                } else {
                    str2 = b28;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareReport", i17 + "," + str5 + "," + str6 + "," + (k17 ? 1 : 0) + "," + type + "," + (R4 ? 1 : 0) + ",1," + str4 + "," + b27 + "," + str2 + "," + b18 + ",,,," + b19);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16492, java.lang.Integer.valueOf(i17), str5, str6, java.lang.Integer.valueOf(k17 ? 1 : 0), java.lang.Integer.valueOf(type), java.lang.Integer.valueOf(R4 ? 1 : 0), 1, str4, b27, str2, b18, "", "", "", b19);
            } catch (java.io.UnsupportedEncodingException unused2) {
                str = str3;
            }
            mVar2 = mVar;
            wXMediaMessage2 = wXMediaMessage;
            str3 = str;
        }
    }
}
