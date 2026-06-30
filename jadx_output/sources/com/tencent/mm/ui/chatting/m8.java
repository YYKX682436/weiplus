package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class m8 implements android.content.DialogInterface.OnClickListener {
    public m8(com.tencent.mm.ui.chatting.n8 n8Var) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        new com.tencent.mm.autogen.events.OmitAllFailNormalMsgEvent().e();
    }
}
