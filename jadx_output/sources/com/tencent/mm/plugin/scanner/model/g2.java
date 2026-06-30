package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class g2 implements com.tencent.mm.plugin.scanner.model.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f158914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f158915e;

    public g2(int i17, boolean z17) {
        this.f158914d = i17;
        this.f158915e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        if (com.tencent.mm.plugin.scanner.model.d1.f158853k == com.tencent.mm.plugin.scanner.model.y0.f159103e) {
            str = com.tencent.mm.plugin.scanner.model.d1.f158852j.getReportString();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanFastFocusEngineManager", "getReportString is not init");
            str = "";
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.model.f2(this.f158914d, str, this.f158915e));
    }
}
