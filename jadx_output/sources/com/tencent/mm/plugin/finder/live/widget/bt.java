package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bt implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f117917d;

    public bt(com.tencent.mm.plugin.finder.live.widget.et etVar) {
        this.f117917d = etVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.live.widget.et etVar = this.f117917d;
            g4Var.d(etVar.T, etVar.f118183e.getResources().getColor(com.tencent.mm.R.color.f478532ac), etVar.f118183e.getResources().getString(com.tencent.mm.R.string.nu_));
        }
    }
}
