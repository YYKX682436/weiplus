package eg4;

/* loaded from: classes4.dex */
public final class s0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI f252791d;

    public s0(com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI) {
        this.f252791d = addFriendVerifyRecordUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f252791d.finish();
        return false;
    }
}
