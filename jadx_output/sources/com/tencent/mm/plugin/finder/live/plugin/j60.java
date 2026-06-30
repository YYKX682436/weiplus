package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f113062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f113063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f113064f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f113065g;

    public j60(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var, android.os.Bundle bundle, java.lang.Object obj, long j17) {
        this.f113062d = r60Var;
        this.f113063e = bundle;
        this.f113064f = obj;
        this.f113065g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = this.f113062d.f114100u;
        if (ep0Var != null) {
            ep0Var.B(this.f113063e, this.f113064f, this.f113065g);
        }
    }
}
