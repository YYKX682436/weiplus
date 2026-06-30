package gv3;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f276110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gv3.d f276111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.l lVar, gv3.d dVar) {
        super(1);
        this.f276110d = lVar;
        this.f276111e = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerTemplateClipRecommendFragment defaultTabFragmentInstance;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f276110d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(booleanValue));
        }
        if (booleanValue) {
            com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout d17 = this.f276111e.d();
            com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout templateClipMusicPickerComponentLayout = d17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout) d17 : null;
            if (templateClipMusicPickerComponentLayout != null && (defaultTabFragmentInstance = templateClipMusicPickerComponentLayout.getDefaultTabFragmentInstance()) != null && !defaultTabFragmentInstance.f156407p) {
                com.tencent.mars.xlog.Log.i(defaultTabFragmentInstance.f156406o, "onActivate: ");
                defaultTabFragmentInstance.f156407p = true;
                ev3.d dVar = defaultTabFragmentInstance.f156380d;
                if (dVar != null) {
                    dVar.c(5, defaultTabFragmentInstance);
                }
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = defaultTabFragmentInstance.f156382f;
                if (wxRecyclerView != null) {
                    wxRecyclerView.setAdapter(defaultTabFragmentInstance.f156381e);
                }
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = defaultTabFragmentInstance.f156382f;
                if (wxRecyclerView2 != null) {
                    wxRecyclerView2.post(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.s(defaultTabFragmentInstance));
                }
                defaultTabFragmentInstance.z0();
            }
        }
        return jz5.f0.f302826a;
    }
}
