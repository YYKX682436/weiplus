package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class x6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.f7 f206233d;

    public x6(com.tencent.mm.ui.chatting.f7 f7Var) {
        this.f206233d = f7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.chatting.f7 f7Var = this.f206233d;
        f7Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingQQMailFooterHandler", "dz[initQQMailDownloadUrlAndMD5]");
        s75.d.b(new com.tencent.mm.ui.chatting.c7(f7Var), "QQMailDownloadUrlAndMD5");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 9, 0, 1);
    }
}
