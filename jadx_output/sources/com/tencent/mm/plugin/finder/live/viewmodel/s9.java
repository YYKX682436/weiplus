package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class s9 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117410d;

    public s9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var) {
        this.f117410d = v9Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f117410d;
        contextMenu.add(0, 1, 0, v9Var.getContext().getResources().getString(com.tencent.mm.R.string.eih));
        contextMenu.add(0, 2, 1, v9Var.getContext().getResources().getString(com.tencent.mm.R.string.eif));
    }
}
