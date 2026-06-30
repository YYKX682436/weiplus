package hd2;

/* loaded from: classes8.dex */
public final class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment f280477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280478e;

    public h(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment, android.view.View view) {
        this.f280477d = finderCommentShareDialogFragment;
        this.f280478e = view;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.graphics.Bitmap b07;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment = this.f280477d;
        if (itemId == 20011) {
            android.view.View container = this.f280478e;
            kotlin.jvm.internal.o.f(container, "$container");
            int i18 = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment.f110034n;
            android.content.Context context = finderCommentShareDialogFragment.getContext();
            if (context != null && (b07 = com.tencent.mm.sdk.platformtools.x.b0(container)) != null) {
                java.lang.String fj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
                com.tencent.mm.sdk.platformtools.x.D0(b07, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj6, true);
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(context, fj6, new hd2.q(context, finderCommentShareDialogFragment));
            }
        }
        finderCommentShareDialogFragment.dismiss();
    }
}
