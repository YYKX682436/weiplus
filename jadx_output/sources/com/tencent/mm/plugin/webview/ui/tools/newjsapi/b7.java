package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class b7 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185974e;

    public b7(nw4.k kVar, nw4.y2 y2Var) {
        this.f185973d = kVar;
        this.f185974e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        int i17 = iPCInteger.f68404d;
        nw4.k kVar = this.f185973d;
        nw4.y2 y2Var = this.f185974e;
        if (i17 > 0) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", kz5.b1.e(new jz5.l("state", java.lang.Integer.valueOf(iPCInteger.f68404d))));
            return;
        }
        if (i17 == -1000) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return;
        }
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + "pre check fail", null);
    }
}
