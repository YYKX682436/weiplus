package wu3;

/* loaded from: classes10.dex */
public final class t0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView f449805d;

    public t0(com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView) {
        this.f449805d = editorInputView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        this.f449805d.setImeVisibility(z17);
    }
}
