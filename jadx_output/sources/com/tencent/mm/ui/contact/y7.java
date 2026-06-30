package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class y7 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment f207262d;

    public y7(com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f207262d = openIMAddressUIFragment;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMAddressUI", "onItemLongClick, targetview is SearchBar::ListView, pos = " + i17);
        com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment = this.f207262d;
        if (i17 < openIMAddressUIFragment.f206519e.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenIMAddressUI", "on item long click, but match header view");
            return true;
        }
        yk5.u uVar = openIMAddressUIFragment.f206521g;
        if (uVar != null && uVar.f462914x) {
            return true;
        }
        com.tencent.mm.storage.g item = openIMAddressUIFragment.f206520f.getItem(i17 - openIMAddressUIFragment.f206519e.getHeaderViewsCount());
        if (item == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMAddressUI", "cont is null. position:%d, header count:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(openIMAddressUIFragment.f206519e.getHeaderViewsCount()));
            return true;
        }
        java.lang.String e17 = item.e();
        if (!com.tencent.mm.storage.z3.k4(e17) && !com.tencent.mm.storage.z3.b4(e17) && !com.tencent.mm.storage.z3.L3(e17)) {
            com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment2 = this.f207262d;
            openIMAddressUIFragment2.f206522h = e17;
            openIMAddressUIFragment2.f206523i.g(view, i17, j17, openIMAddressUIFragment2, openIMAddressUIFragment2.f206529r, openIMAddressUIFragment2.f206524m, openIMAddressUIFragment2.f206525n);
        }
        return true;
    }
}
