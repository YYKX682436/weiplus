package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class k1 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "hideAllTopRightBtns";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        com.tencent.mars.xlog.Log.i("hideAllTopRightBtns", "invokeInOwn");
        if (bVar == null) {
            return;
        }
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        final boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("hide", false) : false;
        sd.a aVar = (sd.a) bVar.f406596a;
        if (!(aVar instanceof com.tencent.mm.plugin.webview.luggage.e0)) {
            bVar.c("fail", null);
            return;
        }
        final com.tencent.mm.plugin.webview.luggage.y1 y1Var = ((com.tencent.mm.plugin.webview.luggage.e0) aVar).f182186t;
        y1Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.luggage.y1$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.widget.LinearLayout linearLayout;
                com.tencent.mm.plugin.webview.luggage.y1 y1Var2 = com.tencent.mm.plugin.webview.luggage.y1.this;
                if (y1Var2.f182693e == null || (linearLayout = y1Var2.f182700o) == null) {
                    return;
                }
                if (optBoolean) {
                    linearLayout.setVisibility(8);
                } else {
                    linearLayout.setVisibility(0);
                }
            }
        });
        bVar.a();
    }
}
