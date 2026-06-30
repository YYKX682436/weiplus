package ii5;

/* loaded from: classes15.dex */
public class j extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mogic.WxViewPager f291663a;

    public j(com.tencent.mm.ui.mogic.WxViewPager wxViewPager, ii5.d dVar) {
        this.f291663a = wxViewPager;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f291663a.dataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f291663a.dataSetChanged();
    }
}
