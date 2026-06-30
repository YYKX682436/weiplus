package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class x6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124346d;

    public x6(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f124346d = obVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124346d;
            g4Var.d(10021, obVar.getResources().getColor(com.tencent.mm.R.color.f478532ac), obVar.getResources().getString(com.tencent.mm.R.string.f491290cn4));
        }
    }
}
