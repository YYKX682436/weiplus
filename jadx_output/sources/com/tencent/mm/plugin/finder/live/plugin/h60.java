package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class h60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f112778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f112779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f112780f;

    public h60(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var, android.os.Bundle bundle, long j17) {
        this.f112778d = r60Var;
        this.f112779e = bundle;
        this.f112780f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = this.f112778d.f114100u;
        if (ep0Var != null) {
            ep0Var.r0(this.f112779e, this.f112780f);
        }
    }
}
