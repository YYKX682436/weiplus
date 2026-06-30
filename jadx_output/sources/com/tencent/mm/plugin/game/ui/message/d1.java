package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class d1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.h1 f141544d;

    public d1(com.tencent.mm.plugin.game.ui.message.j1 j1Var, com.tencent.mm.plugin.game.ui.message.h1 h1Var) {
        this.f141544d = h1Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.game.ui.message.h1 h1Var = this.f141544d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(h1Var.f141562a.K2.f140561s)) {
            if (r53.f.n(h1Var.f141562a.K2.f140561s)) {
                contextMenu.add(0, 13, 0, com.tencent.mm.R.string.fom);
            } else {
                contextMenu.add(0, 12, 0, com.tencent.mm.R.string.foo);
            }
        }
        contextMenu.add(0, 11, 0, com.tencent.mm.R.string.fln);
    }
}
