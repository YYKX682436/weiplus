package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class da implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ea f200423d;

    public da(com.tencent.mm.ui.chatting.ea eaVar) {
        this.f200423d = eaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.ea eaVar = this.f200423d;
        eaVar.f200472i.e(eaVar.f200470g, eaVar.f200471h, false);
    }
}
