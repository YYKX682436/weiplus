package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/view/FinderTemplateClipMusicPickerComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/drawer/TemplateClipMusicPickerComponentLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderTemplateClipMusicPickerComponentLayout extends com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderTemplateClipMusicPickerComponentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout, com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a o() {
        kv3.j jVar = new kv3.j(this, this, null, 4, null);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        jVar.A = d17 != null ? d17.w() : null;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d18 = d();
        jVar.B = d18 != null ? d18.f156223p : null;
        return jVar;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r(com.tencent.maas.model.MJMusicInfo it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo b17 = com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.M.b(it, 1);
        b17.f155719p = 8;
        b17.f155722s = true;
        java.lang.String musicID = it.getMusicID();
        if (!(musicID != null && r26.i0.y(musicID, "Listen_", false))) {
            java.lang.String musicID2 = it.getMusicID();
            r1 = ((musicID2 == null || !r26.i0.y(musicID2, "wxfinderobject_", false)) ? 0 : 1) != 0 ? 2 : 3;
        }
        b17.I = r1;
        return b17;
    }
}
