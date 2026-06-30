package com.tencent.mm.ui.conversation;

/* loaded from: classes4.dex */
public class q1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f207992d;

    public q1(java.lang.Runnable runnable) {
        this.f207992d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f207992d.run();
    }
}
