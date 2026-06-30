package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class u2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f139748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f139749e;

    public u2(com.tencent.mm.plugin.game.luggage.jsapi.z2 z2Var, sd.b bVar, q80.d0 d0Var) {
        this.f139748d = bVar;
        this.f139749e = d0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCLong iPCLong = (com.tencent.mm.ipcinvoker.type.IPCLong) obj;
        sd.b bVar = this.f139748d;
        if (iPCLong != null) {
            long j17 = iPCLong.f68405d;
            if (j17 >= 0) {
                q80.d0 d0Var = this.f139749e;
                if (j17 > 0) {
                    d0Var.f360663o = j17;
                }
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).f406610d, d0Var, new com.tencent.mm.plugin.game.luggage.jsapi.t2(this));
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("JsApiOpenLiteApp", "Open LiteApp fail");
        bVar.c("fail", null);
    }
}
