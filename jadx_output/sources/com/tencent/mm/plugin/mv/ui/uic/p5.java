package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class p5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.z5 f151357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm3.q f151358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(com.tencent.mm.plugin.mv.ui.uic.z5 z5Var, fm3.q qVar) {
        super(0);
        this.f151357d = z5Var;
        this.f151358e = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kk4.b player;
        kk4.c cVar;
        com.tencent.mm.plugin.mv.ui.uic.z5 z5Var = this.f151357d;
        kk4.d dVar = z5Var.f151579r;
        long durationMs = (dVar == null || (player = dVar.getPlayer()) == null || (cVar = ((kk4.v) player).f308577b) == null) ? 0L : ((kk4.f0) cVar).getDurationMs();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "setVideoDuration: origin:" + z5Var.f151581t + ", player:" + durationMs);
        if (durationMs > 0 && z5Var.f151581t != durationMs) {
            fm3.o oVar = this.f151358e.f264113n;
            if (oVar != null) {
                oVar.c(durationMs);
            }
            z5Var.f151581t = durationMs;
            int childCount = z5Var.Q6().getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                com.tencent.mm.plugin.mv.ui.view.FrameListView2 frameListView2 = (com.tencent.mm.plugin.mv.ui.view.FrameListView2) z5Var.Q6().getChildAt(i17);
                if (frameListView2 != null) {
                    java.lang.Object obj = z5Var.P6().f151526d.get(z5Var.Q6().u0(frameListView2));
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    kp4.a aVar = (kp4.a) obj;
                    aVar.f311076f = (z5Var.f151583v * ((float) z5Var.f151581t)) / (((z5Var.C * 1.0f) / aVar.f311072b) * aVar.f311071a);
                    aVar.f();
                    frameListView2.setTrackInfo(aVar);
                    frameListView2.requestLayout();
                }
            }
        }
        z5Var.T6().setVisibility(4);
        kk4.d dVar2 = z5Var.f151579r;
        if (dVar2 != null) {
            dVar2.setOnFrameAvailable(null);
        }
        return jz5.f0.f302826a;
    }
}
