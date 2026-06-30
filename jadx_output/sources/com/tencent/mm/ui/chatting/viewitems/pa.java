package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class pa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ka f205245d;

    public pa(com.tencent.mm.ui.chatting.viewitems.qa qaVar, com.tencent.mm.ui.chatting.viewitems.ka kaVar) {
        this.f205245d = kaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.ka kaVar = this.f205245d;
        kaVar.f204315b.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        kaVar.f204321h.setLayoutParams(new android.widget.FrameLayout.LayoutParams(kaVar.f204315b.getWidth(), kaVar.f204315b.getHeight()));
    }
}
