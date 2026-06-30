package com.tencent.mm.plugin.recordvideo.ui.editor;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView f156122d;

    public c(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView) {
        this.f156122d = editorAudioView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.ImageView favFinderVideoRedDot;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = this.f156122d;
        editorAudioView.f155976p1 = editorAudioView.isShowFinderRedDot();
        dw3.e eVar = editorAudioView.I;
        if (eVar.f244201b) {
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) eVar.f244200a).getValue()).G("enter_select_finder_video_panel", true);
        }
        favFinderVideoRedDot = editorAudioView.getFavFinderVideoRedDot();
        favFinderVideoRedDot.setVisibility(8);
        editorAudioView.K.z(null);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.f(editorAudioView, true);
        editorAudioView.setShowAudioPanel(false);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a callback = editorAudioView.getCallback();
        if (callback != null) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
            audioCacheInfo.f155718o = 2;
            callback.m(audioCacheInfo);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
