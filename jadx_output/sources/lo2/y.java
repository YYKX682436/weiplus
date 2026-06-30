package lo2;

/* loaded from: classes8.dex */
public final class y implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI f320176d;

    public y(com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI) {
        this.f320176d = finderMemberQAVideoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI = this.f320176d;
        db5.e1.n(finderMemberQAVideoUI, com.tencent.mm.R.string.evb, com.tencent.mm.R.string.f490573yv, new lo2.w(finderMemberQAVideoUI), lo2.x.f320175d);
        return true;
    }
}
