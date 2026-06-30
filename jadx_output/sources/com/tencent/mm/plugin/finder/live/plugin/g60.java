package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class g60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f112638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f112639e;

    public g60(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var, android.os.Bundle bundle) {
        this.f112638d = r60Var;
        this.f112639e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = this.f112638d.f114100u;
        if (ep0Var != null) {
            ep0Var.r0(this.f112639e, 0L);
        }
    }
}
