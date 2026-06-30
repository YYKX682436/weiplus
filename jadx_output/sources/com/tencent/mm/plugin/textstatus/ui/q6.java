package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174223d;

    public q6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f174223d = textStatusDoWhatActivityV2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174223d;
        textStatusDoWhatActivityV2.f173545o = false;
        textStatusDoWhatActivityV2.finish();
    }
}
