package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes4.dex */
public final class y0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185546b;

    public y0(nw4.k kVar, nw4.y2 y2Var) {
        this.f185545a = kVar;
        this.f185546b = y2Var;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String obj2;
        if (obj == null || (obj2 = obj.toString()) == null || (str = "fail ".concat(obj2)) == null) {
            str = "fail";
        }
        this.f185545a.f340863d.e(this.f185546b.f341013c, "reportMiniProgramPageData:".concat(str), null);
    }
}
