package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.a7 f201610d;

    public z6(com.tencent.mm.ui.chatting.gallery.a7 a7Var) {
        this.f201610d = a7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.a7 a7Var = this.f201610d;
        if (a7Var.f200785a != null) {
            if (a7Var.f200786b) {
                h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
                java.lang.String Q0 = a7Var.f200785a.Q0();
                long msgId = a7Var.f200785a.getMsgId();
                h90.a[] aVarArr = h90.a.f279671d;
                ((g90.u) wVar).Zi(Q0, msgId, 1);
            } else {
                h90.w wVar2 = (h90.w) i95.n0.c(h90.w.class);
                java.lang.String Q02 = a7Var.f200785a.Q0();
                long msgId2 = a7Var.f200785a.getMsgId();
                h90.a[] aVarArr2 = h90.a.f279671d;
                ((g90.u) wVar2).Zi(Q02, msgId2, 4);
            }
        }
        java.lang.Runnable runnable = a7Var.f200787c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
