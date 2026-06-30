package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class s4 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186514e;

    public s4(nw4.k kVar, nw4.y2 y2Var) {
        this.f186513d = kVar;
        this.f186514e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.GetWxInfoMpPageResponse getWxInfoMpPageResponse = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.GetWxInfoMpPageResponse) obj;
        boolean z17 = getWxInfoMpPageResponse.f185876d;
        nw4.k kVar = this.f186513d;
        nw4.y2 y2Var = this.f186514e;
        if (!z17) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", kz5.b1.e(new jz5.l("err_desc", getWxInfoMpPageResponse.f185880h)));
            return;
        }
        java.util.Map k17 = kz5.c1.k(new jz5.l("nick_name", getWxInfoMpPageResponse.f185877e), new jz5.l("head_img_url", getWxInfoMpPageResponse.f185878f), new jz5.l("user_name", getWxInfoMpPageResponse.f185879g));
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", k17);
    }
}
