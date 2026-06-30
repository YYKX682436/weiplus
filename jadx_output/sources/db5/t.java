package db5;

/* loaded from: classes15.dex */
public class t extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.HorizontalListView f228514a;

    public t(com.tencent.mm.ui.base.HorizontalListView horizontalListView) {
        this.f228514a = horizontalListView;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.ui.base.HorizontalListView horizontalListView;
        synchronized (this.f228514a) {
            horizontalListView = this.f228514a;
            horizontalListView.f197273s = true;
        }
        horizontalListView.invalidate();
        this.f228514a.requestLayout();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        int i17 = com.tencent.mm.ui.base.HorizontalListView.f197260v;
        com.tencent.mm.ui.base.HorizontalListView horizontalListView = this.f228514a;
        synchronized (horizontalListView) {
            horizontalListView.c();
            horizontalListView.removeAllViewsInLayout();
            horizontalListView.requestLayout();
        }
        horizontalListView.invalidate();
        horizontalListView.requestLayout();
    }
}
