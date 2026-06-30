package com.tencent.mm.plugin.report.service;

/* loaded from: classes2.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.report.service.x0 f158327d = new com.tencent.mm.plugin.report.service.x0();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.UserDataOperationReporter", "save");
        try {
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.plugin.report.service.b1.f158149b).getValue()).H("userdatalistitem", com.tencent.mm.plugin.report.service.b1.f158148a.e().toByteArray());
        } catch (java.lang.Exception unused) {
        }
    }
}
