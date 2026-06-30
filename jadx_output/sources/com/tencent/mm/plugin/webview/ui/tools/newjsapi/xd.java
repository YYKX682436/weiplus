package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class xd extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186668e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(nw4.k kVar, nw4.y2 y2Var) {
        super(1);
        this.f186667d = kVar;
        this.f186668e = y2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        nw4.g gVar = this.f186667d.f340863d;
        nw4.y2 y2Var = this.f186668e;
        gVar.e(y2Var.f341013c, " " + y2Var.f341019i + ":ok", kz5.b1.e(new jz5.l("height", java.lang.Integer.valueOf(intValue))));
        return jz5.f0.f302826a;
    }
}
