package com.tencent.mm.ui.contact;

/* loaded from: classes8.dex */
public class j5 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.l5 f206958d;

    public j5(com.tencent.mm.ui.contact.l5 l5Var) {
        this.f206958d = l5Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f206958d.f207007d.getResources().getString(com.tencent.mm.R.string.f490367t0));
    }
}
