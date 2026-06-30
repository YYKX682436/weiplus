package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ma implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ka f204569d;

    public ma(com.tencent.mm.ui.chatting.viewitems.la laVar, com.tencent.mm.ui.chatting.viewitems.ka kaVar) {
        this.f204569d = kaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.ka kaVar = this.f204569d;
        kaVar.f204315b.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        kaVar.f204321h.setLayoutParams(new android.widget.FrameLayout.LayoutParams(kaVar.f204315b.getWidth(), kaVar.f204315b.getHeight()));
    }
}
