package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.f0 f143920d;

    public d0(com.tencent.mm.plugin.lite.logic.f0 f0Var) {
        this.f143920d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.plugin.lite.LiteAppCenter.class.getClassLoader();
            fp.d0.n("owl");
            com.tencent.mm.plugin.lite.logic.f0.b(this.f143920d);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppLite.LiteAppCheckerListener", th6, null, new java.lang.Object[0]);
        }
    }
}
