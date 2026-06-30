package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class o4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185316g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185317h;

    public o4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, nw4.y2 y2Var) {
        this.f185317h = c1Var;
        this.f185313d = str;
        this.f185314e = str2;
        this.f185315f = str3;
        this.f185316g = y2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, this.f185313d, 6, this.f185314e, this.f185315f, 3);
        dialogInterface.dismiss();
        this.f185317h.i5(this.f185316g, "add_download_task_straight:fail_network_not_wifi", null);
    }
}
