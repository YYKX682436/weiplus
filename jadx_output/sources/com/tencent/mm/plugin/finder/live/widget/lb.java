package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class lb implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f118924d;

    public lb(com.tencent.mm.plugin.finder.live.widget.nb nbVar) {
        this.f118924d = nbVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.plugin.finder.live.widget.nb nbVar = this.f118924d;
        g4Var.d(1, nbVar.f118183e.getResources().getColor(com.tencent.mm.R.color.Red_100), nbVar.f118183e.getString(com.tencent.mm.R.string.f493464oo3));
    }
}
