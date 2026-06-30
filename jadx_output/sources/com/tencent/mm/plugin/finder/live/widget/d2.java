package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i2 f118041d;

    public d2(com.tencent.mm.plugin.finder.live.widget.i2 i2Var) {
        this.f118041d = i2Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.live.widget.i2 i2Var = this.f118041d;
            g4Var.f(1, i2Var.f118616d.getResources().getString(com.tencent.mm.R.string.f491764e62));
            g4Var.f(2, i2Var.f118616d.getResources().getString(com.tencent.mm.R.string.f491763e61));
            g4Var.f(3, i2Var.f118616d.getResources().getString(com.tencent.mm.R.string.f491765e63));
        }
    }
}
