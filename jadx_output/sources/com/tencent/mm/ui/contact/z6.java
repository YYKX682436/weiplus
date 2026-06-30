package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class z6 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207273d;

    public z6(com.tencent.mm.ui.contact.b7 b7Var, int i17) {
        this.f207273d = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f207273d, 0, 0, com.tencent.mm.R.string.bf9);
    }
}
