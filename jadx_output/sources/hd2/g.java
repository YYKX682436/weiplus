package hd2;

/* loaded from: classes8.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment f280473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280474e;

    public g(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment, android.view.View view) {
        this.f280473d = finderCommentShareDialogFragment;
        this.f280474e = view;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Context context;
        android.content.Context context2;
        int itemId = menuItem.getItemId();
        android.view.View container = this.f280474e;
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment = this.f280473d;
        if (itemId == 20002) {
            kotlin.jvm.internal.o.f(container, "$container");
            int i18 = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment.f110034n;
            finderCommentShareDialogFragment.getClass();
            android.graphics.Bitmap b07 = com.tencent.mm.sdk.platformtools.x.b0(container);
            if (b07 != null && (context = finderCommentShareDialogFragment.getContext()) != null) {
                java.lang.String fj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
                com.tencent.mm.sdk.platformtools.x.D0(b07, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj6, true);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Retr_File_Name", fj6);
                intent.putExtra("Retr_Compress_Type", 0);
                intent.putExtra("Retr_Msg_Type", 0);
                intent.putExtra("sourceImgInfo", finderCommentShareDialogFragment.n0());
                j45.l.x((com.tencent.mm.ui.MMFragmentActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1014, new hd2.v(context, finderCommentShareDialogFragment));
            }
        } else if (itemId == 20003) {
            kotlin.jvm.internal.o.f(container, "$container");
            int i19 = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment.f110034n;
            finderCommentShareDialogFragment.getClass();
            android.graphics.Bitmap b08 = com.tencent.mm.sdk.platformtools.x.b0(container);
            if (b08 != null && (context2 = finderCommentShareDialogFragment.getContext()) != null) {
                java.lang.String fj7 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
                com.tencent.mm.sdk.platformtools.x.D0(b08, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj7, true);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Ksnsupload_type", 0);
                intent2.putExtra("sns_kemdia_path", fj7);
                intent2.putExtra("KFinder_source_url", finderCommentShareDialogFragment.n0().f71258d);
                j45.l.j(context2, "sns", ".ui.SnsUploadUI", intent2, null);
                com.tencent.mm.plugin.finder.report.d2.g(com.tencent.mm.plugin.finder.report.d2.f124994a, context2, "share_comment", false, finderCommentShareDialogFragment.o0(0, null, 1), 4, null);
            }
        }
        finderCommentShareDialogFragment.dismiss();
    }
}
