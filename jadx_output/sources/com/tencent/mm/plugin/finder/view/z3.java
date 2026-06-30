package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class z3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f133449d;

    public z3(com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView) {
        this.f133449d = finderCollapsibleTextView;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f133449d;
            if (finderCollapsibleTextView.getRealContent() == null) {
                com.tencent.mm.sdk.platformtools.b0.e(finderCollapsibleTextView.getContentTextView().a());
            } else {
                com.tencent.mm.sdk.platformtools.b0.e(finderCollapsibleTextView.getRealContent());
            }
        }
    }
}
