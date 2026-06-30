package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
public class t extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f158308d;

    public t(com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver kVCommCrossProcessReceiver, java.lang.Runnable runnable) {
        this.f158308d = runnable;
    }

    @Override // hm0.t
    public void b() {
        if (android.os.Build.VERSION.SDK_INT < 28 || !android.os.Process.isIsolated()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KVCommCrossProcessReceiver", "Delay post");
            com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158124a.post(this.f158308d);
        }
    }
}
