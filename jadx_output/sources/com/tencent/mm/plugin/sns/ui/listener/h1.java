package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public abstract class h1 implements android.view.View.OnCreateContextMenuListener {
    public abstract void a(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo);

    public abstract boolean b(android.view.View view);

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineOnCreateContextMenuListener");
        if (b(view)) {
            a(contextMenu, view, contextMenuInfo);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineOnCreateContextMenuListener", "onMMCreateContextMenu error");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineOnCreateContextMenuListener");
    }
}
