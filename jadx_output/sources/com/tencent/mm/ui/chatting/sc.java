package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class sc implements pe5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.SendImgProxyUI f202671a;

    public sc(com.tencent.mm.ui.chatting.SendImgProxyUI sendImgProxyUI) {
        this.f202671a = sendImgProxyUI;
    }

    public void a() {
        com.tencent.mm.ui.chatting.SendImgProxyUI sendImgProxyUI = this.f202671a;
        if (!sendImgProxyUI.isFinishing()) {
            sendImgProxyUI.f198316e.dismiss();
        }
        com.tencent.mm.ui.chatting.SendImgProxyUI.f198315g = false;
        sendImgProxyUI.setResult(-1, sendImgProxyUI.getIntent());
        if (sendImgProxyUI.isFinishing()) {
            return;
        }
        sendImgProxyUI.finish();
    }
}
