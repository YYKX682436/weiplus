package wu3;

/* loaded from: classes10.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView f449801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView) {
        super(1);
        this.f449801d = editorInputView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f449801d;
        editorInputView.C = it;
        boolean z17 = it.length() > 0;
        com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText photoEditText = editorInputView.f156000o;
        if (!z17) {
            photoEditText.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        } else if (com.tencent.mm.vfs.w6.j(it)) {
            photoEditText.setTypeface(android.graphics.Typeface.createFromFile(it));
        } else {
            photoEditText.setTypeface(android.graphics.Typeface.DEFAULT);
        }
        return jz5.f0.f302826a;
    }
}
