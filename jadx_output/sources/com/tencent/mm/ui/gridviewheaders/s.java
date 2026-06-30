package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes15.dex */
public class s extends android.widget.BaseAdapter implements com.tencent.mm.ui.gridviewheaders.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ListAdapter f208759d;

    public s(android.widget.ListAdapter listAdapter) {
        com.tencent.mm.ui.gridviewheaders.r rVar = new com.tencent.mm.ui.gridviewheaders.r(this);
        this.f208759d = listAdapter;
        listAdapter.registerDataSetObserver(rVar);
    }

    @Override // com.tencent.mm.ui.gridviewheaders.b
    public int b(int i17) {
        return 0;
    }

    @Override // com.tencent.mm.ui.gridviewheaders.b
    public int e() {
        return 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f208759d.getCount();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f208759d.getItem(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return this.f208759d.getItemId(i17);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return this.f208759d.getView(i17, view, viewGroup);
    }

    @Override // com.tencent.mm.ui.gridviewheaders.b
    public android.view.View i(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return null;
    }
}
