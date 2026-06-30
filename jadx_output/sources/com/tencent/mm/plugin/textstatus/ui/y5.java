package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity f174449d;

    public y5(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity) {
        this.f174449d = textStatusDoWhatActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity = this.f174449d;
        textStatusDoWhatActivity.f173519m = false;
        textStatusDoWhatActivity.finish();
    }
}
