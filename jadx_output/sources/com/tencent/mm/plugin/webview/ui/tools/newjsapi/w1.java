package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class w1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186595e;

    public w1(nw4.k kVar, nw4.y2 y2Var) {
        this.f186594d = kVar;
        this.f186595e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d;
        if (str == null) {
            str = "";
        }
        hashMap.put("redDotInfo", new org.json.JSONObject(str));
        nw4.g gVar = this.f186594d.f340863d;
        nw4.y2 y2Var = this.f186595e;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":success", hashMap);
    }
}
