package do2;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView f242083d;

    public g(com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView) {
        this.f242083d = finderLiveFeedMiniView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniPlayerProxy f111318e = this.f242083d.getF111318e();
        if (f111318e != null) {
            zy2.g5.u(f111318e, null, 1, null);
        }
    }
}
