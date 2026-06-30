package wc5;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.q f444551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f444552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f444553f;

    public e(wc5.q qVar, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, int i17) {
        this.f444551d = qVar;
        this.f444552e = linearLayoutManager;
        this.f444553f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int height;
        wc5.q qVar = this.f444551d;
        qVar.getClass();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f444552e;
        int i17 = this.f444553f;
        android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(i17);
        if (findViewByPosition != null && (height = qVar.getRecyclerView().getHeight()) > 0) {
            int height2 = (height - findViewByPosition.getHeight()) / 2;
            if (height2 < 0) {
                height2 = 0;
            }
            int top = findViewByPosition.getTop() - height2;
            if (top != 0) {
                qVar.getRecyclerView().scrollBy(0, top);
            }
        }
        qVar.getRecyclerView().post(new wc5.d(qVar, i17));
    }
}
