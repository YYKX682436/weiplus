package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes8.dex */
public final class e0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186176e;

    public e0(nw4.k kVar, nw4.y2 y2Var) {
        this.f186175d = kVar;
        this.f186176e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeGeneralReturnParam gamelifeGeneralReturnParam = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeGeneralReturnParam) obj;
        boolean z17 = gamelifeGeneralReturnParam.f186144d;
        nw4.y2 y2Var = this.f186176e;
        nw4.k kVar = this.f186175d;
        java.lang.String str = gamelifeGeneralReturnParam.f186145e;
        if (z17) {
            kVar.f340863d.e(y2Var.f341013c, "gamelifeManager:ok addConversation" + str, null);
            return;
        }
        kVar.f340863d.e(y2Var.f341013c, "gamelifeManager:fail addConversation" + str, null);
    }
}
