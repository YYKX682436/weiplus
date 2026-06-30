package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class k0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.m0 f209013d;

    public k0(com.tencent.mm.ui.m0 m0Var) {
        this.f209013d = m0Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, this.f209013d.f209085d.f209395i.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
