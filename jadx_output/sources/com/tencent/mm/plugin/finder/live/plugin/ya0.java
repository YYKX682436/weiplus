package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class ya0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.bb0 f115177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya0(com.tencent.mm.plugin.finder.live.plugin.bb0 bb0Var) {
        super(0);
        this.f115177d = bb0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kn0.p pVar;
        com.tencent.mm.plugin.finder.live.plugin.bb0 bb0Var = this.f115177d;
        bb0Var.f365323d.animate().alpha(0.0f).setDuration(200L).setListener(new com.tencent.mm.plugin.finder.live.plugin.xa0(bb0Var)).start();
        bb0Var.f112001t.d();
        android.os.Bundle bundle = new android.os.Bundle();
        boolean z17 = false;
        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
        dk2.ef efVar = dk2.ef.f233372a;
        in0.q e17 = efVar.e();
        if (e17 != null && (pVar = e17.D) != null) {
            z17 = pVar.f309589i;
        }
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", z17);
        bb0Var.f111997p.statusChange(qo0.b.f365366i4, bundle);
        in0.q e18 = efVar.e();
        if (e18 != null) {
            e18.L0();
        }
        return jz5.f0.f302826a;
    }
}
