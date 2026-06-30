package vl5;

/* loaded from: classes15.dex */
public class g extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vl5.h f437925a;

    public g(vl5.h hVar, com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView) {
        this.f437925a = hVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f437925a.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f437925a.notifyDataSetInvalidated();
    }
}
