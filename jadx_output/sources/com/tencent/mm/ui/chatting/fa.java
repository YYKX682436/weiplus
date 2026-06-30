package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class fa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ga f200509d;

    public fa(com.tencent.mm.ui.chatting.ga gaVar) {
        this.f200509d = gaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.ga gaVar = this.f200509d;
        gaVar.f200528f.e(gaVar.f200527e, gaVar.f200526d, false);
    }
}
