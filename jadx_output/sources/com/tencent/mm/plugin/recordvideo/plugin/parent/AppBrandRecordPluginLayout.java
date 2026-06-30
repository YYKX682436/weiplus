package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0014R#\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AppBrandRecordPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout;", "", "getLayoutId", "Lcom/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView;", "kotlin.jvm.PlatformType", "C", "Ljz5/g;", "getTopCountdownCover", "()Lcom/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView;", "topCountdownCover", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class AppBrandRecordPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout {

    /* renamed from: C, reason: from kotlin metadata */
    public final jz5.g topCountdownCover;
    public boolean D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandRecordPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.topCountdownCover = jz5.h.b(new ju3.a(this));
    }

    private final com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView getTopCountdownCover() {
        return (com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView) ((jz5.n) this.topCountdownCover).getValue();
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f24if;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        this.D = configProvider.M.getBoolean("key_show_top_countdown_cover", false);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 5) {
            if (getConfigProvider() == null) {
                return;
            }
            if (this.D) {
                getTopCountdownCover().c(r0.f155676n.f71195h);
            }
        } else if (ordinal == 6 && this.D) {
            getTopCountdownCover().b();
        }
        super.w(status, bundle);
    }
}
