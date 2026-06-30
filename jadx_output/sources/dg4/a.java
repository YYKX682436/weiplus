package dg4;

/* loaded from: classes15.dex */
public class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI f232353a;

    public a(com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI autoAddFriendUI) {
        this.f232353a = autoAddFriendUI;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI autoAddFriendUI = this.f232353a;
        if (z17) {
            autoAddFriendUI.f172161h |= 2097152;
        } else {
            autoAddFriendUI.f172161h &= -2097153;
        }
        autoAddFriendUI.f172160g.put(32, z17 ? 1 : 2);
    }
}
