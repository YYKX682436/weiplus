package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class s0 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w0 f114203d;

    public s0(com.tencent.mm.plugin.finder.live.plugin.w0 w0Var) {
        this.f114203d = w0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what == 1) {
            this.f114203d.f114838t = it.arg1;
            com.tencent.mm.plugin.finder.live.plugin.w0 w0Var = this.f114203d;
            com.tencent.mars.xlog.Log.i("FinderLiveAdVideoTimerPlugin", "startLoop: " + w0Var.f114838t);
            w0Var.f114839u.sendMessageDelayed(w0Var.f114839u.obtainMessage(1, 0, 0), 500L);
        }
        return true;
    }
}
