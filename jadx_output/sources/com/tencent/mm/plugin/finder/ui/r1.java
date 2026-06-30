package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class r1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f129760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI f129761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f129762f;

    public r1(int i17, com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI finderBlockListSearchUI, androidx.recyclerview.widget.f2 f2Var) {
        this.f129760d = i17;
        this.f129761e = finderBlockListSearchUI;
        this.f129762f = f2Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.storage.uj0 uj0Var;
        int i18 = this.f129760d;
        if (i18 >= 0) {
            com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI finderBlockListSearchUI = this.f129761e;
            if (i18 >= finderBlockListSearchUI.f128524v.size() || (uj0Var = finderBlockListSearchUI.f128526x) == null) {
                return;
            }
            uj0Var.d(((so2.i0) finderBlockListSearchUI.f128524v.get(i18)).f410415d, new com.tencent.mm.plugin.finder.ui.q1(finderBlockListSearchUI, i18, this.f129762f));
        }
    }
}
