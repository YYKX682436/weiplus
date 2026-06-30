package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class g4 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185130e;

    public g4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185130e = c1Var;
        this.f185129d = y2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.b bVar = (pr4.b) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "[WeCoin] consumeWeCoin onSuccess, data:%s", java.lang.Long.valueOf(bVar.f357986a));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("balance", java.lang.Long.valueOf(bVar.f357986a));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        nw4.y2 y2Var = this.f185129d;
        sb6.append(y2Var.f341019i);
        sb6.append(":ok");
        this.f185130e.i5(y2Var, sb6.toString(), hashMap);
        return null;
    }
}
