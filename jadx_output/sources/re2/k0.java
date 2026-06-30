package re2;

/* loaded from: classes3.dex */
public final class k0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI f394444d;

    public k0(com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI) {
        this.f394444d = finderLiveCoLiveInvitationConfirmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f394444d.finish();
        return true;
    }
}
