package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AutoPlay$3 f206246d;

    public y0(com.tencent.mm.ui.chatting.AutoPlay$3 autoPlay$3) {
        this.f206246d = autoPlay$3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.AutoPlay$3 autoPlay$3 = this.f206246d;
        autoPlay$3.f198148d.J(false);
        autoPlay$3.f198148d.h();
    }
}
