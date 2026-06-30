package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public class xc implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.bd f200226d;

    public xc(com.tencent.mm.ui.chatting.component.bd bdVar) {
        this.f200226d = bdVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.clear();
        com.tencent.mm.ui.chatting.component.bd bdVar = this.f200226d;
        if (c01.e2.Z(bdVar.f198732a.f198580d.x())) {
            contextMenu.add(0, 1, 0, bdVar.f198732a.f198580d.g().getResources().getString(com.tencent.mm.R.string.f490869b40));
        }
        contextMenu.add(0, 2, 0, bdVar.f198732a.f198580d.g().getResources().getString(com.tencent.mm.R.string.ayo));
    }
}
