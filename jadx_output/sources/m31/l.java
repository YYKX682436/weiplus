package m31;

/* loaded from: classes9.dex */
public class l implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI f323162d;

    public l(com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI subscribeMsgDetailUI) {
        this.f323162d = subscribeMsgDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI.f71857w;
        com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI subscribeMsgDetailUI = this.f323162d;
        subscribeMsgDetailUI.V6();
        subscribeMsgDetailUI.finish();
        return false;
    }
}
