package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class w1 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return vd1.h.NAME;
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
        int optInt = bVar.f406597b.f344506c.optInt(dm.i4.COL_ID);
        if (optInt <= 0) {
            bVar.c("fail", null);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.f(optInt, bVar.f406597b.f344506c.optString("value"), bVar.f406597b.f344506c.optInt("is_report_now") > 0, bVar.f406597b.f344506c.optInt("is_important") > 0);
        bVar.a();
    }
}
