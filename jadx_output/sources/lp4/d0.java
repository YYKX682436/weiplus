package lp4;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.f0 f320336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(lp4.f0 f0Var) {
        super(0);
        this.f320336d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lp4.f0 f0Var = this.f320336d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(f0Var.f320343f.getContext());
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = f0Var.f320343f;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.d48, (android.view.ViewGroup) editorPanelHolder, false);
        kotlin.jvm.internal.o.d(inflate);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, inflate, null, 2, null);
        inflate.setOnClickListener(lp4.c0.f320332d);
        return (android.view.ViewGroup) inflate;
    }
}
