package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/DirectSendPhotoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "Lju3/d0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class DirectSendPhotoPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectSendPhotoPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        if (bVar != null) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            ut3.f.f431176c.a(getContext(), new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool, "", bVar.f222213j, 0L, bool, nu3.i.f340218a.l()));
        }
    }
}
