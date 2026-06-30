package com.tencent.mm.ui.chatting.component;

/* loaded from: classes12.dex */
public class nc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f199584d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f199585e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.lc f199586f;

    public nc(com.tencent.mm.ui.chatting.component.oc ocVar, com.tencent.mm.storage.f9 f9Var, m11.b0 b0Var, boolean z17, com.tencent.mm.ui.chatting.component.lc lcVar) {
        this.f199584d = f9Var;
        this.f199585e = z17;
        this.f199586f = lcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        com.tencent.mm.storage.f9 f9Var = this.f199584d;
        boolean z07 = Di.z0(f9Var, com.tencent.mm.R.drawable.bzt, 1, -1);
        if (z07) {
            mt1.b0.f331191a.r(f9Var.getMsgId(), f9Var.Q0());
            if (this.f199585e) {
                ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).nj(f9Var, 1);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(f9Var.getMsgId(), f9Var);
            }
            ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).bj(f9Var, "GetImageComponent");
        }
        com.tencent.mm.ui.chatting.component.lc lcVar = this.f199586f;
        if (lcVar != null) {
            com.tencent.mm.ui.chatting.component.ic icVar = (com.tencent.mm.ui.chatting.component.ic) lcVar;
            if (z07) {
                icVar.f199224d.f199284d.f198580d.q().post(new com.tencent.mm.ui.chatting.component.hc(icVar));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.GetImageComponent", "createHdThumbDone failed, hd thumb path = " + icVar.f199221a);
        }
    }
}
