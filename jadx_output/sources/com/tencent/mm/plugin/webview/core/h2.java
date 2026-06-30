package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class h2 extends com.tencent.mm.plugin.webview.ui.tools.widget.x3 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f181842e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f181843f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f181844g;

    public h2(java.lang.ref.WeakReference controller) {
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f181842e = controller;
        this.f181843f = jz5.h.b(new com.tencent.mm.plugin.webview.core.g2(this));
        this.f181844g = "MicroMsg.WebViewController.SceneEndCallbacker:" + e();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public boolean Cg(com.tencent.mm.plugin.webview.stub.h hVar) {
        java.lang.String str = "onSceneEnd, instance hashcode = " + hashCode();
        java.lang.String str2 = this.f181844g;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (hVar == null) {
            return true;
        }
        int i17 = hVar.getData().getInt("scene_end_listener_hash_code");
        com.tencent.mars.xlog.Log.i(str2, "get hash code = %d, self hash code = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(e()));
        com.tencent.mars.xlog.Log.i(str2, "edw onSceneEnd, type = " + hVar.getType() + ", errCode = " + hVar.getErrCode() + ", errType = " + hVar.Pg());
        if (i17 != e()) {
            com.tencent.mars.xlog.Log.e(str2, "hash code not equal");
            return false;
        }
        com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) this.f181842e.get();
        if (e3Var == null) {
            return true;
        }
        int type = hVar.getType();
        if (type == 106) {
            com.tencent.mm.plugin.webview.core.e3.e1(e3Var, 106);
            e3Var.E0();
            return true;
        }
        if (type != 666) {
            return true;
        }
        com.tencent.mm.plugin.webview.core.e3.e1(e3Var, ma1.i.CTRL_INDEX);
        e3Var.E0();
        return true;
    }

    public final int e() {
        return ((java.lang.Number) this.f181843f.getValue()).intValue();
    }
}
