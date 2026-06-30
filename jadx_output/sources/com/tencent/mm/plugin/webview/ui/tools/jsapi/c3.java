package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class c3 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m21.x f185016d;

    public c3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, m21.x xVar) {
        this.f185016d = xVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "report oreh logbuffer(13927)");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(13927, this.f185016d);
        g0Var.idkeyStat(457L, 0L, 1L, false);
        return 0;
    }
}
