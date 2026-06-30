package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class r4 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f186477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f186478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186480g;

    public r4(java.util.HashMap hashMap, kotlin.jvm.internal.c0 c0Var, nw4.k kVar, nw4.y2 y2Var) {
        this.f186477d = hashMap;
        this.f186478e = c0Var;
        this.f186479f = kVar;
        this.f186480g = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String value = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d;
        kotlin.jvm.internal.o.f(value, "value");
        java.util.HashMap hashMap = this.f186477d;
        hashMap.put("temporaryVisitInfoList", value);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "getTeenModeTemporaryVisitInfo isValidVisit=" + this.f186478e.f310112d + ", temporaryVisitInfoList=" + hashMap.get("temporaryVisitInfoList"));
        nw4.g gVar = this.f186479f.f340863d;
        nw4.y2 y2Var = this.f186480g;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
    }
}
