package com.tencent.mm.ui.contact;

/* loaded from: classes8.dex */
public class p5 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.r5 f207081d;

    public p5(com.tencent.mm.ui.contact.r5 r5Var) {
        this.f207081d = r5Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f207081d.f207155d.getResources().getString(com.tencent.mm.R.string.f490367t0));
    }
}
