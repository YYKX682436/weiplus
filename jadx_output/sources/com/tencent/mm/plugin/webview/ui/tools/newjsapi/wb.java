package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class wb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.wb f186610d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wb();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f186611e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f186612f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        f186611e = env;
        f186612f = msg;
        android.content.Context context = env.f340860a;
        java.lang.String str = (java.lang.String) msg.f340790a.get("titleName");
        new java.util.ArrayList();
        try {
            java.lang.Object obj = msg.f340790a.get("selectedUserNames");
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.lang.String) obj);
            int length = jSONArray.length();
            java.lang.String[] strArr = new java.lang.String[length];
            for (int i17 = 0; i17 < length; i17++) {
                strArr[i17] = jSONArray.get(i17);
            }
            arrayList = nf.e.e(strArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("JsApiSelectContacts", "Failed to parse selectedUserNames: " + e17.getMessage());
            arrayList = new java.util.ArrayList();
        }
        com.tencent.mars.xlog.Log.i("JsApiSelectContacts", "input json selectedUserNames: " + arrayList);
        rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
        if (str == null) {
            str = env.f340860a.getString(com.tencent.mm.R.string.nja);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        ((qd0.q0) e1Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent.putExtra("titile", str);
        if (!arrayList.isEmpty()) {
            intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
        }
        intent.putExtra("default_multi_search", true);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(c01.z1.r());
        arrayList2.add("weixin");
        arrayList2.add("filehelper");
        arrayList2.addAll(c01.e2.i());
        arrayList2.addAll(c01.e2.h());
        arrayList2.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri());
        arrayList2.remove("message_fold");
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList2)) {
            intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, ","));
        }
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.k.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.v0.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.h1.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.e0.class);
        intent.putExtra("KOrientation", 1);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.r0.class);
        pf5.j0.a(intent, cj5.j0.class);
        intent.putExtra("KEY_IS_ONLY_MULTI_SELECT_MODE", true);
        intent.putExtra("max_limit_num", 9);
        intent.putExtra("too_many_member_tip_string", context.getString(com.tencent.mm.R.string.ifr, 9));
        intent.putExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", true);
        pf5.j0.a(intent, cj5.y2.class);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
            com.tencent.mars.xlog.Log.i("JsApiSelectContacts", "ui is MMActivity");
            ((com.tencent.mm.ui.bd) ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).startActivityForResult(intent)).f197877a = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.tb(hashMap);
        } else if ((context instanceof com.tencent.mm.ext.ui.SwipeBackActivity) && (context instanceof q80.z)) {
            com.tencent.mars.xlog.Log.i("JsApiSelectContacts", "env.context is SwipeBackActivity  && env.context is ILiteAppFeatureService.ISetOnActivityResult");
            ((q80.z) context).R1(com.tencent.mm.plugin.webview.ui.tools.newjsapi.ub.f186562a);
            ((com.tencent.mm.ext.ui.SwipeBackActivity) context).startActivityForResult(intent, 223);
        } else {
            env.f340863d.e(msg.f341013c, msg.f341019i + ":fail ui is unknown type", hashMap);
            com.tencent.mars.xlog.Log.i("JsApiSelectContacts", "ui is unknown");
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 556;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "selectContacts";
    }
}
