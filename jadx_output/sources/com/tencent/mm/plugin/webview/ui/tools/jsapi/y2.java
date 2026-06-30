package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.RcptRecentAddrEvent f185558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185560f;

    public y2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.autogen.events.RcptRecentAddrEvent rcptRecentAddrEvent, java.lang.String str) {
        this.f185560f = c1Var;
        this.f185558d = rcptRecentAddrEvent;
        this.f185559e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.RcptRecentAddrEvent rcptRecentAddrEvent = this.f185558d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "JSOAUTH errCode[%s], isAccept[%s]", java.lang.Integer.valueOf(rcptRecentAddrEvent.f54644h.f7253a), java.lang.Boolean.valueOf(rcptRecentAddrEvent.f54644h.f7254b));
        am.lp lpVar = rcptRecentAddrEvent.f54644h;
        int i17 = lpVar.f7253a;
        if (i17 == -119) {
            return;
        }
        java.lang.String str = this.f185559e;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185560f;
        if (i17 != 0) {
            c1Var.i5(c1Var.f184976e, str + "fail", null);
            return;
        }
        if (!lpVar.f7254b) {
            c1Var.i5(c1Var.f184976e, str + "cancel", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str2 = rcptRecentAddrEvent.f54644h.f7255c;
        if (str2 != null && str2.length() > 6) {
            str2 = str2.substring(0, 6);
        }
        hashMap.put("nationalCode", str2);
        hashMap.put("nationalCodeFull", rcptRecentAddrEvent.f54644h.f7255c);
        hashMap.put("userName", rcptRecentAddrEvent.f54644h.f7257e);
        hashMap.put("telNumber", rcptRecentAddrEvent.f54644h.f7256d);
        hashMap.put("addressPostalCode", rcptRecentAddrEvent.f54644h.f7258f);
        hashMap.put("proviceFirstStageName", rcptRecentAddrEvent.f54644h.f7259g);
        hashMap.put("addressCitySecondStageName", rcptRecentAddrEvent.f54644h.f7260h);
        hashMap.put("addressCountiesThirdStageName", rcptRecentAddrEvent.f54644h.f7261i);
        am.lp lpVar2 = rcptRecentAddrEvent.f54644h;
        java.lang.String str3 = lpVar2.f7262j;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = lpVar2.f7263k;
        java.lang.String format = (android.text.TextUtils.isEmpty(str3) || str4.startsWith(str3)) ? str4 : java.lang.String.format("%s%s", str3, str4);
        hashMap.put("addressStreetFourthStageName", str3);
        hashMap.put("addressDetailInfo", format);
        hashMap.put("addressDetailInfoNew", str4);
        c1Var.i5(c1Var.f184976e, str + "ok", hashMap);
    }
}
