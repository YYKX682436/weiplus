package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class m1 implements nw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.r1 f187862a;

    public m1(com.tencent.mm.plugin.webview.webcompt.r1 r1Var) {
        this.f187862a = r1Var;
    }

    @Override // nw4.e
    public final void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        kotlin.jvm.internal.o.d(str2);
        hashMap.put("err_msg", str2);
        if (map != null) {
            hashMap.putAll(map);
        }
        java.lang.String a17 = nw4.x2.a(str, hashMap, false, "");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeixinWebCompt._callback(");
        kotlin.jvm.internal.o.d(str);
        sb6.append(com.tencent.mm.plugin.webview.webcompt.a.c(str));
        sb6.append(", ");
        sb6.append(a17);
        sb6.append("['__params'])");
        com.tencent.mm.plugin.webview.webcompt.r1.a(this.f187862a, sb6.toString());
    }
}
