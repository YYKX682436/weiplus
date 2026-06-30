package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class i implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.k f199202a;

    public i(int i17, com.tencent.mm.ui.chatting.component.k kVar) {
        this.f199202a = kVar;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        g4Var.c(0, 1, 0, this.f199202a.f198580d.g().getResources().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
    }
}
