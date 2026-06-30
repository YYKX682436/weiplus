package com.tencent.mm.plugin.webview.model;

/* loaded from: classes5.dex */
public class i0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f182928d;

    public i0(java.lang.Runnable runnable) {
        this.f182928d = runnable;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.lang.Runnable runnable = this.f182928d;
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return false;
    }
}
