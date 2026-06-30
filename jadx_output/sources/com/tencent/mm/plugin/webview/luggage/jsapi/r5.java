package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public abstract class r5 extends sd.c {
    @Override // sd.c
    public void a(sd.b bVar) {
        java.lang.String name = getClass().getName();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i(name, "gamelog.jsapi, webview, invoke", null);
        if (c() == 1) {
            com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask jsApiMMTask = new com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask();
            jsApiMMTask.f182230f = bVar;
            jsApiMMTask.f182232h = getClass().getName();
            jsApiMMTask.f182231g = bVar.f406597b.f344506c.toString();
            jsApiMMTask.d();
            return;
        }
        if (c() != 2) {
            e(bVar);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.webview.luggage.jsapi.p5 p5Var = new com.tencent.mm.plugin.webview.luggage.jsapi.p5(this, bVar);
        bundle.putString("jsapi_name", getClass().getName());
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, bVar.f406597b.f344506c.toString());
        if (bVar.f406597b.f344506c.optLong("liteCallbackId", 0L) != 0) {
            new sw4.k().a(((sd.a) bVar.f406596a).getContext(), bundle, p5Var);
        } else {
            sw4.g.a((com.tencent.mm.ui.MMActivity) ((sd.a) bVar.f406596a).getContext(), bundle, sw4.k.class, p5Var);
        }
    }

    public abstract int c();

    public abstract void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var);

    public abstract void e(sd.b bVar);
}
