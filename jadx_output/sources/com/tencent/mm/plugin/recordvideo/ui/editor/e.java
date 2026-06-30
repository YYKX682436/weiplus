package com.tencent.mm.plugin.recordvideo.ui.editor;

/* loaded from: classes5.dex */
public final class e implements xu3.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView f156124a;

    public e(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView) {
        this.f156124a = editorAudioView;
    }

    public void a() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = this.f156124a;
        editorAudioView.setShowAudioPanel(true);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.f(editorAudioView, false);
        if (editorAudioView.getWithMusic()) {
            editorAudioView.g(editorAudioView.L, true);
        } else {
            editorAudioView.K.z(null);
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a callback = editorAudioView.getCallback();
            if (callback != null) {
                callback.m(null);
            }
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a callback2 = editorAudioView.getCallback();
        if (callback2 != null) {
            callback2.d();
        }
    }
}
