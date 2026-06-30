package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class b7 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d7 f117845d;

    public b7(com.tencent.mm.plugin.finder.live.widget.d7 d7Var) {
        this.f117845d = d7Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.finder.live.widget.d7 d7Var = this.f117845d;
        contextMenu.add(0, d7Var.L, 0, d7Var.f118183e.getResources().getString(com.tencent.mm.R.string.d4t));
    }
}
