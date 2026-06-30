package kw2;

/* loaded from: classes10.dex */
public final class z extends op4.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout pluginLayout) {
        super(pluginLayout);
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
    }

    @Override // op4.h, op4.k
    public void a(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        super.a(intent);
        com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) this.f347291d;
        if (finderShowInWXProfileStruct == null) {
            return;
        }
        finderShowInWXProfileStruct.p("99");
    }

    @Override // op4.h, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout = this.f347281e;
        if (ordinal != 48) {
            if (ordinal == 50) {
                hw2.e eVar = (hw2.e) basePluginLayout.j(hw2.e.class);
                if (eVar != null) {
                    com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = eVar.f285515g;
                    if (editorAudioView != null ? editorAudioView.isShowFinderSelectPanel() : false) {
                        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView2 = eVar.f285515g;
                        j(editorAudioView2 != null ? editorAudioView2.f155976p1 : false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (ordinal != 97 && ordinal != 98) {
                return;
            }
        }
        hw2.e eVar2 = (hw2.e) basePluginLayout.j(hw2.e.class);
        if (eVar2 == null || !com.tencent.mm.plugin.vlog.model.v0.a()) {
            return;
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView3 = eVar2.f285515g;
        l(editorAudioView3 != null ? editorAudioView3.isShowFinderRedDot() : false);
    }
}
