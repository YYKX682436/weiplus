package com.tencent.mm.ui.conversation;

/* loaded from: classes4.dex */
public class n1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f207883d;

    public n1(java.lang.Runnable runnable) {
        this.f207883d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Runnable runnable = this.f207883d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
