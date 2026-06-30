package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class yc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.c2 f206267d;

    public yc(com.tencent.mm.ui.chatting.zc zcVar, dk5.c2 c2Var) {
        this.f206267d = c2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f206267d.f234543c = true;
    }
}
