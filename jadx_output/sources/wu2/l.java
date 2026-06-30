package wu2;

/* loaded from: classes2.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f449687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment f449688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449689f;

    public l(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment finderFavFeedFragment, java.lang.String str) {
        this.f449687d = bitmap;
        this.f449688e = finderFavFeedFragment;
        this.f449689f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f449687d;
        if (bitmap != null) {
            java.lang.String str = this.f449689f;
            com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment finderFavFeedFragment = this.f449688e;
            finderFavFeedFragment.y0().setMMTitle(hc2.x0.l(str, finderFavFeedFragment.y0(), '#', new android.graphics.drawable.BitmapDrawable(bitmap), com.tencent.mm.R.color.a0c, (int) finderFavFeedFragment.y0().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz), 0, 0, 0, 224, null));
        }
    }
}
