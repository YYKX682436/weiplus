package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class w5 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186604e;

    public w5(nw4.k kVar, nw4.y2 y2Var) {
        this.f186603d = kVar;
        this.f186604e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("ret", "navigateBackToSourceAppForWXPay:fail");
        java.lang.String string2 = bundle.getString("err_desc", "");
        java.util.HashMap hashMap = new java.util.HashMap();
        kotlin.jvm.internal.o.d(string2);
        if (string2.length() > 0) {
            hashMap.put("err_desc", string2);
        }
        this.f186603d.f340863d.e(this.f186604e.f341013c, string, hashMap);
    }
}
