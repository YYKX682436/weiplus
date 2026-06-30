package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCommentTransparentActivity f174118d;

    public n5(com.tencent.mm.plugin.textstatus.ui.TextStatusCommentTransparentActivity textStatusCommentTransparentActivity) {
        this.f174118d = textStatusCommentTransparentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*com.tencent.mm.ui.MMActivity*/.onSwipeBack();
    }
}
