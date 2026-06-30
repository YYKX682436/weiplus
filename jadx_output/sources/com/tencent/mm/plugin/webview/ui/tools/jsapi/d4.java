package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class d4 implements h45.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185050b;

    public d4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185050b = c1Var;
        this.f185049a = y2Var;
    }

    @Override // h45.r
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "secureTunnel callback fail");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("err_desc", str);
        this.f185050b.i5(this.f185049a, "secureTunnel:fail", hashMap);
    }

    @Override // h45.r
    public void onSuccess(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "secureTunnel callback success");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("respbuf", str);
        this.f185050b.i5(this.f185049a, "secureTunnel:ok", hashMap);
    }
}
