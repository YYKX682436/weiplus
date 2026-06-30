package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class c9 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 f185034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185035b;

    public c9(com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var, nw4.y2 y2Var) {
        this.f185034a = e9Var;
        this.f185035b = y2Var;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PrivateCommonApiHandler", "onResult: " + i17);
        nw4.y2 y2Var = this.f185035b;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var = this.f185034a;
        if (i17 == -1) {
            e9Var.f185084a.i5(y2Var, "ok", kz5.c1.k(new jz5.l("err_msg", "ok"), new jz5.l("uploadResult", "uploadFinished"), new jz5.l("totalSize", "0")));
        } else {
            e9Var.f185084a.i5(y2Var, "ok", kz5.c1.k(new jz5.l("err_msg", "ok"), new jz5.l("uploadResult", "uploading"), new jz5.l("totalSize", "0")));
        }
    }
}
