package kp4;

/* loaded from: classes5.dex */
public final class q0 implements kp4.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.SegmentClipThumbSeekBarContainer f311134a;

    public q0(com.tencent.mm.plugin.vlog.ui.thumb.SegmentClipThumbSeekBarContainer segmentClipThumbSeekBarContainer) {
        this.f311134a = segmentClipThumbSeekBarContainer;
    }

    public void a(bg0.y item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.SegmentClip.MediaThumbSeekBarView", "onItemSelected: " + i17);
        com.tencent.mm.plugin.vlog.ui.thumb.SegmentClipThumbSeekBarContainer segmentClipThumbSeekBarContainer = this.f311134a;
        segmentClipThumbSeekBarContainer.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SegmentClip.MediaThumbSeekBarView", "reset: ");
        com.tencent.mm.plugin.mmsight.segment.f fVar = segmentClipThumbSeekBarContainer.f176051f;
        com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView = (com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView) fVar;
        segmentClipRecyclerThumbBarView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SegmentClip.RecyclerThumbBarView", "reset: ");
        rm5.k kVar = segmentClipRecyclerThumbBarView.f148925x;
        if (kVar != null) {
            kVar.destroy();
        }
        segmentClipRecyclerThumbBarView.f148925x = null;
        segmentClipRecyclerThumbBarView.B.f149088e = null;
        segmentClipThumbSeekBarContainer.f176052g = item;
        fVar.setMinThumbViewCountForWindow(item.f19871g);
        double d17 = item.f19870f;
        com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView2 = (com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView) fVar;
        java.lang.String path = item.f19866b;
        kotlin.jvm.internal.o.g(path, "path");
        segmentClipRecyclerThumbBarView2.mediaItemStartTimeMsPositionMap.put(path, java.lang.Double.valueOf(d17));
        fVar.setClipWindowDuration(item.f19867c / 1000.0d);
        fVar.setTotalDurationMs(item.f19868d);
        segmentClipRecyclerThumbBarView2.b(path);
        fVar.setOnPreparedListener(new kp4.o0(segmentClipThumbSeekBarContainer));
    }
}
