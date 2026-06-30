package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class s9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f186523d = kVar;
        this.f186524e = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("retCode", -1);
        hashMap.put("msg", "sendPcRemindMsg:fail cancel");
        this.f186523d.f340863d.e(this.f186524e.f341013c, "sendPcRemindMsg:fail cancel", null);
        return jz5.f0.f302826a;
    }
}
