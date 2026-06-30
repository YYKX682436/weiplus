package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class ch implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198891d;

    public ch(com.tencent.mm.ui.chatting.component.ah ahVar, java.lang.String str) {
        this.f198891d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.m4 m4Var = (com.tencent.mm.storage.m4) c01.d9.b().r();
        java.lang.String str = this.f198891d;
        com.tencent.mm.storage.l4 p17 = m4Var.p(str);
        if (p17 != null) {
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).Z(str, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62, false, p17.u0());
        }
    }
}
