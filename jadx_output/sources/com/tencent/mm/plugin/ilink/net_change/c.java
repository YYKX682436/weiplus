package com.tencent.mm.plugin.ilink.net_change;

/* loaded from: classes8.dex */
public final class c implements com.tencent.mm.plugin.ilink.net_change.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.ilink.net_change.b f142428a = new com.tencent.mm.plugin.ilink.net_change.b();

    @Override // com.tencent.mm.plugin.ilink.net_change.a
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkChangeMainProcessImpl", "startListen: ");
        gm0.j1.n().a(this.f142428a);
    }

    @Override // com.tencent.mm.plugin.ilink.net_change.a
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkChangeMainProcessImpl", "stopListen: ");
        gm0.j1.n().d(this.f142428a);
    }
}
