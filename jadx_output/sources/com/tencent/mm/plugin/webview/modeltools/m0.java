package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes.dex */
public final class m0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f183320d;

    public m0(kotlin.coroutines.Continuation continuation) {
        this.f183320d = continuation;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermissionRequestHelper", "showWebPermissionAlert ok");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f183320d.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }
}
