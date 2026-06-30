package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public abstract class p4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.l4 f207076d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f207077e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public boolean f207078f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f207079g;

    /* renamed from: h, reason: collision with root package name */
    public final int f207080h;

    public p4(com.tencent.mm.ui.contact.l4 l4Var, boolean z17, int i17, boolean z18) {
        this.f207076d = l4Var;
        this.f207078f = z17;
        this.f207080h = i17;
        this.f207079g = z18;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return -1L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (getItem(i17) != null) {
            return getItem(i17).f206832a;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMSelectContactAdapter", "getItemViewType: get data item fail, return unkown Type, totalCount=%d | position = %s", java.lang.Integer.valueOf(getCount()), java.lang.Integer.valueOf(i17));
        return -1;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.contact.item.d item = getItem(i17);
        com.tencent.mm.ui.contact.l4 l4Var = this.f207076d;
        if (view == null) {
            view = item.b().a(l4Var.getActivity(), viewGroup, view);
        }
        com.tencent.mm.ui.contact.item.b bVar = (com.tencent.mm.ui.contact.item.b) view.getTag();
        iz5.a.d(null, bVar);
        if (!item.f206835d) {
            item.a(l4Var.getActivity(), bVar);
            item.f206835d = true;
        }
        item.f206836e = p();
        item.f206837f = l4Var.W5(item);
        item.f206847p = l4Var.A2(item);
        item.b().c(l4Var.getActivity(), bVar, item, l4Var.p5(item), l4Var.t4(item));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 10;
    }

    public void h() {
        android.util.SparseArray sparseArray = this.f207077e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public abstract com.tencent.mm.ui.contact.item.d j(int i17);

    public void k() {
        h();
    }

    @Override // android.widget.Adapter
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.ui.contact.item.d getItem(int i17) {
        android.util.SparseArray sparseArray = this.f207077e;
        if (sparseArray.indexOfKey(i17) >= 0) {
            return (com.tencent.mm.ui.contact.item.d) sparseArray.get(i17);
        }
        if (i17 < 0 || i17 >= getCount()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSelectContactAdapter", "getItem Occur error !!!!!!!!! position = %d", java.lang.Integer.valueOf(i17));
            return null;
        }
        com.tencent.mm.ui.contact.item.d j17 = j(i17);
        if (j17 != null) {
            j17.f206840i = o(j17);
            sparseArray.put(i17, j17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSelectContactAdapter", "createDataItem Occur error !!!!!!!!! position = %d", java.lang.Integer.valueOf(i17));
        }
        return j17;
    }

    public int m() {
        return 0;
    }

    public boolean n(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        return false;
    }

    public boolean o(com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    public boolean p() {
        return this.f207078f;
    }

    public void q(boolean z17) {
        this.f207078f = z17;
        notifyDataSetChanged();
    }
}
