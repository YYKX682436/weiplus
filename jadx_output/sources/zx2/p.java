package zx2;

/* loaded from: classes15.dex */
public class p extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout f477062a;

    public p(com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout) {
        this.f477062a = finderTabLayout;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f477062a.k();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f477062a.k();
    }
}
