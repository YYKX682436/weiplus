package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class z9 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.ka f116859d;

    public z9(com.tencent.mm.plugin.finder.live.view.ka kaVar) {
        this.f116859d = kaVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, this.f116859d.P, 0, com.tencent.mm.R.string.e8z);
    }
}
