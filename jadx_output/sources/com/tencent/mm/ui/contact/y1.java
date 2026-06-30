package com.tencent.mm.ui.contact;

/* loaded from: classes8.dex */
public class y1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.a2 f207255d;

    public y1(com.tencent.mm.ui.contact.a2 a2Var) {
        this.f207255d = a2Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f207255d.f206577d.getResources().getString(com.tencent.mm.R.string.f490367t0));
    }
}
