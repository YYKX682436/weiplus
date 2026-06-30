package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class w1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlockListUI f129971d;

    public w1(com.tencent.mm.plugin.finder.ui.FinderBlockListUI finderBlockListUI) {
        this.f129971d = finderBlockListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        android.view.View actionView;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.ui.FinderBlockListUI finderBlockListUI = this.f129971d;
        com.tencent.mars.xlog.Log.i(finderBlockListUI.f128529t, "doCallSelectContactUIForMultiRetransmit");
        if (finderBlockListUI.f128532w == 1 && (actionView = it.getActionView()) != null) {
            hc2.v0.d(actionView, "add_dont_show_his_likes", "view_clk", false, kz5.c1.k(new jz5.l("dont_show_his_likes_page_source_page", java.lang.Integer.valueOf(finderBlockListUI.f128534y)), new jz5.l("feed_id", pm0.v.u(finderBlockListUI.f128533x))), null, 20, null);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(finderBlockListUI, "com.tencent.mm.ui.contact.SelectContactUI");
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", finderBlockListUI.getString(com.tencent.mm.R.string.eol));
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206782c);
        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter blockListPresenter = finderBlockListUI.f128530u;
        kotlin.jvm.internal.o.d(blockListPresenter);
        java.util.ArrayList arrayList = blockListPresenter.f122567f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((so2.i0) it6.next()).f410415d.getUsername());
        }
        intent.putExtra("always_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, ","));
        intent.putExtra("block_contact", c01.z1.r());
        int i17 = com.tencent.mm.plugin.finder.ui.FinderBlockListUI.f128528z;
        intent.putExtra("max_limit_num", 20);
        intent.putExtra("Forbid_SelectChatRoom", true);
        intent.putExtra("show_too_many_member", false);
        finderBlockListUI.getContext().startActivityForResult(intent, 1);
        return true;
    }
}
