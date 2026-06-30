package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class lu implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pu f118977d;

    public lu(com.tencent.mm.plugin.finder.live.widget.pu puVar) {
        this.f118977d = puVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.live.widget.pu puVar = this.f118977d;
            g4Var.f(1, puVar.f118381d.getResources().getString(com.tencent.mm.R.string.f491764e62));
            g4Var.f(2, puVar.f118381d.getResources().getString(com.tencent.mm.R.string.f491763e61));
        }
    }
}
