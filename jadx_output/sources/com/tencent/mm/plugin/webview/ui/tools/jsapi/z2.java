package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class z2 implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185580f;

    public z2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, nw4.y2 y2Var) {
        this.f185580f = c1Var;
        this.f185578d = str;
        this.f185579e = y2Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.Integer num = (java.lang.Integer) obj3;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doGetFinderLivePreviewUrl errCode:%s", num);
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("ret", num);
            hashMap.put("url", str);
            hashMap.put("requestId", this.f185578d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "doGetFinderLivePreviewUrl" + e17.getMessage());
        }
        this.f185580f.i5(this.f185579e, "onGetFinderLivePreviewUrl:ok", hashMap);
        return null;
    }
}
