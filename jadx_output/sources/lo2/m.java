package lo2;

/* loaded from: classes2.dex */
public final class m implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI f320155d;

    public m(com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI finderMemberFanListUI) {
        this.f320155d = finderMemberFanListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f320155d.finish();
        return true;
    }
}
