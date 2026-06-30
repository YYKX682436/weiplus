package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class w2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.z2 f124811d;

    public w2(com.tencent.mm.plugin.finder.profile.widget.z2 z2Var) {
        this.f124811d = z2Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.profile.widget.z2 z2Var = this.f124811d;
            g4Var.d(1, z2Var.f124845a.getResources().getColor(com.tencent.mm.R.color.ad8), z2Var.f124845a.getString(com.tencent.mm.R.string.p4_));
        }
    }
}
