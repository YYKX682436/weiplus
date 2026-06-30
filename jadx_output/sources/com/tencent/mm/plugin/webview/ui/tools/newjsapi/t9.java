package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class t9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(nw4.k kVar, nw4.y2 y2Var) {
        super(2);
        this.f186545d = kVar;
        this.f186546e = y2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.HashMap hashMap = new java.util.HashMap();
        nw4.y2 y2Var = this.f186546e;
        nw4.k kVar = this.f186545d;
        if (booleanValue) {
            hashMap.put("retCode", 0);
            hashMap.put("msg", "sendPcRemindMsg:ok");
            kVar.f340863d.e(y2Var.f341013c, "sendPcRemindMsg:ok", hashMap);
        } else {
            hashMap.put("retCode", -1);
            hashMap.put("msg", "sendPcRemindMsg:fail");
            kVar.f340863d.e(y2Var.f341013c, "sendPcRemindMsg:fail:", hashMap);
        }
        return jz5.f0.f302826a;
    }
}
