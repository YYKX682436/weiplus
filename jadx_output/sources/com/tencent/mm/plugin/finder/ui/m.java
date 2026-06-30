package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class m implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129489d;

    public m(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        this.f129489d = finderActivityDescUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI = this.f129489d;
            g4Var.d(finderActivityDescUI.D, finderActivityDescUI.getContext().getResources().getColor(com.tencent.mm.R.color.Red_100), com.tencent.mm.plugin.finder.ui.FinderActivityDescUI.c7(finderActivityDescUI));
        }
    }
}
