package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI f143370d;

    public i(com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI) {
        this.f143370d = contactManagerUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI = this.f143370d;
            com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U6 = contactManagerUI.U6();
            kotlin.jvm.internal.o.d(U6);
            java.util.List list = U6.A;
            if (list == null || list.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelManagerUI", "cpan[doDeleteScene] can not do scene. lable is null");
                return;
            }
            w11.h0 h0Var = new w11.h0(list, 1, 2, contactManagerUI.f143317d);
            gm0.j1.n().f273288b.g(h0Var);
            contactManagerUI.f143326p = db5.e1.Q(contactManagerUI.getContext(), contactManagerUI.getString(com.tencent.mm.R.string.f490573yv), contactManagerUI.getString(com.tencent.mm.R.string.f489871e2), true, true, new com.tencent.mm.plugin.label.ui.searchContact.j(h0Var));
            java.lang.String actionInfo = "" + list.size();
            kotlin.jvm.internal.o.g(actionInfo, "actionInfo");
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.label.ui.searchContact.k(4L, actionInfo));
        }
    }
}
