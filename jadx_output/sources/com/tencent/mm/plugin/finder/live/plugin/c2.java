package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.b f112095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f112096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(km2.b bVar, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        super(0);
        this.f112095d = bVar;
        this.f112096e = v3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        km2.b bVar = this.f112095d;
        r45.nw1 nw1Var = bVar.f309070t;
        if (nw1Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.LiveAnchorAfterPlugin", "handleUserActionForReplayStatusAuditing:liveInfo is null");
        } else {
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "replayStatus:" + java.lang.Integer.valueOf(nw1Var.getInteger(31)));
            r45.nw1 nw1Var2 = bVar.f309070t;
            java.lang.Integer valueOf = nw1Var2 != null ? java.lang.Integer.valueOf(nw1Var2.getInteger(31)) : null;
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f112096e;
            if (valueOf != null && valueOf.intValue() == 3) {
                if (v3Var.W == null) {
                    android.content.Context context = v3Var.f365323d.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    v3Var.W = new com.tencent.mm.plugin.finder.live.widget.wt(context, new com.tencent.mm.plugin.finder.live.plugin.k3(v3Var));
                }
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "showReplayCancelTipWidget");
                com.tencent.mm.plugin.finder.live.widget.wt wtVar = v3Var.W;
                if (wtVar != null) {
                    wtVar.w();
                }
            } else if (valueOf != null && valueOf.intValue() == 1) {
                v3Var.getClass();
                com.tencent.mm.plugin.finder.live.util.y.m(v3Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.b2(v3Var, bVar, null), 3, null);
            } else {
                com.tencent.mars.xlog.Log.e("Finder.LiveAnchorAfterPlugin", "handleUserActionForReplayStatusAuditing,but replay_status is unexpected");
            }
        }
        return jz5.f0.f302826a;
    }
}
