package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class ji implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f209009a;

    public ji(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI) {
        this.f209009a = singleChatInfoUI;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SingleChatInfoUI", "OpenLiteApp fail");
        boolean z17 = com.tencent.mm.ui.SingleChatInfoUI.f197069x;
        this.f209009a.Y6();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SingleChatInfoUI", "OpenLiteApp success");
    }
}
