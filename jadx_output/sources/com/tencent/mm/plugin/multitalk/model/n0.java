package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class n0 implements com.tencent.mm.app.y2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.s0 f150047d;

    public n0(com.tencent.mm.plugin.multitalk.model.s0 s0Var) {
        this.f150047d = s0Var;
    }

    @Override // com.tencent.mm.app.y2
    public final void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkCameraManager", "onScreen: " + z17);
        this.f150047d.f150123r = z17 ^ true;
    }
}
