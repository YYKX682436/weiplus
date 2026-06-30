package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class h implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f206736d;

    public h(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f206736d = addressUIFragment;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddressUI", "onItemLongClick, targetview is SearchBar::ListView, pos = " + i17);
        com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment = this.f206736d;
        if (i17 < addressUIFragment.f206307o.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AddressUI", "on item long click, but match header view");
            return true;
        }
        yk5.u uVar = addressUIFragment.f206310r;
        if (uVar != null && uVar.f462914x) {
            return true;
        }
        com.tencent.mm.storage.g item = addressUIFragment.f206309q.getItem(i17 - addressUIFragment.f206307o.getHeaderViewsCount());
        if (item == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddressUI", "cont is null. position:%d, header count:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(addressUIFragment.f206307o.getHeaderViewsCount()));
            return true;
        }
        java.lang.String e17 = item.e();
        if (!com.tencent.mm.storage.z3.k4(e17) && !com.tencent.mm.storage.z3.b4(e17)) {
            com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment2 = this.f206736d;
            addressUIFragment2.f206313u = e17;
            addressUIFragment2.H.g(view, i17, j17, addressUIFragment2, addressUIFragment2.S, addressUIFragment2.I, addressUIFragment2.f206306J);
        }
        return true;
    }
}
