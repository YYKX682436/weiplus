package sr2;

/* loaded from: classes10.dex */
public final class v3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411741d;

    public v3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411741d = postMainUIC;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411741d;
        postMainUIC.getClass();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = dialogInterface instanceof com.tencent.mm.ui.widget.dialog.j0 ? (com.tencent.mm.ui.widget.dialog.j0) dialogInterface : null;
        postMainUIC.D7(j0Var != null ? j0Var.f(i17) : null);
    }
}
