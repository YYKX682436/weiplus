package eg4;

/* loaded from: classes4.dex */
public final class v0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI f252821d;

    public v0(com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI) {
        this.f252821d = addFriendVerifyRecordUI;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "onNotifyChange event = " + str);
        this.f252821d.W6();
    }
}
