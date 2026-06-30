package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class f9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f173871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f173872e;

    public f9(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f173871d = textStatusEditActivity;
        this.f173872e = iEmojiInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f173871d.s7(this.f173872e);
    }
}
