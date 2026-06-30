package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class f5 implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186082b;

    public f5(nw4.k kVar, nw4.y2 y2Var) {
        this.f186081a = kVar;
        this.f186082b = y2Var;
    }

    @Override // vh0.i1
    public void onResult(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        nw4.k kVar = this.f186081a;
        nw4.y2 y2Var = this.f186082b;
        if (booleanValue) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
            return;
        }
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":cancel", null);
    }
}
