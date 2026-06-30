package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class a0 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f184900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f184901e;

    public a0(nw4.k kVar, nw4.y2 y2Var) {
        this.f184900d = kVar;
        this.f184901e = y2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(32227, "4,0,0,0");
        this.f184900d.f340863d.e(this.f184901e.f341013c, "choosePassport:cancel", null);
    }
}
