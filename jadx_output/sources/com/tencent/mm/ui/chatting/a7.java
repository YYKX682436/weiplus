package com.tencent.mm.ui.chatting;

/* loaded from: classes7.dex */
public class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.c7 f198366d;

    public a7(com.tencent.mm.ui.chatting.c7 c7Var) {
        this.f198366d = c7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.c7 c7Var = this.f198366d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(c7Var.f198517d.f200500m) || com.tencent.mm.sdk.platformtools.t8.K0(c7Var.f198517d.f200501n)) {
            com.tencent.mm.ui.chatting.f7.a(c7Var.f198517d);
            return;
        }
        gw4.f fVar = new gw4.f(c7Var.f198517d.f200489b);
        fVar.f276157b = "mmdownloadapp_rQ8fhvGmzxUTY19Pce";
        ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
    }
}
