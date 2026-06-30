package gp4;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer f274438d;

    public v(com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer) {
        this.f274438d = timeEditorItemContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = this.f274438d;
        timeEditorItemContainer.q(timeEditorItemContainer.f175964y, false);
        yz5.l timeEditMenuChangeListener = timeEditorItemContainer.getTimeEditMenuChangeListener();
        if (timeEditMenuChangeListener != null) {
            timeEditMenuChangeListener.invoke(java.lang.Boolean.FALSE);
        }
    }
}
