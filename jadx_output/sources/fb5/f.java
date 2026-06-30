package fb5;

/* loaded from: classes9.dex */
public class f extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.sortview.BaseSortView f260888a;

    public f(com.tencent.mm.ui.base.sortview.BaseSortView baseSortView) {
        this.f260888a = baseSortView;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.ui.base.sortview.BaseSortView baseSortView = this.f260888a;
        fb5.j jVar = baseSortView.f197874r;
        if (jVar != null) {
            java.util.List list = baseSortView.f197866g.f260894d;
            com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = (com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView) jVar;
            android.widget.TextView textView = brandServiceSortView.L;
            if (textView == null || list == null) {
                return;
            }
            if (brandServiceSortView.f94050u == 1) {
                textView.setText(brandServiceSortView.getContext().getString(com.tencent.mm.R.string.mdg, java.lang.Integer.valueOf(((java.util.ArrayList) list).size())));
            } else {
                textView.setText(brandServiceSortView.getContext().getString(com.tencent.mm.R.string.f490768ap2, java.lang.Integer.valueOf(((java.util.ArrayList) list).size())));
            }
        }
    }
}
