package fp4;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp4.s f265372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(fp4.s sVar) {
        super(0);
        this.f265372d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fp4.s sVar = this.f265372d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(sVar.f265374f.getContext());
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = sVar.f265374f;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.d48, (android.view.ViewGroup) editorPanelHolder, false);
        kotlin.jvm.internal.o.d(inflate);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, inflate, null, 2, null);
        inflate.setOnClickListener(fp4.p.f265371d);
        return (android.view.ViewGroup) inflate;
    }
}
