package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class pa implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ra f119376d;

    public pa(com.tencent.mm.plugin.finder.live.widget.ra raVar) {
        this.f119376d = raVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.plugin.finder.live.widget.ra raVar = this.f119376d;
        g4Var.d(1, raVar.f118183e.getResources().getColor(com.tencent.mm.R.color.Red_100), raVar.f118183e.getString(com.tencent.mm.R.string.ony));
    }
}
