package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class nd implements ab0.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.newjsapi.od f186397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f186398c;

    public nd(com.tencent.mm.ipcinvoker.r rVar, com.tencent.mm.plugin.webview.ui.tools.newjsapi.od odVar, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f186396a = rVar;
        this.f186397b = odVar;
        this.f186398c = u3Var;
    }

    @Override // ab0.f0
    public final void onResult(boolean z17, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (z17) {
            str3 = "ok";
        } else {
            str3 = "fail_" + str;
        }
        com.tencent.mm.ipcinvoker.r rVar = this.f186396a;
        if (rVar != null) {
            rVar.a(this.f186397b.a(str3, str2));
        }
        this.f186398c.dismiss();
    }
}
