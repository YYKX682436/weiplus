package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class y4 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f212575a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, android.os.Looper looper) {
        super(looper);
        this.f212575a = findMoreFriendsUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f212575a;
        if (findMoreFriendsUI.f196656w != null) {
            findMoreFriendsUI.B1(true);
        }
    }
}
