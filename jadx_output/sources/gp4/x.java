package gp4;

/* loaded from: classes10.dex */
public final class x implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer f274442d;

    public x(com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer) {
        this.f274442d = timeEditorItemContainer;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.view.ViewGroup itemLayout;
        zu3.r rVar;
        kotlin.jvm.internal.o.g(menuItem, "<anonymous parameter 0>");
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = this.f274442d;
        itemLayout = timeEditorItemContainer.getItemLayout();
        itemLayout.removeView(timeEditorItemContainer.f175964y);
        android.view.View view = timeEditorItemContainer.f175964y;
        zu3.x xVar = view instanceof zu3.x ? (zu3.x) view : null;
        if (xVar != null) {
            zu3.y yVar = xVar.f475862m;
            if (yVar != null && (rVar = yVar.f475875q) != null) {
                rVar.b();
            }
            xVar.f475863n = false;
        }
        yz5.l itemChangeListener = timeEditorItemContainer.getItemChangeListener();
        if (itemChangeListener != null) {
            itemChangeListener.invoke(timeEditorItemContainer.f175964y);
        }
        timeEditorItemContainer.post(timeEditorItemContainer.I);
    }
}
