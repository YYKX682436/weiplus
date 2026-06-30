package lp4;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.p f320362d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(lp4.p pVar) {
        super(0);
        this.f320362d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lp4.p pVar = this.f320362d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(pVar.f320389g.getContext());
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = pVar.f320389g;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.bnz, (android.view.ViewGroup) editorPanelHolder, false);
        kotlin.jvm.internal.o.d(inflate);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, inflate, null, 2, null);
        return (android.view.ViewGroup) inflate;
    }
}
