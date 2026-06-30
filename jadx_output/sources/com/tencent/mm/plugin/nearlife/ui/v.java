package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class v implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI f152349d;

    public v(com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI nearLifeCreatePoiUI) {
        this.f152349d = nearLifeCreatePoiUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI nearLifeCreatePoiUI = this.f152349d;
        g0Var.d(11138, "2", "0", nearLifeCreatePoiUI.f152277r);
        nearLifeCreatePoiUI.f152275p = db5.e1.Q(nearLifeCreatePoiUI.getContext(), nearLifeCreatePoiUI.getString(com.tencent.mm.R.string.h9k), nearLifeCreatePoiUI.getString(com.tencent.mm.R.string.h9l), true, true, new com.tencent.mm.plugin.nearlife.ui.u(this));
        nearLifeCreatePoiUI.f152267e = nearLifeCreatePoiUI.f152271i.getText().toString();
        nearLifeCreatePoiUI.f152268f = nearLifeCreatePoiUI.f152273n.getText().toString();
        nearLifeCreatePoiUI.f152270h = nearLifeCreatePoiUI.f152272m.getText().toString();
        java.lang.String obj = ((android.widget.EditText) nearLifeCreatePoiUI.findViewById(com.tencent.mm.R.id.f484238di1)).getText().toString();
        java.lang.String charSequence = ((android.widget.TextView) nearLifeCreatePoiUI.findViewById(com.tencent.mm.R.id.f487454op1)).getText().toString();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = charSequence;
        du5Var.f372757e = true;
        linkedList.add(du5Var);
        nearLifeCreatePoiUI.f152276q = new dn3.j(nearLifeCreatePoiUI.f152267e, nearLifeCreatePoiUI.f152268f, nearLifeCreatePoiUI.f152270h, nearLifeCreatePoiUI.f152266d, linkedList.size(), linkedList, obj, null);
        c01.d9.e().g(nearLifeCreatePoiUI.f152276q);
        return true;
    }
}
