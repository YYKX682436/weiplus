package wu3;

/* loaded from: classes10.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView f449797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView) {
        super(1);
        this.f449797d = editorInputView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f449797d;
        editorInputView.setSelectedIndex(intValue);
        editorInputView.g();
        return jz5.f0.f302826a;
    }
}
