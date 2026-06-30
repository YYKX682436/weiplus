package hd2;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment f280489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment, android.view.View view) {
        super(1);
        this.f280489d = finderCommentShareDialogFragment;
        this.f280490e = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap b07;
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        android.view.View container = this.f280490e;
        kotlin.jvm.internal.o.f(container, "$container");
        int i17 = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment.f110034n;
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment = this.f280489d;
        android.content.Context context = finderCommentShareDialogFragment.getContext();
        if (context != null && (b07 = com.tencent.mm.sdk.platformtools.x.b0(container)) != null) {
            java.lang.String fj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
            com.tencent.mm.sdk.platformtools.x.D0(b07, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj6, true);
            hd2.p pVar = new hd2.p(finderCommentShareDialogFragment, username, context, fj6, com.tencent.mm.storage.z3.R4(username) ? 3 : 2);
            jd5.a aVar = new jd5.a();
            aVar.p(fj6);
            n13.t tVar = new n13.t();
            tVar.f334133a = pVar;
            ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(context, aVar, username, tVar);
        }
        return jz5.f0.f302826a;
    }
}
