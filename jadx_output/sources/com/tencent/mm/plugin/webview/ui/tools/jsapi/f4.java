package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class f4 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185101b;

    public f4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185101b = c1Var;
        this.f185100a = y2Var;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "[WeCoin] showRechargeFoodsDialog onFailed,errorType:%s,errorCode:%s, msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185101b;
        nw4.y2 y2Var = this.f185100a;
        if (i18 == -3) {
            c1Var.i5(y2Var, y2Var.f341019i + ":cancel", null);
            return;
        }
        c1Var.i5(y2Var, y2Var.f341019i + ":fail", null);
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "[WeCoin] showRechargeFoodsDialog onSuccess,data:%s", (java.lang.Void) obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        nw4.y2 y2Var = this.f185100a;
        sb6.append(y2Var.f341019i);
        sb6.append(":ok");
        this.f185101b.i5(y2Var, sb6.toString(), null);
    }
}
