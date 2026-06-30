package rp4;

/* loaded from: classes5.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.m implements yz5.l {
    public h(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout.class, "createHalfBottomShowDialog", "createHalfBottomShowDialog(Lkotlinx/coroutines/CoroutineScope;)Lcom/tencent/mm/ui/widget/dialog/MMHalfBottomDialog;", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kotlinx.coroutines.y0 p07 = (kotlinx.coroutines.y0) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout = (com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout) this.receiver;
        int i17 = com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout.R;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(editorVideoCompositionPluginLayout.getContext(), 2, 1, true);
        z2Var.y(i65.a.r(editorVideoCompositionPluginLayout.getContext(), com.tencent.mm.R.string.n2o));
        z2Var.x(0);
        z2Var.F = new rp4.o(editorVideoCompositionPluginLayout, p07);
        android.content.Context context = editorVideoCompositionPluginLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        z2Var.j(new wu3.g2(context));
        return z2Var;
    }
}
