package wj5;

/* loaded from: classes5.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj5.f f446792d;

    public e(wj5.f fVar) {
        this.f446792d = fVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            nn.i iVar = (nn.i) i95.n0.c(nn.i.class);
            java.lang.String x17 = this.f446792d.f446797e.x();
            ((nn.j) iVar).getClass();
            com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI.f63834h.a(x17);
        }
    }
}
