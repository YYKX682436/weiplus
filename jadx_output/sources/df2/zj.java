package df2;

/* loaded from: classes3.dex */
public final class zj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f231972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f231973e;

    public zj(df2.pk pkVar, int i17) {
        this.f231972d = pkVar;
        this.f231973e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveCustomGiftTagView finderLiveCustomGiftTagView = this.f231972d.f231084x;
        if (finderLiveCustomGiftTagView != null) {
            finderLiveCustomGiftTagView.b(this.f231973e);
        }
    }
}
