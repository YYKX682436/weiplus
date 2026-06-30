package com.tencent.mm.ui.contact;

/* loaded from: classes8.dex */
public class s1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.u1 f207168d;

    public s1(com.tencent.mm.ui.contact.u1 u1Var) {
        this.f207168d = u1Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f207168d.f207203d.getResources().getString(com.tencent.mm.R.string.f490367t0));
    }
}
