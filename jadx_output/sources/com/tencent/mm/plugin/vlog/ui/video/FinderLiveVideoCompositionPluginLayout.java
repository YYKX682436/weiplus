package com.tencent.mm.plugin.vlog.ui.video;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/video/FinderLiveVideoCompositionPluginLayout;", "Lcom/tencent/mm/plugin/vlog/ui/video/EditorVideoCompositionPluginLayout;", "Lju3/d0;", "", "getMuteOrigin", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveVideoCompositionPluginLayout extends com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout {
    public boolean S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVideoCompositionPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout
    public void A() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveVideoCompositionPluginLayout", "afterPreviewInit >> " + this.S);
        getPreviewNewPlugin().d(this.S);
    }

    @Override // com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout
    /* renamed from: getMuteOrigin, reason: from getter */
    public boolean getS() {
        return this.S;
    }

    @Override // com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        android.os.Bundle bundle;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
        boolean z17 = false;
        if (configProvider != null && (bundle = configProvider.M) != null) {
            z17 = bundle.getBoolean("key_mute_video", false);
        }
        this.S = z17;
        super.r(bVar);
    }

    @Override // com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveVideoCompositionPluginLayout", "afterDetach");
        kotlinx.coroutines.r2 previewJob = getPreviewJob();
        if (previewJob != null) {
            kotlinx.coroutines.p2.a(previewJob, null, 1, null);
        }
    }
}
