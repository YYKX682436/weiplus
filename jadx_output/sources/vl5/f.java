package vl5;

/* loaded from: classes15.dex */
public class f extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.sortlist.DragSortListView f437924a;

    public f(com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView) {
        this.f437924a = dragSortListView;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.f437924a;
        if (dragSortListView.f212515z == 4) {
            dragSortListView.g();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.f437924a;
        if (dragSortListView.f212515z == 4) {
            dragSortListView.g();
        }
    }
}
