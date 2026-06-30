package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes.dex */
public final class g3 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j3 f123727d;

    public g3(com.tencent.mm.plugin.finder.profile.uic.j3 j3Var) {
        this.f123727d = j3Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1001, 0, this.f123727d.getString(com.tencent.mm.R.string.css));
    }
}
