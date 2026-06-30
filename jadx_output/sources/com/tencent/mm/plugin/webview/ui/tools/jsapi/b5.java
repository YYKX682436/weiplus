package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class b5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.t3 f184950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184952f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f184953g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f184954h;

    public b5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, dm.t3 t3Var, java.lang.String str, java.lang.String str2, nw4.y2 y2Var) {
        this.f184954h = c1Var;
        this.f184950d = t3Var;
        this.f184951e = str;
        this.f184952f = str2;
        this.f184953g = y2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, this.f184950d.field_appId, 6, this.f184951e, this.f184952f, 3);
        dialogInterface.dismiss();
        this.f184954h.i5(this.f184953g, "doResumeDownloadTask:fail_network_not_wifi", null);
    }
}
