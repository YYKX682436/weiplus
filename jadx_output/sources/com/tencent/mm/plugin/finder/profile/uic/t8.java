package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes3.dex */
public final class t8 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124228d;

    public t8(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f124228d = obVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, this.f124228d.getContext().getString(com.tencent.mm.R.string.f490359sr));
    }
}
