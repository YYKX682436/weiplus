package rc5;

/* loaded from: classes5.dex */
public final class h implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f394160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rc5.m f394163g;

    public h(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, rc5.m mVar) {
        this.f394160d = recyclerView;
        this.f394161e = i17;
        this.f394162f = i18;
        this.f394163g = mVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17 = -(this.f394161e - this.f394162f);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f394160d;
        recyclerView.scrollBy(0, i17);
        if (recyclerView.getScrollState() == 2) {
            return false;
        }
        this.f394163g.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
