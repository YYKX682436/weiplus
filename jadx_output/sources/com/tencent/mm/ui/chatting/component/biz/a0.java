package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes11.dex */
public class a0 implements com.tencent.mm.ui.chatting.component.biz.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198767a;

    public a0(com.tencent.mm.ui.chatting.component.biz.a aVar) {
        this.f198767a = aVar;
    }

    public boolean a() {
        com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198767a;
        if (aVar.f198758w == null) {
            com.tencent.mm.ui.chatting.component.z4.j(aVar.f198580d.f460717l, com.tencent.mm.R.id.p2d);
            aVar.f198758w = (android.widget.RelativeLayout) aVar.f198580d.c(com.tencent.mm.R.id.asl);
            aVar.f198759x = (android.widget.TextView) aVar.f198580d.c(com.tencent.mm.R.id.asm);
            aVar.f198759x.setText(com.tencent.mm.R.string.azd);
        }
        aVar.f198758w.setVisibility(0);
        aVar.f198580d.q().postDelayed(new com.tencent.mm.ui.chatting.component.biz.k(this), 5000L);
        return true;
    }
}
