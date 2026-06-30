package db5;

/* loaded from: classes15.dex */
public class y extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.HorizontalListViewV2 f228575a;

    public y(com.tencent.mm.ui.base.HorizontalListViewV2 horizontalListViewV2) {
        this.f228575a = horizontalListViewV2;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.ui.base.HorizontalListViewV2 horizontalListViewV2 = this.f228575a;
        horizontalListViewV2.f197281i = true;
        horizontalListViewV2.k();
        horizontalListViewV2.invalidate();
        horizontalListViewV2.requestLayout();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.tencent.mm.ui.base.HorizontalListViewV2 horizontalListViewV2 = this.f228575a;
        horizontalListViewV2.getClass();
        horizontalListViewV2.k();
        horizontalListViewV2.f();
        horizontalListViewV2.removeAllViewsInLayout();
        horizontalListViewV2.requestLayout();
        horizontalListViewV2.invalidate();
        horizontalListViewV2.requestLayout();
    }
}
