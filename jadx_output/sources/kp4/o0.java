package kp4;

/* loaded from: classes5.dex */
public final class o0 implements com.tencent.mm.plugin.mmsight.segment.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.SegmentClipThumbSeekBarContainer f311128a;

    public o0(com.tencent.mm.plugin.vlog.ui.thumb.SegmentClipThumbSeekBarContainer segmentClipThumbSeekBarContainer) {
        this.f311128a = segmentClipThumbSeekBarContainer;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.g
    public final void a(boolean z17) {
        bg0.x behaviorHolder;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SegmentClip.MediaThumbSeekBarView", "Not Supported init SegmentSeekBar failed.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SegmentClip.MediaThumbSeekBarView", "checkInitThumbSeekBar: init success");
        com.tencent.mm.plugin.vlog.ui.thumb.SegmentClipThumbSeekBarContainer segmentClipThumbSeekBarContainer = this.f311128a;
        if (segmentClipThumbSeekBarContainer.f176052g == null || (behaviorHolder = segmentClipThumbSeekBarContainer.getBehaviorHolder()) == null) {
            return;
        }
        bg0.y yVar = segmentClipThumbSeekBarContainer.f176052g;
        kotlin.jvm.internal.o.d(yVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "onSegmentClipItemSelected: " + yVar.f19865a);
        ((dz0.v) behaviorHolder).d(yVar);
    }
}
