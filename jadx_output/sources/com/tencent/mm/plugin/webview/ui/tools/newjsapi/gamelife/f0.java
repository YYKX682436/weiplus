package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes.dex */
public final class f0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186181e;

    public f0(nw4.k kVar, nw4.y2 y2Var) {
        this.f186180d = kVar;
        this.f186181e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d;
        nw4.y2 y2Var = this.f186181e;
        nw4.k kVar = this.f186180d;
        if (z17) {
            kVar.f340863d.e(y2Var.f341013c, "gamelifeManager:ok deleteConversation", null);
        } else {
            kVar.f340863d.e(y2Var.f341013c, "gamelifeManager:fail deleteConversation", null);
        }
    }
}
