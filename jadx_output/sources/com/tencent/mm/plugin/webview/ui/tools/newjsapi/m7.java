package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class m7 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186361e;

    public m7(nw4.k kVar, nw4.y2 y2Var) {
        this.f186360d = kVar;
        this.f186361e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        nw4.k kVar = this.f186360d;
        nw4.y2 y2Var = this.f186361e;
        try {
            if (iPCBoolean.f68400d) {
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
            } else {
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail open fail", null);
            }
        } catch (java.lang.Exception unused) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail open fail", null);
        }
    }
}
