package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes8.dex */
public class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ExtSimpleRecordEvent f185233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.l6 f185234e;

    public k6(com.tencent.mm.plugin.webview.ui.tools.jsapi.l6 l6Var, com.tencent.mm.autogen.events.ExtSimpleRecordEvent extSimpleRecordEvent) {
        this.f185234e = l6Var;
        this.f185233d = extSimpleRecordEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.l6 l6Var = this.f185234e;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "onVoiceRecordEnd, localId(%s).", l6Var.f185253d.f182736e);
        try {
            l6Var.f185255f.Y = null;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.COL_LOCALID, l6Var.f185253d.f182736e);
            this.f185233d.f54209h.getClass();
            bundle.putString("recordResult", "onVoiceRecordEnd:".concat("ok"));
            com.tencent.mm.plugin.webview.stub.z0 z0Var = l6Var.f185255f.f184998y;
            if (z0Var != null) {
                z0Var.callback(2008, bundle);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "callbacker is null");
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "callback stop record failed");
        }
    }
}
