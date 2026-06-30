package vl5;

/* loaded from: classes15.dex */
public class h extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ListAdapter f437926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.sortlist.DragSortListView f437927e;

    public h(com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView, android.widget.ListAdapter listAdapter, vl5.e eVar) {
        this.f437927e = dragSortListView;
        this.f437926d = listAdapter;
        listAdapter.registerDataSetObserver(new vl5.g(this, dragSortListView));
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return this.f437926d.areAllItemsEnabled();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f437926d.getCount();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f437926d.getItem(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return this.f437926d.getItemId(i17);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return this.f437926d.getItemViewType(i17);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        vl5.c cVar;
        android.widget.ListAdapter listAdapter = this.f437926d;
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.f437927e;
        if (view == null || !(view instanceof vl5.c)) {
            android.view.View view2 = listAdapter.getView(i17, null, dragSortListView);
            vl5.c dVar = view2 instanceof android.widget.Checkable ? new vl5.d(dragSortListView.getContext()) : new vl5.c(dragSortListView.getContext());
            dVar.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            dVar.addView(view2);
            cVar = dVar;
        } else {
            cVar = (vl5.c) view;
            android.view.View childAt = cVar.getChildAt(0);
            android.view.View view3 = listAdapter.getView(i17, childAt, dragSortListView);
            if (view3 != childAt) {
                if (childAt != null) {
                    cVar.removeViewAt(0);
                }
                cVar.addView(view3);
            }
        }
        int headerViewsCount = i17 + dragSortListView.getHeaderViewsCount();
        int i18 = com.tencent.mm.ui.widget.sortlist.DragSortListView.I1;
        dragSortListView.c(headerViewsCount, cVar, true);
        return cVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f437926d.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return this.f437926d.hasStableIds();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        return this.f437926d.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        return this.f437926d.isEnabled(i17);
    }
}
