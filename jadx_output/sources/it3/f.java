package it3;

/* loaded from: classes10.dex */
public final class f implements com.tencent.mm.plugin.mmsight.segment.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294558d;

    public f(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI) {
        this.f294558d = finderRedPacketCoverEditUI;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void d(boolean z17, float f17, float f18) {
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void j(boolean z17, float f17, float f18) {
        com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "attachThumbSeekBar onDown left:" + z17 + " start:" + f17 + " end:" + f18);
        it3.a aVar = this.f294558d.f155618m;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void p(boolean z17, float f17, float f18) {
        com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI = this.f294558d;
        it3.a aVar = finderRedPacketCoverEditUI.f155618m;
        if (aVar != null) {
            long durationMs = aVar.getDurationMs();
            it3.a aVar2 = finderRedPacketCoverEditUI.f155618m;
            if (aVar2 != null) {
                com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout.r(aVar2, null, 0L, 3, null);
            }
            finderRedPacketCoverEditUI.f155621p = java.lang.Math.round(r0 * f17);
            long round = java.lang.Math.round(((float) durationMs) * f18);
            finderRedPacketCoverEditUI.f155622q = round;
            it3.a aVar3 = finderRedPacketCoverEditUI.f155618m;
            if (aVar3 != null) {
                aVar3.u(finderRedPacketCoverEditUI.f155621p, round);
            }
            it3.a aVar4 = finderRedPacketCoverEditUI.f155618m;
            if (aVar4 != null) {
                aVar4.getPlayer().seekTo(finderRedPacketCoverEditUI.f155621p);
            }
            com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "attachThumbSeekBar onUp start:" + f17 + " end:" + f18 + " loopStart:" + finderRedPacketCoverEditUI.f155621p + " loopEnd:" + finderRedPacketCoverEditUI.f155622q);
        }
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void u(float f17, float f18) {
        com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI = this.f294558d;
        it3.a aVar = finderRedPacketCoverEditUI.f155618m;
        if (aVar != null) {
            float durationMs = (float) aVar.getDurationMs();
            finderRedPacketCoverEditUI.f155621p = java.lang.Math.round(durationMs * f17);
            long round = java.lang.Math.round(durationMs * f18);
            finderRedPacketCoverEditUI.f155622q = round;
            it3.a aVar2 = finderRedPacketCoverEditUI.f155618m;
            if (aVar2 != null) {
                aVar2.u(finderRedPacketCoverEditUI.f155621p, round);
            }
            it3.a aVar3 = finderRedPacketCoverEditUI.f155618m;
            if (aVar3 != null) {
                aVar3.getPlayer().seekTo(finderRedPacketCoverEditUI.f155621p);
            }
            com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "attachThumbSeekBar onRecyclerChanged start:" + f17 + " end:" + f18 + " loopStart:" + finderRedPacketCoverEditUI.f155621p + " loopEnd:" + finderRedPacketCoverEditUI.f155622q);
        }
    }
}
