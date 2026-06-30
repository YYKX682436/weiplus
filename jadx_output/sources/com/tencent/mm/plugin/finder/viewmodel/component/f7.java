package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class f7 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134369d;

    public f7(in5.s0 s0Var) {
        this.f134369d = s0Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f134369d.f293121e.getResources().getString(com.tencent.mm.R.string.map));
    }
}
