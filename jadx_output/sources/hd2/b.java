package hd2;

/* loaded from: classes10.dex */
public final class b implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment f280448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f280449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f280450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f280451d;

    public b(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment, android.view.ViewGroup viewGroup, android.widget.ProgressBar progressBar, android.widget.ImageView imageView) {
        this.f280448a = finderCommentShareDialogFragment;
        this.f280449b = viewGroup;
        this.f280450c = progressBar;
        this.f280451d = imageView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imageLoader: result:");
        sb6.append(bitmap != null);
        com.tencent.mars.xlog.Log.i("FinderCommentShareDialogFragment", sb6.toString());
        boolean z17 = bitmap != null;
        int i17 = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment.f110034n;
        this.f280448a.getClass();
        pm0.v.X(new hd2.a(z17, this.f280449b, this.f280451d, this.f280450c));
    }
}
