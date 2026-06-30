package dg4;

/* loaded from: classes15.dex */
public class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI f232354a;

    public b(com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI autoAddFriendUI) {
        this.f232354a = autoAddFriendUI;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI autoAddFriendUI = this.f232354a;
        if (z17) {
            autoAddFriendUI.f172161h |= 32;
        } else {
            autoAddFriendUI.f172161h &= -33;
        }
        autoAddFriendUI.f172160g.put(4, z17 ? 1 : 2);
    }
}
