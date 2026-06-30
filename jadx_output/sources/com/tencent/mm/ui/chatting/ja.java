package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class ja implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ka f201873d;

    public ja(com.tencent.mm.ui.chatting.ka kaVar) {
        this.f201873d = kaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.ka kaVar = this.f201873d;
        kaVar.f201904g.e(kaVar.f201903f, kaVar.f201902e, false);
    }
}
