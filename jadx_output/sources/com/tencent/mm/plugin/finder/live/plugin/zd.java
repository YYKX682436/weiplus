package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.be f115327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(com.tencent.mm.plugin.finder.live.plugin.be beVar) {
        super(0);
        this.f115327d = beVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.be beVar = this.f115327d;
        com.tencent.mars.xlog.Log.i(beVar.f112018p, "showDanmakuGuide failed");
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) beVar.X0(com.tencent.mm.plugin.finder.live.plugin.mg.class);
        if (mgVar != null) {
            mgVar.J1();
        }
        beVar.f112023u = null;
        return jz5.f0.f302826a;
    }
}
