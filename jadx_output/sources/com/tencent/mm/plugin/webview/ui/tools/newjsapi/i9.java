package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class i9 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186257e;

    public i9(nw4.k kVar, nw4.y2 y2Var) {
        this.f186256d = kVar;
        this.f186257e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d;
        nw4.k kVar = this.f186256d;
        nw4.y2 y2Var = this.f186257e;
        if (z17) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
            return;
        }
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
    }
}
