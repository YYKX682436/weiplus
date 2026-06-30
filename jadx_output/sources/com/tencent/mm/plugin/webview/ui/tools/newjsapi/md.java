package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class md implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab0.a f186366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.newjsapi.od f186368f;

    public md(ab0.a aVar, com.tencent.mm.ipcinvoker.r rVar, com.tencent.mm.plugin.webview.ui.tools.newjsapi.od odVar) {
        this.f186366d = aVar;
        this.f186367e = rVar;
        this.f186368f = odVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        ((cb0.d) this.f186366d).a();
        com.tencent.mm.ipcinvoker.r rVar = this.f186367e;
        if (rVar != null) {
            rVar.a(this.f186368f.a("fail_cancel", null));
        }
    }
}
