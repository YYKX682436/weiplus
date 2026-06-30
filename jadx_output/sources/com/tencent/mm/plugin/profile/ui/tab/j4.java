package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class j4 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154372d;

    public j4(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154372d = s4Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, this.f154372d.f154553e.getString(com.tencent.mm.R.string.f490359sr));
    }
}
