package com.tencent.mm.ui.conversation;

/* loaded from: classes4.dex */
public class c1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f207598d;

    public c1(java.lang.Runnable runnable) {
        this.f207598d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Runnable runnable = this.f207598d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
