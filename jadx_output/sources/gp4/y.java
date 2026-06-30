package gp4;

/* loaded from: classes10.dex */
public final class y implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer f274443d;

    public y(com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer) {
        this.f274443d = timeEditorItemContainer;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = this.f274443d;
        timeEditorItemContainer.post(timeEditorItemContainer.I);
        timeEditorItemContainer.getClass();
    }
}
