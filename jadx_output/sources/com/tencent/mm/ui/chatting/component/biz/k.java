package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a0 f198790d;

    public k(com.tencent.mm.ui.chatting.component.biz.a0 a0Var) {
        this.f198790d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.biz.a0 a0Var = this.f198790d;
        android.widget.RelativeLayout relativeLayout = a0Var.f198767a.f198758w;
        if (relativeLayout != null && relativeLayout.getVisibility() != 8) {
            a0Var.f198767a.f198758w.setVisibility(8);
        }
        yb5.d dVar = a0Var.f198767a.f198580d;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.BizComponent", "[onProcecssClick] mChattingContext is null!");
        } else {
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) dVar.f460708c.a(sb5.z0.class))).C();
            a0Var.f198767a.f198580d.J();
        }
    }
}
