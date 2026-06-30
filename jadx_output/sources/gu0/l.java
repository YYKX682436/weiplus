package gu0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI f275751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI composingCreationPreviewUI) {
        super(0);
        this.f275751d = composingCreationPreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI.f69176e;
        com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI composingCreationPreviewUI = this.f275751d;
        composingCreationPreviewUI.getClass();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211729s = composingCreationPreviewUI.getString(com.tencent.mm.R.string.o_8);
        aVar.f211732v = composingCreationPreviewUI.getString(com.tencent.mm.R.string.o_7);
        aVar.f211733w = composingCreationPreviewUI.getString(com.tencent.mm.R.string.o_9);
        aVar.F = gu0.n.f275768d;
        aVar.E = new gu0.p(composingCreationPreviewUI);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(composingCreationPreviewUI, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        return jz5.f0.f302826a;
    }
}
