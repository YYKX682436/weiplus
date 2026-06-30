package cq4;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cq4.n f221471d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(cq4.n nVar) {
        super(0);
        this.f221471d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cq4.n nVar = this.f221471d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(nVar.f221474a.getContext());
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = nVar.f221474a;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.a5q, (android.view.ViewGroup) editorPanelHolder, false);
        kotlin.jvm.internal.o.d(inflate);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, inflate, null, 2, null);
        return inflate;
    }
}
