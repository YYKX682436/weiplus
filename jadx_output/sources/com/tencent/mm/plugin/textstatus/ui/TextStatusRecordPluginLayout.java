package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusRecordPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class TextStatusRecordPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout {
    public ut3.d R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStatusRecordPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onResume() {
        super.onResume();
        ut3.d dVar = this.R;
        if (dVar != null) {
            ut3.f.f431176c.f431177a = dVar;
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        super.r(bVar);
        this.R = ut3.f.f431176c.f431177a;
    }
}
