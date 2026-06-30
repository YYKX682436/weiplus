package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/MusicMvEditVideoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvEditVideoPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvEditVideoPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew, com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        if (bVar != null) {
            bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
            java.lang.String str = bVar.f222204a;
            ((b92.u2) vVar).getClass();
            com.tencent.mm.plugin.sight.base.b c17 = j33.s.f297456a.c(str);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
            java.lang.String str2 = configProvider != null ? configProvider.B : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = str2;
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvEditVideoPluginLayout", "videoInfo:" + c17 + ", path:" + bVar.f222204a + ',' + com.tencent.mm.vfs.w6.j(bVar.f222204a) + ", thumb:" + bVar.f222205b + ',' + com.tencent.mm.vfs.w6.j(bVar.f222205b) + ", outputVideoPath:" + str3);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mm.vfs.w6.c(bVar.f222204a, str3);
            }
            ut3.f.f431176c.a(getContext(), new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(java.lang.Boolean.TRUE, str3, bVar.f222205b, java.lang.Long.valueOf(c17.f162382a), java.lang.Boolean.FALSE, nu3.i.f340218a.l()));
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew, com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (ju3.f1.f301940a[status.ordinal()] == 1) {
            super.w(ju3.c0.B1, bundle);
        } else {
            super.w(status, bundle);
        }
    }
}
