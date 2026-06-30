package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class k5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCommentTransparentActivity f174029d;

    public k5(com.tencent.mm.plugin.textstatus.ui.TextStatusCommentTransparentActivity textStatusCommentTransparentActivity) {
        this.f174029d = textStatusCommentTransparentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*com.tencent.mm.ui.MMActivity*/.onBackPressed();
    }
}
