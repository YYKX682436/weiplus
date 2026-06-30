package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class n implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.p f129191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129192b;

    public n(com.tencent.mm.plugin.finder.ui.fav.p pVar, android.view.View view) {
        this.f129191a = pVar;
        this.f129192b = view;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.c(0, this.f129191a.f129199m, 0, this.f129192b.getContext().getResources().getString(com.tencent.mm.R.string.dec), com.tencent.mm.R.raw.icons_filled_delete);
    }
}
