package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes.dex */
public class b0 implements android.content.DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]yes");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
