package com.tencent.mm.plugin.finder.search;

/* loaded from: classes3.dex */
public final class a0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f125610d;

    public a0(kotlin.jvm.internal.f0 f0Var) {
        this.f125610d = f0Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenu != null) {
            contextMenu.add(0, this.f125610d.f310116d, 0, com.tencent.mm.R.string.eoj);
        }
    }
}
