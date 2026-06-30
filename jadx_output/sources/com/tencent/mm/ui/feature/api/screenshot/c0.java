package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class c0 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208462a;

    public c0(com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208462a = j1Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "onEnterForeground");
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).Ai(context, this.f208462a, java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "onExitForeground");
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).Di(context, this.f208462a, java.lang.Boolean.TRUE);
    }
}
