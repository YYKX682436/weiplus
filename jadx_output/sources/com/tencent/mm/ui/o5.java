package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class o5 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.GameMsgDownloadImgEvent f209449a;

    public o5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, com.tencent.mm.autogen.events.GameMsgDownloadImgEvent gameMsgDownloadImgEvent) {
        this.f209449a = gameMsgDownloadImgEvent;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        com.tencent.mm.autogen.events.GameMsgDownloadImgEvent gameMsgDownloadImgEvent = this.f209449a;
        am.ue ueVar = gameMsgDownloadImgEvent.f54367g;
        ueVar.f8078a = 2;
        ueVar.f8079b = str;
        gameMsgDownloadImgEvent.e();
    }
}
