package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mi0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.vi0 f113518d;

    public mi0(com.tencent.mm.plugin.finder.live.plugin.vi0 vi0Var) {
        this.f113518d = vi0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.live.plugin.vi0 vi0Var = this.f113518d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = vi0Var.A;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        vi0Var.getClass();
        g4Var.d(0, vi0Var.f365323d.getContext().getResources().getColor(com.tencent.mm.R.color.f479323wd), vi0Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.dmg));
    }
}
