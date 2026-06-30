package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class c6 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.d6 f198516a;

    public c6(com.tencent.mm.ui.chatting.d6 d6Var) {
        this.f198516a = d6Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        android.view.View view = (android.view.View) message.obj;
        com.tencent.mm.ui.chatting.d6 d6Var = this.f198516a;
        if (d6Var.f200418b == view.getScrollY()) {
            d6Var.getClass();
            return;
        }
        d6Var.getClass();
        com.tencent.mm.sdk.platformtools.n3 n3Var = d6Var.f200419c;
        n3Var.sendMessageDelayed(n3Var.obtainMessage(0, view), 5L);
        d6Var.f200418b = view.getScrollY();
    }
}
