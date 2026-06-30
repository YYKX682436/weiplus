package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class ka implements android.content.DialogInterface.OnClickListener {
    public ka(com.tencent.mm.ui.conversation.ma maVar) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        new com.tencent.mm.autogen.events.ResendAllFailNormalMsgEvent().e();
    }
}
