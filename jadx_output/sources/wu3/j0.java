package wu3;

/* loaded from: classes5.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView f449769d;

    public j0(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView) {
        this.f449769d = editorAudioView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wt3.e eVar;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = this.f449769d;
        if (editorAudioView.N || (eVar = editorAudioView.M) == null) {
            return;
        }
        eVar.f449403l.obtainMessage(1).sendToTarget();
    }
}
