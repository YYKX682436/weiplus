package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class pb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.pb f186437d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.pb();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get("addrs");
        nw4.g gVar = env.f340863d;
        if (obj == null) {
            gVar.e(msg.f341013c, "sameNetVerify:fail addrs is null or empty", null);
            return true;
        }
        java.lang.String obj2 = obj.toString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            cl0.e eVar = new cl0.e(obj2);
            int length = eVar.length();
            for (int i17 = 0; i17 < length; i17++) {
                if (eVar.getString(i17) != null) {
                    arrayList.add(eVar.getString(i17));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("SameNetVerifyTAG", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("SameNetVerifyTAG", "addrs:" + arrayList);
        if (arrayList.isEmpty()) {
            gVar.e(msg.f341013c, "sameNetVerify:fail addrs is null or empty", null);
            return true;
        }
        com.tencent.wechat.aff.same_net_verify.b.f217486b.b(arrayList, "", new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ob(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 551;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "sameNetVerify";
    }
}
