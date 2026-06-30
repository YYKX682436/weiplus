package gp4;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer f274433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer) {
        super(0);
        this.f274433d = timeEditorItemContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String dialogTitle;
        java.lang.String dialogMenu;
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = this.f274433d;
        timeEditorItemContainer.removeCallbacks(timeEditorItemContainer.I);
        yz5.p pVar = timeEditorItemContainer.f175953J;
        dialogTitle = timeEditorItemContainer.getDialogTitle();
        dialogMenu = timeEditorItemContainer.getDialogMenu();
        ((com.tencent.mm.ui.widget.dialog.k0) ((gp4.z) pVar).invoke(dialogTitle, dialogMenu)).v();
        timeEditorItemContainer.f175963x = null;
        return jz5.f0.f302826a;
    }
}
