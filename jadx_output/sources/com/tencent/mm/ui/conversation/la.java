package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class la implements android.content.DialogInterface.OnClickListener {
    public la(com.tencent.mm.ui.conversation.ma maVar) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        new com.tencent.mm.autogen.events.OmitAllFailNormalMsgEvent().e();
    }
}
