package com.tencent.mm.plugin.magicbrush.pkg;

/* loaded from: classes7.dex */
public class MagicPkgCheckerListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivateEvent> {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f148102d = new java.util.concurrent.CopyOnWriteArraySet();

    public MagicPkgCheckerListener() {
        super(com.tencent.mm.app.a0.f53288d);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCheckerListener", "[MagicPkgCheckerListener]");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_magic_clear_all_pkg, 0) == 1) {
            ((ku5.t0) ku5.t0.f312615d).g(new fe3.c(this));
        }
        this.__eventId = -1435144905;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public /* bridge */ /* synthetic */ boolean callback(com.tencent.mm.autogen.events.ActivateEvent activateEvent) {
        return false;
    }
}
