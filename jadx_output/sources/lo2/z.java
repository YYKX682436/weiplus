package lo2;

/* loaded from: classes8.dex */
public final class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI f320177d;

    public z(com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI) {
        this.f320177d = finderMemberQAVideoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f320177d.finish();
        return true;
    }
}
