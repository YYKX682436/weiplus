package lp4;

/* loaded from: classes10.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.a1 f320442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(lp4.a1 a1Var) {
        super(0);
        this.f320442d = a1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lp4.a1 a1Var = this.f320442d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(a1Var.f320313f.getContext());
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = a1Var.f320313f;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.d49, (android.view.ViewGroup) editorPanelHolder, false);
        kotlin.jvm.internal.o.d(inflate);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, inflate, null, 2, null);
        return (android.view.ViewGroup) inflate;
    }
}
