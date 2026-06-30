package lo2;

/* loaded from: classes2.dex */
public final class s implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI f320168d;

    public s(com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI finderMemberPreviewUI) {
        this.f320168d = finderMemberPreviewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI finderMemberPreviewUI = this.f320168d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) finderMemberPreviewUI.getContext(), 1, false);
        k0Var.f211872n = lo2.q.f320164d;
        k0Var.f211881s = new lo2.r(finderMemberPreviewUI);
        k0Var.v();
        return true;
    }
}
