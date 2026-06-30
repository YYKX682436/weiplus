package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class r0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.f0 f202437d;

    public r0(com.tencent.mm.ui.chatting.presenter.t0 t0Var, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        this.f202437d = f0Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, view.getContext().getString(com.tencent.mm.R.string.i29));
        com.tencent.mm.ui.chatting.adapter.f0 f0Var = this.f202437d;
        if (!com.tencent.mm.storage.z3.m4(f0Var.f198412e) && !com.tencent.mm.storage.z3.q4(f0Var.f198412e)) {
            contextMenu.add(0, 1, 0, view.getContext().getString(com.tencent.mm.R.string.b1o));
        }
        contextMenu.add(0, 2, 0, view.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, 3, 0, view.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
