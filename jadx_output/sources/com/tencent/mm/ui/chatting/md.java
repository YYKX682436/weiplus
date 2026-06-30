package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class md implements android.content.DialogInterface.OnCancelListener {
    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.ui.chatting.hd.f201679a;
        if (u3Var != null) {
            u3Var.dismiss();
            com.tencent.mm.ui.chatting.hd.f201679a = null;
        }
        com.tencent.mm.ui.chatting.hd.f201680b = false;
        ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.ui.chatting.hd.f201681c).clear();
    }
}
