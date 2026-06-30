package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes11.dex */
public final class g9 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f129291d;

    public g9(int i17, com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, int i18) {
        this.f129291d = finderLivePostHelperUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI = this.f129291d;
        g4Var.p(1, finderLivePostHelperUI.getString(com.tencent.mm.R.string.oyn), "", 0);
        g4Var.p(2, finderLivePostHelperUI.getString(com.tencent.mm.R.string.oyg), finderLivePostHelperUI.getString(com.tencent.mm.R.string.oyh), 0);
    }
}
