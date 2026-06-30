package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class t extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.t f186532d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.t();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        jz5.f0 f0Var;
        java.lang.String obj;
        java.lang.String obj2;
        java.lang.String obj3;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseChatRoomMember", "handleMsg params:" + msg.f340790a);
        android.content.Context context = env.f340860a;
        if (context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
            java.lang.Object obj4 = msg.f340790a.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            java.lang.String str2 = (obj4 == null || (obj3 = obj4.toString()) == null) ? "" : obj3;
            java.lang.Object obj5 = msg.f340790a.get("chatRoomUserName");
            java.lang.String str3 = (obj5 == null || (obj2 = obj5.toString()) == null) ? "" : obj2;
            java.lang.Object obj6 = msg.f340790a.get("selectedUserNameList");
            java.lang.String str4 = (obj6 == null || (obj = obj6.toString()) == null) ? "" : obj;
            java.lang.Object obj7 = msg.f340790a.get("allUserNameList");
            if (obj7 == null || (str = obj7.toString()) == null) {
                str = "";
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str5 : r26.n0.f0(str4, new java.lang.String[]{","}, false, 0, 6, null)) {
                if (!r26.n0.N(str5)) {
                    arrayList.add(str5);
                }
            }
            for (java.lang.String str6 : r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null)) {
                if (!r26.n0.N(str6)) {
                    arrayList2.add(str6);
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mm.ui.vc startActivityForResult = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).startActivityForResult(((qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class))).wi((androidx.appcompat.app.AppCompatActivity) context, str2, str3, arrayList, arrayList2));
            if (startActivityForResult != null) {
                ((com.tencent.mm.ui.bd) startActivityForResult).f197877a = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s(hashMap, env, msg);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                hashMap.put("errCode", -1);
                hashMap.put("action", -1);
                env.f340863d.e(msg.f341013c, msg.f341019i + ":fail", hashMap);
            }
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 457;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "chooseChatRoomMember";
    }
}
