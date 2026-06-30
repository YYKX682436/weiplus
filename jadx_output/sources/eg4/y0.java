package eg4;

/* loaded from: classes4.dex */
public final class y0 implements xg3.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI f252831a;

    public y0(com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI) {
        this.f252831a = addFriendVerifyRecordUI;
    }

    @Override // xg3.t
    public void a(boolean z17, int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory callback: hasMore=" + z17 + ", errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + errMsg);
        this.f252831a.f172167h = false;
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory success, hasMore=" + z17);
            this.f252831a.f172166g = z17 ^ true;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory fail: ".concat(errMsg));
        }
        this.f252831a.W6();
    }
}
