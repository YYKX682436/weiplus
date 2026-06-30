package sr2;

/* loaded from: classes5.dex */
public final class t3 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411723d;

    public t3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411723d = postMainUIC;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "oldBottom " + i38 + ", bottom " + i27);
        if (i38 != i27) {
            com.tencent.mm.plugin.finder.post.PostMainUIC.Y6(this.f411723d, null, !((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue(), 1, null);
        }
    }
}
