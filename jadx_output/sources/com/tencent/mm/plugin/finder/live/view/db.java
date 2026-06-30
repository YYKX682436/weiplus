package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class db implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f116256d;

    public db(com.tencent.mm.plugin.finder.live.view.gb gbVar) {
        this.f116256d = gbVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.a(this.f116256d.X, com.tencent.mm.R.string.e8d);
        }
    }
}
