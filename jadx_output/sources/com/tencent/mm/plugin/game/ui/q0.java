package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class q0 implements android.content.DialogInterface.OnClickListener {
    public q0(com.tencent.mm.plugin.game.ui.r0 r0Var) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameClickListener", "resumeDownloadTask not wifi, user cancel");
    }
}
