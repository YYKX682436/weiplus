package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes15.dex */
public class h extends android.widget.BaseAdapter {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f208740n;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.gridviewheaders.b f208741d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f208742e;

    /* renamed from: f, reason: collision with root package name */
    public int f208743f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.gridviewheaders.GridHeadersGridView f208744g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f208745h;

    /* renamed from: i, reason: collision with root package name */
    public int f208746i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View[] f208747m;

    public h(android.content.Context context, com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView, com.tencent.mm.ui.gridviewheaders.b bVar) {
        com.tencent.mm.ui.gridviewheaders.c cVar = new com.tencent.mm.ui.gridviewheaders.c(this);
        this.f208745h = new java.util.ArrayList();
        this.f208746i = 1;
        this.f208742e = context;
        this.f208741d = bVar;
        this.f208744g = gridHeadersGridView;
        bVar.registerDataSetObserver(cVar);
    }

    public long a(int i17) {
        return c(i17).f208733a;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public com.tencent.mm.ui.gridviewheaders.f c(int i17) {
        com.tencent.mm.ui.gridviewheaders.b bVar = this.f208741d;
        int e17 = bVar.e();
        if (e17 == 0) {
            return i17 >= bVar.getCount() ? new com.tencent.mm.ui.gridviewheaders.f(this, -1, 0) : new com.tencent.mm.ui.gridviewheaders.f(this, i17, 0);
        }
        int i18 = i17;
        int i19 = 0;
        while (i19 < e17) {
            int b17 = bVar.b(i19);
            if (i17 == 0) {
                return new com.tencent.mm.ui.gridviewheaders.f(this, -2, i19);
            }
            int i27 = this.f208746i;
            int i28 = i17 - i27;
            if (i28 < 0) {
                return new com.tencent.mm.ui.gridviewheaders.f(this, -1, i19);
            }
            int i29 = i18 - i27;
            if (i28 < b17) {
                return new com.tencent.mm.ui.gridviewheaders.f(this, i29, i19);
            }
            int b18 = bVar.b(i19);
            int i37 = this.f208746i;
            int i38 = b18 % i37;
            int i39 = i38 == 0 ? 0 : i37 - i38;
            i18 = i29 - i39;
            i17 = i28 - (b17 + i39);
            i19++;
        }
        return new com.tencent.mm.ui.gridviewheaders.f(this, -1, i19);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        this.f208743f = 0;
        com.tencent.mm.ui.gridviewheaders.b bVar = this.f208741d;
        int e17 = bVar.e();
        if (e17 == 0) {
            return bVar.getCount();
        }
        for (int i17 = 0; i17 < e17; i17++) {
            int i18 = this.f208743f;
            int b17 = bVar.b(i17);
            int b18 = bVar.b(i17);
            int i19 = this.f208746i;
            int i27 = b18 % i19;
            this.f208743f = i18 + b17 + (i27 == 0 ? 0 : i19 - i27) + i19;
        }
        return this.f208743f;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        int i18 = c(i17).f208734b;
        if (i18 == -1 || i18 == -2) {
            return null;
        }
        return this.f208741d.getItem(i18);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        int i18 = c(i17).f208734b;
        if (i18 == -2) {
            return -1L;
        }
        if (i18 == -1) {
            return -2L;
        }
        return this.f208741d.getItemId(i18);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        int i18 = c(i17).f208734b;
        if (i18 == -2) {
            return 1;
        }
        if (i18 == -1) {
            return 0;
        }
        int itemViewType = this.f208741d.getItemViewType(i18);
        return itemViewType == -1 ? itemViewType : itemViewType + 2;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.gridviewheaders.g gVar;
        android.view.View view2;
        if (view instanceof com.tencent.mm.ui.gridviewheaders.g) {
            com.tencent.mm.ui.gridviewheaders.g gVar2 = (com.tencent.mm.ui.gridviewheaders.g) view;
            gVar = gVar2;
            view = gVar2.getChildAt(0);
        } else {
            gVar = null;
        }
        com.tencent.mm.ui.gridviewheaders.f c17 = c(i17);
        com.tencent.mm.ui.gridviewheaders.b bVar = this.f208741d;
        android.content.Context context = this.f208742e;
        int i18 = c17.f208734b;
        if (i18 == -2) {
            com.tencent.mm.ui.gridviewheaders.e eVar = new com.tencent.mm.ui.gridviewheaders.e(this, context);
            eVar.setHeaderWidth(this.f208744g.getWidth());
            int i19 = c17.f208733a;
            eVar.setHeaderId(i19);
            eVar.setTag(bVar.i(i19, (android.view.View) eVar.getTag(), viewGroup));
            view2 = eVar;
        } else if (i18 == -1) {
            com.tencent.mm.ui.gridviewheaders.d dVar = (com.tencent.mm.ui.gridviewheaders.d) view;
            view2 = dVar;
            if (dVar == null) {
                view2 = new com.tencent.mm.ui.gridviewheaders.d(this, context);
            }
        } else {
            view2 = bVar.getView(i18, view, viewGroup);
        }
        if (gVar == null) {
            gVar = new com.tencent.mm.ui.gridviewheaders.g(this, context);
        }
        gVar.removeAllViews();
        gVar.addView(view2);
        gVar.setPosition(i17);
        gVar.setNumColumns(this.f208746i);
        android.view.View[] viewArr = this.f208747m;
        int i27 = i17 % this.f208746i;
        viewArr[i27] = gVar;
        if (i27 == 0) {
            f208740n = true;
            int i28 = 1;
            while (true) {
                android.view.View[] viewArr2 = this.f208747m;
                if (i28 >= viewArr2.length) {
                    break;
                }
                viewArr2[i28] = getView(i17 + i28, null, viewGroup);
                i28++;
            }
            f208740n = false;
        }
        gVar.setRowSiblings(this.f208747m);
        if (!f208740n) {
            int i29 = this.f208746i;
            if (i17 % i29 == i29 - 1 || i17 == getCount() - 1) {
                android.view.View[] viewArr3 = new android.view.View[this.f208746i];
                this.f208747m = viewArr3;
                java.util.Arrays.fill(viewArr3, (java.lang.Object) null);
            }
        }
        return gVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f208741d.getViewTypeCount() + 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return this.f208741d.hasStableIds();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        return this.f208741d.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        int i18 = c(i17).f208734b;
        if (i18 == -1 || i18 == -2) {
            return false;
        }
        return this.f208741d.isEnabled(i18);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.f208741d.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.f208741d.unregisterDataSetObserver(dataSetObserver);
    }
}
