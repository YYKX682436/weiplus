package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes8.dex */
public final class k0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186191e;

    public k0(nw4.k kVar, nw4.y2 y2Var) {
        this.f186190d = kVar;
        this.f186191e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeSessionIdData getGamelifeSessionIdData = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeSessionIdData) obj;
        boolean z17 = getGamelifeSessionIdData.f186154f;
        nw4.y2 y2Var = this.f186191e;
        nw4.k kVar = this.f186190d;
        java.lang.String str = getGamelifeSessionIdData.f186153e;
        if (!z17) {
            kVar.f340863d.e(y2Var.f341013c, "gamelifeManager fail" + str, null);
            return;
        }
        java.util.Map e17 = kz5.b1.e(new jz5.l(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, getGamelifeSessionIdData.f186152d));
        kVar.f340863d.e(y2Var.f341013c, "gamelifeManager success" + str, e17);
    }
}
