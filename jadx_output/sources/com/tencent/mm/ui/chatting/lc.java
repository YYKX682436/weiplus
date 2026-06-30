package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class lc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f201936d;

    public lc(com.tencent.mm.ui.chatting.RevokeMsgListener revokeMsgListener, android.app.Activity activity) {
        this.f201936d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f201936d.finish();
    }
}
