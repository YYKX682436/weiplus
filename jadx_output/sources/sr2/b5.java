package sr2;

/* loaded from: classes5.dex */
public final class b5 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411521d;

    public b5(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411521d = postMainUIC;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "oldBottom " + i38 + ", bottom " + i27);
        if (i38 != i27) {
            com.tencent.mm.plugin.finder.post.PostMainUIC.Y6(this.f411521d, null, true, 1, null);
        }
    }
}
