package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f125641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderContactSearchUI f125642e;

    public c0(int i17, com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI) {
        this.f125641d = i17;
        this.f125642e = finderContactSearchUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.mu2 mu2Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        int i18 = this.f125641d;
        if (i18 >= 0) {
            com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI = this.f125642e;
            if (i18 >= finderContactSearchUI.f125534z.size() || (mu2Var = (r45.mu2) finderContactSearchUI.f125534z.get(i18)) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0)) == null) {
                return;
            }
            new com.tencent.mm.plugin.finder.storage.q().d(finderContact, new com.tencent.mm.plugin.finder.search.b0(finderContactSearchUI, i18));
        }
    }
}
