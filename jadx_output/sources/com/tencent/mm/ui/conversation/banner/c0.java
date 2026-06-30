package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes.dex */
public class c0 implements android.content.DialogInterface.OnCancelListener {
    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
