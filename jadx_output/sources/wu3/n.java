package wu3;

/* loaded from: classes5.dex */
public final class n implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView f449781d;

    public n(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView) {
        this.f449781d = editorAudioSearchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        this.f449781d.setImeVisibility(z17);
    }
}
