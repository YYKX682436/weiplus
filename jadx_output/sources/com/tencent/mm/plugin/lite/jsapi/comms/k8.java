package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes9.dex */
public final class k8 implements tg3.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f143645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f143646b;

    public k8(java.lang.String str, kotlin.jvm.internal.f0 f0Var, java.lang.Runnable runnable) {
        this.f143645a = f0Var;
        this.f143646b = runnable;
    }

    @Override // tg3.z0
    public final void a() {
        kotlin.jvm.internal.f0 f0Var = this.f143645a;
        int i17 = f0Var.f310116d - 1;
        f0Var.f310116d = i17;
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.i("LiteAppSendVideoMessage", "doShareVideoAfterSelectConversation, send video done");
            this.f143646b.run();
        }
    }
}
