package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class i60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f112930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f112931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f112932f;

    public i60(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var, android.os.Bundle bundle, java.lang.Object obj) {
        this.f112930d = r60Var;
        this.f112931e = bundle;
        this.f112932f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = this.f112930d.f114100u;
        if (ep0Var != null) {
            ep0Var.B(this.f112931e, this.f112932f, 0L);
        }
    }
}
