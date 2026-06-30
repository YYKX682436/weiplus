package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f114157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(0);
        this.f114157d = hmVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f114157d;
        com.tencent.mars.xlog.Log.i(hmVar.f112831r, "restoreTargetContactToAnchor");
        com.tencent.mm.plugin.finder.live.plugin.lj ljVar = hmVar.Q;
        if (ljVar != null) {
            ljVar.f113401a = "";
        }
        if (ljVar != null) {
            ya2.b2 B1 = hmVar.B1();
            ljVar.f113402b = B1 != null ? B1.w0() : com.tencent.mm.plugin.finder.live.plugin.hm.T1;
        }
        if (ljVar != null) {
            ya2.b2 B12 = hmVar.B1();
            ljVar.f113403c = B12 != null ? B12.getAvatarUrl() : null;
        }
        com.tencent.mm.plugin.finder.live.plugin.hm.v1(hmVar);
        hmVar.M.h();
        return jz5.f0.f302826a;
    }
}
