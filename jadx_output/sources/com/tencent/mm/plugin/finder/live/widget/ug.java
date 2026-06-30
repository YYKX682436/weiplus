package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ug implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bh f119972d;

    public ug(int i17, com.tencent.mm.plugin.finder.live.widget.bh bhVar, int i18) {
        this.f119972d = bhVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String allFansCntDesc;
        java.lang.String superFansCntDesc;
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f119972d;
        allFansCntDesc = bhVar.getAllFansCntDesc();
        g4Var.f(0, allFansCntDesc);
        superFansCntDesc = bhVar.getSuperFansCntDesc();
        g4Var.f(1, superFansCntDesc);
    }
}
