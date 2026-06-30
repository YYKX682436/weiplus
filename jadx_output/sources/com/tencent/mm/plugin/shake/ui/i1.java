package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes8.dex */
public class i1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.TVInfoUI f162282d;

    public i1(com.tencent.mm.plugin.shake.ui.TVInfoUI tVInfoUI) {
        this.f162282d = tVInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str;
        int i17 = com.tencent.mm.plugin.shake.ui.TVInfoUI.f162223q;
        com.tencent.mm.plugin.shake.ui.TVInfoUI tVInfoUI = this.f162282d;
        tVInfoUI.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList.add(tVInfoUI.getString(com.tencent.mm.R.string.lag));
        linkedList2.add(0);
        linkedList.add(tVInfoUI.getString(com.tencent.mm.R.string.lah));
        linkedList2.add(1);
        if (!tVInfoUI.getIntent().getBooleanExtra("key_is_favorite_item", false)) {
            linkedList.add(tVInfoUI.getString(com.tencent.mm.R.string.hjg));
            linkedList2.add(2);
        } else if (tVInfoUI.getIntent().getBooleanExtra("key_can_delete_favorite_item", true)) {
            str = tVInfoUI.getString(com.tencent.mm.R.string.f490367t0);
            db5.e1.d(tVInfoUI, "", linkedList, linkedList2, str, false, new com.tencent.mm.plugin.shake.ui.m1(tVInfoUI));
            return true;
        }
        str = "";
        db5.e1.d(tVInfoUI, "", linkedList, linkedList2, str, false, new com.tencent.mm.plugin.shake.ui.m1(tVInfoUI));
        return true;
    }
}
