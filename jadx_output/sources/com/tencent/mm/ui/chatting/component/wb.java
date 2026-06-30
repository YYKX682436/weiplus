package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class wb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.jb f200166e;

    public wb(com.tencent.mm.ui.chatting.component.jb jbVar, java.lang.String str) {
        this.f200166e = jbVar;
        this.f200165d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.storage.a3 z07;
        java.lang.String str = this.f200165d;
        com.tencent.mm.ui.chatting.component.jb jbVar = this.f200166e;
        try {
            boolean z18 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_UnionTransfer_Int, 0) == 1;
            int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("AssociatechatroomPayTransferEntranceGrayscaleStatus", 0);
            if (z18) {
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str)) == null) {
                z17 = false;
            } else {
                z17 = (z07.field_chatroomStatus & 134217728) > 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM grey:%s showTransferEntry:%b ChatroomStatus:%s", java.lang.Integer.valueOf(b17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(z07.field_chatroomStatus));
            }
            if (b17 == 1) {
                if (z17) {
                    return;
                }
                jbVar.f199263e.U(14);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM disableServiceRemittance, grey is 1, but showTransferEntry false");
                return;
            }
            if (b17 != 2) {
                jbVar.f199263e.U(16);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM disableServiceRemittance, close");
                return;
            }
            boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_union_transfer_chatroom, 0) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM grey is 2, abtest: %s showTransferEntry: %s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17));
            if (!z19 && !z17) {
                jbVar.f199263e.U(15);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM disableServiceRemittance, grey is 2, but showTransferEntry and abtest is false");
            }
        } catch (java.lang.Exception e17) {
            jbVar.f199263e.U(17);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingUI.FootComponent", e17, "", new java.lang.Object[0]);
        }
    }
}
