package sr2;

/* loaded from: classes10.dex */
public final class u3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411733d;

    public u3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411733d = postMainUIC;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411733d;
        postMainUIC.getClass();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = dialogInterface instanceof com.tencent.mm.ui.widget.dialog.j0 ? (com.tencent.mm.ui.widget.dialog.j0) dialogInterface : null;
        android.widget.Button f17 = j0Var != null ? j0Var.f(i17) : null;
        postMainUIC.b7(postMainUIC.getString(com.tencent.mm.R.string.eve), true, new sr2.g3(postMainUIC));
        postMainUIC.K7(f17, "post_save_exit");
        com.tencent.mm.plugin.finder.report.p2.f125237a.G("andr_Post_Page_Draft", null);
    }
}
