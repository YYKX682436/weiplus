package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class e9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f173843d;

    public e9(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f173843d = textStatusEditActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f173843d;
        com.tencent.mm.ui.bk.r0(textStatusEditActivity.i7().getPaint(), 0.8f);
        textStatusEditActivity.i7().setHint(com.tencent.mm.R.string.jv_);
    }
}
