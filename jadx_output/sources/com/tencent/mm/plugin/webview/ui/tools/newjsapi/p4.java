package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186427e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(nw4.k kVar, nw4.y2 y2Var) {
        super(1);
        this.f186426d = kVar;
        this.f186427e = y2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String draftData = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(draftData, "draftData");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "getDraftData success");
        if (draftData.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "getDraftData is empty");
        }
        nw4.g gVar = this.f186426d.f340863d;
        nw4.y2 y2Var = this.f186427e;
        java.lang.String str = y2Var.f341013c;
        java.lang.String str2 = y2Var.f341019i + ":ok";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("draftData", draftData);
        gVar.e(str, str2, hashMap);
        return jz5.f0.f302826a;
    }
}
