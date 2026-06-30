package lo2;

/* loaded from: classes3.dex */
public final class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberBanUI f320110d;

    public d(com.tencent.mm.plugin.finder.member.ui.FinderMemberBanUI finderMemberBanUI) {
        this.f320110d = finderMemberBanUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f320110d.finish();
        return true;
    }
}
